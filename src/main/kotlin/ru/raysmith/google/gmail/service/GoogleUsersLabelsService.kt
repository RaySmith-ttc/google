package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.Label
import com.google.api.services.gmail.model.ListLabelsResponse
import ru.raysmith.google.gmail.utils.fields.LabelField
import ru.raysmith.google.gmail.utils.fields.LabelFields
import ru.raysmith.google.gmail.utils.fields.ListLabelsResponseField
import ru.raysmith.google.gmail.utils.fields.ListLabelsResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersLabelsService(private val service: Gmail.Users.Labels) {

    fun update(
		userId: String, id: String, content: Label,
		fields: FieldsList<LabelField> = LabelFields.ALL,
		setup: Gmail.Users.Labels.Update.() -> Unit = { }
	): Label = service.update(userId, id, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun patch(
		userId: String, id: String, content: Label,
		fields: FieldsList<LabelField> = LabelFields.ALL,
		setup: Gmail.Users.Labels.Patch.() -> Unit = { }
	): Label = service.patch(userId, id, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		userId: String,
		fields: FieldsList<ListLabelsResponseField> = ListLabelsResponseFields.ALL,
		setup: Gmail.Users.Labels.List.() -> Unit = { }
	): ListLabelsResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, id: String,
		fields: FieldsList<LabelField> = LabelFields.ALL,
		setup: Gmail.Users.Labels.Get.() -> Unit = { }
	): Label = service.get(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, id: String,
		setup: Gmail.Users.Labels.Delete.() -> Unit = { }
	) = service.delete(userId, id).apply(setup).execute()

	fun create(
		userId: String, content: Label,
		fields: FieldsList<LabelField> = LabelFields.ALL,
		setup: Gmail.Users.Labels.Create.() -> Unit = { }
	): Label = service.create(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}