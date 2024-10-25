package ru.raysmith.google.gmail.service

import com.google.api.client.http.AbstractInputStreamContent
import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.Draft
import com.google.api.services.gmail.model.ListDraftsResponse
import com.google.api.services.gmail.model.Message
import ru.raysmith.google.gmail.utils.fields.*
import ru.raysmith.google.utils.FieldsList

class GoogleUsersDraftsService(private val service: Gmail.Users.Drafts) {

    fun update(
		userId: String, id: String, content: Draft, mediaContent: AbstractInputStreamContent,
		fields: FieldsList<DraftField> = DraftFields.ALL,
		setup: Gmail.Users.Drafts.Update.() -> Unit = { }
	): Draft = service.update(userId, id, content, mediaContent).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun send(
		userId: String, content: Draft, mediaContent: AbstractInputStreamContent? = null,
		fields: FieldsList<MessageField> = MessageFields.ALL,
		setup: Gmail.Users.Drafts.Send.() -> Unit = { }
	): Message = if (mediaContent == null) {
		service.send(userId, content)
	} else {
		service.send(userId, content, mediaContent)
	}.apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		userId: String,
		fields: FieldsList<ListDraftsResponseField> = ListDraftsResponseFields.ALL,
		setup: Gmail.Users.Drafts.List.() -> Unit = { }
	): ListDraftsResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, id: String,
		fields: FieldsList<DraftField> = DraftFields.ALL,
		setup: Gmail.Users.Drafts.Get.() -> Unit = { }
	): Draft = service.get(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, id: String,
		setup: Gmail.Users.Drafts.Delete.() -> Unit = { }
	) = service.delete(userId, id).apply(setup).execute()

	fun create(
		userId: String, content: Draft, mediaContent: AbstractInputStreamContent,
		fields: FieldsList<DraftField> = DraftFields.ALL,
		setup: Gmail.Users.Drafts.Create.() -> Unit = { }
	): Draft = service.create(userId, content, mediaContent).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}