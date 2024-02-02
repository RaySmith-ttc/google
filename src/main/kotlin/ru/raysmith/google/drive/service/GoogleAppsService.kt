package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.App
import com.google.api.services.drive.model.AppList

class GoogleAppsService(val service: Drive.Apps) {
    fun get(appId: String, setup: Drive.Apps.Get.() -> Unit = { }): App = service.get(appId).apply(setup).execute()
    fun list(setup: Drive.Apps.List.() -> Unit = { }): AppList = service.list().apply(setup).execute()
}