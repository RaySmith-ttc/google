package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.ListSendAsResponse
import com.google.api.services.gmail.model.SendAs
import ru.raysmith.google.gmail.utils.fields.ListSendAsResponseField
import ru.raysmith.google.gmail.utils.fields.ListSendAsResponseFields
import ru.raysmith.google.gmail.utils.fields.SendAsField
import ru.raysmith.google.gmail.utils.fields.SendAsFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsSendAsService(private val service: Gmail.Users.Settings.SendAs) {
	val SmimeInfo = GoogleUsersSettingsSendAsSmimeInfoService(service.smimeInfo())

    fun verify(
		userId: String, sendAsEmail: String,
		setup: Gmail.Users.Settings.SendAs.Verify.() -> Unit = { }
	) = service.verify(userId, sendAsEmail).apply(setup).execute()

	fun update(
		userId: String, sendAsEmail: String, content: SendAs,
		fields: FieldsList<SendAsField> = SendAsFields.ALL,
		setup: Gmail.Users.Settings.SendAs.Update.() -> Unit = { }
	): SendAs = service.update(userId, sendAsEmail, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun patch(
		userId: String, sendAsEmail: String, content: SendAs,
		fields: FieldsList<SendAsField> = SendAsFields.ALL,
		setup: Gmail.Users.Settings.SendAs.Patch.() -> Unit = { }
	): SendAs = service.patch(userId, sendAsEmail, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		userId: String,
		fields: FieldsList<ListSendAsResponseField> = ListSendAsResponseFields.ALL,
		setup: Gmail.Users.Settings.SendAs.List.() -> Unit = { }
	): ListSendAsResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, sendAsEmail: String,
		fields: FieldsList<SendAsField> = SendAsFields.ALL,
		setup: Gmail.Users.Settings.SendAs.Get.() -> Unit = { }
	): SendAs = service.get(userId, sendAsEmail).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, sendAsEmail: String,
		setup: Gmail.Users.Settings.SendAs.Delete.() -> Unit = { }
	) = service.delete(userId, sendAsEmail).apply(setup).execute()

	fun create(
		userId: String, content: SendAs,
		fields: FieldsList<SendAsField> = SendAsFields.ALL,
		setup: Gmail.Users.Settings.SendAs.Create.() -> Unit = { }
	): SendAs = service.create(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}