package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Channel

class GoogleChannelsService(val service: Drive.Channels) {
    fun stop(content: Channel, setup: Drive.Channels.Stop.() -> Unit = { }) {
        service.stop(content).apply(setup).execute()
    }
}

