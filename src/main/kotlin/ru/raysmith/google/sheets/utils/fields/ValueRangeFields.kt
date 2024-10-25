package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ValueRangeField : Field

object ValueRangeFields {
    val ALL: FieldsList<ValueRangeField> = fieldsList("*")
	val majorDimension: FieldsList<ValueRangeField> get() = fieldsList("majorDimension")
	val range: FieldsList<ValueRangeField> get() = fieldsList("range")
	val values: FieldsList<ValueRangeField> get() = fieldsList("values")
}

