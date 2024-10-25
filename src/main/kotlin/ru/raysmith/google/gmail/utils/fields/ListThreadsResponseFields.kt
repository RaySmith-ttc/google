package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListThreadsResponseField : Field

object ListThreadsResponseFields {
    val ALL: FieldsList<ListThreadsResponseField> = fieldsList("*")
	val nextPageToken: FieldsList<ListThreadsResponseField> get() = fieldsList("nextPageToken")
	val resultSizeEstimate: FieldsList<ListThreadsResponseField> get() = fieldsList("resultSizeEstimate")
	val threads = object : ListThreadsResponseFieldThread("threads") {}
}

abstract class ListThreadsResponseFieldThread(private val path: String) : FieldsList<ListThreadsResponseField>(path) {
	val historyId: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/id")
	val messages by lazy { object : ListThreadsResponseFieldMessage("${path}/messages") {} }
	val snippet: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/snippet")
}

abstract class ListThreadsResponseFieldMessage(private val path: String) : FieldsList<ListThreadsResponseField>(path) {
	val historyId: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : ListThreadsResponseFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/threadId")
}

abstract class ListThreadsResponseFieldMessagePart(private val path: String) : FieldsList<ListThreadsResponseField>(path) {
	val body by lazy { object : ListThreadsResponseFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : ListThreadsResponseFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : ListThreadsResponseFieldMessagePart("${path}/parts") {} }
}

abstract class ListThreadsResponseFieldMessagePartBody(private val path: String) : FieldsList<ListThreadsResponseField>(path) {
	val attachmentId: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/data")
	val size: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/size")
}

abstract class ListThreadsResponseFieldMessagePartHeader(private val path: String) : FieldsList<ListThreadsResponseField>(path) {
	val name: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/name")
	val value: FieldsList<ListThreadsResponseField> get() = fieldsList("${path}/value")
}

