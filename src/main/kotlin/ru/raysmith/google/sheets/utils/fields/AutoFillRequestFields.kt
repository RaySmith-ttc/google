package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AutoFillRequestField : Field

object AutoFillRequestFields {
    val ALL: FieldsList<AutoFillRequestField> = fieldsList("*")
	val range = object : AutoFillRequestFieldGridRange("range") {}
	val sourceAndDestination = object : AutoFillRequestFieldSourceAndDestination("sourceAndDestination") {}
	val useAlternateSeries: FieldsList<AutoFillRequestField> get() = fieldsList("useAlternateSeries")
}

abstract class AutoFillRequestFieldGridRange(private val path: String) : FieldsList<AutoFillRequestField>(path) {
	val endColumnIndex: FieldsList<AutoFillRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AutoFillRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AutoFillRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AutoFillRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AutoFillRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AutoFillRequestFieldSourceAndDestination(private val path: String) : FieldsList<AutoFillRequestField>(path) {
	val dimension: FieldsList<AutoFillRequestField> get() = fieldsList("${path}/dimension")
	val fillLength: FieldsList<AutoFillRequestField> get() = fieldsList("${path}/fillLength")
	val source by lazy { object : AutoFillRequestFieldGridRange("${path}/source") {} }
}

