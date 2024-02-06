package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.DeveloperMetadata
import com.google.api.services.sheets.v4.model.SearchDeveloperMetadataRequest
import com.google.api.services.sheets.v4.model.SearchDeveloperMetadataResponse

class GoogleSpreadsheetsDeveloperMetadataService(val service: Sheets.Spreadsheets.DeveloperMetadata) {
    fun get(
        spreadsheetId: String, metadataId: Int,
        setup: Sheets.Spreadsheets.DeveloperMetadata.Get.() -> Unit
    ): DeveloperMetadata = service.get(spreadsheetId, metadataId).apply(setup).execute()

    fun search(
        spreadsheetId: String, content: SearchDeveloperMetadataRequest,
        setup: Sheets.Spreadsheets.DeveloperMetadata.Search.() -> Unit
    ): SearchDeveloperMetadataResponse = service.search(spreadsheetId, content).apply(setup).execute()
}