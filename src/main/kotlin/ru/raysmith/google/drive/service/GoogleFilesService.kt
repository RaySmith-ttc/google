package ru.raysmith.google.drive.service

import com.google.api.client.http.AbstractInputStreamContent
import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.*
import ru.raysmith.google.drive.utils.fields.*
import ru.raysmith.google.utils.FieldsList

class GoogleFilesService(private val service: Drive.Files) {

    fun watch(
		fileId: String, content: Channel,
		fields: FieldsList<ChannelField> = ChannelFields.ALL,
		setup: Drive.Files.Watch.() -> Unit = { }
	): Channel = service.watch(fileId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun update(
		fileId: String, content: File, mediaContent: AbstractInputStreamContent? = null,
		fields: FieldsList<FileField> = FileFields.ALL,
		setup: Drive.Files.Update.() -> Unit = { }
	): File = if (mediaContent == null) {
		service.update(fileId, content)
	} else {
		service.update(fileId, content, mediaContent)
	}.apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun modifyLabels(
		fileId: String, content: ModifyLabelsRequest,
		fields: FieldsList<ModifyLabelsResponseField> = ModifyLabelsResponseFields.ALL,
		setup: Drive.Files.ModifyLabels.() -> Unit = { }
	): ModifyLabelsResponse = service.modifyLabels(fileId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun listLabels(
		fileId: String,
		fields: FieldsList<LabelListField> = LabelListFields.ALL,
		setup: Drive.Files.ListLabels.() -> Unit = { }
	): LabelList = service.listLabels(fileId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		fields: FieldsList<FileListField> = FileListFields.ALL,
		setup: Drive.Files.List.() -> Unit = { }
	): FileList = service.list().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		fileId: String,
		fields: FieldsList<FileField> = FileFields.ALL,
		setup: Drive.Files.Get.() -> Unit = { }
	): File = service.get(fileId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun generateIds(
		fields: FieldsList<GeneratedIdsField> = GeneratedIdsFields.ALL,
		setup: Drive.Files.GenerateIds.() -> Unit = { }
	): GeneratedIds = service.generateIds().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun export(
		fileId: String, mimeType: String,
		setup: Drive.Files.Export.() -> Unit = { }
	) = service.export(fileId, mimeType).apply(setup).execute()

	fun emptyTrash(
		setup: Drive.Files.EmptyTrash.() -> Unit = { }
	) = service.emptyTrash().apply(setup).execute()

	fun download(
		fileId: String,
		fields: FieldsList<OperationField> = OperationFields.ALL,
		setup: Drive.Files.Download.() -> Unit = { }
	): Operation = service.download(fileId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		fileId: String,
		setup: Drive.Files.Delete.() -> Unit = { }
	) = service.delete(fileId).apply(setup).execute()

	fun create(
		content: File, mediaContent: AbstractInputStreamContent? = null,
		fields: FieldsList<FileField> = FileFields.ALL,
		setup: Drive.Files.Create.() -> Unit = { }
	): File = if (mediaContent == null) {
		service.create(content)
	} else {
		service.create(content, mediaContent)
	}.apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun copy(
		fileId: String, content: File,
		fields: FieldsList<FileField> = FileFields.ALL,
		setup: Drive.Files.Copy.() -> Unit = { }
	): File = service.copy(fileId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}