package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceTableField : Field

object DataSourceTableFields {
    val ALL: FieldsList<DataSourceTableField> = fieldsList("*")
	val columnSelectionType: FieldsList<DataSourceTableField> get() = fieldsList("columnSelectionType")
	val columns = object : DataSourceTableFieldDataSourceColumnReference("columns") {}
	val dataExecutionStatus = object : DataSourceTableFieldDataExecutionStatus("dataExecutionStatus") {}
	val dataSourceId: FieldsList<DataSourceTableField> get() = fieldsList("dataSourceId")
	val filterSpecs = object : DataSourceTableFieldFilterSpec("filterSpecs") {}
	val rowLimit: FieldsList<DataSourceTableField> get() = fieldsList("rowLimit")
	val sortSpecs = object : DataSourceTableFieldSortSpec("sortSpecs") {}
}

abstract class DataSourceTableFieldDataSourceColumnReference(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val name: FieldsList<DataSourceTableField> get() = fieldsList("${path}/name")
}

abstract class DataSourceTableFieldDataExecutionStatus(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val errorCode: FieldsList<DataSourceTableField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<DataSourceTableField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<DataSourceTableField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<DataSourceTableField> get() = fieldsList("${path}/state")
}

abstract class DataSourceTableFieldFilterSpec(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val columnIndex: FieldsList<DataSourceTableField> get() = fieldsList("${path}/columnIndex")
	val dataSourceColumnReference by lazy { object : DataSourceTableFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val filterCriteria by lazy { object : DataSourceTableFieldFilterCriteria("${path}/filterCriteria") {} }
}

abstract class DataSourceTableFieldSortSpec(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val backgroundColor by lazy { object : DataSourceTableFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : DataSourceTableFieldColorStyle("${path}/backgroundColorStyle") {} }
	val dataSourceColumnReference by lazy { object : DataSourceTableFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val dimensionIndex: FieldsList<DataSourceTableField> get() = fieldsList("${path}/dimensionIndex")
	val foregroundColor by lazy { object : DataSourceTableFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : DataSourceTableFieldColorStyle("${path}/foregroundColorStyle") {} }
	val sortOrder: FieldsList<DataSourceTableField> get() = fieldsList("${path}/sortOrder")
}

abstract class DataSourceTableFieldFilterCriteria(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val condition by lazy { object : DataSourceTableFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<DataSourceTableField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : DataSourceTableFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : DataSourceTableFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : DataSourceTableFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : DataSourceTableFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class DataSourceTableFieldColor(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val alpha: FieldsList<DataSourceTableField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<DataSourceTableField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DataSourceTableField> get() = fieldsList("${path}/green")
	val red: FieldsList<DataSourceTableField> get() = fieldsList("${path}/red")
}

abstract class DataSourceTableFieldColorStyle(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val rgbColor by lazy { object : DataSourceTableFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<DataSourceTableField> get() = fieldsList("${path}/themeColor")
}

abstract class DataSourceTableFieldBooleanCondition(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val type: FieldsList<DataSourceTableField> get() = fieldsList("${path}/type")
	val values by lazy { object : DataSourceTableFieldConditionValue("${path}/values") {} }
}

abstract class DataSourceTableFieldConditionValue(private val path: String) : FieldsList<DataSourceTableField>(path) {
	val relativeDate: FieldsList<DataSourceTableField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<DataSourceTableField> get() = fieldsList("${path}/userEnteredValue")
}

