package ru.raysmith.google.model.api

import com.google.api.services.drive.model.Permission
import ru.raysmith.google.snakeCased

enum class PermissionType {
    USER, GROUP, DOMAIN, ANYONE
}

var Permission.typeE: PermissionType?
    get() = type?.let { PermissionType.valueOf(it) }
    set(value) { type = value?.snakeCased() }