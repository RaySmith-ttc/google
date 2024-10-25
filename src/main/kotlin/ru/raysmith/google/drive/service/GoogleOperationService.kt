package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive

class GoogleOperationService(private val service: Drive.Operation) {

    fun delete(
		name: String,
		setup: Drive.Operation.Delete.() -> Unit = { }
	) = service.delete(name).apply(setup).execute()

	fun cancel(
		name: String,
		setup: Drive.Operation.Cancel.() -> Unit = { }
	) = service.cancel(name).apply(setup).execute()

}