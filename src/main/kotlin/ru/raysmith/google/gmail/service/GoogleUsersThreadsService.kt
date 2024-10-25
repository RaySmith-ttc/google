package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.ListThreadsResponse
import com.google.api.services.gmail.model.ModifyThreadRequest
import com.google.api.services.gmail.model.Thread
import ru.raysmith.google.gmail.utils.fields.ListThreadsResponseField
import ru.raysmith.google.gmail.utils.fields.ListThreadsResponseFields
import ru.raysmith.google.gmail.utils.fields.ThreadField
import ru.raysmith.google.gmail.utils.fields.ThreadFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersThreadsService(private val service: Gmail.Users.Threads) {

    fun untrash(
		userId: String, id: String,
		fields: FieldsList<ThreadField> = ThreadFields.ALL,
		setup: Gmail.Users.Threads.Untrash.() -> Unit = { }
	): Thread = service.untrash(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun trash(
		userId: String, id: String,
		fields: FieldsList<ThreadField> = ThreadFields.ALL,
		setup: Gmail.Users.Threads.Trash.() -> Unit = { }
	): Thread = service.trash(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun modify(
		userId: String, id: String, content: ModifyThreadRequest,
		fields: FieldsList<ThreadField> = ThreadFields.ALL,
		setup: Gmail.Users.Threads.Modify.() -> Unit = { }
	): Thread = service.modify(userId, id, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		userId: String,
		fields: FieldsList<ListThreadsResponseField> = ListThreadsResponseFields.ALL,
		setup: Gmail.Users.Threads.List.() -> Unit = { }
	): ListThreadsResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, id: String,
		fields: FieldsList<ThreadField> = ThreadFields.ALL,
		setup: Gmail.Users.Threads.Get.() -> Unit = { }
	): Thread = service.get(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, id: String,
		setup: Gmail.Users.Threads.Delete.() -> Unit = { }
	) = service.delete(userId, id).apply(setup).execute()

}