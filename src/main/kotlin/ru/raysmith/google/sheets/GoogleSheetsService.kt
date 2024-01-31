package ru.raysmith.google.sheets

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.SheetsScopes
import com.google.api.services.sheets.v4.model.*
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import ru.raysmith.google.GoogleUtils
import ru.raysmith.google.model.api.HorizontalAlign
import ru.raysmith.google.model.api.WrapStrategy

class GoogleSheetsService(val sheets: Sheets) {

    companion object {
        object Config {
            var defaultCellFormat: CellFormat = CellFormat().setTextFormat(TextFormat()).apply {
                this.horizontalAlignment = HorizontalAlign.LEFT.name
                this.wrapStrategy = WrapStrategy.WRAP.name
            }
        }

        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = SheetsScopes.all()
        ): Sheets {
            val secretStream = ClassLoader.getSystemClassLoader().getResourceAsStream(secretPath)
                ?: error("resource file '$secretPath' not found")
            val credentials = GoogleCredentials.fromStream(secretStream).createScoped(scopes)
            return Sheets.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(credentials)
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    fun requests(spreadsheetId: String, vararg requests: Request): BatchUpdateSpreadsheetResponse {
        return sheets.spreadsheets().batchUpdate(spreadsheetId, BatchUpdateSpreadsheetRequest().apply {
            this.requests = requests.toList()
        }).execute()
    }

    val Sheets = SheetService(this, sheets)
    val SpreadSheets = SpreadSheetsService(sheets)
}

fun List<List<Any>>.contains(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL) =
    findRow(value, containsModeData) != null

fun List<List<Any>>.findRow(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL) = find { row ->
    row.any {
        when(containsModeData.mode) {
            ContainsMode.FULL -> it == value
            ContainsMode.PATH -> it is String && value is String && it.contains(value, ignoreCase = containsModeData.ignoreCase)
            ContainsMode.START_WITH -> it is String && value is String && it.startsWith(value, ignoreCase = containsModeData.ignoreCase)
            ContainsMode.END_WITH -> it is String && value is String && it.endsWith(value, ignoreCase = containsModeData.ignoreCase)
            ContainsMode.MATCH -> it is String && value is String && it.matches(value.toRegex())
        }
    }
}

fun List<Any>.columnIndex(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL) = indexOfFirst {
    when(containsModeData.mode) {
        ContainsMode.FULL -> it == value
        ContainsMode.PATH -> it is String && value is String && it.contains(value, ignoreCase = containsModeData.ignoreCase)
        ContainsMode.START_WITH -> it is String && value is String && it.startsWith(value, ignoreCase = containsModeData.ignoreCase)
        ContainsMode.END_WITH -> it is String && value is String && it.endsWith(value, ignoreCase = containsModeData.ignoreCase)
        ContainsMode.MATCH -> it is String && value is String && it.matches(value.toRegex())
    }
}

class ContainsModeData private constructor(val mode: ContainsMode, val ignoreCase: Boolean = true) {
    companion object {
        val FULL = ContainsModeData(ContainsMode.FULL)
        val PATH = ContainsModeData(ContainsMode.PATH)
        val START_WITH = ContainsModeData(ContainsMode.START_WITH)
        val END_WITH = ContainsModeData(ContainsMode.END_WITH)
        val MATCH = ContainsModeData(ContainsMode.MATCH)
    }
    
    fun ignoreCase(value: Boolean) = ContainsModeData(mode, value)
    
    fun <T> findIn(data: List<T>, value: Any) = data.find {
        when(mode) {
            ContainsMode.FULL -> it == value
            ContainsMode.PATH -> it is String && value is String && it.contains(value, ignoreCase = ignoreCase)
            ContainsMode.START_WITH -> it is String && value is String && it.startsWith(value, ignoreCase = ignoreCase)
            ContainsMode.END_WITH -> it is String && value is String && it.endsWith(value, ignoreCase = ignoreCase)
            ContainsMode.MATCH -> it is String && value is String && it.matches(value.toRegex())
        }
    }
}

enum class ContainsMode {
    FULL, PATH, START_WITH, END_WITH, MATCH
}

data class Range(val sheet: String? = null, val cells: String? = null) {
    companion object {
        val DEFAULT = Range("Sheet1", null)
    }
    
    override fun toString(): String = "${sheet?.let { "'$it'" } ?: ""}${if (sheet != null && cells != null) "!" else ""}${cells ?: ""}"
}
enum class RangeMode {
    SHEET, CELLS
}
fun String.toRange(mode: RangeMode = RangeMode.SHEET) = when(mode) {
    RangeMode.SHEET -> Range(this, null)
    RangeMode.CELLS -> Range(null, this)
}



