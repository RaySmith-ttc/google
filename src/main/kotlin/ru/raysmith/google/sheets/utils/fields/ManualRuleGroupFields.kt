package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ManualRuleGroupField : Field

object ManualRuleGroupFields {
    val ALL: FieldsList<ManualRuleGroupField> = fieldsList("*")
	val groupName = object : ManualRuleGroupFieldExtendedValue("groupName") {}
	val items = object : ManualRuleGroupFieldExtendedValue("items") {}
}

abstract class ManualRuleGroupFieldExtendedValue(private val path: String) : FieldsList<ManualRuleGroupField>(path) {
	val boolValue: FieldsList<ManualRuleGroupField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : ManualRuleGroupFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<ManualRuleGroupField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<ManualRuleGroupField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<ManualRuleGroupField> get() = fieldsList("${path}/stringValue")
}

abstract class ManualRuleGroupFieldErrorValue(private val path: String) : FieldsList<ManualRuleGroupField>(path) {
	val message: FieldsList<ManualRuleGroupField> get() = fieldsList("${path}/message")
	val type: FieldsList<ManualRuleGroupField> get() = fieldsList("${path}/type")
}

