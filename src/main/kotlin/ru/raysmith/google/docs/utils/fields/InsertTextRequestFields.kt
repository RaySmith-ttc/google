package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertTextRequestField : Field

object InsertTextRequestFields {
    val ALL: FieldsList<InsertTextRequestField> = fieldsList("*")
	val endOfSegmentLocation = object : InsertTextRequestFieldEndOfSegmentLocation("endOfSegmentLocation") {}
	val location = object : InsertTextRequestFieldLocation("location") {}
	val text: FieldsList<InsertTextRequestField> get() = fieldsList("text")
}

abstract class InsertTextRequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<InsertTextRequestField>(path) {
	val segmentId: FieldsList<InsertTextRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertTextRequestField> get() = fieldsList("${path}/tabId")
}

abstract class InsertTextRequestFieldLocation(private val path: String) : FieldsList<InsertTextRequestField>(path) {
	val index: FieldsList<InsertTextRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<InsertTextRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertTextRequestField> get() = fieldsList("${path}/tabId")
}

