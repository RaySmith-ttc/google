package ru.raysmith.google.gen.codegen

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
import java.io.File
import kotlin.reflect.KClass

fun <T : AbstractGoogleJsonClient> generateBuilders(
    service: KClass<T>,
    buildersFile: String,
    destPackage: String
) {
    val models = collectModels(service.modelPackageName)
    val res = StringBuilder()
    val imports = mutableListOf<String>()

    models.forEach {
        val typeName = when(it.simpleName) {
            "List" -> {
                imports.add(it.load().kotlin.qualifiedName!!)
                it.simpleName
            }
            else -> it.simpleName
        }

        res.append("fun ${it.simpleName.decapitalize()}(setup: ${typeName}.() -> Unit) = ${it.simpleName}().apply(setup)\n")
    }

    File(buildersFile).writeText(buildString {
        append("@file:Suppress(\"unused\")\n")
        append("\n")
        append("package $destPackage\n")
        append("\n")
        append("import ${service.modelPackageName}.*")
        append("\n")
        if (imports.isNotEmpty()) {
            imports.forEach {
                append("import $it").append("\n")
            }
            append("\n")
        }
        append(res)
    }.replace(".*\nfun", ".*\n\nfun"))
}
