package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PermissionListField : Field

object PermissionListFields {
    val ALL: FieldsList<PermissionListField> = fieldsList("*")
	val kind: FieldsList<PermissionListField> get() = fieldsList("kind")
	val nextPageToken: FieldsList<PermissionListField> get() = fieldsList("nextPageToken")
	val permissions = object : PermissionListFieldPermission("permissions") {}
}

abstract class PermissionListFieldPermission(private val path: String) : FieldsList<PermissionListField>(path) {
	val allowFileDiscovery: FieldsList<PermissionListField> get() = fieldsList("${path}/allowFileDiscovery")
	val deleted: FieldsList<PermissionListField> get() = fieldsList("${path}/deleted")
	val displayName: FieldsList<PermissionListField> get() = fieldsList("${path}/displayName")
	val domain: FieldsList<PermissionListField> get() = fieldsList("${path}/domain")
	val emailAddress: FieldsList<PermissionListField> get() = fieldsList("${path}/emailAddress")
	val expirationTime: FieldsList<PermissionListField> get() = fieldsList("${path}/expirationTime")
	val id: FieldsList<PermissionListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<PermissionListField> get() = fieldsList("${path}/kind")
	val pendingOwner: FieldsList<PermissionListField> get() = fieldsList("${path}/pendingOwner")
	val permissionDetails by lazy { object : PermissionListFieldPermissionDetails("${path}/permissionDetails") {} }
	val photoLink: FieldsList<PermissionListField> get() = fieldsList("${path}/photoLink")
	val role: FieldsList<PermissionListField> get() = fieldsList("${path}/role")
	val teamDrivePermissionDetails by lazy { object : PermissionListFieldTeamDrivePermissionDetails("${path}/teamDrivePermissionDetails") {} }
	val type: FieldsList<PermissionListField> get() = fieldsList("${path}/type")
	val view: FieldsList<PermissionListField> get() = fieldsList("${path}/view")
}

abstract class PermissionListFieldPermissionDetails(private val path: String) : FieldsList<PermissionListField>(path) {
	val inherited: FieldsList<PermissionListField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<PermissionListField> get() = fieldsList("${path}/inheritedFrom")
	val permissionType: FieldsList<PermissionListField> get() = fieldsList("${path}/permissionType")
	val role: FieldsList<PermissionListField> get() = fieldsList("${path}/role")
}

abstract class PermissionListFieldTeamDrivePermissionDetails(private val path: String) : FieldsList<PermissionListField>(path) {
	val inherited: FieldsList<PermissionListField> get() = fieldsList("${path}/inherited")
	val inheritedFrom: FieldsList<PermissionListField> get() = fieldsList("${path}/inheritedFrom")
	val role: FieldsList<PermissionListField> get() = fieldsList("${path}/role")
	val teamDrivePermissionType: FieldsList<PermissionListField> get() = fieldsList("${path}/teamDrivePermissionType")
}

