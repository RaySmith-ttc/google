package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DimensionGroupField : Field

object DimensionGroupFields {
    val ALL: FieldsList<DimensionGroupField> = fieldsList("*")
	val collapsed: FieldsList<DimensionGroupField> get() = fieldsList("collapsed")
	val depth: FieldsList<DimensionGroupField> get() = fieldsList("depth")
	val range = object : DimensionGroupFieldDimensionRange("range") {}
}

abstract class DimensionGroupFieldDimensionRange(private val path: String) : FieldsList<DimensionGroupField>(path) {
	val dimension: FieldsList<DimensionGroupField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DimensionGroupField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DimensionGroupField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DimensionGroupField> get() = fieldsList("${path}/startIndex")
}

