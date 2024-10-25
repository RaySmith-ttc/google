package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AboutField : Field

object AboutFields {
    val ALL: FieldsList<AboutField> = fieldsList("*")
	val appInstalled: FieldsList<AboutField> get() = fieldsList("appInstalled")
	val canCreateDrives: FieldsList<AboutField> get() = fieldsList("canCreateDrives")
	val canCreateTeamDrives: FieldsList<AboutField> get() = fieldsList("canCreateTeamDrives")
	val driveThemes = object : AboutFieldDriveThemes("driveThemes") {}
	val exportFormats: FieldsList<AboutField> get() = fieldsList("exportFormats")
	val folderColorPalette: FieldsList<AboutField> get() = fieldsList("folderColorPalette")
	val importFormats: FieldsList<AboutField> get() = fieldsList("importFormats")
	val kind: FieldsList<AboutField> get() = fieldsList("kind")
	val maxImportSizes: FieldsList<AboutField> get() = fieldsList("maxImportSizes")
	val maxUploadSize: FieldsList<AboutField> get() = fieldsList("maxUploadSize")
	val storageQuota = object : AboutFieldStorageQuota("storageQuota") {}
	val teamDriveThemes = object : AboutFieldTeamDriveThemes("teamDriveThemes") {}
	val user = object : AboutFieldUser("user") {}
}

abstract class AboutFieldDriveThemes(private val path: String) : FieldsList<AboutField>(path) {
	val backgroundImageLink: FieldsList<AboutField> get() = fieldsList("${path}/backgroundImageLink")
	val colorRgb: FieldsList<AboutField> get() = fieldsList("${path}/colorRgb")
	val id: FieldsList<AboutField> get() = fieldsList("${path}/id")
}

abstract class AboutFieldStorageQuota(private val path: String) : FieldsList<AboutField>(path) {
	val limit: FieldsList<AboutField> get() = fieldsList("${path}/limit")
	val usage: FieldsList<AboutField> get() = fieldsList("${path}/usage")
	val usageInDrive: FieldsList<AboutField> get() = fieldsList("${path}/usageInDrive")
	val usageInDriveTrash: FieldsList<AboutField> get() = fieldsList("${path}/usageInDriveTrash")
}

abstract class AboutFieldTeamDriveThemes(private val path: String) : FieldsList<AboutField>(path) {
	val backgroundImageLink: FieldsList<AboutField> get() = fieldsList("${path}/backgroundImageLink")
	val colorRgb: FieldsList<AboutField> get() = fieldsList("${path}/colorRgb")
	val id: FieldsList<AboutField> get() = fieldsList("${path}/id")
}

abstract class AboutFieldUser(private val path: String) : FieldsList<AboutField>(path) {
	val displayName: FieldsList<AboutField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<AboutField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<AboutField> get() = fieldsList("${path}/kind")
	val me: FieldsList<AboutField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<AboutField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<AboutField> get() = fieldsList("${path}/photoLink")
}

