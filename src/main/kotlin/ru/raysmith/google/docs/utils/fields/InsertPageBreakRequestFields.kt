package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertPageBreakRequestField : Field

object InsertPageBreakRequestFields {
    val ALL: FieldsList<InsertPageBreakRequestField> = fieldsList("*")
	val endOfSegmentLocation = object : InsertPageBreakRequestFieldEndOfSegmentLocation("endOfSegmentLocation") {}
	val location = object : InsertPageBreakRequestFieldLocation("location") {}
}

abstract class InsertPageBreakRequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<InsertPageBreakRequestField>(path) {
	val segmentId: FieldsList<InsertPageBreakRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertPageBreakRequestField> get() = fieldsList("${path}/tabId")
}

abstract class InsertPageBreakRequestFieldLocation(private val path: String) : FieldsList<InsertPageBreakRequestField>(path) {
	val index: FieldsList<InsertPageBreakRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<InsertPageBreakRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertPageBreakRequestField> get() = fieldsList("${path}/tabId")
}

