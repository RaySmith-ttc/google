package ru.raysmith.google.sheets.service

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.SheetsScopes
import com.google.api.services.sheets.v4.model.CellFormat
import com.google.auth.http.HttpCredentialsAdapter
import ru.raysmith.google.sheets.dsl.textFormat
import ru.raysmith.google.sheets.utils.cellFormat
import ru.raysmith.google.utils.GoogleUtils

class GoogleSheetsService(service: Sheets) {

    companion object {
		object Config {
			var defaultCellFormat: CellFormat = cellFormat {
				textFormat { }
			}
		}

        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = SheetsScopes.all()
        ): Sheets {
            return Sheets.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(GoogleUtils.createCredentials(secretPath, scopes))
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    val Spreadsheets = GoogleSpreadsheetsService(service.spreadsheets())
}