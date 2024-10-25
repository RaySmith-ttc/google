package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ManualRuleField : Field

object ManualRuleFields {
    val ALL: FieldsList<ManualRuleField> = fieldsList("*")
	val groups = object : ManualRuleFieldManualRuleGroup("groups") {}
}

abstract class ManualRuleFieldManualRuleGroup(private val path: String) : FieldsList<ManualRuleField>(path) {
	val groupName by lazy { object : ManualRuleFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : ManualRuleFieldExtendedValue("${path}/items") {} }
}

abstract class ManualRuleFieldExtendedValue(private val path: String) : FieldsList<ManualRuleField>(path) {
	val boolValue: FieldsList<ManualRuleField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : ManualRuleFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<ManualRuleField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<ManualRuleField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<ManualRuleField> get() = fieldsList("${path}/stringValue")
}

abstract class ManualRuleFieldErrorValue(private val path: String) : FieldsList<ManualRuleField>(path) {
	val message: FieldsList<ManualRuleField> get() = fieldsList("${path}/message")
	val type: FieldsList<ManualRuleField> get() = fieldsList("${path}/type")
}

