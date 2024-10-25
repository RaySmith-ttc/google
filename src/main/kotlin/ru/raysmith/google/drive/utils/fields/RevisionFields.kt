package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RevisionField : Field

object RevisionFields {
    val ALL: FieldsList<RevisionField> = fieldsList("*")
	val exportLinks: FieldsList<RevisionField> get() = fieldsList("exportLinks")
	val id: FieldsList<RevisionField> get() = fieldsList("id")
	val keepForever: FieldsList<RevisionField> get() = fieldsList("keepForever")
	val kind: FieldsList<RevisionField> get() = fieldsList("kind")
	val lastModifyingUser = object : RevisionFieldUser("lastModifyingUser") {}
	val md5Checksum: FieldsList<RevisionField> get() = fieldsList("md5Checksum")
	val mimeType: FieldsList<RevisionField> get() = fieldsList("mimeType")
	val modifiedTime: FieldsList<RevisionField> get() = fieldsList("modifiedTime")
	val originalFilename: FieldsList<RevisionField> get() = fieldsList("originalFilename")
	val publishAuto: FieldsList<RevisionField> get() = fieldsList("publishAuto")
	val published: FieldsList<RevisionField> get() = fieldsList("published")
	val publishedLink: FieldsList<RevisionField> get() = fieldsList("publishedLink")
	val publishedOutsideDomain: FieldsList<RevisionField> get() = fieldsList("publishedOutsideDomain")
	val size: FieldsList<RevisionField> get() = fieldsList("size")
}

abstract class RevisionFieldUser(private val path: String) : FieldsList<RevisionField>(path) {
	val displayName: FieldsList<RevisionField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<RevisionField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<RevisionField> get() = fieldsList("${path}/kind")
	val me: FieldsList<RevisionField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<RevisionField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<RevisionField> get() = fieldsList("${path}/photoLink")
}

