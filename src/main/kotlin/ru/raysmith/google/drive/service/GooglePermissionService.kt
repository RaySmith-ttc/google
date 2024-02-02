package ru.raysmith.google.drive.service

import com.google.api.services.drive.Drive
import com.google.api.services.drive.model.Permission
import com.google.api.services.drive.model.PermissionList

class GooglePermissionService(val service: Drive.Permissions) {
    fun create(fileId: String, permission: Permission, setup: Drive.Permissions.Create.() -> Unit = { }): Permission =
        service.create(fileId, permission).apply(setup).execute()

    fun delete(fileId: String, permissionId: String, setup: Drive.Permissions.Delete.() -> Unit = { }) {
        service.delete(fileId, permissionId).apply(setup).execute()
    }

    fun update(fileId: String, permissionId: String, permission: Permission, setup: Drive.Permissions.Update.() -> Unit = { }): Permission =
        service.update(fileId, permissionId, permission).apply(setup).execute()

    fun get(fileId: String, permissionId: String, setup: Drive.Permissions.Get.() -> Unit = { }): Permission =
        service.get(fileId, permissionId).apply(setup).execute()

    fun list(fileId: String, setup: Drive.Permissions.List.() -> Unit = { }): PermissionList =
        service.list(fileId).apply(setup).execute()
}

