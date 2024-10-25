package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.App
import com.google.api.services.drive.model.AppList
import ru.raysmith.google.drive.utils.fields.AppField
import ru.raysmith.google.drive.utils.fields.AppFields
import ru.raysmith.google.drive.utils.fields.AppListField
import ru.raysmith.google.drive.utils.fields.AppListFields
import ru.raysmith.google.utils.FieldsList

class GoogleAppsService(private val service: Drive.Apps) {

    fun list(
		fields: FieldsList<AppListField> = AppListFields.ALL,
		setup: Drive.Apps.List.() -> Unit = { }
	): AppList = service.list().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		appId: String,
		fields: FieldsList<AppField> = AppFields.ALL,
		setup: Drive.Apps.Get.() -> Unit = { }
	): App = service.get(appId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}