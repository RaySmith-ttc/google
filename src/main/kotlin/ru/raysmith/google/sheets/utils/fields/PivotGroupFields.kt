package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotGroupField : Field

object PivotGroupFields {
    val ALL: FieldsList<PivotGroupField> = fieldsList("*")
	val dataSourceColumnReference = object : PivotGroupFieldDataSourceColumnReference("dataSourceColumnReference") {}
	val groupLimit = object : PivotGroupFieldPivotGroupLimit("groupLimit") {}
	val groupRule = object : PivotGroupFieldPivotGroupRule("groupRule") {}
	val label: FieldsList<PivotGroupField> get() = fieldsList("label")
	val repeatHeadings: FieldsList<PivotGroupField> get() = fieldsList("repeatHeadings")
	val showTotals: FieldsList<PivotGroupField> get() = fieldsList("showTotals")
	val sortOrder: FieldsList<PivotGroupField> get() = fieldsList("sortOrder")
	val sourceColumnOffset: FieldsList<PivotGroupField> get() = fieldsList("sourceColumnOffset")
	val valueBucket = object : PivotGroupFieldPivotGroupSortValueBucket("valueBucket") {}
	val valueMetadata = object : PivotGroupFieldPivotGroupValueMetadata("valueMetadata") {}
}

abstract class PivotGroupFieldDataSourceColumnReference(private val path: String) : FieldsList<PivotGroupField>(path) {
	val name: FieldsList<PivotGroupField> get() = fieldsList("${path}/name")
}

abstract class PivotGroupFieldPivotGroupLimit(private val path: String) : FieldsList<PivotGroupField>(path) {
	val applyOrder: FieldsList<PivotGroupField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<PivotGroupField> get() = fieldsList("${path}/countLimit")
}

abstract class PivotGroupFieldPivotGroupRule(private val path: String) : FieldsList<PivotGroupField>(path) {
	val dateTimeRule by lazy { object : PivotGroupFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : PivotGroupFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : PivotGroupFieldManualRule("${path}/manualRule") {} }
}

abstract class PivotGroupFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<PivotGroupField>(path) {
	val buckets by lazy { object : PivotGroupFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<PivotGroupField> get() = fieldsList("${path}/valuesIndex")
}

abstract class PivotGroupFieldPivotGroupValueMetadata(private val path: String) : FieldsList<PivotGroupField>(path) {
	val collapsed: FieldsList<PivotGroupField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : PivotGroupFieldExtendedValue("${path}/value") {} }
}

abstract class PivotGroupFieldDateTimeRule(private val path: String) : FieldsList<PivotGroupField>(path) {
	val type: FieldsList<PivotGroupField> get() = fieldsList("${path}/type")
}

abstract class PivotGroupFieldHistogramRule(private val path: String) : FieldsList<PivotGroupField>(path) {
	val end: FieldsList<PivotGroupField> get() = fieldsList("${path}/end")
	val interval: FieldsList<PivotGroupField> get() = fieldsList("${path}/interval")
	val start: FieldsList<PivotGroupField> get() = fieldsList("${path}/start")
}

abstract class PivotGroupFieldManualRule(private val path: String) : FieldsList<PivotGroupField>(path) {
	val groups by lazy { object : PivotGroupFieldManualRuleGroup("${path}/groups") {} }
}

abstract class PivotGroupFieldExtendedValue(private val path: String) : FieldsList<PivotGroupField>(path) {
	val boolValue: FieldsList<PivotGroupField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : PivotGroupFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<PivotGroupField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<PivotGroupField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<PivotGroupField> get() = fieldsList("${path}/stringValue")
}

abstract class PivotGroupFieldManualRuleGroup(private val path: String) : FieldsList<PivotGroupField>(path) {
	val groupName by lazy { object : PivotGroupFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : PivotGroupFieldExtendedValue("${path}/items") {} }
}

abstract class PivotGroupFieldErrorValue(private val path: String) : FieldsList<PivotGroupField>(path) {
	val message: FieldsList<PivotGroupField> get() = fieldsList("${path}/message")
	val type: FieldsList<PivotGroupField> get() = fieldsList("${path}/type")
}

