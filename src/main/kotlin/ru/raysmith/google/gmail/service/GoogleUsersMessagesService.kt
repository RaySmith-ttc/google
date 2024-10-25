package ru.raysmith.google.gmail.service

import com.google.api.client.http.AbstractInputStreamContent
import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.*
import ru.raysmith.google.gmail.utils.fields.ListMessagesResponseField
import ru.raysmith.google.gmail.utils.fields.ListMessagesResponseFields
import ru.raysmith.google.gmail.utils.fields.MessageField
import ru.raysmith.google.gmail.utils.fields.MessageFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersMessagesService(private val service: Gmail.Users.Messages) {
	val Attachments = GoogleUsersMessagesAttachmentsService(service.attachments())

    fun untrash(
		userId: String, id: String,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Messages.Untrash.() -> Unit = { }
	): Message = service.untrash(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun trash(
		userId: String, id: String,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Messages.Trash.() -> Unit = { }
	): Message = service.trash(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun send(
		userId: String, content: Message, mediaContent: AbstractInputStreamContent? = null,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Messages.Send.() -> Unit = { }
	): Message = if (mediaContent == null) {
		service.send(userId, content)
	} else {
		service.send(userId, content, mediaContent)
	}.apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun modify(
		userId: String, id: String, content: ModifyMessageRequest,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Messages.Modify.() -> Unit = { }
	): Message = service.modify(userId, id, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		userId: String,
		fields: FieldsList<ListMessagesResponseField> = ListMessagesResponseFields.ALL,
		setup: Gmail.Users.Messages.List.() -> Unit = { }
	): ListMessagesResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun insert(
		userId: String, content: Message, mediaContent: AbstractInputStreamContent? = null,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Messages.Insert.() -> Unit = { }
	): Message = if (mediaContent == null) {
		service.insert(userId, content)
	} else {
		service.insert(userId, content, mediaContent)
	}.apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun gmailImport(
		userId: String, content: Message, mediaContent: AbstractInputStreamContent,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Messages.GmailImport.() -> Unit = { }
	): Message = service.gmailImport(userId, content, mediaContent).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, id: String,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Messages.Get.() -> Unit = { }
	): Message = service.get(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, id: String,
		setup: Gmail.Users.Messages.Delete.() -> Unit = { }
	) = service.delete(userId, id).apply(setup).execute()

	fun batchModify(
		userId: String, content: BatchModifyMessagesRequest,
		setup: Gmail.Users.Messages.BatchModify.() -> Unit = { }
	) = service.batchModify(userId, content).apply(setup).execute()

	fun batchDelete(
		userId: String, content: BatchDeleteMessagesRequest,
		setup: Gmail.Users.Messages.BatchDelete.() -> Unit = { }
	) = service.batchDelete(userId, content).apply(setup).execute()

}