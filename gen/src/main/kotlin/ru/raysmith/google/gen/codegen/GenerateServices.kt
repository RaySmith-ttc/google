package ru.raysmith.google.gen.codegen

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest
import com.google.api.services.sheets.v4.Sheets
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.full.functions
import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.full.starProjectedType
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.jvm.javaType
import kotlin.reflect.jvm.jvmErasure

// TODO Drive.Files.export -> executeMediaAsInputStream

private data class ArgData(val name: String, val type: String, val isOptional: Boolean)

fun <T : AbstractGoogleJsonClient> generateServices(
    service: KClass<T>,
    path: String,
    destPackage: String,
) {
    val serviceName = service.simpleName!!

    val resources = service.nestedClasses
        .filter { it.supertypes.none { it.classifier != Any::class } }
        .reversed()

    File(path + "/Google${serviceName}Service.kt").writeText(generateServiceClass(destPackage, service, resources))

    fun checkNested(resourceClass: KClass<*>, resourceName: String, serviceName: String) {
        resourceClass.nestedClasses
            .filter { it.supertypes.none { it.classifier != Any::class } }
            .reversed()
            .forEach {
                val name = getServiceName(it.simpleName!!)
                File(path + "/Google${resourceName}${name}Service.kt").writeText(generateResourceClass(destPackage, service, it, resourceName + name, "$serviceName.$resourceName"))

                checkNested(it, resourceName + name, serviceName)
            }
    }

    resources.forEach { resourceClass ->
        val resourceName = resourceClass.simpleName!!
        File(path + "/Google${resourceName}Service.kt").writeText(generateResourceClass(destPackage, service, resourceClass))

        checkNested(resourceClass, resourceName, service.simpleName!!)
    }
}

private fun  <T : AbstractGoogleJsonClient> generateResourceClass(
    destPackage: String,
    service: KClass<T>,
    resourceClass: KClass<*>,
    resourceClassName: String = resourceClass.simpleName!!,
    serviceName: String = service.simpleName!!
): String {
    val resourceName = resourceClass.simpleName!!
    println(resourceName)
    val additionalImports = mutableListOf<String>()

    return kotlin("""
package $destPackage

import ${service.qualifiedName}
import ru.raysmith.google.utils.FieldsList
%ADDITIONAL_IMPORTS%
class Google${resourceClassName}Service(private val service: ${getServiceName(serviceName)}.${resourceName}) {
${
    buildString {
        resourceClass.nestedClasses
            .filter { it.supertypes.none { it.classifier != Any::class } }
            .reversed()
            .forEach {
                val name = getServiceName(it.simpleName!!)
                append("\tval $name = Google${resourceClassName}${name}Service(service.${name.decapitalize()}())\n")
            }
    }
}
    ${
        resourceClass.nestedClasses
            .filter { it.supertypes.any { it.isRequest() } }
            .joinToString("\n\t") { requestClass ->
                val requestName = requestClass.simpleName!!
                println("- $requestName")
                
                val methodName = requestName.replaceFirstChar { it.lowercase() }

                val args = run {
                    val methods = resourceClass.functions.filter {
                        it.name == requestName.replaceFirstChar { ch -> ch.lowercase() }
                    }
                    check(methods.size == 1 || methods.size == 2)

                    val args1 = methods.getOrNull(1)?.let { method ->
                        val methodParams = method.parameters.filter { it.kind != KParameter.Kind.INSTANCE }
                        val paramNames = paranamer.lookupParameterNames(method.javaMethod)
                        println("--- [1] ${paramNames.joinToString(", ")}")

                        paramNames.mapIndexed { i, field ->
                            val type = methodParams[i].type
                            val qualifiedName = type.jvmErasure.qualifiedName!!
                            if (!qualifiedName.startsWith("java.lang")) {
                                additionalImports.add(qualifiedName)
                            }
                            ArgData(field, getArgType(serviceName, type.jvmErasure.simpleName!!, resourceName, methodName, field), false)
                        }
                    } ?: emptyList()

                    val args1Names = args1.map { it.name }.toSet()

                    val args2 = run {
                        val method = methods.first()
                        val methodParams = method.parameters.filter { it.kind != KParameter.Kind.INSTANCE }
                        val paramNames = paranamer.lookupParameterNames(method.javaMethod)
                        println("--- [2] ${paramNames.joinToString(", ")}")

                        paramNames.mapIndexedNotNull { i, field ->
                            if (args1Names.contains(field)) {
                                null
                            } else {
                                val type = methodParams[i].type
                                val qualifiedName = type.jvmErasure.qualifiedName!!
                                if (!qualifiedName.startsWith("java.lang")) {
                                    additionalImports.add(qualifiedName)
                                }
                                ArgData(field, getArgType(serviceName, type.jvmErasure.simpleName!!, resourceName, methodName, field), args1.isNotEmpty())
                            }
                        }
                    }

                    args1 + args2
                }
                
                check(args.filter { it.isOptional }.size <= 1)

                val returnType = requestClass.supertypes.first { it.isRequest() }
                    .arguments
                    .also { check(it.size == 1) }
                    .first()
                
                val simpleReturnName = returnType.type!!.javaType.typeName.split(".").last().let { if (it == "Void") null else it }
                val returnTypeName = simpleReturnName?.let { getReturnType(serviceName, it, resourceName, methodName) }

                if (returnTypeName != null) {
                    additionalImports.add(returnType.type!!.javaType.typeName)
                    
                    val packageName = serviceName.substringBefore('.').lowercase()
                    
                    additionalImports.add("ru.raysmith.google.${packageName}.utils.fields.${simpleReturnName}Field")
                    additionalImports.add("ru.raysmith.google.${packageName}.utils.fields.${simpleReturnName}Fields")
                }
                
                buildString {
                
                    append(kotlin("fun $methodName("))
                    if (args.isNotEmpty()) {
                        append(args.joinToString(", ", prefix = "\n\t\t", postfix = ",\n") { "${it.name}: ${it.type}${if (it.isOptional) "? = null" else ""}" })
                    } else {
                        append("\n")
                    }
                    if (returnTypeName != null) {
                        append(kotlin("\t\tfields: FieldsList<${simpleReturnName}Field> = ${simpleReturnName}Fields.ALL,\n"))
                    }
                    append(kotlin("\t\tsetup: ${getServiceName(serviceName)}.${resourceName}.${requestName}.() -> Unit = { }\n"))
                    append(kotlin("\t)${returnTypeName?.let { ": $it" } ?: ""} = "))
                    
                    val hasOptionalArg = args.any { it.isOptional }
                    if (hasOptionalArg) {
                        append(kotlin("if (${args.first { it.isOptional }.name} == null) {\n"))
                        append(kotlin("\t\tservice.${methodName}(${args.filter { !it.isOptional }.joinToString(", ") { it.name }})\n"))
                        append("\t} else {\n")
                        append(kotlin("\t\tservice.${methodName}(${args.joinToString(", ") { it.name }})\n"))
                        append("\t}")
                    } else {
                        append(kotlin("service.${methodName}(${args.joinToString(", ") { it.name }})"))
                    }
                    
                    if (returnTypeName != null) {
                        append(".apply {\n")
                        append("\t\tsetFields(fields.getValue())\n")
                        append("\t\tsetup()\n")
                        append("\t}.execute()\n")
                    } else {
                        append(".apply(setup).execute()\n")
                    }
                }
            }
    }
}
    """.trimIndent()).replace(
        "%ADDITIONAL_IMPORTS%",
        if (additionalImports.isEmpty()) "\n" else {
            additionalImports
                .filterAdditionalImports(serviceName, resourceName).distinct()
                .joinToString("") { "import $it\n" }
        }
    )
}

private fun <T : AbstractGoogleJsonClient> generateServiceClass(destPackage: String, service: KClass<T>, resources: List<KClass<*>>): String {
    val serviceName = service.simpleName!!
    return kotlin("""
package $destPackage

import ${service.qualifiedName}
import ${service.qualifiedName}Scopes
import com.google.auth.http.HttpCredentialsAdapter
import ru.raysmith.google.utils.GoogleUtils
import ru.raysmith.google.${serviceName.lowercase()}.service.*
${
    when(service) {
        Sheets::class -> buildString { 
            append("import com.google.api.services.sheets.v4.model.CellFormat\n")
            append("import ru.raysmith.google.sheets.utils.cellFormat\n")
            append("import ru.raysmith.google.sheets.dsl.textFormat\n")
        }
        else -> "\n"
    }
}
class Google${serviceName}Service(service: ${serviceName}) {
    companion object {${
        when(service) {
            Sheets::class -> buildString { 
                append("\n")
                append("\t\tobject Config {\n")
                append("\t\t\tvar defaultCellFormat: CellFormat = cellFormat {\n")
                append("\t\t\t\ttextFormat { }\n")
                append("\t\t\t}\n")
                append("\t\t}\n")
            }
            else -> ""
        }
    }
        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = ${serviceName}Scopes.all()
        ): $serviceName {
            return ${serviceName}.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(GoogleUtils.createCredentials(secretPath, scopes))
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    ${resources.joinToString("\n\t") {
        "val ${it.simpleName} = Google${it.simpleName}Service(service.${it.simpleName!!.replaceFirstChar { ch -> ch.lowercase() }}())"
    }}
}
    """.trimIndent())
}

private fun getServiceName(simpleName: String) = when {
    simpleName == "SheetsOperations" -> "Sheets"
    simpleName.startsWith("Gmail.") -> simpleName
        .replace(Regex("([a-z])([A-Z])"), "$1.$2")
        .replace(".Send.As", ".SendAs")
    else -> simpleName
}

private fun getArgType(serviceName: String, type: String, resourceName: String, methodName: String, argName: String): String {
    return when(serviceName) {
        "Drive" -> when(resourceName) {
            "Files" -> when(methodName) {
                "Update" -> when(argName) {
                    "mediaContent" -> "AbstractInputStreamContent"
                    else -> type
                }
                "Create" -> when(argName) {
                    "mediaContent" -> "AbstractInputStreamContent"
                    else -> type
                }
                else -> type
            }
            "Drives" -> if (type == "Drive") "com.google.api.services.drive.model.Drive" else type
            else -> type
        }
        else -> type
    }
}

private fun getReturnType(serviceName: String, type: String, resourceName: String, methodName: String): String {
    return when(serviceName) {
        "Drive" -> when(resourceName) {
            "Drives" -> if (type == "Drive") "com.google.api.services.drive.model.Drive" else type
            else -> type
        }
        else -> type
    }
}

private fun List<String>.filterAdditionalImports(serviceName: String, resourceName: String): List<String> {
    return when(serviceName) {
        "Drive" -> when(resourceName) {
            "Drives" -> filter { it != "com.google.api.services.drive.model.Drive" }
            else -> this
        }
        else -> this
    }
}

private fun KType.isRequest() = classifier!!.starProjectedType.isSubtypeOf(AbstractGoogleJsonClientRequest::class.starProjectedType)