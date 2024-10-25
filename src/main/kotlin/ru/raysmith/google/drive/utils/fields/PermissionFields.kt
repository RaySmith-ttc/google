package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PermissionField : Field

object PermissionFields {
    val ALL: FieldsList<PermissionField> = fieldsList("*")
	val allowFileDiscovery: FieldsList<PermissionField> get() = fieldsList("allowFileDiscovery")
	val deleted: FieldsList<PermissionField> get() = fieldsList("deleted")
	val displayName: FieldsList<PermissionField> get() = fieldsList("displayName")
	val domain: FieldsList<PermissionField> get() = fieldsList("domain")
	val emailAddress: FieldsList<PermissionField> get() = fieldsList("emailAddress")
	val expirationTime: FieldsList<PermissionField> get() = fieldsList("expirationTime")
	val id: FieldsList<PermissionField> get() = fieldsList("id")
	val kind: FieldsList<PermissionField> get() = fieldsList("kind")
	val pendingOwner: FieldsList<PermissionField> get() = fieldsList("pendingOwner")
	val permissionDetails = object : PermissionFieldPermissionDetails("permissionDetails") {}
	val photoLink: FieldsList<PermissionField> get() = fieldsList("photoLink")
	val role: FieldsList<PermissionField> get() = fieldsList("role")
	val teamDrivePermissionDetails = object : PermissionFieldTeamDrivePermissionDetails("teamDrivePermissionDetails") {}
	val type: FieldsList<PermissionField> get() = fieldsList("type")
	val view: FieldsList<PermissionField> get() = fieldsList("view")
}

abstract class PermissionFieldPermissionDetails(private val path: String) : FieldsList<PermissionField>(path) {
	val inherited: FieldsList<PermissionField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<PermissionField> get() = fieldsList("${path}/inheritedFrom")
	val permissionType: FieldsList<PermissionField> get() = fieldsList("${path}/permissionType")
	val role: FieldsList<PermissionField> get() = fieldsList("${path}/role")
}

abstract class PermissionFieldTeamDrivePermissionDetails(private val path: String) : FieldsList<PermissionField>(path) {
	val inherited: FieldsList<PermissionField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<PermissionField> get() = fieldsList("${path}/inheritedFrom")
	val role: FieldsList<PermissionField> get() = fieldsList("${path}/role")
	val teamDrivePermissionType: FieldsList<PermissionField> get() = fieldsList("${path}/teamDrivePermissionType")
}

