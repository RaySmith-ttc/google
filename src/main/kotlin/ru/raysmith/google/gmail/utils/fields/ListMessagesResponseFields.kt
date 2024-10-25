package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListMessagesResponseField : Field

object ListMessagesResponseFields {
    val ALL: FieldsList<ListMessagesResponseField> = fieldsList("*")
	val messages = object : ListMessagesResponseFieldMessage("messages") {}
	val nextPageToken: FieldsList<ListMessagesResponseField> get() = fieldsList("nextPageToken")
	val resultSizeEstimate: FieldsList<ListMessagesResponseField> get() = fieldsList("resultSizeEstimate")
}

abstract class ListMessagesResponseFieldMessage(private val path: String) : FieldsList<ListMessagesResponseField>(path) {
	val historyId: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : ListMessagesResponseFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/threadId")
}

abstract class ListMessagesResponseFieldMessagePart(private val path: String) : FieldsList<ListMessagesResponseField>(path) {
	val body by lazy { object : ListMessagesResponseFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : ListMessagesResponseFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : ListMessagesResponseFieldMessagePart("${path}/parts") {} }
}

abstract class ListMessagesResponseFieldMessagePartBody(private val path: String) : FieldsList<ListMessagesResponseField>(path) {
	val attachmentId: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/data")
	val size: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/size")
}

abstract class ListMessagesResponseFieldMessagePartHeader(private val path: String) : FieldsList<ListMessagesResponseField>(path) {
	val name: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/name")
	val value: FieldsList<ListMessagesResponseField> get() = fieldsList("${path}/value")
}

