package ru.raysmith.google.sheets.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.File
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetResponse
import com.google.api.services.sheets.v4.model.GetSpreadsheetByDataFilterRequest
import com.google.api.services.sheets.v4.model.Spreadsheet

class GoogleSpreadSheetsService(val service: Sheets.Spreadsheets) {
    val DeveloperMetadata = GoogleSpreadsheetsDeveloperMetadataService(service.developerMetadata())
    val SheetsOperations = GoogleSheetsOperationsService(service.sheets())
    val Values = GoogleSheetsValuesService(service.values())

    fun create(content: Spreadsheet, setup: Sheets.Spreadsheets.Create.() -> Unit = { }): Spreadsheet =
        service.create(content).apply(setup).execute()

    fun get(spreadsheetId: String, setup: Sheets.Spreadsheets.Get.() -> Unit = { }): Spreadsheet =
        service.get(spreadsheetId).apply(setup).execute()

    fun getByDataFilter(
        spreadsheetId: String, content: GetSpreadsheetByDataFilterRequest,
        setup: Sheets.Spreadsheets.GetByDataFilter.() -> Unit = { }
    ): Spreadsheet = service.getByDataFilter(spreadsheetId, content).apply(setup).execute()

    fun batchUpdate(
        spreadsheetId: String, content: BatchUpdateSpreadsheetRequest,
        setup: Sheets.Spreadsheets.BatchUpdate.() -> Unit = { }
    ): BatchUpdateSpreadsheetResponse = service.batchUpdate(spreadsheetId, content).apply(setup).execute()
}

fun GoogleSpreadSheetsService.copy(id: String, drive: Drive, content: File? = null, setup: Drive.Files.Copy.() -> Unit): File? {
    return drive.files()
        .copy(id, content)
        .apply(setup)
        .execute()
}

fun GoogleSpreadSheetsService.contains(spreadsheetId: String, range: Range, value: String, containsModeData: ContainsModeData = ContainsModeData.FULL): Boolean {
    return Values.get(spreadsheetId, range).contains(value, containsModeData)
}

fun GoogleSpreadSheetsService.indexOfRow(value: Any, spreadsheetId: String, range: Range): Int {
    val valueRange = Values.get(spreadsheetId, range)
    val idColumnIndex = valueRange.firstOrNull()?.indexOfFirst { it == "#" }?.let { if (it == -1) 0 else it } ?: 0
    return valueRange.indexOfFirst {
        it.size >= idColumnIndex + 1 && it[idColumnIndex] == value
    }
}