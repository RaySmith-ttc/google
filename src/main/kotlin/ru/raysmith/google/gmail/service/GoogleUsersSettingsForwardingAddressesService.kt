package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.ForwardingAddress
import com.google.api.services.gmail.model.ListForwardingAddressesResponse
import ru.raysmith.google.gmail.utils.fields.ForwardingAddressField
import ru.raysmith.google.gmail.utils.fields.ForwardingAddressFields
import ru.raysmith.google.gmail.utils.fields.ListForwardingAddressesResponseField
import ru.raysmith.google.gmail.utils.fields.ListForwardingAddressesResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsForwardingAddressesService(private val service: Gmail.Users.Settings.ForwardingAddresses) {

    fun list(
		userId: String,
		fields: FieldsList<ListForwardingAddressesResponseField> = ListForwardingAddressesResponseFields.ALL,
		setup: Gmail.Users.Settings.ForwardingAddresses.List.() -> Unit = { }
	): ListForwardingAddressesResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, forwardingEmail: String,
		fields: FieldsList<ForwardingAddressField> = ForwardingAddressFields.ALL,
		setup: Gmail.Users.Settings.ForwardingAddresses.Get.() -> Unit = { }
	): ForwardingAddress = service.get(userId, forwardingEmail).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, forwardingEmail: String,
		setup: Gmail.Users.Settings.ForwardingAddresses.Delete.() -> Unit = { }
	) = service.delete(userId, forwardingEmail).apply(setup).execute()

	fun create(
		userId: String, content: ForwardingAddress,
		fields: FieldsList<ForwardingAddressField> = ForwardingAddressFields.ALL,
		setup: Gmail.Users.Settings.ForwardingAddresses.Create.() -> Unit = { }
	): ForwardingAddress = service.create(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}