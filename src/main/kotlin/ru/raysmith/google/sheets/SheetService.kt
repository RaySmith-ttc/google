package ru.raysmith.google.sheets

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.sheets.service.GoogleSheetsService

class SheetService(private val spreadsheetService: GoogleSheetsService, val service: Sheets) {

    fun find(spreadsheet: Spreadsheet, title: String) = spreadsheet.sheets.firstOrNull { it.properties.title == title }
    fun find(spreadsheet: Spreadsheet, id: Int) = spreadsheet.sheets.firstOrNull { it.properties.sheetId == id }
    fun create(spreadsheet: Spreadsheet, sheetTitle: String) = service.spreadsheets()
        .batchUpdate(
            spreadsheet.spreadsheetId, BatchUpdateSpreadsheetRequest().setRequests(listOf(
                Request().apply {
                    addSheet = AddSheetRequest().apply {
                        properties = SheetProperties().apply {
                            title = sheetTitle
                        }
                    }
                }
            )))
        .execute().replies.first().addSheet

    fun getOrCreate(spreadsheet: Spreadsheet, sheetTitle: String, headers: RowData? = null): Sheet {
        return find(spreadsheet, sheetTitle) ?: run {
            val newSheetResponse = create(spreadsheet, sheetTitle).properties.sheetId
            find(spreadsheet.refreshed(spreadsheetService), newSheetResponse)!!.also { newSheet ->
                if (headers != null) {
                    val data = table {
                        rows.add(headers)
                    }

                    val req = Request().setAppendCells(
                        AppendCellsRequest()
                            .setFields("*")
                            .setRows(data)
                            .setSheetId(newSheet.properties.sheetId)
                    )

                    service.spreadsheets()
                        .batchUpdate(spreadsheet.spreadsheetId, BatchUpdateSpreadsheetRequest().setRequests(listOf(req)))
                        .execute()
                }
            }
        }
    }
}