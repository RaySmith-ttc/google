package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartSourceRangeField : Field

object ChartSourceRangeFields {
    val ALL: FieldsList<ChartSourceRangeField> = fieldsList("*")
	val sources = object : ChartSourceRangeFieldGridRange("sources") {}
}

abstract class ChartSourceRangeFieldGridRange(private val path: String) : FieldsList<ChartSourceRangeField>(path) {
	val endColumnIndex: FieldsList<ChartSourceRangeField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<ChartSourceRangeField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<ChartSourceRangeField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<ChartSourceRangeField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<ChartSourceRangeField> get() = fieldsList("${path}/startRowIndex")
}

