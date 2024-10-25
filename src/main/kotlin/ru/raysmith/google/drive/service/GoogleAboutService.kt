package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.About
import ru.raysmith.google.drive.utils.fields.AboutField
import ru.raysmith.google.drive.utils.fields.AboutFields
import ru.raysmith.google.utils.FieldsList

class GoogleAboutService(private val service: Drive.About) {

    fun get(
		fields: FieldsList<AboutField> = AboutFields.ALL,
		setup: Drive.About.Get.() -> Unit = { }
	): About = service.get().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}