package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.DriveScopes
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import ru.raysmith.google.GoogleUtils

class GoogleDriveService(val service: Drive) {

    companion object {
        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = DriveScopes.all()
        ): Drive {
            val secretStream = ClassLoader.getSystemClassLoader().getResourceAsStream(secretPath)
                ?: error("resource file '$secretPath' not found")
            val credentials = GoogleCredentials.fromStream(secretStream).createScoped(scopes)
            return Drive.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(credentials)
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    val About = GoogleAboutService(service.about())
    val Apps = GoogleAppsService(service.apps())
    val Changes = GoogleChangesService(service.changes())
    val Channels = GoogleChannelsService(service.channels())
    val Comments = GoogleCCommentsService(service.comments())
    val Drives = GoogleDrivesService(service.drives())
    val Files = GoogleFilesService(service.files())
    val Permissions = GooglePermissionService(service.permissions())
    val Replies = GoogleRepliesService(service.replies())
    val Revisions = GoogleRevisionsService(service.revisions())
    val Teamdrives = GoogleTeamDrivesService(service.teamdrives())
}