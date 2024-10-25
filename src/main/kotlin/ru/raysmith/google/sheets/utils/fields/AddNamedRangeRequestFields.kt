package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddNamedRangeRequestField : Field

object AddNamedRangeRequestFields {
    val ALL: FieldsList<AddNamedRangeRequestField> = fieldsList("*")
	val namedRange = object : AddNamedRangeRequestFieldNamedRange("namedRange") {}
}

abstract class AddNamedRangeRequestFieldNamedRange(private val path: String) : FieldsList<AddNamedRangeRequestField>(path) {
	val name: FieldsList<AddNamedRangeRequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<AddNamedRangeRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : AddNamedRangeRequestFieldGridRange("${path}/range") {} }
}

abstract class AddNamedRangeRequestFieldGridRange(private val path: String) : FieldsList<AddNamedRangeRequestField>(path) {
	val endColumnIndex: FieldsList<AddNamedRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddNamedRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddNamedRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddNamedRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddNamedRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

