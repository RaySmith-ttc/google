package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.*
import ru.raysmith.google.gmail.utils.fields.CseKeyPairField
import ru.raysmith.google.gmail.utils.fields.CseKeyPairFields
import ru.raysmith.google.gmail.utils.fields.ListCseKeyPairsResponseField
import ru.raysmith.google.gmail.utils.fields.ListCseKeyPairsResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsCseKeypairsService(private val service: Gmail.Users.Settings.Cse.Keypairs) {

    fun obliterate(
		userId: String, keyPairId: String, content: ObliterateCseKeyPairRequest,
		setup: Gmail.Users.Settings.Cse.Keypairs.Obliterate.() -> Unit = { }
	) = service.obliterate(userId, keyPairId, content).apply(setup).execute()

	fun list(
		userId: String,
		fields: FieldsList<ListCseKeyPairsResponseField> = ListCseKeyPairsResponseFields.ALL,
		setup: Gmail.Users.Settings.Cse.Keypairs.List.() -> Unit = { }
	): ListCseKeyPairsResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, keyPairId: String,
		fields: FieldsList<CseKeyPairField> = CseKeyPairFields.ALL,
		setup: Gmail.Users.Settings.Cse.Keypairs.Get.() -> Unit = { }
	): CseKeyPair = service.get(userId, keyPairId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun enable(
		userId: String, keyPairId: String, content: EnableCseKeyPairRequest,
		fields: FieldsList<CseKeyPairField> = CseKeyPairFields.ALL,
		setup: Gmail.Users.Settings.Cse.Keypairs.Enable.() -> Unit = { }
	): CseKeyPair = service.enable(userId, keyPairId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun disable(
		userId: String, keyPairId: String, content: DisableCseKeyPairRequest,
		fields: FieldsList<CseKeyPairField> = CseKeyPairFields.ALL,
		setup: Gmail.Users.Settings.Cse.Keypairs.Disable.() -> Unit = { }
	): CseKeyPair = service.disable(userId, keyPairId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun create(
		userId: String, content: CseKeyPair,
		fields: FieldsList<CseKeyPairField> = CseKeyPairFields.ALL,
		setup: Gmail.Users.Settings.Cse.Keypairs.Create.() -> Unit = { }
	): CseKeyPair = service.create(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}