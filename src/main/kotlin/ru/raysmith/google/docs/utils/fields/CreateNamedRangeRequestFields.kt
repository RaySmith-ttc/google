package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateNamedRangeRequestField : Field

object CreateNamedRangeRequestFields {
    val ALL: FieldsList<CreateNamedRangeRequestField> = fieldsList("*")
	val name: FieldsList<CreateNamedRangeRequestField> get() = fieldsList("name")
	val range = object : CreateNamedRangeRequestFieldRange("range") {}
}

abstract class CreateNamedRangeRequestFieldRange(private val path: String) : FieldsList<CreateNamedRangeRequestField>(path) {
	val endIndex: FieldsList<CreateNamedRangeRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<CreateNamedRangeRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<CreateNamedRangeRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<CreateNamedRangeRequestField> get() = fieldsList("${path}/tabId")
}

