package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.CopySheetToAnotherSpreadsheetRequest
import com.google.api.services.sheets.v4.model.SheetProperties

class GoogleSheetsOperationsService(val service: Sheets.Spreadsheets.SheetsOperations) {
    fun get(
        spreadsheetId: String, sheetId: Int, content: CopySheetToAnotherSpreadsheetRequest,
        setup: Sheets.Spreadsheets.SheetsOperations.CopyTo.() -> Unit
    ): SheetProperties = service.copyTo(spreadsheetId, sheetId, content).apply(setup).execute()
}