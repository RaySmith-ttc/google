package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TeamDriveField : Field

object TeamDriveFields {
    val ALL: FieldsList<TeamDriveField> = fieldsList("*")
	val backgroundImageFile = object : TeamDriveFieldBackgroundImageFile("backgroundImageFile") {}
	val backgroundImageLink: FieldsList<TeamDriveField> get() = fieldsList("backgroundImageLink")
	val capabilities = object : TeamDriveFieldCapabilities("capabilities") {}
	val colorRgb: FieldsList<TeamDriveField> get() = fieldsList("colorRgb")
	val createdTime: FieldsList<TeamDriveField> get() = fieldsList("createdTime")
	val id: FieldsList<TeamDriveField> get() = fieldsList("id")
	val kind: FieldsList<TeamDriveField> get() = fieldsList("kind")
	val name: FieldsList<TeamDriveField> get() = fieldsList("name")
	val orgUnitId: FieldsList<TeamDriveField> get() = fieldsList("orgUnitId")
	val restrictions = object : TeamDriveFieldRestrictions("restrictions") {}
	val themeId: FieldsList<TeamDriveField> get() = fieldsList("themeId")
}

abstract class TeamDriveFieldBackgroundImageFile(private val path: String) : FieldsList<TeamDriveField>(path) {
	val id: FieldsList<TeamDriveField> get() = fieldsList("${path}/id")
	val width: FieldsList<TeamDriveField> get() = fieldsList("${path}/width")
	val xCoordinate: FieldsList<TeamDriveField> get() = fieldsList("${path}/xCoordinate")
	val yCoordinate: FieldsList<TeamDriveField> get() = fieldsList("${path}/yCoordinate")
}

abstract class TeamDriveFieldCapabilities(private val path: String) : FieldsList<TeamDriveField>(path) {
	val canAddChildren: FieldsList<TeamDriveField> get() = fieldsList("${path}/canAddChildren")
	val canChangeCopyRequiresWriterPermissionRestriction: FieldsList<TeamDriveField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermissionRestriction")
	val canChangeDomainUsersOnlyRestriction: FieldsList<TeamDriveField> get() = fieldsList("${path}/canChangeDomainUsersOnlyRestriction")
	val canChangeSharingFoldersRequiresOrganizerPermissionRestriction: FieldsList<TeamDriveField> get() = fieldsList("${path}/canChangeSharingFoldersRequiresOrganizerPermissionRestriction")
	val canChangeTeamDriveBackground: FieldsList<TeamDriveField> get() = fieldsList("${path}/canChangeTeamDriveBackground")
	val canChangeTeamMembersOnlyRestriction: FieldsList<TeamDriveField> get() = fieldsList("${path}/canChangeTeamMembersOnlyRestriction")
	val canComment: FieldsList<TeamDriveField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<TeamDriveField> get() = fieldsList("${path}/canCopy")
	val canDeleteChildren: FieldsList<TeamDriveField> get() = fieldsList("${path}/canDeleteChildren")
	val canDeleteTeamDrive: FieldsList<TeamDriveField> get() = fieldsList("${path}/canDeleteTeamDrive")
	val canDownload: FieldsList<TeamDriveField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<TeamDriveField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<TeamDriveField> get() = fieldsList("${path}/canListChildren")
	val canManageMembers: FieldsList<TeamDriveField> get() = fieldsList("${path}/canManageMembers")
	val canReadRevisions: FieldsList<TeamDriveField> get() = fieldsList("${path}/canReadRevisions")
	val canRemoveChildren: FieldsList<TeamDriveField> get() = fieldsList("${path}/canRemoveChildren")
	val canRename: FieldsList<TeamDriveField> get() = fieldsList("${path}/canRename")
	val canRenameTeamDrive: FieldsList<TeamDriveField> get() = fieldsList("${path}/canRenameTeamDrive")
	val canResetTeamDriveRestrictions: FieldsList<TeamDriveField> get() = fieldsList("${path}/canResetTeamDriveRestrictions")
	val canShare: FieldsList<TeamDriveField> get() = fieldsList("${path}/canShare")
	val canTrashChildren: FieldsList<TeamDriveField> get() = fieldsList("${path}/canTrashChildren")
}

abstract class TeamDriveFieldRestrictions(private val path: String) : FieldsList<TeamDriveField>(path) {
	val adminManagedRestrictions: FieldsList<TeamDriveField> get() = fieldsList("${path}/adminManagedRestrictions")
	val copyRequiresWriterPermission: FieldsList<TeamDriveField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val domainUsersOnly: FieldsList<TeamDriveField> get() = fieldsList("${path}/domainUsersOnly")
	val sharingFoldersRequiresOrganizerPermission: FieldsList<TeamDriveField> get() = fieldsList("${path}/sharingFoldersRequiresOrganizerPermission")
	val teamMembersOnly: FieldsList<TeamDriveField> get() = fieldsList("${path}/teamMembersOnly")
}

