package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.CseIdentity
import com.google.api.services.gmail.model.ListCseIdentitiesResponse
import ru.raysmith.google.gmail.utils.fields.CseIdentityField
import ru.raysmith.google.gmail.utils.fields.CseIdentityFields
import ru.raysmith.google.gmail.utils.fields.ListCseIdentitiesResponseField
import ru.raysmith.google.gmail.utils.fields.ListCseIdentitiesResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsCseIdentitiesService(private val service: Gmail.Users.Settings.Cse.Identities) {

    fun patch(
		userId: String, emailAddress: String, content: CseIdentity,
		fields: FieldsList<CseIdentityField> = CseIdentityFields.ALL,
		setup: Gmail.Users.Settings.Cse.Identities.Patch.() -> Unit = { }
	): CseIdentity = service.patch(userId, emailAddress, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		userId: String,
		fields: FieldsList<ListCseIdentitiesResponseField> = ListCseIdentitiesResponseFields.ALL,
		setup: Gmail.Users.Settings.Cse.Identities.List.() -> Unit = { }
	): ListCseIdentitiesResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, cseEmailAddress: String,
		fields: FieldsList<CseIdentityField> = CseIdentityFields.ALL,
		setup: Gmail.Users.Settings.Cse.Identities.Get.() -> Unit = { }
	): CseIdentity = service.get(userId, cseEmailAddress).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, cseEmailAddress: String,
		setup: Gmail.Users.Settings.Cse.Identities.Delete.() -> Unit = { }
	) = service.delete(userId, cseEmailAddress).apply(setup).execute()

	fun create(
		userId: String, content: CseIdentity,
		fields: FieldsList<CseIdentityField> = CseIdentityFields.ALL,
		setup: Gmail.Users.Settings.Cse.Identities.Create.() -> Unit = { }
	): CseIdentity = service.create(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}