package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ReplyField : Field

object ReplyFields {
    val ALL: FieldsList<ReplyField> = fieldsList("*")
	val action: FieldsList<ReplyField> get() = fieldsList("action")
	val author = object : ReplyFieldUser("author") {}
	val content: FieldsList<ReplyField> get() = fieldsList("content")
	val createdTime: FieldsList<ReplyField> get() = fieldsList("createdTime")
	val deleted: FieldsList<ReplyField> get() = fieldsList("deleted")
	val htmlContent: FieldsList<ReplyField> get() = fieldsList("htmlContent")
	val id: FieldsList<ReplyField> get() = fieldsList("id")
	val kind: FieldsList<ReplyField> get() = fieldsList("kind")
	val modifiedTime: FieldsList<ReplyField> get() = fieldsList("modifiedTime")
}

abstract class ReplyFieldUser(private val path: String) : FieldsList<ReplyField>(path) {
	val displayName: FieldsList<ReplyField> get() = fieldsList("${path}/displayName")
	val emailAddress: FieldsList<ReplyField> get() = fieldsList("${path}/emailAddress")
	val kind: FieldsList<ReplyField> get() = fieldsList("${path}/kind")
	val me: FieldsList<ReplyField> get() = fieldsList("${path}/me")
	val permissionId: FieldsList<ReplyField> get() = fieldsList("${path}/permissionId")
	val photoLink: FieldsList<ReplyField> get() = fieldsList("${path}/photoLink")
}

