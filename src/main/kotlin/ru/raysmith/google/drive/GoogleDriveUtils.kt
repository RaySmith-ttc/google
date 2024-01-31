package ru.raysmith.google.drive

import com.google.api.services.drive.model.File
import com.google.api.services.drive.model.Permission
import ru.raysmith.google.model.api.PermissionRole
import ru.raysmith.google.model.api.PermissionType

private val snakeCaseRegex = Regex("_([a-z])")

fun permission(setup: Permission.() -> Unit) = Permission().apply(setup)
fun permission(type: PermissionType, role: PermissionRole, setup: Permission.() -> Unit = {}) = Permission().apply {
    this.type = type.name.lowercase()
    this.role = snakeCaseRegex.replace(role.name.lowercase()) {
        it.groupValues[1].uppercase()
    }
    setup()
}


fun file(setup: File.() -> Unit) = File().apply(setup)