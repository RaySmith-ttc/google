package ru.raysmith.google.drive

import com.google.api.client.http.AbstractInputStreamContent
import com.google.api.client.http.InputStreamContent
import com.google.api.services.drive.Drive
import com.google.api.services.drive.DriveScopes
import com.google.api.services.drive.model.File
import com.google.api.services.drive.model.Permission
import com.google.api.services.drive.model.PermissionList
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import ru.raysmith.google.GoogleUtils
import java.io.InputStream

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

    // TODO separate services
    val Permissions = GooglePermissionService(service)
    val files = service.files()
    val drives = service.drives()
    val replies = service.replies()
    val teamdrives = service.teamdrives()
    val about = service.about()
    val changes = service.changes()
    val channels = service.channels()
    val comments = service.comments()
    val revisions = service.revisions()

    fun create(file: File, stream: InputStream, setup: Drive.Files.Create.() -> Unit = {}): File =
        create(file, InputStreamContent(null, stream), setup)

    fun create(file: File, content: AbstractInputStreamContent, setup: Drive.Files.Create.() -> Unit = {}): File = service.files()
        .create(file, content).apply(setup).execute()

    fun get(fileId: String, setup: Drive.Files.Get.() -> Unit = {}): File = service.files().get(fileId).apply(setup).execute()
}

class GooglePermissionService(val service: Drive) {
    fun create(fileId: String, permission: Permission, setup: Drive.Permissions.Create.() -> Unit): Permission =
        service.permissions().create(fileId, permission).apply(setup).execute()

    fun delete(fileId: String, permissionId: String, setup: Drive.Permissions.Delete.() -> Unit) {
        service.permissions().delete(fileId, permissionId).apply(setup).execute()
    }

    fun update(fileId: String, permissionId: String, permission: Permission, setup: Drive.Permissions.Update.() -> Unit): Permission =
        service.permissions().update(fileId, permissionId, permission).apply(setup).execute()

    fun get(fileId: String, permissionId: String, setup: Drive.Permissions.Get.() -> Unit): Permission =
        service.permissions().get(fileId, permissionId).apply(setup).execute()

    fun list(fileId: String, setup: Drive.Permissions.List.() -> Unit): PermissionList =
        service.permissions().list(fileId).apply(setup).execute()
}