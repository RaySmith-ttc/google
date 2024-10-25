package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SetDataValidationRequestField : Field

object SetDataValidationRequestFields {
    val ALL: FieldsList<SetDataValidationRequestField> = fieldsList("*")
	val range = object : SetDataValidationRequestFieldGridRange("range") {}
	val rule = object : SetDataValidationRequestFieldDataValidationRule("rule") {}
}

abstract class SetDataValidationRequestFieldGridRange(private val path: String) : FieldsList<SetDataValidationRequestField>(path) {
	val endColumnIndex: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SetDataValidationRequestFieldDataValidationRule(private val path: String) : FieldsList<SetDataValidationRequestField>(path) {
	val condition by lazy { object : SetDataValidationRequestFieldBooleanCondition("${path}/condition") {} }
	val inputMessage: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/inputMessage")
	val showCustomUi: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/showCustomUi")
	val strict: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/strict")
}

abstract class SetDataValidationRequestFieldBooleanCondition(private val path: String) : FieldsList<SetDataValidationRequestField>(path) {
	val type: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : SetDataValidationRequestFieldConditionValue("${path}/values") {} }
}

abstract class SetDataValidationRequestFieldConditionValue(private val path: String) : FieldsList<SetDataValidationRequestField>(path) {
	val relativeDate: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<SetDataValidationRequestField> get() = fieldsList("${path}/userEnteredValue")
}

