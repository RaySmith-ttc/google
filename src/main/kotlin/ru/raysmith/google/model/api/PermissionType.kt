package ru.raysmith.google.model.api

import com.google.api.services.drive.model.Permission
import ru.raysmith.google.utils.snakeCased

enum class PermissionType {
    USER, GROUP, DOMAIN, ANYONE
}

/**
 * The type of the grantee. When creating a permission, if [type] is [PermissionType.USER] or [PermissionType.GROUP],
 * you must provide an [Permission.emailAddress] for the user or group. When [type] is [PermissionType.DOMAIN],
 * you must provide a [Permission.domain]. There isn't extra information required for an [PermissionType.ANYONE] type.
 * */
fun Permission.setType(type: PermissionType) = setType(type.snakeCased())

/**
 * The type of the grantee. When creating a permission, if `type` is [PermissionType.USER] or [PermissionType.GROUP],
 * you must provide an [Permission.emailAddress] for the user or group. When `type` is [PermissionType.DOMAIN],
 * you must provide a [Permission.domain]. There isn't extra information required for an [PermissionType.ANYONE] type.
 * */
var Permission.typeE: PermissionType?
    get() = type?.let { PermissionType.valueOf(it) }
    set(value) { type = value?.snakeCased() }