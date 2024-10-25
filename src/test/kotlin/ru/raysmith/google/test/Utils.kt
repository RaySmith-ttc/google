package ru.raysmith.google.test

import com.google.api.client.json.GenericJson
import ru.raysmith.google.docs.service.GoogleDocsService
import ru.raysmith.google.drive.service.GoogleDriveService
import ru.raysmith.google.gmail.GmailService
import ru.raysmith.google.sheets.service.GoogleSheetsService

val GmailService by lazy {
    GmailService(GmailService.service("Test"))
}

val DriveService by lazy {
    GoogleDriveService(GoogleDriveService.service("Test"))
}

val DocsService by lazy {
    GoogleDocsService(GoogleDocsService.service("Test"))
}

val SheetsService by lazy {
    GoogleSheetsService(GoogleSheetsService.service("Test"))
}

fun <T : GenericJson> T.prettyPrint() = println(factory.toPrettyString(this))