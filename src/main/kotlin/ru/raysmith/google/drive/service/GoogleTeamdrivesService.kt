package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.TeamDrive
import com.google.api.services.drive.model.TeamDriveList
import ru.raysmith.google.drive.utils.fields.TeamDriveField
import ru.raysmith.google.drive.utils.fields.TeamDriveFields
import ru.raysmith.google.drive.utils.fields.TeamDriveListField
import ru.raysmith.google.drive.utils.fields.TeamDriveListFields
import ru.raysmith.google.utils.FieldsList

class GoogleTeamdrivesService(private val service: Drive.Teamdrives) {

    fun update(
		teamDriveId: String, content: TeamDrive,
		fields: FieldsList<TeamDriveField> = TeamDriveFields.ALL,
		setup: Drive.Teamdrives.Update.() -> Unit = { }
	): TeamDrive = service.update(teamDriveId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		fields: FieldsList<TeamDriveListField> = TeamDriveListFields.ALL,
		setup: Drive.Teamdrives.List.() -> Unit = { }
	): TeamDriveList = service.list().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		teamDriveId: String,
		fields: FieldsList<TeamDriveField> = TeamDriveFields.ALL,
		setup: Drive.Teamdrives.Get.() -> Unit = { }
	): TeamDrive = service.get(teamDriveId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		teamDriveId: String,
		setup: Drive.Teamdrives.Delete.() -> Unit = { }
	) = service.delete(teamDriveId).apply(setup).execute()

	fun create(
		requestId: String, content: TeamDrive,
		fields: FieldsList<TeamDriveField> = TeamDriveFields.ALL,
		setup: Drive.Teamdrives.Create.() -> Unit = { }
	): TeamDrive = service.create(requestId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}