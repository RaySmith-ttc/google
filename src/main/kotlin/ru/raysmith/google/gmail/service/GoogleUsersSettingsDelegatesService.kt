package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.Delegate
import com.google.api.services.gmail.model.ListDelegatesResponse
import ru.raysmith.google.gmail.utils.fields.DelegateField
import ru.raysmith.google.gmail.utils.fields.DelegateFields
import ru.raysmith.google.gmail.utils.fields.ListDelegatesResponseField
import ru.raysmith.google.gmail.utils.fields.ListDelegatesResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsDelegatesService(private val service: Gmail.Users.Settings.Delegates) {

    fun list(
		userId: String,
		fields: FieldsList<ListDelegatesResponseField> = ListDelegatesResponseFields.ALL,
		setup: Gmail.Users.Settings.Delegates.List.() -> Unit = { }
	): ListDelegatesResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, delegateEmail: String,
		fields: FieldsList<DelegateField> = DelegateFields.ALL,
		setup: Gmail.Users.Settings.Delegates.Get.() -> Unit = { }
	): Delegate = service.get(userId, delegateEmail).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, delegateEmail: String,
		setup: Gmail.Users.Settings.Delegates.Delete.() -> Unit = { }
	) = service.delete(userId, delegateEmail).apply(setup).execute()

	fun create(
		userId: String, content: Delegate,
		fields: FieldsList<DelegateField> = DelegateFields.ALL,
		setup: Gmail.Users.Settings.Delegates.Create.() -> Unit = { }
	): Delegate = service.create(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}