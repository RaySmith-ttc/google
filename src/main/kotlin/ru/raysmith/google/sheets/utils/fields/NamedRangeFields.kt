package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NamedRangeField : Field

object NamedRangeFields {
    val ALL: FieldsList<NamedRangeField> = fieldsList("*")
	val name: FieldsList<NamedRangeField> get() = fieldsList("name")
	val namedRangeId: FieldsList<NamedRangeField> get() = fieldsList("namedRangeId")
	val range = object : NamedRangeFieldGridRange("range") {}
}

abstract class NamedRangeFieldGridRange(private val path: String) : FieldsList<NamedRangeField>(path) {
	val endColumnIndex: FieldsList<NamedRangeField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<NamedRangeField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<NamedRangeField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<NamedRangeField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<NamedRangeField> get() = fieldsList("${path}/startRowIndex")
}

