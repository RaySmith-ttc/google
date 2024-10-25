package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NamedRangeField : Field

object NamedRangeFields {
    val ALL: FieldsList<NamedRangeField> = fieldsList("*")
	val name: FieldsList<NamedRangeField> get() = fieldsList("name")
	val namedRangeId: FieldsList<NamedRangeField> get() = fieldsList("namedRangeId")
	val ranges = object : NamedRangeFieldRange("ranges") {}
}

abstract class NamedRangeFieldRange(private val path: String) : FieldsList<NamedRangeField>(path) {
	val endIndex: FieldsList<NamedRangeField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<NamedRangeField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<NamedRangeField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<NamedRangeField> get() = fieldsList("${path}/tabId")
}

