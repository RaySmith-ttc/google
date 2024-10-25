package ru.raysmith.google.gen.codegen

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
import com.google.api.client.json.GenericJson
import com.google.api.client.util.Key
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.allSuperclasses
import kotlin.reflect.full.starProjectedType
import kotlin.reflect.jvm.jvmErasure

private data class FieldData(
    val name: String,
    val type: String,
    val qualifiedName: String,
    val parentPath: String?,
    var subfields: List<FieldData>,
    val fullPath: String,
    val ancestorNames: List<String> = emptyList(),
    val ancestorTypes: List<String> = emptyList()
)

private data class HandledData(val superType: KType, val type: KType, val qualifiedModelName: String, val fullPath: String?, val parentPath: String?)

private data class BackListData(
    var occured: Boolean = false,
    var subfields: List<FieldData> = emptyList()
)

private val blacklist = listOf(
    "kotlin.collections.(Mutable)List<com.google.api.services.docs.v1.model.StructuralElement!>!",
    "kotlin.collections.(Mutable)List<com.google.api.services.docs.v1.model.Tab!>!",
    "kotlin.collections.(Mutable)List<com.google.api.services.gmail.model.MessagePart!>!",
)

fun <T : AbstractGoogleJsonClient> generateFields(
    service: KClass<T>,
    path: String,
    destPackage: String
) {
    val blacklistOccurred = blacklist.associateWith {
        BackListData()
    }.toMutableMap()

    val handled = mutableSetOf<HandledData>()
    val models: List<com.google.common.reflect.ClassPath.ClassInfo> = collectModels(service.modelPackageName)
    val blackListFieldData = mutableListOf<FieldData>()

    fun KClass<*>.process(name: String, type: KType, depth: Int = 1, parentPath: String? = null, qualifiedModelName: String, ancestorNames: List<String> = emptyList(), ancestorTypes: List<String> = emptyList()): List<FieldData> {
        check(depth <= 50) { "Overflow? Then need to add a type to the blacklist" }
        val processData = mutableListOf<FieldData>()

        if (type.classifier == Map::class) {
            val argType = type.arguments.last().type!!
            val subfields = argType.jvmErasure.process(name, argType, depth, parentPath, qualifiedModelName, ancestorNames)
            processData.addAll(subfields)
        } else if (type.jvmErasure.supertypes.any { it.classifier == Collection::class }) {
            val argType = type.arguments.first().type!!
            val subfields = argType.jvmErasure.process(name, argType, depth, parentPath, qualifiedModelName, ancestorNames)
            processData.addAll(subfields)
        }  else {
            members.filter { it.annotations.contains(Key()) }.forEach { f ->
                val fullPath = if (parentPath != null) "$parentPath/${f.name}" else f.name
                println("${"-".repeat(depth)} ${f.name}: ${f.returnType} (${fullPath.take(80)})")
                val newParentPath = if (parentPath == null) f.name else "$parentPath/${f.name}"
                val h = HandledData(type, f.returnType, qualifiedModelName, fullPath, parentPath)

                val alreadyHandled = handled.any {
                    it.type == f.returnType &&
                            it.superType == type &&
                            it.qualifiedModelName == qualifiedModelName &&
                            it.fullPath == fullPath
                }

                val isComplexType = when {
                    f.returnType.classifier == Map::class -> true
                    f.returnType.jvmErasure.supertypes.any { it.classifier == Collection::class } -> true
                    f.returnType.jvmErasure.java.superclass == GenericJson::class.java -> true
                    f.returnType.jvmErasure.allSuperclasses.any { it == GenericJson::class } -> true
                    else -> false
                }

                val shouldProcess = if (f.returnType.toString() in blacklist) {
                    isComplexType && !alreadyHandled && !blacklistOccurred[f.returnType.toString()]!!.occured
                } else {
                    isComplexType && !alreadyHandled
                }

                val qualifiedName = when {
                    f.returnType.classifier == Map::class -> {
                        "MapOf" + f.returnType.arguments.first().type!!.jvmErasure.qualifiedName!! + f.returnType.arguments.last().type!!.jvmErasure.qualifiedName!!
                    }
                    f.returnType.jvmErasure.supertypes.any { it.classifier == Collection::class } -> f.returnType.arguments.first().type!!.jvmErasure.qualifiedName!!
                    else ->  f.returnType.jvmErasure.qualifiedName!!
                }
                val newAncestorNames = ancestorNames + name
                val newAncestorTypes = ancestorTypes + type.toString()
                var setSubfieldToBlacklistData = false
                val subfields = if (shouldProcess) {
                    handled.add(h)
                    if (f.returnType.toString() in blacklist) {
                        setSubfieldToBlacklistData = true
                        blacklistOccurred[f.returnType.toString()]!!.apply {
                            occured = true
                        }
                    }
                    f.returnType.jvmErasure.java.kotlin.process(f.name, f.returnType, depth + 1, newParentPath, qualifiedModelName, newAncestorNames, newAncestorTypes).also {
                        if (setSubfieldToBlacklistData) {
                            blacklistOccurred[f.returnType.toString()]!!.apply {
                                subfields = it
                            }
                        }
                    }
                } else {
                    if (f.returnType.toString() in blacklist) {
                        setSubfieldToBlacklistData = true
                        emptyList()
                    } else emptyList()
                }
                val fieldData = FieldData(f.name, f.returnType.toString(), qualifiedName, newParentPath, subfields, ancestorNames = newAncestorNames, fullPath = fullPath, ancestorTypes = newAncestorTypes)
                if (setSubfieldToBlacklistData) {
                    blackListFieldData.add(fieldData)
                }
                processData.add(fieldData)
            }
        }

        return processData
    }

    models.forEachIndexed { i, it ->
        val res = StringBuilder()
        val model = it.simpleName
        println("$i: $model")
        val data = it.load().kotlin.let { it.process(it.simpleName ?: "", it.starProjectedType, qualifiedModelName = it.qualifiedName!!) }

        blackListFieldData.forEach {
            it.subfields = blacklistOccurred[it.type]?.subfields ?: it.subfields
        }

        res.append("""
package $destPackage

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ${model}Field : Field

object ${model}Fields {
    val ALL: FieldsList<${model}Field> = fieldsList("*")

        """.trimIndent())

        data.forEach { field ->
            if (field.subfields.isNotEmpty()) {
                val isRecursive = field.ancestorNames.contains(field.name)
                println("isRecursive: $isRecursive (${field.name} in ${field.ancestorNames})")
                if (!isRecursive) {
                    res.append("\tval ${field.name} = object : ${model}Field${field.qualifiedName.substringAfterLast('.')}(\"${field.name}\") {}\n")
                } else {
                    res.append("\tval ${field.name}: FieldsList<${model}Field> get() = fieldsList(\"${field.name}\")\n")
                }
//                res.append("\tval ${field.name} = object : ${model}Field${field.qualifiedName.substringAfterLast('.')}(\"${field.name}\") {}\n")
            } else {
                res.append("\tval ${field.name}: FieldsList<${model}Field> get() = fieldsList(\"${field.name}\")\n")
            }
        }

        res.append("}\n\n")

        val declared = mutableListOf<String>()
        var subfieldsToAdd = data.filter { it.subfields.isNotEmpty() }
        fun addSubfield() {
            val nextSubfieldsToAdd = mutableListOf<FieldData>()
            subfieldsToAdd.forEach { field ->
                val className = "${model}Field${field.qualifiedName.substringAfterLast('.')}"
                if (!declared.contains(className)) {
                    declared.add(className)
                    res.append("abstract class $className(private val path: String) : FieldsList<${model}Field>(path) {\n")
                    field.subfields.forEach { subfield ->
                        val subClassName = "${model}Field${subfield.qualifiedName.substringAfterLast('.')}"
                        val isRecursive = subfield.ancestorTypes.contains(subfield.type) ||
                                (subfield.ancestorNames.contains(subfield.name) &&
                                        subfield.type == field.type)

                        if (subfield.subfields.isNotEmpty() && !isRecursive) {
                            res.append("\tval ${subfield.name} by lazy { object : $subClassName(\"\${path}/${subfield.name}\") {} }\n")
                            nextSubfieldsToAdd.add(subfield)
                        } else {
                            res.append("\tval ${subfield.name}: FieldsList<${model}Field> get() = fieldsList(\"\${path}/${subfield.name}\")\n")
                        }
                    }
                    res.append("}\n\n")
                }
            }
            subfieldsToAdd = nextSubfieldsToAdd
        }

        do {
            addSubfield()
        } while (subfieldsToAdd.isNotEmpty())

        File("$path/${model}Fields.kt")
            .apply { createNewFile() }
            .writeText(res.toString())

        println()
    }
}