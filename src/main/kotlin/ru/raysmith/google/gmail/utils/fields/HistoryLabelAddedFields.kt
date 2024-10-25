package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistoryLabelAddedField : Field

object HistoryLabelAddedFields {
    val ALL: FieldsList<HistoryLabelAddedField> = fieldsList("*")
	val labelIds: FieldsList<HistoryLabelAddedField> get() = fieldsList("labelIds")
	val message = object : HistoryLabelAddedFieldMessage("message") {}
}

abstract class HistoryLabelAddedFieldMessage(private val path: String) : FieldsList<HistoryLabelAddedField>(path) {
	val historyId: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : HistoryLabelAddedFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/threadId")
}

abstract class HistoryLabelAddedFieldMessagePart(private val path: String) : FieldsList<HistoryLabelAddedField>(path) {
	val body by lazy { object : HistoryLabelAddedFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : HistoryLabelAddedFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : HistoryLabelAddedFieldMessagePart("${path}/parts") {} }
}

abstract class HistoryLabelAddedFieldMessagePartBody(private val path: String) : FieldsList<HistoryLabelAddedField>(path) {
	val attachmentId: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/data")
	val size: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/size")
}

abstract class HistoryLabelAddedFieldMessagePartHeader(private val path: String) : FieldsList<HistoryLabelAddedField>(path) {
	val name: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/name")
	val value: FieldsList<HistoryLabelAddedField> get() = fieldsList("${path}/value")
}

