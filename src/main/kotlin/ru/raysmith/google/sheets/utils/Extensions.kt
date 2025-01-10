package ru.raysmith.google.sheets.utils

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.File
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.sheets.dsl.addSheet
import ru.raysmith.google.sheets.dsl.requests
import ru.raysmith.google.sheets.service.GoogleSheetsService
import ru.raysmith.google.sheets.service.GoogleSpreadsheetsService
import ru.raysmith.google.sheets.service.GoogleSpreadsheetsValuesService
import ru.raysmith.google.sheets.utils.fields.*
import ru.raysmith.google.utils.FieldsList

/** Applies [GridRange.startColumnIndex] and [GridRange.endColumnIndex] as result of [getGoogleSheetColumnsRange] */
fun GridRange.applyColumnsRange(column1: String, column2: String) {
    getGoogleSheetColumnsRange(column1, column2).let {
        startColumnIndex = it.first
        endColumnIndex = it.last
    }
}

/** Returns first [Sheet] in this spreadsheet by title or null */
fun Spreadsheet.findSheet(title: String) = sheets.firstOrNull { it.properties.title == title }

/** Returns [Sheet] in this spreadsheet by id or null */
fun Spreadsheet.findSheet(id: Int) = sheets.firstOrNull { it.properties.sheetId == id }

fun GoogleSpreadsheetsService.copy(id: String, drive: Drive, content: File? = null, setup: Drive.Files.Copy.() -> Unit): File? {
    return drive.files()
        .copy(id, content)
        .apply(setup)
        .execute()
}

fun GoogleSpreadsheetsService.contains(spreadsheetId: String, range: Range, value: String, containsModeData: ContainsModeData = ContainsModeData.FULL): Boolean {
    return Values.get(spreadsheetId, range).contains(value, containsModeData)
}

fun GoogleSpreadsheetsService.indexOfRow(value: Any, spreadsheetId: String, range: Range): Int {
    val valueRange = Values.get(spreadsheetId, range)
    val idColumnIndex = valueRange.firstOrNull()?.indexOfFirst { it.value == "#" }?.let { if (it == -1) 0 else it } ?: 0
    return valueRange.indexOfFirst {
        it.size >= idColumnIndex + 1 && it[idColumnIndex].value == value
    }
}

fun GoogleSpreadsheetsValuesService.get(
    spreadsheetId: String, range: Range,
    fields: FieldsList<ValueRangeField> = ValueRangeFields.ALL,
    setup: Sheets.Spreadsheets.Values.Get.() -> Unit = { }
): List<List<Value>> = get(spreadsheetId, range.toString(), fields, setup).getValues()
    .map { it.map { v -> Value(v) } }

fun GoogleSpreadsheetsValuesService.update(
    spreadsheetId: String, range: Range, content: ValueRange,
    fields: FieldsList<UpdateValuesResponseField> = UpdateValuesResponseFields.ALL,
    setup: Sheets.Spreadsheets.Values.Update.() -> Unit = { }
) = update(spreadsheetId, range.toString(), content, fields, setup)

fun GoogleSpreadsheetsValuesService.append(
    spreadsheetId: String, range: Range, content: ValueRange,
    fields: FieldsList<AppendValuesResponseField> = AppendValuesResponseFields.ALL,
    setup: Sheets.Spreadsheets.Values.Append.() -> Unit = { }
) = append(spreadsheetId, range.toString(), content, fields, setup)

fun GoogleSpreadsheetsService.createSheet(
    spreadsheetId: String, addSheet: AddSheetRequest.() -> Unit
): AddSheetResponse = batchUpdate(
    spreadsheetId, batchUpdateSpreadsheetRequest {
        requests {
            request {
                addSheet(addSheet)
            }
        }
    }
).replies.first().addSheet

fun GoogleSpreadsheetsService.getOrCreate(spreadsheet: Spreadsheet, sheetTitle: String, headers: RowData? = null): Sheet {
    return spreadsheet.findSheet(sheetTitle) ?: run {
        val newSheetResponse = createSheet(spreadsheet.spreadsheetId, { properties.title = sheetTitle }).properties.sheetId
        spreadsheet.refreshed(this).findSheet(newSheetResponse)!!.also { newSheet ->
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

                batchUpdate(spreadsheet.spreadsheetId, BatchUpdateSpreadsheetRequest().setRequests(listOf(req)))
            }
        }
    }
}

@Deprecated("repeated batchUpdate", ReplaceWith("Spreadsheets.batchUpdate(spreadsheetId, content)"))
fun GoogleSheetsService.requests(spreadsheetId: String, content: BatchUpdateSpreadsheetRequest): BatchUpdateSpreadsheetResponse {
    return Spreadsheets.batchUpdate(spreadsheetId, content)
}