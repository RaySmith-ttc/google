package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteConditionalFormatRuleRequestField : Field

object DeleteConditionalFormatRuleRequestFields {
    val ALL: FieldsList<DeleteConditionalFormatRuleRequestField> = fieldsList("*")
	val index: FieldsList<DeleteConditionalFormatRuleRequestField> get() = fieldsList("index")
	val sheetId: FieldsList<DeleteConditionalFormatRuleRequestField> get() = fieldsList("sheetId")
}

