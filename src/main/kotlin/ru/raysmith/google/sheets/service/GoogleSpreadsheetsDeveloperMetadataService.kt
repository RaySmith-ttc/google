package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.DeveloperMetadata
import com.google.api.services.sheets.v4.model.SearchDeveloperMetadataRequest
import com.google.api.services.sheets.v4.model.SearchDeveloperMetadataResponse
import ru.raysmith.google.sheets.utils.fields.DeveloperMetadataField
import ru.raysmith.google.sheets.utils.fields.DeveloperMetadataFields
import ru.raysmith.google.sheets.utils.fields.SearchDeveloperMetadataResponseField
import ru.raysmith.google.sheets.utils.fields.SearchDeveloperMetadataResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleSpreadsheetsDeveloperMetadataService(private val service: Sheets.Spreadsheets.DeveloperMetadata) {

    fun search(
		spreadsheetId: String, content: SearchDeveloperMetadataRequest,
		fields: FieldsList<SearchDeveloperMetadataResponseField> = SearchDeveloperMetadataResponseFields.ALL,
		setup: Sheets.Spreadsheets.DeveloperMetadata.Search.() -> Unit = { }
	): SearchDeveloperMetadataResponse = service.search(spreadsheetId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		spreadsheetId: String, metadataId: Int,
		fields: FieldsList<DeveloperMetadataField> = DeveloperMetadataFields.ALL,
		setup: Sheets.Spreadsheets.DeveloperMetadata.Get.() -> Unit = { }
	): DeveloperMetadata = service.get(spreadsheetId, metadataId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}