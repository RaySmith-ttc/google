package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistoryMessageAddedField : Field

object HistoryMessageAddedFields {
    val ALL: FieldsList<HistoryMessageAddedField> = fieldsList("*")
	val message = object : HistoryMessageAddedFieldMessage("message") {}
}

abstract class HistoryMessageAddedFieldMessage(private val path: String) : FieldsList<HistoryMessageAddedField>(path) {
	val historyId: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : HistoryMessageAddedFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/threadId")
}

abstract class HistoryMessageAddedFieldMessagePart(private val path: String) : FieldsList<HistoryMessageAddedField>(path) {
	val body by lazy { object : HistoryMessageAddedFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : HistoryMessageAddedFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : HistoryMessageAddedFieldMessagePart("${path}/parts") {} }
}

abstract class HistoryMessageAddedFieldMessagePartBody(private val path: String) : FieldsList<HistoryMessageAddedField>(path) {
	val attachmentId: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/data")
	val size: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/size")
}

abstract class HistoryMessageAddedFieldMessagePartHeader(private val path: String) : FieldsList<HistoryMessageAddedField>(path) {
	val name: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/name")
	val value: FieldsList<HistoryMessageAddedField> get() = fieldsList("${path}/value")
}

