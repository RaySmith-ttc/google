package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.*
import ru.raysmith.google.gmail.utils.fields.*
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsService(private val service: Gmail.Users.Settings) {
	val Cse = GoogleUsersSettingsCseService(service.cse())
	val Delegates = GoogleUsersSettingsDelegatesService(service.delegates())
	val Filters = GoogleUsersSettingsFiltersService(service.filters())
	val ForwardingAddresses = GoogleUsersSettingsForwardingAddressesService(service.forwardingAddresses())
	val SendAs = GoogleUsersSettingsSendAsService(service.sendAs())

    fun updateVacation(
		userId: String, content: VacationSettings,
		fields: FieldsList<VacationSettingsField> = VacationSettingsFields.ALL,
		setup: Gmail.Users.Settings.UpdateVacation.() -> Unit = { }
	): VacationSettings = service.updateVacation(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun updatePop(
		userId: String, content: PopSettings,
		fields: FieldsList<PopSettingsField> = PopSettingsFields.ALL,
		setup: Gmail.Users.Settings.UpdatePop.() -> Unit = { }
	): PopSettings = service.updatePop(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun updateLanguage(
		userId: String, content: LanguageSettings,
		fields: FieldsList<LanguageSettingsField> = LanguageSettingsFields.ALL,
		setup: Gmail.Users.Settings.UpdateLanguage.() -> Unit = { }
	): LanguageSettings = service.updateLanguage(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun updateImap(
		userId: String, content: ImapSettings,
		fields: FieldsList<ImapSettingsField> = ImapSettingsFields.ALL,
		setup: Gmail.Users.Settings.UpdateImap.() -> Unit = { }
	): ImapSettings = service.updateImap(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun updateAutoForwarding(
		userId: String, content: AutoForwarding,
		fields: FieldsList<AutoForwardingField> = AutoForwardingFields.ALL,
		setup: Gmail.Users.Settings.UpdateAutoForwarding.() -> Unit = { }
	): AutoForwarding = service.updateAutoForwarding(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun getVacation(
		userId: String,
		fields: FieldsList<VacationSettingsField> = VacationSettingsFields.ALL,
		setup: Gmail.Users.Settings.GetVacation.() -> Unit = { }
	): VacationSettings = service.getVacation(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun getPop(
		userId: String,
		fields: FieldsList<PopSettingsField> = PopSettingsFields.ALL,
		setup: Gmail.Users.Settings.GetPop.() -> Unit = { }
	): PopSettings = service.getPop(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun getLanguage(
		userId: String,
		fields: FieldsList<LanguageSettingsField> = LanguageSettingsFields.ALL,
		setup: Gmail.Users.Settings.GetLanguage.() -> Unit = { }
	): LanguageSettings = service.getLanguage(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun getImap(
		userId: String,
		fields: FieldsList<ImapSettingsField> = ImapSettingsFields.ALL,
		setup: Gmail.Users.Settings.GetImap.() -> Unit = { }
	): ImapSettings = service.getImap(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun getAutoForwarding(
		userId: String,
		fields: FieldsList<AutoForwardingField> = AutoForwardingFields.ALL,
		setup: Gmail.Users.Settings.GetAutoForwarding.() -> Unit = { }
	): AutoForwarding = service.getAutoForwarding(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}