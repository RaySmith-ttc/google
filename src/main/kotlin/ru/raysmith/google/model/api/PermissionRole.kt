package ru.raysmith.google.model.api

import com.google.api.services.drive.model.Permission
import ru.raysmith.google.snakeCased

enum class PermissionRole {
    OWNER, ORGANIZER, FILE_ORGANIZER, WRITER, COMMENTER, READER
}

fun Permission.setRole(permissionRole: PermissionRole) {
    setRole(permissionRole.snakeCased())
}

var Permission.roleE: PermissionRole?
    get() = role?.let { PermissionRole.valueOf(it) }
    set(value) { role = value?.snakeCased() }