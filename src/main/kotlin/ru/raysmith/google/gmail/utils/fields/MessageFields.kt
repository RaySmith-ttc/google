package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MessageField : Field

object MessageFields {
    val ALL: FieldsList<MessageField> = fieldsList("*")
	val historyId: FieldsList<MessageField> get() = fieldsList("historyId")
	val id: FieldsList<MessageField> get() = fieldsList("id")
	val internalDate: FieldsList<MessageField> get() = fieldsList("internalDate")
	val labelIds: FieldsList<MessageField> get() = fieldsList("labelIds")
	val payload = object : MessageFieldMessagePart("payload") {}
	val raw: FieldsList<MessageField> get() = fieldsList("raw")
	val sizeEstimate: FieldsList<MessageField> get() = fieldsList("sizeEstimate")
	val snippet: FieldsList<MessageField> get() = fieldsList("snippet")
	val threadId: FieldsList<MessageField> get() = fieldsList("threadId")
}

abstract class MessageFieldMessagePart(private val path: String) : FieldsList<MessageField>(path) {
	val body by lazy { object : MessageFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<MessageField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : MessageFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<MessageField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<MessageField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : MessageFieldMessagePart("${path}/parts") {} }
}

abstract class MessageFieldMessagePartBody(private val path: String) : FieldsList<MessageField>(path) {
	val attachmentId: FieldsList<MessageField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<MessageField> get() = fieldsList("${path}/data")
	val size: FieldsList<MessageField> get() = fieldsList("${path}/size")
}

abstract class MessageFieldMessagePartHeader(private val path: String) : FieldsList<MessageField>(path) {
	val name: FieldsList<MessageField> get() = fieldsList("${path}/name")
	val value: FieldsList<MessageField> get() = fieldsList("${path}/value")
}

