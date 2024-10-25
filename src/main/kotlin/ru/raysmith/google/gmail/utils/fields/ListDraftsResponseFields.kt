package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListDraftsResponseField : Field

object ListDraftsResponseFields {
    val ALL: FieldsList<ListDraftsResponseField> = fieldsList("*")
	val drafts = object : ListDraftsResponseFieldDraft("drafts") {}
	val nextPageToken: FieldsList<ListDraftsResponseField> get() = fieldsList("nextPageToken")
	val resultSizeEstimate: FieldsList<ListDraftsResponseField> get() = fieldsList("resultSizeEstimate")
}

abstract class ListDraftsResponseFieldDraft(private val path: String) : FieldsList<ListDraftsResponseField>(path) {
	val id: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/id")
	val message by lazy { object : ListDraftsResponseFieldMessage("${path}/message") {} }
}

abstract class ListDraftsResponseFieldMessage(private val path: String) : FieldsList<ListDraftsResponseField>(path) {
	val historyId: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/historyId")
	val id: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/id")
	val internalDate: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/internalDate")
	val labelIds: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/labelIds")
	val payload by lazy { object : ListDraftsResponseFieldMessagePart("${path}/payload") {} }
	val raw: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/raw")
	val sizeEstimate: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/sizeEstimate")
	val snippet: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/snippet")
	val threadId: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/threadId")
}

abstract class ListDraftsResponseFieldMessagePart(private val path: String) : FieldsList<ListDraftsResponseField>(path) {
	val body by lazy { object : ListDraftsResponseFieldMessagePartBody("${path}/body") {} }
	val filename: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/filename")
	val headers by lazy { object : ListDraftsResponseFieldMessagePartHeader("${path}/headers") {} }
	val mimeType: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/mimeType")
	val partId: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/partId")
	val parts by lazy { object : ListDraftsResponseFieldMessagePart("${path}/parts") {} }
}

abstract class ListDraftsResponseFieldMessagePartBody(private val path: String) : FieldsList<ListDraftsResponseField>(path) {
	val attachmentId: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/attachmentId")
	val data: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/data")
	val size: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/size")
}

abstract class ListDraftsResponseFieldMessagePartHeader(private val path: String) : FieldsList<ListDraftsResponseField>(path) {
	val name: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/name")
	val value: FieldsList<ListDraftsResponseField> get() = fieldsList("${path}/value")
}

