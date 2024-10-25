package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.DriveScopes
import com.google.auth.http.HttpCredentialsAdapter
import ru.raysmith.google.utils.GoogleUtils


class GoogleDriveService(service: Drive) {
    companion object {
        fun service(
            applicationName: String, secretPath: String = "secret.json", scopes: Collection<String> = DriveScopes.all()
        ): Drive {
            return Drive.Builder(
                GoogleUtils.httpTransport,
                GoogleUtils.jsonFactory,
                HttpCredentialsAdapter(GoogleUtils.createCredentials(secretPath, scopes))
            )
                .setApplicationName(applicationName)
                .build()
        }
    }

    val About = GoogleAboutService(service.about())
	val Apps = GoogleAppsService(service.apps())
	val Changes = GoogleChangesService(service.changes())
	val Channels = GoogleChannelsService(service.channels())
	val Comments = GoogleCommentsService(service.comments())
	val Drives = GoogleDrivesService(service.drives())
	val Files = GoogleFilesService(service.files())
	val Operation = GoogleOperationService(service.operation())
	val Operations = GoogleOperationsService(service.operations())
	val Permissions = GooglePermissionsService(service.permissions())
	val Replies = GoogleRepliesService(service.replies())
	val Revisions = GoogleRevisionsService(service.revisions())
	val Teamdrives = GoogleTeamdrivesService(service.teamdrives())
}