package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CommentListField : Field

object CommentListFields {
    val ALL: FieldsList<CommentListField> = fieldsList("*")
	val comments = object : CommentListFieldComment("comments") {}
	val kind: FieldsList<CommentListField> get() = fieldsList("kind")
	val nextPageToken: FieldsList<CommentListField> get() = fieldsList("nextPageToken")
}

abstract class CommentListFieldComment(private val path: String) : FieldsList<CommentListField>(path) {
	val anchor: FieldsList<CommentListField> get() = fieldsList("${path}/anchor")
	val author by lazy { object : CommentListFieldUser("${path}/author") {} }
	val content: FieldsList<CommentListField> get() = fieldsList("${path}/content")
	val createdTime: FieldsList<CommentListField> get() = fieldsList("${path}/createdTime")
	val deleted: FieldsList<CommentListField> get() = fieldsList("${path}/deleted")
	val htmlContent: FieldsList<CommentListField> get() = fieldsList("${path}/htmlContent")
	val id: FieldsList<CommentListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<CommentListField> get() = fieldsList("${path}/kind")
	val modifiedTime: FieldsList<CommentListField> get() = fieldsList("${path}/modifiedTime")
	val quotedFileContent by lazy { object : CommentListFieldQuotedFileContent("${path}/quotedFileContent") {} }
	val replies by lazy { object : CommentListFieldReply("${path}/replies") {} }
	val resolved: FieldsList<CommentListField> get() = fieldsList("${path}/resolved")
}

abstract class CommentListFieldUser(private val path: String) : FieldsList<CommentListField>(path) {
	val displayName: FieldsList<CommentListField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<CommentListField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<CommentListField> get() = fieldsList("${path}/kind")
	val me: FieldsList<CommentListField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<CommentListField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<CommentListField> get() = fieldsList("${path}/photoLink")
}

abstract class CommentListFieldQuotedFileContent(private val path: String) : FieldsList<CommentListField>(path) {
	val mimeType: FieldsList<CommentListField> get() = fieldsList("${path}/mimeType")
	val value: FieldsList<CommentListField> get() = fieldsList("${path}/value")
}

abstract class CommentListFieldReply(private val path: String) : FieldsList<CommentListField>(path) {
	val action: FieldsList<CommentListField> get() = fieldsList("${path}/action")
	val author by lazy { object : CommentListFieldUser("${path}/author") {} }
	val content: FieldsList<CommentListField> get() = fieldsList("${path}/content")
	val createdTime: FieldsList<CommentListField> get() = fieldsList("${path}/createdTime")
	val deleted: FieldsList<CommentListField> get() = fieldsList("${path}/deleted")
	val htmlContent: FieldsList<CommentListField> get() = fieldsList("${path}/htmlContent")
	val id: FieldsList<CommentListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<CommentListField> get() = fieldsList("${path}/kind")
	val modifiedTime: FieldsList<CommentListField> get() = fieldsList("${path}/modifiedTime")
}

