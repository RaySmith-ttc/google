package ru.raysmith.google

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.gson.GsonFactory

object GoogleUtils {
    const val DRIVE_BASE_URL = "https://drive.google.com/drive/folders/"
    const val FILE_BASE_URL = "https://drive.google.com/file/d/"
    const val SHEET_BASE_URL = "https://docs.google.com/spreadsheets/d/"
    val jsonFactory: GsonFactory = GsonFactory()
    val httpTransport: NetHttpTransport = GoogleNetHttpTransport.newTrustedTransport()

    fun parseIdFromLink(link: String): String {
        return when {
            link.contains("drive.google.com") -> link.substringAfterLast("/").substringBefore("?")
            link.contains("docs.google.com/") -> link.substringAfterLast("/d/").substringBefore("/")
            else -> error("Unsupported link")
        }

    }
}