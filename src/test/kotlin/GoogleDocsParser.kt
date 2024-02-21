
import org.intellij.lang.annotations.Language
import org.jsoup.Jsoup
import java.io.File
import kotlin.test.Test


class GoogleDocsParser {

    val BASE_URL = "https://developers.google.com/"

    val pages = listOf(
        "/sheets/api/reference/rest/v4/spreadsheets",
        "/sheets/api/reference/rest/v4/spreadsheets/sheets",
        "/sheets/api/reference/rest/v4/spreadsheets/cells",
        "/sheets/api/reference/rest/v4/spreadsheets/pivot-tables",
        "/sheets/api/reference/rest/v4/spreadsheets/charts",
        "/sheets/api/reference/rest/v4/spreadsheets/other",
        "/sheets/api/reference/rest/v4/spreadsheets/batchUpdate",
        "/sheets/api/reference/rest/v4/spreadsheets/request",
        "/sheets/api/reference/rest/v4/spreadsheets/response",
        "/sheets/api/reference/rest/v4/spreadsheets/create",
        "/sheets/api/reference/rest/v4/spreadsheets/get",
        "/sheets/api/reference/rest/v4/spreadsheets/getByDataFilter",
        "/sheets/api/reference/rest/v4/spreadsheets.developerMetadata",
        "/sheets/api/reference/rest/v4/spreadsheets.developerMetadata/get",
        "/sheets/api/reference/rest/v4/spreadsheets.developerMetadata/search",
        "/sheets/api/reference/rest/v4/spreadsheets.sheets",
        "/sheets/api/reference/rest/v4/spreadsheets.sheets/copyTo",
        "/sheets/api/reference/rest/v4/spreadsheets.values",
        "/sheets/api/reference/rest/v4/spreadsheets.values/append",
        "/sheets/api/reference/rest/v4/spreadsheets.values/batchClear",
        "/sheets/api/reference/rest/v4/spreadsheets.values/batchClearByDataFilter",
        "/sheets/api/reference/rest/v4/spreadsheets.values/batchGet",
        "/sheets/api/reference/rest/v4/spreadsheets.values/batchGetByDataFilter",
        "/sheets/api/reference/rest/v4/spreadsheets.values/batchUpdate",
        "/sheets/api/reference/rest/v4/spreadsheets.values/batchUpdateByDataFilter",
        "/sheets/api/reference/rest/v4/spreadsheets.values/clear",
        "/sheets/api/reference/rest/v4/spreadsheets.values/get",
        "/sheets/api/reference/rest/v4/spreadsheets.values/update",
        "/sheets/api/reference/rest/v4/DataFilter",
        "/sheets/api/reference/rest/v4/DateTimeRenderOption",
        "/sheets/api/reference/rest/v4/Dimension",
        "/sheets/api/reference/rest/v4/DimensionRange",
        "/sheets/api/reference/rest/v4/ErrorCode",
        "/sheets/api/reference/rest/v4/ErrorDetails",
        "/sheets/api/reference/rest/v4/UpdateValuesResponse",
        "/sheets/api/reference/rest/v4/ValueInputOption",
        "/sheets/api/reference/rest/v4/ValueRenderOption",
    )

    fun kotlin(@Language("kotlin") str: String) = str

    @Test
    fun sheets() {
        val declared = mutableListOf<String>()
        val res = StringBuilder()

        pages.forEach { page ->
            Jsoup.connect("$BASE_URL$page").get()
                .select("section").filter { it -> it.id().endsWith(".FIELDS") }.forEach { fieldSection ->
                    val resource by lazy { fieldSection.parent()!!.id() }
                    fieldSection.select("tbody").select("tr").filter { it -> it.className() != "alt" }.forEach { tr ->
                        val `object` = tr.select("td")[1].text()
                        if (`object`.startsWith("object (")) {
                            val field = tr.select("td").first()!!.text()
                            val typeName = `object`.substring(8, `object`.indexOf(")"))
                            if (field.endsWith("[]")) {
                                val fieldName = field.dropLast(2)
                                    .replace(" (deprecated)", "")

                                val builderName = fieldName.capitalize() + "Builder"
                                val funName = typeName.replaceFirstChar { it.lowercase() }

                                if (!declared.contains(builderName)) {

                                    res.append(kotlin("""
                                    interface $builderName {

                                        @GoogleDSL
                                        fun ${funName}(setup: $typeName.() -> Unit)
                                        val all: List<$typeName>
                                    }
                                    """.trimIndent()))
                                    res.append("\n\n")
                                }
                                res.append(kotlin("""
                                    @GoogleDSL
                                    fun ${resource}.${fieldName}(setup: $builderName.() -> Unit) {
                                        val builder = object : $builderName {
                                            override val all = mutableListOf<$typeName>()

                                            @GoogleDSL
                                            override fun ${funName}(setup: $typeName.() -> Unit) {
                                                all.add($typeName().apply(setup))
                                            }
                                        }

                                        this.${fieldName} = builder.apply(setup).all
                                    }
                                """.trimIndent()))
                                declared.add(builderName)
                            } else {
                                val fieldName = field.replace(" (deprecated)", "")
                                res.append(kotlin("""
                                    @GoogleDSL
                                    fun ${resource}.${fieldName}(setup: ${typeName}.() -> Unit) {
                                        ${fieldName} = ${typeName}().apply(setup)
                                    }
                                """.trimIndent()))
                            }
                            res.append("\n\n// ---------------------------------------------------------------------------------------------------------------------\n\n")
                        }
                    }
                }
        }

        File("src/main/kotlin/ru/raysmith/google/sheets/dsl/DSL.kt").writeText("""
package ru.raysmith.google.sheets.dsl

import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.sheets.utils.GoogleDSL

$res
        """.trimIndent())
    }

    @Test
    fun drive() {
        // TODO
    }
}