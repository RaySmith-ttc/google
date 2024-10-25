package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateNamedRangeRequestField : Field

object UpdateNamedRangeRequestFields {
    val ALL: FieldsList<UpdateNamedRangeRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("fields")
	val namedRange = object : UpdateNamedRangeRequestFieldNamedRange("namedRange") {}
}

abstract class UpdateNamedRangeRequestFieldNamedRange(private val path: String) : FieldsList<UpdateNamedRangeRequestField>(path) {
	val name: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : UpdateNamedRangeRequestFieldGridRange("${path}/range") {} }
}

abstract class UpdateNamedRangeRequestFieldGridRange(private val path: String) : FieldsList<UpdateNamedRangeRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateNamedRangeRequestField> get() = fieldsList("${path}/startRowIndex")
}

