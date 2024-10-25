package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ThreadField : Field

object ThreadFields {
    val ALL: FieldsList<ThreadField> = fieldsList("*")
	val historyId: FieldsList<ThreadField> get() = fieldsList("historyId")
	val id: FieldsList<ThreadField> get() = fieldsList("id")
	val messages = object : ThreadFieldMessage("messages") {}
	val snippet: FieldsList<ThreadField> get() = fieldsList("snippet")
}

abstract class ThreadFieldMessage(private val path: String) : FieldsList<ThreadField>(path) {
	val historyId: FieldsList<ThreadField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<ThreadField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<ThreadField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<ThreadField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : ThreadFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<ThreadField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<ThreadField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<ThreadField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<ThreadField> get() = fieldsList("${path}/threadId")
}

abstract class ThreadFieldMessagePart(private val path: String) : FieldsList<ThreadField>(path) {
	val body by lazy { object : ThreadFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<ThreadField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : ThreadFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<ThreadField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<ThreadField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : ThreadFieldMessagePart("${path}/parts") {} }
}

abstract class ThreadFieldMessagePartBody(private val path: String) : FieldsList<ThreadField>(path) {
	val attachmentId: FieldsList<ThreadField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<ThreadField> get() = fieldsList("${path}/data")
	val size: FieldsList<ThreadField> get() = fieldsList("${path}/size")
}

abstract class ThreadFieldMessagePartHeader(private val path: String) : FieldsList<ThreadField>(path) {
	val name: FieldsList<ThreadField> get() = fieldsList("${path}/name")
	val value: FieldsList<ThreadField> get() = fieldsList("${path}/value")
}

