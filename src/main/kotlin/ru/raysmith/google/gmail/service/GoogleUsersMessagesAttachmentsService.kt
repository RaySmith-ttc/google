package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.MessagePartBody
import ru.raysmith.google.gmail.utils.fields.MessagePartBodyField
import ru.raysmith.google.gmail.utils.fields.MessagePartBodyFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersMessagesAttachmentsService(private val service: Gmail.Users.Messages.Attachments) {

    fun get(
		userId: String, messageId: String, id: String,
		fields: FieldsList<MessagePartBodyField> = MessagePartBodyFields.ALL,
		setup: Gmail.Users.Messages.Attachments.Get.() -> Unit = { }
	): MessagePartBody = service.get(userId, messageId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}