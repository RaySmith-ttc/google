package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertSectionBreakRequestField : Field

object InsertSectionBreakRequestFields {
    val ALL: FieldsList<InsertSectionBreakRequestField> = fieldsList("*")
	val endOfSegmentLocation = object : InsertSectionBreakRequestFieldEndOfSegmentLocation("endOfSegmentLocation") {}
	val location = object : InsertSectionBreakRequestFieldLocation("location") {}
	val sectionType: FieldsList<InsertSectionBreakRequestField> get() = fieldsList("sectionType")
}

abstract class InsertSectionBreakRequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<InsertSectionBreakRequestField>(path) {
	val segmentId: FieldsList<InsertSectionBreakRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertSectionBreakRequestField> get() = fieldsList("${path}/tabId")
}

abstract class InsertSectionBreakRequestFieldLocation(private val path: String) : FieldsList<InsertSectionBreakRequestField>(path) {
	val index: FieldsList<InsertSectionBreakRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<InsertSectionBreakRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertSectionBreakRequestField> get() = fieldsList("${path}/tabId")
}

