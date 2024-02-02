package ru.raysmith.google.drive.service

import com.google.api.client.http.AbstractInputStreamContent
import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.*
import java.io.InputStream

class GoogleFilesService(val service: Drive.Files) {
    fun get(fileId: String, setup: Drive.Files.Get.() -> Unit = { }): File = service.get(fileId).apply(setup).execute()

    fun list(setup: Drive.Files.List.() -> Unit = { }): FileList = service.list().apply(setup).execute()

    fun listLabels(fileId: String, setup: Drive.Files.ListLabels.() -> Unit): LabelList =
        service.listLabels(fileId).apply(setup).execute()

    fun modifyLabels(
        fileId: String, content: ModifyLabelsRequest, setup: Drive.Files.ModifyLabels.() -> Unit = { }
    ): ModifyLabelsResponse = service.modifyLabels(fileId, content).apply(setup).execute()

    fun create(
        content: File, mediaContent: AbstractInputStreamContent? = null, setup: Drive.Files.Create.() -> Unit = { }
    ): File = if (mediaContent == null) {
        service.create(content).apply(setup).execute()
    } else {
        service.create(content, mediaContent).apply(setup).execute()
    }

    fun update(
        fileId: String,
        content: File,
        mediaContent: AbstractInputStreamContent? = null,
        setup: Drive.Files.Update.() -> Unit = { }
    ): File = if (mediaContent == null) {
        service.update(fileId, content).apply(setup).execute()
    } else {
        service.update(fileId, content, mediaContent).apply(setup).execute()
    }

    fun copy(
        fileId: String, content: File, setup: Drive.Files.Copy.() -> Unit = { }
    ): File = service.copy(fileId, content).apply(setup).execute()

    fun delete(fileId: String, setup: Drive.Files.Delete.() -> Unit = { }) {
        service.delete(fileId).apply(setup).execute()
    }

    fun emptyTrash(setup: Drive.Files.EmptyTrash.() -> Unit = { }) {
        service.emptyTrash().apply(setup).execute()
    }

    fun generateIds(setup: Drive.Files.GenerateIds.() -> Unit = { }): GeneratedIds =
        service.generateIds().apply(setup).execute()

    fun watch(fileId: String, content: Channel, setup: Drive.Files.Watch.() -> Unit = { }): Channel =
        service.watch(fileId, content).apply(setup).execute()

    fun export(fileId: String, mimeType: String, setup: Drive.Files.Export.() -> Unit = { }): InputStream =
        service.export(fileId, mimeType).apply(setup).executeAsInputStream()
}

