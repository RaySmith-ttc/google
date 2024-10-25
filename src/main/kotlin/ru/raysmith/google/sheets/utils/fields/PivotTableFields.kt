package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotTableField : Field

object PivotTableFields {
    val ALL: FieldsList<PivotTableField> = fieldsList("*")
	val columns = object : PivotTableFieldPivotGroup("columns") {}
	val criteria = object : PivotTableFieldPivotFilterCriteria("criteria") {}
	val dataExecutionStatus = object : PivotTableFieldDataExecutionStatus("dataExecutionStatus") {}
	val dataSourceId: FieldsList<PivotTableField> get() = fieldsList("dataSourceId")
	val filterSpecs = object : PivotTableFieldPivotFilterSpec("filterSpecs") {}
	val rows = object : PivotTableFieldPivotGroup("rows") {}
	val source = object : PivotTableFieldGridRange("source") {}
	val valueLayout: FieldsList<PivotTableField> get() = fieldsList("valueLayout")
	val values = object : PivotTableFieldPivotValue("values") {}
}

abstract class PivotTableFieldPivotGroup(private val path: String) : FieldsList<PivotTableField>(path) {
	val dataSourceColumnReference by lazy { object : PivotTableFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val groupLimit by lazy { object : PivotTableFieldPivotGroupLimit("${path}/groupLimit") {} }
	val groupRule by lazy { object : PivotTableFieldPivotGroupRule("${path}/groupRule") {} }
	val label: FieldsList<PivotTableField> get() = fieldsList("${path}/label")
	val repeatHeadings: FieldsList<PivotTableField> get() = fieldsList("${path}/repeatHeadings")
	val showTotals: FieldsList<PivotTableField> get() = fieldsList("${path}/showTotals")
	val sortOrder: FieldsList<PivotTableField> get() = fieldsList("${path}/sortOrder")
	val sourceColumnOffset: FieldsList<PivotTableField> get() = fieldsList("${path}/sourceColumnOffset")
	val valueBucket by lazy { object : PivotTableFieldPivotGroupSortValueBucket("${path}/valueBucket") {} }
	val valueMetadata by lazy { object : PivotTableFieldPivotGroupValueMetadata("${path}/valueMetadata") {} }
}

abstract class PivotTableFieldPivotFilterCriteria(private val path: String) : FieldsList<PivotTableField>(path) {
	val condition by lazy { object : PivotTableFieldBooleanCondition("${path}/condition") {} }
	val visibleByDefault: FieldsList<PivotTableField> get() = fieldsList("${path}/visibleByDefault")
	val visibleValues: FieldsList<PivotTableField> get() = fieldsList("${path}/visibleValues")
}

abstract class PivotTableFieldDataExecutionStatus(private val path: String) : FieldsList<PivotTableField>(path) {
	val errorCode: FieldsList<PivotTableField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<PivotTableField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<PivotTableField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<PivotTableField> get() = fieldsList("${path}/state")
}

abstract class PivotTableFieldPivotFilterSpec(private val path: String) : FieldsList<PivotTableField>(path) {
	val columnOffsetIndex: FieldsList<PivotTableField> get() = fieldsList("${path}/columnOffsetIndex")
	val dataSourceColumnReference by lazy { object : PivotTableFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : PivotTableFieldPivotFilterCriteria("${path}/filterCriteria") {} }
}

abstract class PivotTableFieldGridRange(private val path: String) : FieldsList<PivotTableField>(path) {
	val endColumnIndex: FieldsList<PivotTableField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<PivotTableField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<PivotTableField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<PivotTableField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<PivotTableField> get() = fieldsList("${path}/startRowIndex")
}

abstract class PivotTableFieldPivotValue(private val path: String) : FieldsList<PivotTableField>(path) {
	val calculatedDisplayType: FieldsList<PivotTableField> get() = fieldsList("${path}/calculatedDisplayType")
	val dataSourceColumnReference by lazy { object : PivotTableFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val formula: FieldsList<PivotTableField> get() = fieldsList("${path}/formula")
	val name: FieldsList<PivotTableField> get() = fieldsList("${path}/name")
	val sourceColumnOffset: FieldsList<PivotTableField> get() = fieldsList("${path}/sourceColumnOffset")
	val summarizeFunction: FieldsList<PivotTableField> get() = fieldsList("${path}/summarizeFunction")
}

abstract class PivotTableFieldDataSourceColumnReference(private val path: String) : FieldsList<PivotTableField>(path) {
	val name: FieldsList<PivotTableField> get() = fieldsList("${path}/name")
}

abstract class PivotTableFieldPivotGroupLimit(private val path: String) : FieldsList<PivotTableField>(path) {
	val applyOrder: FieldsList<PivotTableField> get() = fieldsList("${path}/applyOrder")
	val countLimit: FieldsList<PivotTableField> get() = fieldsList("${path}/countLimit")
}

abstract class PivotTableFieldPivotGroupRule(private val path: String) : FieldsList<PivotTableField>(path) {
	val dateTimeRule by lazy { object : PivotTableFieldDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : PivotTableFieldHistogramRule("${path}/histogramRule") {} }
	val manualRule by lazy { object : PivotTableFieldManualRule("${path}/manualRule") {} }
}

abstract class PivotTableFieldPivotGroupSortValueBucket(private val path: String) : FieldsList<PivotTableField>(path) {
	val buckets by lazy { object : PivotTableFieldExtendedValue("${path}/buckets") {} }
	val valuesIndex: FieldsList<PivotTableField> get() = fieldsList("${path}/valuesIndex")
}

abstract class PivotTableFieldPivotGroupValueMetadata(private val path: String) : FieldsList<PivotTableField>(path) {
	val collapsed: FieldsList<PivotTableField> get() = fieldsList("${path}/collapsed")
	val value by lazy { object : PivotTableFieldExtendedValue("${path}/value") {} }
}

abstract class PivotTableFieldBooleanCondition(private val path: String) : FieldsList<PivotTableField>(path) {
	val type: FieldsList<PivotTableField> get() = fieldsList("${path}/type")
	val values by lazy { object : PivotTableFieldConditionValue("${path}/values") {} }
}

abstract class PivotTableFieldDateTimeRule(private val path: String) : FieldsList<PivotTableField>(path) {
	val type: FieldsList<PivotTableField> get() = fieldsList("${path}/type")
}

abstract class PivotTableFieldHistogramRule(private val path: String) : FieldsList<PivotTableField>(path) {
	val end: FieldsList<PivotTableField> get() = fieldsList("${path}/end")
	val interval: FieldsList<PivotTableField> get() = fieldsList("${path}/interval")
	val start: FieldsList<PivotTableField> get() = fieldsList("${path}/start")
}

abstract class PivotTableFieldManualRule(private val path: String) : FieldsList<PivotTableField>(path) {
	val groups by lazy { object : PivotTableFieldManualRuleGroup("${path}/groups") {} }
}

abstract class PivotTableFieldExtendedValue(private val path: String) : FieldsList<PivotTableField>(path) {
	val boolValue: FieldsList<PivotTableField> get() = fieldsList("${path}/boolValue")
	val errorValue by lazy { object : PivotTableFieldErrorValue("${path}/errorValue") {} }
	val formulaValue: FieldsList<PivotTableField> get() = fieldsList("${path}/formulaValue")
	val numberValue: FieldsList<PivotTableField> get() = fieldsList("${path}/numberValue")
	val stringValue: FieldsList<PivotTableField> get() = fieldsList("${path}/stringValue")
}

abstract class PivotTableFieldConditionValue(private val path: String) : FieldsList<PivotTableField>(path) {
	val relativeDate: FieldsList<PivotTableField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<PivotTableField> get() = fieldsList("${path}/userEnteredValue")
}

abstract class PivotTableFieldManualRuleGroup(private val path: String) : FieldsList<PivotTableField>(path) {
	val groupName by lazy { object : PivotTableFieldExtendedValue("${path}/groupName") {} }
	val items by lazy { object : PivotTableFieldExtendedValue("${path}/items") {} }
}

abstract class PivotTableFieldErrorValue(private val path: String) : FieldsList<PivotTableField>(path) {
	val message: FieldsList<PivotTableField> get() = fieldsList("${path}/message")
	val type: FieldsList<PivotTableField> get() = fieldsList("${path}/type")
}

