package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.TeamDrive
import com.google.api.services.drive.model.TeamDriveList

class GoogleTeamDrivesService(val service: Drive.Teamdrives) {
    fun get(teamDriveId: String, setup: Drive.Teamdrives.Get.() -> Unit = { }): TeamDrive =
        service.get(teamDriveId).apply(setup).execute()

    fun list(setup: Drive.Teamdrives.List.() -> Unit = { }): TeamDriveList =
        service.list().apply(setup).execute()

    fun create(requestId: String, content: TeamDrive, setup: Drive.Teamdrives.Create.() -> Unit = { }): TeamDrive =
        service.create(requestId, content).apply(setup).execute()

    fun update(teamDriveId: String, request: TeamDrive, setup: Drive.Teamdrives.Update.() -> Unit = { }): TeamDrive =
        service.update(teamDriveId, request).apply(setup).execute()

    fun delete(teamDriveId: String, setup: Drive.Teamdrives.Delete.() -> Unit = { }) {
        service.delete(teamDriveId).apply(setup).execute()
    }
}