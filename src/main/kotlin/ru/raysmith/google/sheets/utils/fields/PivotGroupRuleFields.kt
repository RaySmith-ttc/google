package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotGroupRuleField : Field

object PivotGroupRuleFields {
    val ALL: FieldsList<PivotGroupRuleField> = fieldsList("*")
	val dateTimeRule = object : PivotGroupRuleFieldDateTimeRule("dateTimeRule") {}
	val histogramRule = object : PivotGroupRuleFieldHistogramRule("histogramRule") {}
	val manualRule = object : PivotGroupRuleFieldManualRule("manualRule") {}
}

abstract class PivotGroupRuleFieldDateTimeRule(private val path: String) : FieldsList<PivotGroupRuleField>(path) {
	val type: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/type")
}

abstract class PivotGroupRuleFieldHistogramRule(private val path: String) : FieldsList<PivotGroupRuleField>(path) {
	val end: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/end")
	val interval: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/interval")
	val start: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/start")
}

abstract class PivotGroupRuleFieldManualRule(private val path: String) : FieldsList<PivotGroupRuleField>(path) {
	val groups by lazy { object : PivotGroupRuleFieldManualRuleGroup("${path}/groups") {} }
}

abstract class PivotGroupRuleFieldManualRuleGroup(private val path: String) : FieldsList<PivotGroupRuleField>(path) {
	val groupName by lazy { object : PivotGroupRuleFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : PivotGroupRuleFieldExtendedValue("${path}/items") {} }
}

abstract class PivotGroupRuleFieldExtendedValue(private val path: String) : FieldsList<PivotGroupRuleField>(path) {
	val boolValue: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : PivotGroupRuleFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/stringValue")
}

abstract class PivotGroupRuleFieldErrorValue(private val path: String) : FieldsList<PivotGroupRuleField>(path) {
	val message: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/message")
	val type: FieldsList<PivotGroupRuleField> get() = fieldsList("${path}/type")
}

