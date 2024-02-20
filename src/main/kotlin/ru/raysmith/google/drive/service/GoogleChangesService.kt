package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.ChangeList
import com.google.api.services.drive.model.Channel
import com.google.api.services.drive.model.StartPageToken

class GoogleChangesService(val service: Drive.Changes) {
    fun list(pageToken: String, setup: Drive.Changes.List.() -> Unit = { }): ChangeList =
        service.list(pageToken).apply(setup).execute()

    fun watch(pageToken: String, content: Channel, setup: Drive.Changes.Watch.() -> Unit = { }): Channel =
        service.watch(pageToken, content).apply(setup).execute()

    fun watch(setup: Drive.Changes.GetStartPageToken.() -> Unit = { }): StartPageToken =
        service.startPageToken.apply(setup).execute()
}