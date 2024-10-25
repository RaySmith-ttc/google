package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddNamedRangeResponseField : Field

object AddNamedRangeResponseFields {
    val ALL: FieldsList<AddNamedRangeResponseField> = fieldsList("*")
	val namedRange = object : AddNamedRangeResponseFieldNamedRange("namedRange") {}
}

abstract class AddNamedRangeResponseFieldNamedRange(private val path: String) : FieldsList<AddNamedRangeResponseField>(path) {
	val name: FieldsList<AddNamedRangeResponseField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<AddNamedRangeResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : AddNamedRangeResponseFieldGridRange("${path}/range") {} }
}

abstract class AddNamedRangeResponseFieldGridRange(private val path: String) : FieldsList<AddNamedRangeResponseField>(path) {
	val endColumnIndex: FieldsList<AddNamedRangeResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddNamedRangeResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddNamedRangeResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddNamedRangeResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddNamedRangeResponseField> get() = fieldsList("${path}/startRowIndex")
}

