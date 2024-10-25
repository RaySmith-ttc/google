package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RevisionListField : Field

object RevisionListFields {
    val ALL: FieldsList<RevisionListField> = fieldsList("*")
	val kind: FieldsList<RevisionListField> get() = fieldsList("kind")
	val nextPageToken: FieldsList<RevisionListField> get() = fieldsList("nextPageToken")
	val revisions = object : RevisionListFieldRevision("revisions") {}
}

abstract class RevisionListFieldRevision(private val path: String) : FieldsList<RevisionListField>(path) {
	val exportLinks: FieldsList<RevisionListField> get() = fieldsList("${path}/exportLinks")
	val id: FieldsList<RevisionListField> get() = fieldsList("${path}/id")
	val keepForever: FieldsList<RevisionListField> get() = fieldsList("${path}/keepForever")
	val kind: FieldsList<RevisionListField> get() = fieldsList("${path}/kind")
	val lastModifyingUser by lazy { object : RevisionListFieldUser("${path}/lastModifyingUser") {} }
	val md5Checksum: FieldsList<RevisionListField> get() = fieldsList("${path}/md5Checksum")
	val mimeType: FieldsList<RevisionListField> get() = fieldsList("${path}/mimeType")
	val modifiedTime: FieldsList<RevisionListField> get() = fieldsList("${path}/modifiedTime")
	val originalFilename: FieldsList<RevisionListField> get() = fieldsList("${path}/originalFilename")
	val publishAuto: FieldsList<RevisionListField> get() = fieldsList("${path}/publishAuto")
	val published: FieldsList<RevisionListField> get() = fieldsList("${path}/published")
	val publishedLink: FieldsList<RevisionListField> get() = fieldsList("${path}/publishedLink")
	val publishedOutsideDomain: FieldsList<RevisionListField> get() = fieldsList("${path}/publishedOutsideDomain")
	val size: FieldsList<RevisionListField> get() = fieldsList("${path}/size")
}

abstract class RevisionListFieldUser(private val path: String) : FieldsList<RevisionListField>(path) {
	val displayName: FieldsList<RevisionListField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<RevisionListField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<RevisionListField> get() = fieldsList("${path}/kind")
	val me: FieldsList<RevisionListField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<RevisionListField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<RevisionListField> get() = fieldsList("${path}/photoLink")
}

