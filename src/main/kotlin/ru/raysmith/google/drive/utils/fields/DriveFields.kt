package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DriveField : Field

object DriveFields {
    val ALL: FieldsList<DriveField> = fieldsList("*")
	val backgroundImageFile = object : DriveFieldBackgroundImageFile("backgroundImageFile") {}
	val backgroundImageLink: FieldsList<DriveField> get() = fieldsList("backgroundImageLink")
	val capabilities = object : DriveFieldCapabilities("capabilities") {}
	val colorRgb: FieldsList<DriveField> get() = fieldsList("colorRgb")
	val createdTime: FieldsList<DriveField> get() = fieldsList("createdTime")
	val hidden: FieldsList<DriveField> get() = fieldsList("hidden")
	val id: FieldsList<DriveField> get() = fieldsList("id")
	val kind: FieldsList<DriveField> get() = fieldsList("kind")
	val name: FieldsList<DriveField> get() = fieldsList("name")
	val orgUnitId: FieldsList<DriveField> get() = fieldsList("orgUnitId")
	val restrictions = object : DriveFieldRestrictions("restrictions") {}
	val themeId: FieldsList<DriveField> get() = fieldsList("themeId")
}

abstract class DriveFieldBackgroundImageFile(private val path: String) : FieldsList<DriveField>(path) {
	val id: FieldsList<DriveField> get() = fieldsList("${path}/id")
	val width: FieldsList<DriveField> get() = fieldsList("${path}/width")
	val xCoordinate: FieldsList<DriveField> get() = fieldsList("${path}/xCoordinate")
	val yCoordinate: FieldsList<DriveField> get() = fieldsList("${path}/yCoordinate")
}

abstract class DriveFieldCapabilities(private val path: String) : FieldsList<DriveField>(path) {
	val canAddChildren: FieldsList<DriveField> get() = fieldsList("${path}/canAddChildren")
	val canChangeCopyRequiresWriterPermissionRestriction: FieldsList<DriveField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermissionRestriction")
	val canChangeDomainUsersOnlyRestriction: FieldsList<DriveField> get() = fieldsList("${path}/canChangeDomainUsersOnlyRestriction")
	val canChangeDriveBackground: FieldsList<DriveField> get() = fieldsList("${path}/canChangeDriveBackground")
	val canChangeDriveMembersOnlyRestriction: FieldsList<DriveField> get() = fieldsList("${path}/canChangeDriveMembersOnlyRestriction")
	val canChangeSharingFoldersRequiresOrganizerPermissionRestriction: FieldsList<DriveField> get() = fieldsList("${path}/canChangeSharingFoldersRequiresOrganizerPermissionRestriction")
	val canComment: FieldsList<DriveField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<DriveField> get() = fieldsList("${path}/canCopy")
	val canDeleteChildren: FieldsList<DriveField> get() = fieldsList("${path}/canDeleteChildren")
	val canDeleteDrive: FieldsList<DriveField> get() = fieldsList("${path}/canDeleteDrive")
	val canDownload: FieldsList<DriveField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<DriveField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<DriveField> get() = fieldsList("${path}/canListChildren")
	val canManageMembers: FieldsList<DriveField> get() = fieldsList("${path}/canManageMembers")
	val canReadRevisions: FieldsList<DriveField> get() = fieldsList("${path}/canReadRevisions")
	val canRename: FieldsList<DriveField> get() = fieldsList("${path}/canRename")
	val canRenameDrive: FieldsList<DriveField> get() = fieldsList("${path}/canRenameDrive")
	val canResetDriveRestrictions: FieldsList<DriveField> get() = fieldsList("${path}/canResetDriveRestrictions")
	val canShare: FieldsList<DriveField> get() = fieldsList("${path}/canShare")
	val canTrashChildren: FieldsList<DriveField> get() = fieldsList("${path}/canTrashChildren")
}

abstract class DriveFieldRestrictions(private val path: String) : FieldsList<DriveField>(path) {
	val adminManagedRestrictions: FieldsList<DriveField> get() = fieldsList("${path}/adminManagedRestrictions")
	val copyRequiresWriterPermission: FieldsList<DriveField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val domainUsersOnly: FieldsList<DriveField> get() = fieldsList("${path}/domainUsersOnly")
	val driveMembersOnly: FieldsList<DriveField> get() = fieldsList("${path}/driveMembersOnly")
	val sharingFoldersRequiresOrganizerPermission: FieldsList<DriveField> get() = fieldsList("${path}/sharingFoldersRequiresOrganizerPermission")
}

