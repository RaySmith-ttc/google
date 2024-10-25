package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateHeaderRequestField : Field

object CreateHeaderRequestFields {
    val ALL: FieldsList<CreateHeaderRequestField> = fieldsList("*")
	val sectionBreakLocation = object : CreateHeaderRequestFieldLocation("sectionBreakLocation") {}
	val type: FieldsList<CreateHeaderRequestField> get() = fieldsList("type")
}

abstract class CreateHeaderRequestFieldLocation(private val path: String) : FieldsList<CreateHeaderRequestField>(path) {
	val index: FieldsList<CreateHeaderRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<CreateHeaderRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<CreateHeaderRequestField> get() = fieldsList("${path}/tabId")
}

