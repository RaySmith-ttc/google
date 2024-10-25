package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Reply
import com.google.api.services.drive.model.ReplyList
import ru.raysmith.google.drive.utils.fields.ReplyField
import ru.raysmith.google.drive.utils.fields.ReplyFields
import ru.raysmith.google.drive.utils.fields.ReplyListField
import ru.raysmith.google.drive.utils.fields.ReplyListFields
import ru.raysmith.google.utils.FieldsList

class GoogleRepliesService(private val service: Drive.Replies) {

    fun update(
		fileId: String, commentId: String, replyId: String, content: Reply,
		fields: FieldsList<ReplyField> = ReplyFields.ALL,
		setup: Drive.Replies.Update.() -> Unit = { }
	): Reply = service.update(fileId, commentId, replyId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		fileId: String, commentId: String,
		fields: FieldsList<ReplyListField> = ReplyListFields.ALL,
		setup: Drive.Replies.List.() -> Unit = { }
	): ReplyList = service.list(fileId, commentId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		fileId: String, commentId: String, replyId: String,
		fields: FieldsList<ReplyField> = ReplyFields.ALL,
		setup: Drive.Replies.Get.() -> Unit = { }
	): Reply = service.get(fileId, commentId, replyId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		fileId: String, commentId: String, replyId: String,
		setup: Drive.Replies.Delete.() -> Unit = { }
	) = service.delete(fileId, commentId, replyId).apply(setup).execute()

	fun create(
		fileId: String, commentId: String, content: Reply,
		fields: FieldsList<ReplyField> = ReplyFields.ALL,
		setup: Drive.Replies.Create.() -> Unit = { }
	): Reply = service.create(fileId, commentId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}