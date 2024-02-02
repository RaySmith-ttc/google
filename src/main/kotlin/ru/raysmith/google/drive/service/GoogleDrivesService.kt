package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.DriveList

class GoogleDrivesService(val service: Drive.Drives) {
    fun get(driveId: String, setup: Drive.Drives.Get.() -> Unit = { }): com.google.api.services.drive.model.Drive =
        service.get(driveId).apply(setup).execute()

    fun list(setup: Drive.Drives.List.() -> Unit = { }): DriveList = service.list().apply(setup).execute()

    fun create(
        requestId: String,
        content: com.google.api.services.drive.model.Drive,
        setup: Drive.Drives.Create.() -> Unit = { }
    ): com.google.api.services.drive.model.Drive? = service.create(requestId, content).apply(setup).execute()

    fun delete(driveId: String, setup: Drive.Drives.Delete.() -> Unit = { }) {
        service.delete(driveId).apply(setup).execute()
    }

    fun hide(driveId: String, setup: Drive.Drives.Hide.() -> Unit = { }): com.google.api.services.drive.model.Drive? =
        service.hide(driveId).apply(setup).execute()

    fun unhide(driveId: String, setup: Drive.Drives.Unhide.() -> Unit = { }): com.google.api.services.drive.model.Drive? =
        service.unhide(driveId).apply(setup).execute()
}

