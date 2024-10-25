package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.Profile
import com.google.api.services.gmail.model.WatchRequest
import com.google.api.services.gmail.model.WatchResponse
import ru.raysmith.google.gmail.utils.fields.ProfileField
import ru.raysmith.google.gmail.utils.fields.ProfileFields
import ru.raysmith.google.gmail.utils.fields.WatchResponseField
import ru.raysmith.google.gmail.utils.fields.WatchResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersService(private val service: Gmail.Users) {
	val Drafts = GoogleUsersDraftsService(service.drafts())
	val History = GoogleUsersHistoryService(service.history())
	val Labels = GoogleUsersLabelsService(service.labels())
	val Messages = GoogleUsersMessagesService(service.messages())
	val Settings = GoogleUsersSettingsService(service.settings())
	val Threads = GoogleUsersThreadsService(service.threads())

    fun watch(
		userId: String, content: WatchRequest,
		fields: FieldsList<WatchResponseField> = WatchResponseFields.ALL,
		setup: Gmail.Users.Watch.() -> Unit = { }
	): WatchResponse = service.watch(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun stop(
		userId: String,
		setup: Gmail.Users.Stop.() -> Unit = { }
	) = service.stop(userId).apply(setup).execute()

	fun getProfile(
		userId: String,
		fields: FieldsList<ProfileField> = ProfileFields.ALL,
		setup: Gmail.Users.GetProfile.() -> Unit = { }
	): Profile = service.getProfile(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}