package ru.raysmith.google.gmail.service

import com.google.api.services.gmail.Gmail
import com.google.api.services.gmail.model.Filter
import com.google.api.services.gmail.model.ListFiltersResponse
import ru.raysmith.google.gmail.utils.fields.FilterField
import ru.raysmith.google.gmail.utils.fields.FilterFields
import ru.raysmith.google.gmail.utils.fields.ListFiltersResponseField
import ru.raysmith.google.gmail.utils.fields.ListFiltersResponseFields
import ru.raysmith.google.utils.FieldsList

class GoogleUsersSettingsFiltersService(private val service: Gmail.Users.Settings.Filters) {

    fun list(
		userId: String,
		fields: FieldsList<ListFiltersResponseField> = ListFiltersResponseFields.ALL,
		setup: Gmail.Users.Settings.Filters.List.() -> Unit = { }
	): ListFiltersResponse = service.list(userId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		userId: String, id: String,
		fields: FieldsList<FilterField> = FilterFields.ALL,
		setup: Gmail.Users.Settings.Filters.Get.() -> Unit = { }
	): Filter = service.get(userId, id).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		userId: String, id: String,
		setup: Gmail.Users.Settings.Filters.Delete.() -> Unit = { }
	) = service.delete(userId, id).apply(setup).execute()

	fun create(
		userId: String, content: Filter,
		fields: FieldsList<FilterField> = FilterFields.ALL,
		setup: Gmail.Users.Settings.Filters.Create.() -> Unit = { }
	): Filter = service.create(userId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}