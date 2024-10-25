package ru.raysmith.google.gen.sheets
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import ru.raysmith.google.gen.codegen.BASE_URL
import ru.raysmith.google.gen.codegen.BuilderData
import ru.raysmith.google.gen.codegen.containsSame
import ru.raysmith.google.gen.codegen.kotlin
import java.io.File

fun main() {
    val pages = Jsoup.connect("https://developers.google.com/sheets/api/reference/rest").get()
        .select("devsite-book-nav").first().select("ul[class=devsite-nav-section]").first()
        .children()
        .dropWhile { it.text() != "REST Resources" }.drop(1)
        .dropLastWhile { it.text() != "Types" }.dropLast(1)
        .flatMap {
            it.select("a").map { it.attr("href").replace(BASE_URL.dropLast(1), "") }
        }.filter { it.isNotEmpty() }

    val builders = mutableListOf<BuilderData>()
    val buildersDeclared = mutableListOf<String>()
    val res = StringBuilder()

    fun getBuilderName(builderData: BuilderData): String {
        return if (builders.containsSame(builderData)) {
            builderData.originalInterfaceName
        } else {
            builderData.renamedVariantInterfaceName
        }
    }

    fun getBuilderData(resource: String, fieldName: String): BuilderData {
        return builders.first { it.renamedVariantInterfaceName == resource + fieldName.capitalize() + "Builder" }
    }

    fun Element.resource(page: String): String {
        return parent()!!.id().let {
            when {
                it == "DeveloperMetadata.DeveloperMetadataLocation" -> "DeveloperMetadataLocation"
                page == "/sheets/api/reference/rest/v4/spreadsheets/batchUpdate" && it == "body.request_body" -> "BatchUpdateSpreadsheetRequest"
                page == "/sheets/api/reference/rest/v4/spreadsheets/batchUpdate" && it == "body.response_body" -> "BatchUpdateSpreadsheetResponse"
                page == "/sheets/api/reference/rest/v4/spreadsheets/getByDataFilter" && it == "body.request_body" -> "GetSpreadsheetByDataFilterRequest"
                page == "/sheets/api/reference/rest/v4/spreadsheets.developerMetadata/search" && it == "body.request_body" -> "SearchDeveloperMetadataRequest"
                page == "/sheets/api/reference/rest/v4/spreadsheets.values/batchClearByDataFilter" && it == "body.request_body" -> "BatchClearValuesByDataFilterRequest"
                page == "/sheets/api/reference/rest/v4/spreadsheets.values/batchGetByDataFilter" && it == "body.request_body" -> "BatchGetValuesByDataFilterRequest"
                page == "/sheets/api/reference/rest/v4/spreadsheets.values/batchUpdateByDataFilter" && it == "body.request_body" -> "BatchUpdateValuesByDataFilterRequest"
                page == "/sheets/api/reference/rest/v4/spreadsheets.values/batchUpdate" && it == "body.request_body" -> "BatchUpdateValuesRequest"
                it.startsWith("body.") -> it.drop(5)
                else -> it
            }
        }
    }

    fun Document.fieldSections(block: (fieldSection: Element) -> Unit) {
        select("section").filter { s -> s.id().endsWith(".FIELDS") }.forEach { fieldSection ->
            block(fieldSection)
        }
    }

    fun Element.trs(block: (tr: Element) -> Unit) {
        select("tbody").select("tr")
            .filter { it -> it.className() != "alt" }
            .forEach {
                block(it)
            }
    }

    fun Element.onField(
        onArray: (fieldName: String, typeName: String, link: String) -> Unit = { _, _, _ -> },
        onObject:  (fieldName: String, typeName: String) -> Unit = { _, _ -> }
    ) {
        val `object` = select("td")[1].text()
        if (`object`.startsWith("object (")) {
            val field = select("td").first()!!.text()
            val link = select("a").first()!!.attr("href")
            val typeName = `object`.substring(8, `object`.indexOf(")"))
            if (field.endsWith("[]")) {
                val fieldName = field.dropLast(2).replace(" (deprecated)", "")
                onArray(fieldName, typeName, link)
            } else {
                val fieldName = field.replace(" (deprecated)", "")
                onObject(fieldName, typeName)
            }
        }
    }

    pages.mapIndexed { pageI, page ->
        Jsoup.connect("$BASE_URL$page").get().also {
            println("${(((pageI + 1.0) / pages.size.toDouble()) * 100).toInt()}%...")
        }.also {
            it.fieldSections { fieldSection ->
                fieldSection.trs { tr ->
                    tr.onField(
                        onArray = { fieldName, typeName, link ->
                            val resource = fieldSection.resource(page)
                            val builderName = resource + fieldName.capitalize() + "Builder"
                            val origFunName = typeName.replaceFirstChar { it.lowercase() }
                            val orig = fieldName.capitalize() + "Builder"
                            val interfaceFunName = when {
                                resource == "DataSourceTable" && origFunName == "dataSourceColumnReference" -> "column"
                                resource == "ColumnsBuilder" && origFunName == "dataSourceColumnReference" -> "column"
                                orig == "RowsBuilder" && origFunName == "rowData" -> "row"
                                else -> origFunName
                            }

                            builders.add(BuilderData(orig, builderName, link, interfaceFunName, typeName))
                        },
                    )
                }
            }
        }
    }.also {
        builders.filter { b1 -> builders.containsSame(b1) }.forEach {
            if (!buildersDeclared.contains(it.originalInterfaceName)) {
                res.append(
                    kotlin("""
                    interface ${it.originalInterfaceName} {

                        @GoogleDSL
                        fun ${it.interfaceFunName}(setup: ${it.typeName}.() -> Unit)
                        val all: List<${it.typeName}>
                    }
                """.trimIndent())
                )
                res.append("\n\n")

                buildersDeclared.add(it.originalInterfaceName)
            }
        }
        res.append("\n\n// ${"-".repeat(117)}\n\n")
    }.forEachIndexed { index, document ->
        val page = pages[index]

        document.fieldSections { fieldSection ->
            val resource by lazy { fieldSection.resource(page) }
            fieldSection.trs { tr ->
                tr.onField(
                    onArray = { fieldName, typeName, link ->
                        val builderData = getBuilderData(resource, fieldName)
                        val builderName = getBuilderName(builderData)

                        if (!buildersDeclared.contains(builderName)) {
                            res.append(
                                kotlin("""
                                interface $builderName {

                                    @GoogleDSL
                                    fun ${builderData.interfaceFunName}(setup: $typeName.() -> Unit)
                                    val all: List<$typeName>
                                }
                                """.trimIndent())
                            )
                            res.append("\n\n")
                        }
                        res.append(
                            kotlin("""
                                @GoogleDSL
                                fun ${resource}.${fieldName}(setup: $builderName.() -> Unit) {
                                    val builder = object : $builderName {
                                        override val all = mutableListOf<$typeName>()

                                        @GoogleDSL
                                        override fun ${builderData.interfaceFunName}(setup: $typeName.() -> Unit) {
                                            all.add($typeName().apply(setup))
                                        }
                                    }

                                    ${
                                when {
                                    resource == "RowData" && fieldName == "values" -> kotlin("this.setValues(builder.apply(setup).all)")
                                    resource == "BooleanCondition" && fieldName == "values" -> kotlin("this.setValues(builder.apply(setup).all)")
                                    resource == "PivotTable" && fieldName == "values" -> kotlin("this.setValues(builder.apply(setup).all)")
                                    else -> kotlin("this.${fieldName} = builder.apply(setup).all")
                                }
                            }
                                }
                            """.trimIndent())
                        )
                        res.append("\n\n// ${"-".repeat(117)}\n\n")
                        buildersDeclared.add(builderName)
                    },
                    onObject = { fieldName, typeName ->
                        res.append(
                            kotlin("""
                                @GoogleDSL
                                fun ${resource}.${fieldName}(setup: ${typeName}.() -> Unit) {
                                    $fieldName = ${typeName}().apply(setup)
                                }
                            """.trimIndent())
                        )
                        res.append("\n\n// ${"-".repeat(117)}\n\n")
                    }
                )
            }
        }
    }

    File("src/main/kotlin/ru/raysmith/google/sheets/dsl/DSL.kt").writeText("""
package ru.raysmith.google.sheets.dsl

import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.utils.GoogleDSL

$res
        """.trimIndent())
}