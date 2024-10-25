package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DimensionRangeField : Field

object DimensionRangeFields {
    val ALL: FieldsList<DimensionRangeField> = fieldsList("*")
	val dimension: FieldsList<DimensionRangeField> get() = fieldsList("dimension")
	val endIndex: FieldsList<DimensionRangeField> get() = fieldsList("endIndex")
	val sheetId: FieldsList<DimensionRangeField> get() = fieldsList("sheetId")
	val startIndex: FieldsList<DimensionRangeField> get() = fieldsList("startIndex")
}

