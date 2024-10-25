package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Comment
import com.google.api.services.drive.model.CommentList
import ru.raysmith.google.drive.utils.fields.CommentField
import ru.raysmith.google.drive.utils.fields.CommentFields
import ru.raysmith.google.drive.utils.fields.CommentListField
import ru.raysmith.google.drive.utils.fields.CommentListFields
import ru.raysmith.google.utils.FieldsList

class GoogleCommentsService(private val service: Drive.Comments) {

    fun update(
		fileId: String, commentId: String, content: Comment,
		fields: FieldsList<CommentField> = CommentFields.ALL,
		setup: Drive.Comments.Update.() -> Unit = { }
	): Comment = service.update(fileId, commentId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		fileId: String,
		fields: FieldsList<CommentListField> = CommentListFields.ALL,
		setup: Drive.Comments.List.() -> Unit = { }
	): CommentList = service.list(fileId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		fileId: String, commentId: String,
		fields: FieldsList<CommentField> = CommentFields.ALL,
		setup: Drive.Comments.Get.() -> Unit = { }
	): Comment = service.get(fileId, commentId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		fileId: String, commentId: String,
		setup: Drive.Comments.Delete.() -> Unit = { }
	) = service.delete(fileId, commentId).apply(setup).execute()

	fun create(
		fileId: String, content: Comment,
		fields: FieldsList<CommentField> = CommentFields.ALL,
		setup: Drive.Comments.Create.() -> Unit = { }
	): Comment = service.create(fileId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}