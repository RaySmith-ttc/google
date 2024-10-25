package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ConditionValueField : Field

object ConditionValueFields {
    val ALL: FieldsList<ConditionValueField> = fieldsList("*")
	val relativeDate: FieldsList<ConditionValueField> get() = fieldsList("relativeDate")
	val userEnteredValue: FieldsList<ConditionValueField> get() = fieldsList("userEnteredValue")
}

