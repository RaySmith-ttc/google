package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.CopySheetToAnotherSpreadsheetRequest
import com.google.api.services.sheets.v4.model.SheetProperties
import ru.raysmith.google.sheets.utils.fields.SheetPropertiesField
import ru.raysmith.google.sheets.utils.fields.SheetPropertiesFields
import ru.raysmith.google.utils.FieldsList

class GoogleSpreadsheetsSheetsService(private val service: Sheets.Spreadsheets.SheetsOperations) {

    fun copyTo(
		spreadsheetId: String, sheetId: Int, content: CopySheetToAnotherSpreadsheetRequest,
		fields: FieldsList<SheetPropertiesField> = SheetPropertiesFields.ALL,
		setup: Sheets.Spreadsheets.SheetsOperations.CopyTo.() -> Unit = { }
	): SheetProperties = service.copyTo(spreadsheetId, sheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}