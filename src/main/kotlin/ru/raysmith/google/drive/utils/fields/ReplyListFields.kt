package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ReplyListField : Field

object ReplyListFields {
    val ALL: FieldsList<ReplyListField> = fieldsList("*")
	val kind: FieldsList<ReplyListField> get() = fieldsList("kind")
	val nextPageToken: FieldsList<ReplyListField> get() = fieldsList("nextPageToken")
	val replies = object : ReplyListFieldReply("replies") {}
}

abstract class ReplyListFieldReply(private val path: String) : FieldsList<ReplyListField>(path) {
	val action: FieldsList<ReplyListField> get() = fieldsList("${path}/action")
	val author by lazy { object : ReplyListFieldUser("${path}/author") {} }
	val content: FieldsList<ReplyListField> get() = fieldsList("${path}/content")
	val createdTime: FieldsList<ReplyListField> get() = fieldsList("${path}/createdTime")
	val deleted: FieldsList<ReplyListField> get() = fieldsList("${path}/deleted")
	val htmlContent: FieldsList<ReplyListField> get() = fieldsList("${path}/htmlContent")
	val id: FieldsList<ReplyListField> get() = fieldsList("${path}/id")
	val kind: FieldsList<ReplyListField> get() = fieldsList("${path}/kind")
	val modifiedTime: FieldsList<ReplyListField> get() = fieldsList("${path}/modifiedTime")
}

abstract class ReplyListFieldUser(private val path: String) : FieldsList<ReplyListField>(path) {
	val displayName: FieldsList<ReplyListField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<ReplyListField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<ReplyListField> get() = fieldsList("${path}/kind")
	val me: FieldsList<ReplyListField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<ReplyListField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<ReplyListField> get() = fieldsList("${path}/photoLink")
}

