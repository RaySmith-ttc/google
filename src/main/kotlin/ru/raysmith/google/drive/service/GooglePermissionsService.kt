package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Permission
import com.google.api.services.drive.model.PermissionList
import ru.raysmith.google.drive.utils.fields.PermissionField
import ru.raysmith.google.drive.utils.fields.PermissionFields
import ru.raysmith.google.drive.utils.fields.PermissionListField
import ru.raysmith.google.drive.utils.fields.PermissionListFields
import ru.raysmith.google.utils.FieldsList

class GooglePermissionsService(private val service: Drive.Permissions) {

    fun update(
		fileId: String, permissionId: String, content: Permission,
		fields: FieldsList<PermissionField> = PermissionFields.ALL,
		setup: Drive.Permissions.Update.() -> Unit = { }
	): Permission = service.update(fileId, permissionId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun list(
		fileId: String,
		fields: FieldsList<PermissionListField> = PermissionListFields.ALL,
		setup: Drive.Permissions.List.() -> Unit = { }
	): PermissionList = service.list(fileId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun get(
		fileId: String, permissionId: String,
		fields: FieldsList<PermissionField> = PermissionFields.ALL,
		setup: Drive.Permissions.Get.() -> Unit = { }
	): Permission = service.get(fileId, permissionId).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

	fun delete(
		fileId: String, permissionId: String,
		setup: Drive.Permissions.Delete.() -> Unit = { }
	) = service.delete(fileId, permissionId).apply(setup).execute()

	fun create(
		fileId: String, content: Permission,
		fields: FieldsList<PermissionField> = PermissionFields.ALL,
		setup: Drive.Permissions.Create.() -> Unit = { }
	): Permission = service.create(fileId, content).apply {
		setFields(fields.getValue())
		setup()
	}.execute()

}