package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.ListOperationsResponse
import com.google.api.services.drive.model.Operation
import ru.raysmith.google.drive.utils.fields.ListOperationsResponseField
import ru.raysmith.google.drive.utils.fields.ListOperationsResponseFields
import ru.raysmith.google.drive.utils.fields.OperationField
import ru.raysmith.google.drive.utils.fields.OperationFields
import ru.raysmith.google.utils.FieldsList

class GoogleOperationsService(private val service: Drive.Operations) {

    fun list(
		fields: FieldsList<ListOperationsResponseField> = ListOperationsResponseFields.ALL,
		setup: Drive.Operations.List.() -> Unit = { }
	): ListOperationsResponse = service.list().apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		name: String,
		fields: FieldsList<OperationField> = OperationFields.ALL,
		setup: Drive.Operations.Get.() -> Unit = { }
	): Operation = service.get(name).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}