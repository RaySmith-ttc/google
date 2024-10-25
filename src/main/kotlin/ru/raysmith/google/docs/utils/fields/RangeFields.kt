package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RangeField : Field

object RangeFields {
    val ALL: FieldsList<RangeField> = fieldsList("*")
	val endIndex: FieldsList<RangeField> get() = fieldsList("endIndex")
	val segmentId: FieldsList<RangeField> get() = fieldsList("segmentId")
	val startIndex: FieldsList<RangeField> get() = fieldsList("startIndex")
	val tabId: FieldsList<RangeField> get() = fieldsList("tabId")
}

