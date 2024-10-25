package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistoryField : Field

object HistoryFields {
    val ALL: FieldsList<HistoryField> = fieldsList("*")
	val id: FieldsList<HistoryField> get() = fieldsList("id")
	val labelsAdded = object : HistoryFieldHistoryLabelAdded("labelsAdded") {}
	val labelsRemoved = object : HistoryFieldHistoryLabelRemoved("labelsRemoved") {}
	val messages = object : HistoryFieldMessage("messages") {}
	val messagesAdded = object : HistoryFieldHistoryMessageAdded("messagesAdded") {}
	val messagesDeleted = object : HistoryFieldHistoryMessageDeleted("messagesDeleted") {}
}

abstract class HistoryFieldHistoryLabelAdded(private val path: String) : FieldsList<HistoryField>(path) {
	val labelIds: FieldsList<HistoryField> get() = fieldsList("${path}/labelIds")
	val message by lazy { object : HistoryFieldMessage("${path}/message") {} }
}

abstract class HistoryFieldHistoryLabelRemoved(private val path: String) : FieldsList<HistoryField>(path) {
	val labelIds: FieldsList<HistoryField> get() = fieldsList("${path}/labelIds")
	val message by lazy { object : HistoryFieldMessage("${path}/message") {} }
}

abstract class HistoryFieldMessage(private val path: String) : FieldsList<HistoryField>(path) {
	val historyId: FieldsList<HistoryField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<HistoryField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<HistoryField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<HistoryField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : HistoryFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<HistoryField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<HistoryField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<HistoryField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<HistoryField> get() = fieldsList("${path}/threadId")
}

abstract class HistoryFieldHistoryMessageAdded(private val path: String) : FieldsList<HistoryField>(path) {
	val message by lazy { object : HistoryFieldMessage("${path}/message") {} }
}

abstract class HistoryFieldHistoryMessageDeleted(private val path: String) : FieldsList<HistoryField>(path) {
	val message by lazy { object : HistoryFieldMessage("${path}/message") {} }
}

abstract class HistoryFieldMessagePart(private val path: String) : FieldsList<HistoryField>(path) {
	val body by lazy { object : HistoryFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<HistoryField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : HistoryFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<HistoryField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<HistoryField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : HistoryFieldMessagePart("${path}/parts") {} }
}

abstract class HistoryFieldMessagePartBody(private val path: String) : FieldsList<HistoryField>(path) {
	val attachmentId: FieldsList<HistoryField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<HistoryField> get() = fieldsList("${path}/data")
	val size: FieldsList<HistoryField> get() = fieldsList("${path}/size")
}

abstract class HistoryFieldMessagePartHeader(private val path: String) : FieldsList<HistoryField>(path) {
	val name: FieldsList<HistoryField> get() = fieldsList("${path}/name")
	val value: FieldsList<HistoryField> get() = fieldsList("${path}/value")
}

