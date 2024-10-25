package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.ListSmimeInfoResponse
import com.google.api.services.gmail.model.SmimeInfo
import ru.raysmith.google.gmail.utils.fields.ListSmimeInfoResponseField
import ru.raysmith.google.gmail.utils.fields.ListSmimeInfoResponseFields
import ru.raysmith.google.gmail.utils.fields.SmimeInfoField
import ru.raysmith.google.gmail.utils.fields.SmimeInfoFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsSendAsSmimeInfoService(private val service: Gmail.Users.Settings.SendAs.SmimeInfo) {

    fun setDefault(
		userId: String, sendAsEmail: String, id: String,
		setup: Gmail.Users.Settings.SendAs.SmimeInfo.SetDefault.() -> Unit = { }
	) = service.setDefault(userId, sendAsEmail, id).apply(setup).execute()

	fun list(
		userId: String, sendAsEmail: String,
		fields: FieldsList<ListSmimeInfoResponseField> = ListSmimeInfoResponseFields.ALL,
		setup: Gmail.Users.Settings.SendAs.SmimeInfo.List.() -> Unit = { }
	): ListSmimeInfoResponse = service.list(userId, sendAsEmail).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun insert(
		userId: String, sendAsEmail: String, content: SmimeInfo,
		fields: FieldsList<SmimeInfoField> = SmimeInfoFields.ALL,
		setup: Gmail.Users.Settings.SendAs.SmimeInfo.Insert.() -> Unit = { }
	): SmimeInfo = service.insert(userId, sendAsEmail, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, sendAsEmail: String, id: String,
		fields: FieldsList<SmimeInfoField> = SmimeInfoFields.ALL,
		setup: Gmail.Users.Settings.SendAs.SmimeInfo.Get.() -> Unit = { }
	): SmimeInfo = service.get(userId, sendAsEmail, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, sendAsEmail: String, id: String,
		setup: Gmail.Users.Settings.SendAs.SmimeInfo.Delete.() -> Unit = { }
	) = service.delete(userId, sendAsEmail, id).apply(setup).execute()

}