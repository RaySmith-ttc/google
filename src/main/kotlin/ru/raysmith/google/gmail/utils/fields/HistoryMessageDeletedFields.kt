package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistoryMessageDeletedField : Field

object HistoryMessageDeletedFields {
    val ALL: FieldsList<HistoryMessageDeletedField> = fieldsList("*")
	val message = object : HistoryMessageDeletedFieldMessage("message") {}
}

abstract class HistoryMessageDeletedFieldMessage(private val path: String) : FieldsList<HistoryMessageDeletedField>(path) {
	val historyId: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : HistoryMessageDeletedFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/threadId")
}

abstract class HistoryMessageDeletedFieldMessagePart(private val path: String) : FieldsList<HistoryMessageDeletedField>(path) {
	val body by lazy { object : HistoryMessageDeletedFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : HistoryMessageDeletedFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : HistoryMessageDeletedFieldMessagePart("${path}/parts") {} }
}

abstract class HistoryMessageDeletedFieldMessagePartBody(private val path: String) : FieldsList<HistoryMessageDeletedField>(path) {
	val attachmentId: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/data")
	val size: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/size")
}

abstract class HistoryMessageDeletedFieldMessagePartHeader(private val path: String) : FieldsList<HistoryMessageDeletedField>(path) {
	val name: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/name")
	val value: FieldsList<HistoryMessageDeletedField> get() = fieldsList("${path}/value")
}

