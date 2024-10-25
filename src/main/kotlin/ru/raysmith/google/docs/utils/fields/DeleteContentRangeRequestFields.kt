package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteContentRangeRequestField : Field

object DeleteContentRangeRequestFields {
    val ALL: FieldsList<DeleteContentRangeRequestField> = fieldsList("*")
	val range = object : DeleteContentRangeRequestFieldRange("range") {}
}

abstract class DeleteContentRangeRequestFieldRange(private val path: String) : FieldsList<DeleteContentRangeRequestField>(path) {
	val endIndex: FieldsList<DeleteContentRangeRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<DeleteContentRangeRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<DeleteContentRangeRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<DeleteContentRangeRequestField> get() = fieldsList("${path}/tabId")
}

