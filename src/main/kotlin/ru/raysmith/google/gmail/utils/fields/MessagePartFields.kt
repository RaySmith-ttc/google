package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MessagePartField : Field

object MessagePartFields {
    val ALL: FieldsList<MessagePartField> = fieldsList("*")
	val body = object : MessagePartFieldMessagePartBody("body") {}
	val filename: FieldsList<MessagePartField> get() = fieldsList("filename")
	val headers = object : MessagePartFieldMessagePartHeader("headers") {}
	val mimeType: FieldsList<MessagePartField> get() = fieldsList("mimeType")
	val partId: FieldsList<MessagePartField> get() = fieldsList("partId")
	val parts = object : MessagePartFieldMessagePart("parts") {}
}

abstract class MessagePartFieldMessagePartBody(private val path: String) : FieldsList<MessagePartField>(path) {
	val attachmentId: FieldsList<MessagePartField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<MessagePartField> get() = fieldsList("${path}/data")
	val size: FieldsList<MessagePartField> get() = fieldsList("${path}/size")
}

abstract class MessagePartFieldMessagePartHeader(private val path: String) : FieldsList<MessagePartField>(path) {
	val name: FieldsList<MessagePartField> get() = fieldsList("${path}/name")
	val value: FieldsList<MessagePartField> get() = fieldsList("${path}/value")
}

abstract class MessagePartFieldMessagePart(private val path: String) : FieldsList<MessagePartField>(path) {
	val body by lazy { object : MessagePartFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<MessagePartField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : MessagePartFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<MessagePartField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<MessagePartField> get() = fieldsList("${path}/partId")
	val parts: FieldsList<MessagePartField> get() = fieldsList("${path}/parts")
}

