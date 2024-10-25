package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NamedRangesField : Field

object NamedRangesFields {
    val ALL: FieldsList<NamedRangesField> = fieldsList("*")
	val name: FieldsList<NamedRangesField> get() = fieldsList("name")
	val namedRanges = object : NamedRangesFieldNamedRange("namedRanges") {}
}

abstract class NamedRangesFieldNamedRange(private val path: String) : FieldsList<NamedRangesField>(path) {
	val name: FieldsList<NamedRangesField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<NamedRangesField> get() = fieldsList("${path}/namedRangeId")
	val ranges by lazy { object : NamedRangesFieldRange("${path}/ranges") {} }
}

abstract class NamedRangesFieldRange(private val path: String) : FieldsList<NamedRangesField>(path) {
	val endIndex: FieldsList<NamedRangesField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<NamedRangesField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<NamedRangesField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<NamedRangesField> get() = fieldsList("${path}/tabId")
}

