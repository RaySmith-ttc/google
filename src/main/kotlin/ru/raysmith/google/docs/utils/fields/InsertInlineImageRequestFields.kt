package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertInlineImageRequestField : Field

object InsertInlineImageRequestFields {
    val ALL: FieldsList<InsertInlineImageRequestField> = fieldsList("*")
	val endOfSegmentLocation = object : InsertInlineImageRequestFieldEndOfSegmentLocation("endOfSegmentLocation") {}
	val location = object : InsertInlineImageRequestFieldLocation("location") {}
	val objectSize = object : InsertInlineImageRequestFieldSize("objectSize") {}
	val uri: FieldsList<InsertInlineImageRequestField> get() = fieldsList("uri")
}

abstract class InsertInlineImageRequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<InsertInlineImageRequestField>(path) {
	val segmentId: FieldsList<InsertInlineImageRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertInlineImageRequestField> get() = fieldsList("${path}/tabId")
}

abstract class InsertInlineImageRequestFieldLocation(private val path: String) : FieldsList<InsertInlineImageRequestField>(path) {
	val index: FieldsList<InsertInlineImageRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<InsertInlineImageRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<InsertInlineImageRequestField> get() = fieldsList("${path}/tabId")
}

abstract class InsertInlineImageRequestFieldSize(private val path: String) : FieldsList<InsertInlineImageRequestField>(path) {
	val height by lazy { object : InsertInlineImageRequestFieldDimension("${path}/height") {} }
	val width by lazy { object : InsertInlineImageRequestFieldDimension("${path}/width") {} }
}

abstract class InsertInlineImageRequestFieldDimension(private val path: String) : FieldsList<InsertInlineImageRequestField>(path) {
	val magnitude: FieldsList<InsertInlineImageRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<InsertInlineImageRequestField> get() = fieldsList("${path}/unit")
}

