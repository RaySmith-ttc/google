package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.SheetsScopes
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetRequest
import com.google.api.services.sheets.v4.model.BatchUpdateSpreadsheetResponse
import com.google.api.services.sheets.v4.model.CellFormat
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import ru.raysmith.google.GoogleUtils
import ru.raysmith.google.sheets.utils.cellFormat
import ru.raysmith.google.sheets.utils.textFormat

class GoogleSheetsService(val sheets: Sheets) {

    companion object {
        object Config {
            var defaultCellFormat: CellFormat = cellFormat {
                textFormat = textFormat {  }
            }
        }

        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = SheetsScopes.all()
        ): Sheets {
            val secretStream = ClassLoader.getSystemClassLoader().getResourceAsStream(secretPath)
                ?: error("resource file '$secretPath' not found")
            val credentials = GoogleCredentials.fromStream(secretStream).createScoped(scopes)
            return Sheets.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(credentials)
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    fun requests(spreadsheetId: String, content: BatchUpdateSpreadsheetRequest): BatchUpdateSpreadsheetResponse {
        return sheets.spreadsheets().batchUpdate(spreadsheetId, content).execute()
    }

    val Sheets = SheetService(this, sheets)
    val Spreadsheets = GoogleSpreadsheetsService(sheets.spreadsheets())
}