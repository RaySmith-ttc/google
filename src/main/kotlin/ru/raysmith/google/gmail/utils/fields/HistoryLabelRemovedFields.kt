package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistoryLabelRemovedField : Field

object HistoryLabelRemovedFields {
    val ALL: FieldsList<HistoryLabelRemovedField> = fieldsList("*")
	val labelIds: FieldsList<HistoryLabelRemovedField> get() = fieldsList("labelIds")
	val message = object : HistoryLabelRemovedFieldMessage("message") {}
}

abstract class HistoryLabelRemovedFieldMessage(private val path: String) : FieldsList<HistoryLabelRemovedField>(path) {
	val historyId: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : HistoryLabelRemovedFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/threadId")
}

abstract class HistoryLabelRemovedFieldMessagePart(private val path: String) : FieldsList<HistoryLabelRemovedField>(path) {
	val body by lazy { object : HistoryLabelRemovedFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : HistoryLabelRemovedFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : HistoryLabelRemovedFieldMessagePart("${path}/parts") {} }
}

abstract class HistoryLabelRemovedFieldMessagePartBody(private val path: String) : FieldsList<HistoryLabelRemovedField>(path) {
	val attachmentId: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/data")
	val size: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/size")
}

abstract class HistoryLabelRemovedFieldMessagePartHeader(private val path: String) : FieldsList<HistoryLabelRemovedField>(path) {
	val name: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/name")
	val value: FieldsList<HistoryLabelRemovedField> get() = fieldsList("${path}/value")
}

