package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetResponse
import com.google.api.services.sheets.v4.model.GetSpreadsheetByDataFilterRequest
import com.google.api.services.sheets.v4.model.Spreadsheet
import ru.raysmith.google.sheets.utils.fields.BatchUpdateSpreadsheetResponseField
import ru.raysmith.google.sheets.utils.fields.BatchUpdateSpreadsheetResponseFields
import ru.raysmith.google.sheets.utils.fields.SpreadsheetField
import ru.raysmith.google.sheets.utils.fields.SpreadsheetFields
import ru.raysmith.google.utils.FieldsList

class GoogleSpreadsheetsService(private val service: Sheets.Spreadsheets) {
	val DeveloperMetadata = GoogleSpreadsheetsDeveloperMetadataService(service.developerMetadata())
	val Sheets = GoogleSpreadsheetsSheetsService(service.sheets())
	val Values = GoogleSpreadsheetsValuesService(service.values())

    fun getByDataFilter(
		spreadsheetId: String, content: GetSpreadsheetByDataFilterRequest,
		fields: FieldsList<SpreadsheetField> = SpreadsheetFields.ALL,
		setup: Sheets.Spreadsheets.GetByDataFilter.() -> Unit = { }
	): Spreadsheet = service.getByDataFilter(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		spreadsheetId: String,
		fields: FieldsList<SpreadsheetField> = SpreadsheetFields.ALL,
		setup: Sheets.Spreadsheets.Get.() -> Unit = { }
	): Spreadsheet = service.get(spreadsheetId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun create(
		content: Spreadsheet,
		fields: FieldsList<SpreadsheetField> = SpreadsheetFields.ALL,
		setup: Sheets.Spreadsheets.Create.() -> Unit = { }
	): Spreadsheet = service.create(content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchUpdate(
		spreadsheetId: String, content: BatchUpdateSpreadsheetRequest,
		fields: FieldsList<BatchUpdateSpreadsheetResponseField> = BatchUpdateSpreadsheetResponseFields.ALL,
		setup: Sheets.Spreadsheets.BatchUpdate.() -> Unit = { }
	): BatchUpdateSpreadsheetResponse = service.batchUpdate(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}