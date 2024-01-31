package ru.raysmith.google.sheets

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.File
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*

class SpreadSheetsService(val sheets: Sheets) {
    fun get(id: String): Spreadsheet =
        sheets.spreadsheets().get(id).execute()

    fun create(title: String, setup: Spreadsheet.() -> Unit = { }): Spreadsheet {
        return sheets.spreadsheets().create(Spreadsheet().apply {
            this.properties = SpreadsheetProperties().setTitle(title)
            setup()
        }).execute()
    }

    fun createCopy(id: String, drive: Drive, content: File? = null, setSupportsAllDrives: Boolean = true): File? {
        return drive.files()
            .copy(id, content)
            .setSupportsAllDrives(setSupportsAllDrives)
            .execute()
    }

    fun values(spreadsheetId: String, range: Range): List<List<Any>> =
        sheets.spreadsheets().values().get(spreadsheetId, range.toString()).execute().getValues()

    fun contains(spreadsheetId: String, range: Range, value: String, containsModeData: ContainsModeData = ContainsModeData.FULL): Boolean {
        return values(spreadsheetId, range).contains(value, containsModeData)
    }

    fun indexOfRow(value: Any, spreadsheetId: String, range: Range): Int {
        val valueRange = values(spreadsheetId, range)
        val idColumnIndex = valueRange.firstOrNull()?.indexOfFirst { it == "#" }?.let { if (it == -1) 0 else it } ?: 0
        return valueRange.indexOfFirst {
            it.size >= idColumnIndex + 1 && it[idColumnIndex] == value
        }
    }

    fun batchUpdate(spreadsheetId: String, content: BatchUpdateSpreadsheetRequest) =
        sheets.spreadsheets().batchUpdate(spreadsheetId, content).execute()
}

fun batchUpdateSpreadsheetRequest(setup: BatchUpdateSpreadsheetRequest.() -> Unit) = BatchUpdateSpreadsheetRequest().apply(setup)
fun BatchUpdateSpreadsheetRequest.request(setup: Request.() -> Unit) {
    setRequests(requests.apply { add(ru.raysmith.google.sheets.request { setup() }) })
}

fun updateCellsRequest(setup: UpdateCellsRequest.() -> Unit) = UpdateCellsRequest().apply(setup)
fun gridCoordinate(setup: GridCoordinate.() -> Unit) = GridCoordinate().apply(setup)