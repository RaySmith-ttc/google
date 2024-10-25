package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListHistoryResponseField : Field

object ListHistoryResponseFields {
    val ALL: FieldsList<ListHistoryResponseField> = fieldsList("*")
	val history = object : ListHistoryResponseFieldHistory("history") {}
	val historyId: FieldsList<ListHistoryResponseField> get() = fieldsList("historyId")
	val nextPageToken: FieldsList<ListHistoryResponseField> get() = fieldsList("nextPageToken")
}

abstract class ListHistoryResponseFieldHistory(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val id: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/id")
	val labelsAdded by lazy { object : ListHistoryResponseFieldHistoryLabelAdded("${path}/labelsAdded") {} }
	val labelsRemoved by lazy { object : ListHistoryResponseFieldHistoryLabelRemoved("${path}/labelsRemoved") {} }
	val messages by lazy { object : ListHistoryResponseFieldMessage("${path}/messages") {} }
	val messagesAdded by lazy { object : ListHistoryResponseFieldHistoryMessageAdded("${path}/messagesAdded") {} }
	val messagesDeleted by lazy { object : ListHistoryResponseFieldHistoryMessageDeleted("${path}/messagesDeleted") {} }
}

abstract class ListHistoryResponseFieldHistoryLabelAdded(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val labelIds: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/labelIds")
	val message by lazy { object : ListHistoryResponseFieldMessage("${path}/message") {} }
}

abstract class ListHistoryResponseFieldHistoryLabelRemoved(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val labelIds: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/labelIds")
	val message by lazy { object : ListHistoryResponseFieldMessage("${path}/message") {} }
}

abstract class ListHistoryResponseFieldMessage(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val historyId: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : ListHistoryResponseFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/threadId")
}

abstract class ListHistoryResponseFieldHistoryMessageAdded(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val message by lazy { object : ListHistoryResponseFieldMessage("${path}/message") {} }
}

abstract class ListHistoryResponseFieldHistoryMessageDeleted(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val message by lazy { object : ListHistoryResponseFieldMessage("${path}/message") {} }
}

abstract class ListHistoryResponseFieldMessagePart(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val body by lazy { object : ListHistoryResponseFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : ListHistoryResponseFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : ListHistoryResponseFieldMessagePart("${path}/parts") {} }
}

abstract class ListHistoryResponseFieldMessagePartBody(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val attachmentId: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/data")
	val size: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/size")
}

abstract class ListHistoryResponseFieldMessagePartHeader(private val path: String) : FieldsList<ListHistoryResponseField>(path) {
	val name: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/name")
	val value: FieldsList<ListHistoryResponseField> get() = fieldsList("${path}/value")
}

