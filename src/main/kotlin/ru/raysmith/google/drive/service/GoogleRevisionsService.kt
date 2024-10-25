package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Revision
import com.google.api.services.drive.model.RevisionList
import ru.raysmith.google.drive.utils.fields.RevisionField
import ru.raysmith.google.drive.utils.fields.RevisionFields
import ru.raysmith.google.drive.utils.fields.RevisionListField
import ru.raysmith.google.drive.utils.fields.RevisionListFields
import ru.raysmith.google.utils.FieldsList

class GoogleRevisionsService(private val service: Drive.Revisions) {

    fun update(
		fileId: String, revisionId: String, content: Revision,
		fields: FieldsList<RevisionField> = RevisionFields.ALL,
		setup: Drive.Revisions.Update.() -> Unit = { }
	): Revision = service.update(fileId, revisionId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		fileId: String,
		fields: FieldsList<RevisionListField> = RevisionListFields.ALL,
		setup: Drive.Revisions.List.() -> Unit = { }
	): RevisionList = service.list(fileId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		fileId: String, revisionId: String,
		fields: FieldsList<RevisionField> = RevisionFields.ALL,
		setup: Drive.Revisions.Get.() -> Unit = { }
	): Revision = service.get(fileId, revisionId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		fileId: String, revisionId: String,
		setup: Drive.Revisions.Delete.() -> Unit = { }
	) = service.delete(fileId, revisionId).apply(setup).execute()

}