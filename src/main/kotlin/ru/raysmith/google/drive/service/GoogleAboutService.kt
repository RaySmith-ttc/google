package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.About

class GoogleAboutService(val service: Drive.About) {
    fun get(setup: Drive.About.Get.() -> Unit = { }): About = service.get().apply(setup).execute()
}