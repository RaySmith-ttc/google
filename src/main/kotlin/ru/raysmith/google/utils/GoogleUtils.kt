package ru.raysmith.google.utils

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.auth.oauth2.GoogleCredentials

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

    fun createCredentials(secretPath: String, scopes: Collection<String>): GoogleCredentials? {
        val secretStream = ClassLoader.getSystemClassLoader().getResourceAsStream(secretPath)
            ?: error("resource file '$secretPath' not found")
        return GoogleCredentials.fromStream(secretStream).createScoped(scopes)
    }
}