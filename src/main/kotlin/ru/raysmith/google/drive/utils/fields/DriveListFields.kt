package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DriveListField : Field

object DriveListFields {
    val ALL: FieldsList<DriveListField> = fieldsList("*")
	val drives = object : DriveListFieldDrive("drives") {}
	val kind: FieldsList<DriveListField> get() = fieldsList("kind")
	val nextPageToken: FieldsList<DriveListField> get() = fieldsList("nextPageToken")
}

abstract class DriveListFieldDrive(private val path: String) : FieldsList<DriveListField>(path) {
	val backgroundImageFile by lazy { object : DriveListFieldBackgroundImageFile("${path}/backgroundImageFile") {} }
	val backgroundImageLink: FieldsList<DriveListField> get() = fieldsList("${path}/backgroundImageLink")
	val capabilities by lazy { object : DriveListFieldCapabilities("${path}/capabilities") {} }
	val colorRgb: FieldsList<DriveListField> get() = fieldsList("${path}/colorRgb")
	val createdTime: FieldsList<DriveListField> get() = fieldsList("${path}/createdTime")
	val hidden: FieldsList<DriveListField> get() = fieldsList("${path}/hidden")
	val id: FieldsList<DriveListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<DriveListField> get() = fieldsList("${path}/kind")
	val name: FieldsList<DriveListField> get() = fieldsList("${path}/name")
	val orgUnitId: FieldsList<DriveListField> get() = fieldsList("${path}/orgUnitId")
	val restrictions by lazy { object : DriveListFieldRestrictions("${path}/restrictions") {} }
	val themeId: FieldsList<DriveListField> get() = fieldsList("${path}/themeId")
}

abstract class DriveListFieldBackgroundImageFile(private val path: String) : FieldsList<DriveListField>(path) {
	val id: FieldsList<DriveListField> get() = fieldsList("${path}/id")
	val width: FieldsList<DriveListField> get() = fieldsList("${path}/width")
	val xCoordinate: FieldsList<DriveListField> get() = fieldsList("${path}/xCoordinate")
	val yCoordinate: FieldsList<DriveListField> get() = fieldsList("${path}/yCoordinate")
}

abstract class DriveListFieldCapabilities(private val path: String) : FieldsList<DriveListField>(path) {
	val canAddChildren: FieldsList<DriveListField> get() = fieldsList("${path}/canAddChildren")
	val canChangeCopyRequiresWriterPermissionRestriction: FieldsList<DriveListField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermissionRestriction")
	val canChangeDomainUsersOnlyRestriction: FieldsList<DriveListField> get() = fieldsList("${path}/canChangeDomainUsersOnlyRestriction")
	val canChangeDriveBackground: FieldsList<DriveListField> get() = fieldsList("${path}/canChangeDriveBackground")
	val canChangeDriveMembersOnlyRestriction: FieldsList<DriveListField> get() = fieldsList("${path}/canChangeDriveMembersOnlyRestriction")
	val canChangeSharingFoldersRequiresOrganizerPermissionRestriction: FieldsList<DriveListField> get() = fieldsList("${path}/canChangeSharingFoldersRequiresOrganizerPermissionRestriction")
	val canComment: FieldsList<DriveListField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<DriveListField> get() = fieldsList("${path}/canCopy")
	val canDeleteChildren: FieldsList<DriveListField> get() = fieldsList("${path}/canDeleteChildren")
	val canDeleteDrive: FieldsList<DriveListField> get() = fieldsList("${path}/canDeleteDrive")
	val canDownload: FieldsList<DriveListField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<DriveListField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<DriveListField> get() = fieldsList("${path}/canListChildren")
	val canManageMembers: FieldsList<DriveListField> get() = fieldsList("${path}/canManageMembers")
	val canReadRevisions: FieldsList<DriveListField> get() = fieldsList("${path}/canReadRevisions")
	val canRename: FieldsList<DriveListField> get() = fieldsList("${path}/canRename")
	val canRenameDrive: FieldsList<DriveListField> get() = fieldsList("${path}/canRenameDrive")
	val canResetDriveRestrictions: FieldsList<DriveListField> get() = fieldsList("${path}/canResetDriveRestrictions")
	val canShare: FieldsList<DriveListField> get() = fieldsList("${path}/canShare")
	val canTrashChildren: FieldsList<DriveListField> get() = fieldsList("${path}/canTrashChildren")
}

abstract class DriveListFieldRestrictions(private val path: String) : FieldsList<DriveListField>(path) {
	val adminManagedRestrictions: FieldsList<DriveListField> get() = fieldsList("${path}/adminManagedRestrictions")
	val copyRequiresWriterPermission: FieldsList<DriveListField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val domainUsersOnly: FieldsList<DriveListField> get() = fieldsList("${path}/domainUsersOnly")
	val driveMembersOnly: FieldsList<DriveListField> get() = fieldsList("${path}/driveMembersOnly")
	val sharingFoldersRequiresOrganizerPermission: FieldsList<DriveListField> get() = fieldsList("${path}/sharingFoldersRequiresOrganizerPermission")
}

