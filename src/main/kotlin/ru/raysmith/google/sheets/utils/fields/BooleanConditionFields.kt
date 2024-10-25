package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BooleanConditionField : Field

object BooleanConditionFields {
    val ALL: FieldsList<BooleanConditionField> = fieldsList("*")
	val type: FieldsList<BooleanConditionField> get() = fieldsList("type")
	val values = object : BooleanConditionFieldConditionValue("values") {}
}

abstract class BooleanConditionFieldConditionValue(private val path: String) : FieldsList<BooleanConditionField>(path) {
	val relativeDate: FieldsList<BooleanConditionField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<BooleanConditionField> get() = fieldsList("${path}/userEnteredValue")
}

