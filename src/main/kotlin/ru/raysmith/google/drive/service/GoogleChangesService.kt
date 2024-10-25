package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.ChangeList
import com.google.api.services.drive.model.Channel
import com.google.api.services.drive.model.StartPageToken
import ru.raysmith.google.drive.utils.fields.*
import ru.raysmith.google.utils.FieldsList

class GoogleChangesService(private val service: Drive.Changes) {

    fun watch(
		pageToken: String, content: Channel,
		fields: FieldsList<ChannelField> = ChannelFields.ALL,
		setup: Drive.Changes.Watch.() -> Unit = { }
	): Channel = service.watch(pageToken, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		pageToken: String,
		fields: FieldsList<ChangeListField> = ChangeListFields.ALL,
		setup: Drive.Changes.List.() -> Unit = { }
	): ChangeList = service.list(pageToken).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun getStartPageToken(
		fields: FieldsList<StartPageTokenField> = StartPageTokenFields.ALL,
		setup: Drive.Changes.GetStartPageToken.() -> Unit = { }
	): StartPageToken = service.getStartPageToken().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}