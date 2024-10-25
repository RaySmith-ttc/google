package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TeamDriveListField : Field

object TeamDriveListFields {
    val ALL: FieldsList<TeamDriveListField> = fieldsList("*")
	val kind: FieldsList<TeamDriveListField> get() = fieldsList("kind")
	val nextPageToken: FieldsList<TeamDriveListField> get() = fieldsList("nextPageToken")
	val teamDrives = object : TeamDriveListFieldTeamDrive("teamDrives") {}
}

abstract class TeamDriveListFieldTeamDrive(private val path: String) : FieldsList<TeamDriveListField>(path) {
	val backgroundImageFile by lazy { object : TeamDriveListFieldBackgroundImageFile("${path}/backgroundImageFile") {} }
	val backgroundImageLink: FieldsList<TeamDriveListField> get() = fieldsList("${path}/backgroundImageLink")
	val capabilities by lazy { object : TeamDriveListFieldCapabilities("${path}/capabilities") {} }
	val colorRgb: FieldsList<TeamDriveListField> get() = fieldsList("${path}/colorRgb")
	val createdTime: FieldsList<TeamDriveListField> get() = fieldsList("${path}/createdTime")
	val id: FieldsList<TeamDriveListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<TeamDriveListField> get() = fieldsList("${path}/kind")
	val name: FieldsList<TeamDriveListField> get() = fieldsList("${path}/name")
	val orgUnitId: FieldsList<TeamDriveListField> get() = fieldsList("${path}/orgUnitId")
	val restrictions by lazy { object : TeamDriveListFieldRestrictions("${path}/restrictions") {} }
	val themeId: FieldsList<TeamDriveListField> get() = fieldsList("${path}/themeId")
}

abstract class TeamDriveListFieldBackgroundImageFile(private val path: String) : FieldsList<TeamDriveListField>(path) {
	val id: FieldsList<TeamDriveListField> get() = fieldsList("${path}/id")
	val width: FieldsList<TeamDriveListField> get() = fieldsList("${path}/width")
	val xCoordinate: FieldsList<TeamDriveListField> get() = fieldsList("${path}/xCoordinate")
	val yCoordinate: FieldsList<TeamDriveListField> get() = fieldsList("${path}/yCoordinate")
}

abstract class TeamDriveListFieldCapabilities(private val path: String) : FieldsList<TeamDriveListField>(path) {
	val canAddChildren: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canAddChildren")
	val canChangeCopyRequiresWriterPermissionRestriction: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canChangeCopyRequiresWriterPermissionRestriction")
	val canChangeDomainUsersOnlyRestriction: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canChangeDomainUsersOnlyRestriction")
	val canChangeSharingFoldersRequiresOrganizerPermissionRestriction: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canChangeSharingFoldersRequiresOrganizerPermissionRestriction")
	val canChangeTeamDriveBackground: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canChangeTeamDriveBackground")
	val canChangeTeamMembersOnlyRestriction: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canChangeTeamMembersOnlyRestriction")
	val canComment: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canComment")
	val canCopy: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canCopy")
	val canDeleteChildren: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canDeleteChildren")
	val canDeleteTeamDrive: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canDeleteTeamDrive")
	val canDownload: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canDownload")
	val canEdit: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canEdit")
	val canListChildren: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canListChildren")
	val canManageMembers: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canManageMembers")
	val canReadRevisions: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canReadRevisions")
	val canRemoveChildren: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canRemoveChildren")
	val canRename: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canRename")
	val canRenameTeamDrive: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canRenameTeamDrive")
	val canResetTeamDriveRestrictions: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canResetTeamDriveRestrictions")
	val canShare: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canShare")
	val canTrashChildren: FieldsList<TeamDriveListField> get() = fieldsList("${path}/canTrashChildren")
}

abstract class TeamDriveListFieldRestrictions(private val path: String) : FieldsList<TeamDriveListField>(path) {
	val adminManagedRestrictions: FieldsList<TeamDriveListField> get() = fieldsList("${path}/adminManagedRestrictions")
	val copyRequiresWriterPermission: FieldsList<TeamDriveListField> get() = fieldsList("${path}/copyRequiresWriterPermission")
	val domainUsersOnly: FieldsList<TeamDriveListField> get() = fieldsList("${path}/domainUsersOnly")
	val sharingFoldersRequiresOrganizerPermission: FieldsList<TeamDriveListField> get() = fieldsList("${path}/sharingFoldersRequiresOrganizerPermission")
	val teamMembersOnly: FieldsList<TeamDriveListField> get() = fieldsList("${path}/teamMembersOnly")
}

