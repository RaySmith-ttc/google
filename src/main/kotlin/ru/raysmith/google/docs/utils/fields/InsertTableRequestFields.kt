package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertTableRequestField : Field

object InsertTableRequestFields {
    val ALL: FieldsList<InsertTableRequestField> = fieldsList("*")
	val columns: FieldsList<InsertTableRequestField> get() = fieldsList("columns")
	val endOfSegmentLocation = object : InsertTableRequestFieldEndOfSegmentLocation("endOfSegmentLocation") {}
	val location = object : InsertTableRequestFieldLocation("location") {}
	val rows: FieldsList<InsertTableRequestField> get() = fieldsList("rows")
}

abstract class InsertTableRequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<InsertTableRequestField>(path) {
	val segmentId: FieldsList<InsertTableRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertTableRequestField> get() = fieldsList("${path}/tabId")
}

abstract class InsertTableRequestFieldLocation(private val path: String) : FieldsList<InsertTableRequestField>(path) {
	val index: FieldsList<InsertTableRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<InsertTableRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertTableRequestField> get() = fieldsList("${path}/tabId")
}

