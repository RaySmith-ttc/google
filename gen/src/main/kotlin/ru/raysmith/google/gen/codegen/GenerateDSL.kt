package ru.raysmith.google.gen.codegen

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
import com.google.api.client.json.GenericJson
import com.google.api.client.util.Key
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.full.hasAnnotation
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.jvm.javaType
import kotlin.reflect.jvm.jvmErasure
import kotlin.reflect.typeOf

fun <T : AbstractGoogleJsonClient> generateDSL(
    service: KClass<T>,
    path: String,
    destPackage: String
) {
    val buildersDeclared = mutableListOf<String>()
    val res = StringBuilder()
    val modelPackage = service.java.packageName + ".model"

    collectModels(service.java.packageName).forEach { model ->
        println(model.simpleName)

        fun String.fixedTypeName() = replace("java.util.", "")
            .replace("java.lang.", "")
            .replace("$", ".")
            .let {
                when {
                    it.endsWith(".List") -> it
                    else -> it.replace("${modelPackage}.", "")
                }
            }.let {
                if (it == "Object") "Any" else it
            }

        model.load().kotlin.members.filter { it.hasAnnotation<Key>() }.forEach { field ->
            println("- ${field.name}: ${field.returnType}")

            fun appendField(setupType: String, appendAll: Boolean = false) {
                val modelName = when(model.load().kotlin.qualifiedName) {
                    "com.google.api.services.docs.v1.model.List" -> "com.google.api.services.docs.v1.model.List"
                    else -> model.simpleName
                }
                res.append("@GoogleDSL\nfun $modelName.${field.name}(setup: ${setupType}.() -> Unit) {\n")
                res.append(when(field.name) {
                    "size" -> "\tsetSize(${setupType}().apply(setup))"
                    else -> "\t${field.name} = ${setupType}().apply(setup)"
                }).append("${if (appendAll) ".all" else ""}\n")
                res.append("}\n\n")
            }

            if (field.returnType.jvmErasure.supertypes.contains(typeOf<GenericJson>())) {
                val fieldTypeName = field.returnType.javaType.typeName.fixedTypeName()
                appendField(fieldTypeName)
            } else if (field.returnType.jvmErasure.isSubclassOf(List::class) && field.returnType.arguments.first().type!!.javaType.typeName.startsWith(modelPackage)) {
                val builderName = model.simpleName + field.name.capitalize() + "Builder"
                val listType = field.returnType.arguments.first().type!!.javaType.typeName.substringAfterLast('.').fixedTypeName()
                val funName = listType.decapitalize().let {
                    if (it.contains(".")) {
                        it.substringAfterLast('.').decapitalize()
                    } else it
                }

                if (!buildersDeclared.contains(builderName)) {
                    res.append("interface $builderName {\n")
                        .append("\n")
                        .append("\t@GoogleDSL\n")
                        .append("\tfun $funName(setup: ${listType}.() -> Unit)\n")
                        .append("\tval all: List<${listType}>\n")
                        .append("}\n\n")

                    buildersDeclared.add(builderName)
                }

                res.append("@GoogleDSL\n")
                    .append("fun ${model.simpleName}.${field.name}(setup: ${builderName}.() -> Unit) {\n")
                    .append("\tval builder = object : ${builderName} {\n")
                    .append("\t\toverride val all = mutableListOf<${listType}>()\n")
                    .append("\n")
                    .append("\t\t@GoogleDSL\n")
                    .append("\t\toverride inline fun ${funName}(setup: ${listType}.() -> Unit) {\n")
                    .append("\t\t\tall.add(${listType}().apply(setup))\n")
                    .append("\t\t}\n")
                    .append("\t}\n")
                    .append("\n")
                    .append(if (field.name == "values") {
                        "\tthis.setValues(builder.apply(setup).all)\n"
                    } else {
                        "\tthis.${field.name} = builder.apply(setup).all\n"
                    })
                    .append("}\n\n")
            } else if (field.returnType.jvmErasure.isSubclassOf(Map::class)) {
                check(field.returnType.arguments.size == 2)
                val builderName = model.simpleName + field.name.capitalize() + "Builder"

                if (!buildersDeclared.contains(builderName)) {

                    val t1 = field.returnType.arguments.first().type!!.javaType.typeName.fixedTypeName()
                    val t2 = field.returnType.arguments.last().type!!.javaType.typeName.fixedTypeName()

                    res.append("@GoogleDSL\n")
                        .append("class $builderName {\n")
                        .append("\n")
                        .append("\tval all = mutableMapOf<$t1, $t2>()\n")
                        .append("\tinfix fun $t1.to(that: $t2) = all.put(this, that)\n")
                        .append("}\n\n")

                    buildersDeclared.add(builderName)
                }

                appendField(builderName, appendAll = true)
            }

        }

    }

    File("$path/DSL.kt").writeText("""
@file:Suppress("OVERRIDE_BY_INLINE", "unused")

package $destPackage

import $modelPackage.*
import ru.raysmith.google.utils.GoogleDSL

$res
        """.trimIndent())
}