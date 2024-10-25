package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.DriveList
import ru.raysmith.google.drive.utils.fields.DriveField
import ru.raysmith.google.drive.utils.fields.DriveFields
import ru.raysmith.google.drive.utils.fields.DriveListField
import ru.raysmith.google.drive.utils.fields.DriveListFields
import ru.raysmith.google.utils.FieldsList

class GoogleDrivesService(private val service: Drive.Drives) {

    fun update(
		driveId: String, content: com.google.api.services.drive.model.Drive,
		fields: FieldsList<DriveField> = DriveFields.ALL,
		setup: Drive.Drives.Update.() -> Unit = { }
	): com.google.api.services.drive.model.Drive = service.update(driveId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun unhide(
		driveId: String,
		fields: FieldsList<DriveField> = DriveFields.ALL,
		setup: Drive.Drives.Unhide.() -> Unit = { }
	): com.google.api.services.drive.model.Drive = service.unhide(driveId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		fields: FieldsList<DriveListField> = DriveListFields.ALL,
		setup: Drive.Drives.List.() -> Unit = { }
	): DriveList = service.list().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun hide(
		driveId: String,
		fields: FieldsList<DriveField> = DriveFields.ALL,
		setup: Drive.Drives.Hide.() -> Unit = { }
	): com.google.api.services.drive.model.Drive = service.hide(driveId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		driveId: String,
		fields: FieldsList<DriveField> = DriveFields.ALL,
		setup: Drive.Drives.Get.() -> Unit = { }
	): com.google.api.services.drive.model.Drive = service.get(driveId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		driveId: String,
		setup: Drive.Drives.Delete.() -> Unit = { }
	) = service.delete(driveId).apply(setup).execute()

	fun create(
		requestId: String, content: com.google.api.services.drive.model.Drive,
		fields: FieldsList<DriveField> = DriveFields.ALL,
		setup: Drive.Drives.Create.() -> Unit = { }
	): com.google.api.services.drive.model.Drive = service.create(requestId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}