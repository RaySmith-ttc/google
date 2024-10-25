package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateFootnoteRequestField : Field

object CreateFootnoteRequestFields {
    val ALL: FieldsList<CreateFootnoteRequestField> = fieldsList("*")
	val endOfSegmentLocation = object : CreateFootnoteRequestFieldEndOfSegmentLocation("endOfSegmentLocation") {}
	val location = object : CreateFootnoteRequestFieldLocation("location") {}
}

abstract class CreateFootnoteRequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<CreateFootnoteRequestField>(path) {
	val segmentId: FieldsList<CreateFootnoteRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<CreateFootnoteRequestField> get() = fieldsList("${path}/tabId")
}

abstract class CreateFootnoteRequestFieldLocation(private val path: String) : FieldsList<CreateFootnoteRequestField>(path) {
	val index: FieldsList<CreateFootnoteRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<CreateFootnoteRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<CreateFootnoteRequestField> get() = fieldsList("${path}/tabId")
}

