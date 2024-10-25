package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.ListHistoryResponse
import ru.raysmith.google.gmail.utils.fields.ListHistoryResponseField
import ru.raysmith.google.gmail.utils.fields.ListHistoryResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersHistoryService(private val service: Gmail.Users.History) {

    fun list(
		userId: String,
		fields: FieldsList<ListHistoryResponseField> = ListHistoryResponseFields.ALL,
		setup: Gmail.Users.History.List.() -> Unit = { }
	): ListHistoryResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}