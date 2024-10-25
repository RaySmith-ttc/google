package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DraftField : Field

object DraftFields {
    val ALL: FieldsList<DraftField> = fieldsList("*")
	val id: FieldsList<DraftField> get() = fieldsList("id")
	val message = object : DraftFieldMessage("message") {}
}

abstract class DraftFieldMessage(private val path: String) : FieldsList<DraftField>(path) {
	val historyId: FieldsList<DraftField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<DraftField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<DraftField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<DraftField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : DraftFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<DraftField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<DraftField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<DraftField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<DraftField> get() = fieldsList("${path}/threadId")
}

abstract class DraftFieldMessagePart(private val path: String) : FieldsList<DraftField>(path) {
	val body by lazy { object : DraftFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<DraftField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : DraftFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<DraftField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<DraftField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : DraftFieldMessagePart("${path}/parts") {} }
}

abstract class DraftFieldMessagePartBody(private val path: String) : FieldsList<DraftField>(path) {
	val attachmentId: FieldsList<DraftField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<DraftField> get() = fieldsList("${path}/data")
	val size: FieldsList<DraftField> get() = fieldsList("${path}/size")
}

abstract class DraftFieldMessagePartHeader(private val path: String) : FieldsList<DraftField>(path) {
	val name: FieldsList<DraftField> get() = fieldsList("${path}/name")
	val value: FieldsList<DraftField> get() = fieldsList("${path}/value")
}

