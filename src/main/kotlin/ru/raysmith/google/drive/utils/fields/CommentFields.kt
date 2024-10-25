package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CommentField : Field

object CommentFields {
    val ALL: FieldsList<CommentField> = fieldsList("*")
	val anchor: FieldsList<CommentField> get() = fieldsList("anchor")
	val author = object : CommentFieldUser("author") {}
	val content: FieldsList<CommentField> get() = fieldsList("content")
	val createdTime: FieldsList<CommentField> get() = fieldsList("createdTime")
	val deleted: FieldsList<CommentField> get() = fieldsList("deleted")
	val htmlContent: FieldsList<CommentField> get() = fieldsList("htmlContent")
	val id: FieldsList<CommentField> get() = fieldsList("id")
	val kind: FieldsList<CommentField> get() = fieldsList("kind")
	val modifiedTime: FieldsList<CommentField> get() = fieldsList("modifiedTime")
	val quotedFileContent = object : CommentFieldQuotedFileContent("quotedFileContent") {}
	val replies = object : CommentFieldReply("replies") {}
	val resolved: FieldsList<CommentField> get() = fieldsList("resolved")
}

abstract class CommentFieldUser(private val path: String) : FieldsList<CommentField>(path) {
	val displayName: FieldsList<CommentField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<CommentField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<CommentField> get() = fieldsList("${path}/kind")
	val me: FieldsList<CommentField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<CommentField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<CommentField> get() = fieldsList("${path}/photoLink")
}

abstract class CommentFieldQuotedFileContent(private val path: String) : FieldsList<CommentField>(path) {
	val mimeType: FieldsList<CommentField> get() = fieldsList("${path}/mimeType")
	val value: FieldsList<CommentField> get() = fieldsList("${path}/value")
}

abstract class CommentFieldReply(private val path: String) : FieldsList<CommentField>(path) {
	val action: FieldsList<CommentField> get() = fieldsList("${path}/action")
	val author by lazy { object : CommentFieldUser("${path}/author") {} }
	val content: FieldsList<CommentField> get() = fieldsList("${path}/content")
	val createdTime: FieldsList<CommentField> get() = fieldsList("${path}/createdTime")
	val deleted: FieldsList<CommentField> get() = fieldsList("${path}/deleted")
	val htmlContent: FieldsList<CommentField> get() = fieldsList("${path}/htmlContent")
	val id: FieldsList<CommentField> get() = fieldsList("${path}/id")
	val kind: FieldsList<CommentField> get() = fieldsList("${path}/kind")
	val modifiedTime: FieldsList<CommentField> get() = fieldsList("${path}/modifiedTime")
}

