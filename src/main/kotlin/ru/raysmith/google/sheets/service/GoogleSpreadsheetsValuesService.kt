package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.sheets.utils.fields.*
import ru.raysmith.google.utils.FieldsList

class GoogleSpreadsheetsValuesService(private val service: Sheets.Spreadsheets.Values) {

    fun update(
		spreadsheetId: String, range: String, content: ValueRange,
		fields: FieldsList<UpdateValuesResponseField> = UpdateValuesResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.Update.() -> Unit = { }
	): UpdateValuesResponse = service.update(spreadsheetId, range, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		spreadsheetId: String, range: String,
		fields: FieldsList<ValueRangeField> = ValueRangeFields.ALL,
		setup: Sheets.Spreadsheets.Values.Get.() -> Unit = { }
	): ValueRange = service.get(spreadsheetId, range).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun clear(
		spreadsheetId: String, range: String, content: ClearValuesRequest,
		fields: FieldsList<ClearValuesResponseField> = ClearValuesResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.Clear.() -> Unit = { }
	): ClearValuesResponse = service.clear(spreadsheetId, range, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchUpdateByDataFilter(
		spreadsheetId: String, content: BatchUpdateValuesByDataFilterRequest,
		fields: FieldsList<BatchUpdateValuesByDataFilterResponseField> = BatchUpdateValuesByDataFilterResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.BatchUpdateByDataFilter.() -> Unit = { }
	): BatchUpdateValuesByDataFilterResponse = service.batchUpdateByDataFilter(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchUpdate(
		spreadsheetId: String, content: BatchUpdateValuesRequest,
		fields: FieldsList<BatchUpdateValuesResponseField> = BatchUpdateValuesResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.BatchUpdate.() -> Unit = { }
	): BatchUpdateValuesResponse = service.batchUpdate(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchGetByDataFilter(
		spreadsheetId: String, content: BatchGetValuesByDataFilterRequest,
		fields: FieldsList<BatchGetValuesByDataFilterResponseField> = BatchGetValuesByDataFilterResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.BatchGetByDataFilter.() -> Unit = { }
	): BatchGetValuesByDataFilterResponse = service.batchGetByDataFilter(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchGet(
		spreadsheetId: String,
		fields: FieldsList<BatchGetValuesResponseField> = BatchGetValuesResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.BatchGet.() -> Unit = { }
	): BatchGetValuesResponse = service.batchGet(spreadsheetId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchClearByDataFilter(
		spreadsheetId: String, content: BatchClearValuesByDataFilterRequest,
		fields: FieldsList<BatchClearValuesByDataFilterResponseField> = BatchClearValuesByDataFilterResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.BatchClearByDataFilter.() -> Unit = { }
	): BatchClearValuesByDataFilterResponse = service.batchClearByDataFilter(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun batchClear(
		spreadsheetId: String, content: BatchClearValuesRequest,
		fields: FieldsList<BatchClearValuesResponseField> = BatchClearValuesResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.BatchClear.() -> Unit = { }
	): BatchClearValuesResponse = service.batchClear(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun append(
		spreadsheetId: String, range: String, content: ValueRange,
		fields: FieldsList<AppendValuesResponseField> = AppendValuesResponseFields.ALL,
		setup: Sheets.Spreadsheets.Values.Append.() -> Unit = { }
	): AppendValuesResponse = service.append(spreadsheetId, range, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}