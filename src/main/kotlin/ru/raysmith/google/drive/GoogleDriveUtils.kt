package ru.raysmith.google.drive

import com.google.api.services.drive.model.Permission
import ru.raysmith.google.model.api.PermissionRole
import ru.raysmith.google.model.api.PermissionType
import ru.raysmith.google.model.api.roleE
import ru.raysmith.google.model.api.typeE

fun permission(type: PermissionType, role: PermissionRole, setup: Permission.() -> Unit = {}) = Permission().apply {
    this.typeE = type
    this.roleE = role
    setup()
}