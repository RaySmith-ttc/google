package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddDataSourceResponseField : Field

object AddDataSourceResponseFields {
    val ALL: FieldsList<AddDataSourceResponseField> = fieldsList("*")
	val dataExecutionStatus = object : AddDataSourceResponseFieldDataExecutionStatus("dataExecutionStatus") {}
	val dataSource = object : AddDataSourceResponseFieldDataSource("dataSource") {}
}

abstract class AddDataSourceResponseFieldDataExecutionStatus(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val errorCode: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/state")
}

abstract class AddDataSourceResponseFieldDataSource(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val calculatedColumns by lazy { object : AddDataSourceResponseFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : AddDataSourceResponseFieldDataSourceSpec("${path}/spec") {} }
}

abstract class AddDataSourceResponseFieldDataSourceColumn(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val formula: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : AddDataSourceResponseFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class AddDataSourceResponseFieldDataSourceSpec(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val bigQuery by lazy { object : AddDataSourceResponseFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : AddDataSourceResponseFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : AddDataSourceResponseFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class AddDataSourceResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val name: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/name")
}

abstract class AddDataSourceResponseFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val projectId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : AddDataSourceResponseFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : AddDataSourceResponseFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class AddDataSourceResponseFieldLookerDataSourceSpec(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val explore: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/model")
}

abstract class AddDataSourceResponseFieldDataSourceParameter(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val name: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : AddDataSourceResponseFieldGridRange("${path}/range") {} }
}

abstract class AddDataSourceResponseFieldBigQueryQuerySpec(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val rawQuery: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/rawQuery")
}

abstract class AddDataSourceResponseFieldBigQueryTableSpec(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val datasetId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/tableProjectId")
}

abstract class AddDataSourceResponseFieldGridRange(private val path: String) : FieldsList<AddDataSourceResponseField>(path) {
	val endColumnIndex: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddDataSourceResponseField> get() = fieldsList("${path}/startRowIndex")
}

