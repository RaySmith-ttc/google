package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataValidationRuleField : Field

object DataValidationRuleFields {
    val ALL: FieldsList<DataValidationRuleField> = fieldsList("*")
	val condition = object : DataValidationRuleFieldBooleanCondition("condition") {}
	val inputMessage: FieldsList<DataValidationRuleField> get() = fieldsList("inputMessage")
	val showCustomUi: FieldsList<DataValidationRuleField> get() = fieldsList("showCustomUi")
	val strict: FieldsList<DataValidationRuleField> get() = fieldsList("strict")
}

abstract class DataValidationRuleFieldBooleanCondition(private val path: String) : FieldsList<DataValidationRuleField>(path) {
	val type: FieldsList<DataValidationRuleField> get() = fieldsList("${path}/type")
	val values by lazy { object : DataValidationRuleFieldConditionValue("${path}/values") {} }
}

abstract class DataValidationRuleFieldConditionValue(private val path: String) : FieldsList<DataValidationRuleField>(path) {
	val relativeDate: FieldsList<DataValidationRuleField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<DataValidationRuleField> get() = fieldsList("${path}/userEnteredValue")
}

