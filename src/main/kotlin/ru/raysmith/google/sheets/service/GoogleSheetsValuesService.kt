package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*

class GoogleSheetsValuesService(val service: Sheets.Spreadsheets.Values) {

    fun get(
        spreadsheetId: String, range: String,
        setup: Sheets.Spreadsheets.Values.Get.() -> Unit = { }
    ): ValueRange = service.get(spreadsheetId, range).apply(setup).execute()

    fun batchGet(
        spreadsheetId: String,
        setup: Sheets.Spreadsheets.Values.BatchGet.() -> Unit = { }
    ): BatchGetValuesResponse = service.batchGet(spreadsheetId).apply(setup).execute()

    fun batchGetByDataFilter(
        spreadsheetId: String, content: BatchGetValuesByDataFilterRequest,
        setup: Sheets.Spreadsheets.Values.BatchGetByDataFilter.() -> Unit = { }
    ): BatchGetValuesByDataFilterResponse = service.batchGetByDataFilter(spreadsheetId, content).apply(setup).execute()

    fun append(
        spreadsheetId: String, range: String, content: ValueRange,
        setup: Sheets.Spreadsheets.Values.Append.() -> Unit = { }
    ): AppendValuesResponse = service.append(spreadsheetId, range, content).apply(setup).execute()

    fun update(
        spreadsheetId: String, range: String, content: ValueRange,
        setup: Sheets.Spreadsheets.Values.Update.() -> Unit = { }
    ): UpdateValuesResponse = service.update(spreadsheetId, range, content).apply(setup).execute()

    fun batchUpdate(
        spreadsheetId: String, content: BatchUpdateValuesRequest,
        setup: Sheets.Spreadsheets.Values.BatchUpdate.() -> Unit = { }
    ): BatchUpdateValuesResponse = service.batchUpdate(spreadsheetId, content).apply(setup).execute()

    fun batchUpdateByDataFilter(
        spreadsheetId: String, content: BatchUpdateValuesByDataFilterRequest,
        setup: Sheets.Spreadsheets.Values.BatchUpdateByDataFilter.() -> Unit = { }
    ): BatchUpdateValuesByDataFilterResponse? =
        service.batchUpdateByDataFilter(spreadsheetId, content).apply(setup).execute()

    fun clear(
        spreadsheetId: String, range: String, content: ClearValuesRequest,
        setup: Sheets.Spreadsheets.Values.Clear.() -> Unit = { }
    ): ClearValuesResponse = service.clear(spreadsheetId, range, content).apply(setup).execute()

    fun batchClear(
        spreadsheetId: String, content: BatchClearValuesRequest,
        setup: Sheets.Spreadsheets.Values.BatchClear.() -> Unit = { }
    ): BatchClearValuesResponse? = service.batchClear(spreadsheetId, content).apply(setup).execute()

    fun batchClearByDataFilter(
        spreadsheetId: String, content: BatchClearValuesByDataFilterRequest,
        setup: Sheets.Spreadsheets.Values.BatchClearByDataFilter.() -> Unit = { }
    ): BatchClearValuesByDataFilterResponse? =
        service.batchClearByDataFilter(spreadsheetId, content).apply(setup).execute()
}

fun GoogleSheetsValuesService.get(
    spreadsheetId: String, range: Range,
    setup: Sheets.Spreadsheets.Values.Get.() -> Unit = { }
): List<List<Any>> = service.get(spreadsheetId, range.toString()).apply(setup).execute().getValues()

fun GoogleSheetsValuesService.update(
    spreadsheetId: String, range: Range, content: ValueRange,
    setup: Sheets.Spreadsheets.Values.Update.() -> Unit = { }
) = update(spreadsheetId, range.toString(), content, setup)