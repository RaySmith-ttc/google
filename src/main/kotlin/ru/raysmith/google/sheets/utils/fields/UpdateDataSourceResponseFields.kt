package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateDataSourceResponseField : Field

object UpdateDataSourceResponseFields {
    val ALL: FieldsList<UpdateDataSourceResponseField> = fieldsList("*")
	val dataExecutionStatus = object : UpdateDataSourceResponseFieldDataExecutionStatus("dataExecutionStatus") {}
	val dataSource = object : UpdateDataSourceResponseFieldDataSource("dataSource") {}
}

abstract class UpdateDataSourceResponseFieldDataExecutionStatus(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val errorCode: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/state")
}

abstract class UpdateDataSourceResponseFieldDataSource(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val calculatedColumns by lazy { object : UpdateDataSourceResponseFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : UpdateDataSourceResponseFieldDataSourceSpec("${path}/spec") {} }
}

abstract class UpdateDataSourceResponseFieldDataSourceColumn(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val formula: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : UpdateDataSourceResponseFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class UpdateDataSourceResponseFieldDataSourceSpec(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val bigQuery by lazy { object : UpdateDataSourceResponseFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : UpdateDataSourceResponseFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : UpdateDataSourceResponseFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class UpdateDataSourceResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val name: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/name")
}

abstract class UpdateDataSourceResponseFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val projectId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : UpdateDataSourceResponseFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : UpdateDataSourceResponseFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class UpdateDataSourceResponseFieldLookerDataSourceSpec(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val explore: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/model")
}

abstract class UpdateDataSourceResponseFieldDataSourceParameter(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val name: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : UpdateDataSourceResponseFieldGridRange("${path}/range") {} }
}

abstract class UpdateDataSourceResponseFieldBigQueryQuerySpec(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val rawQuery: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/rawQuery")
}

abstract class UpdateDataSourceResponseFieldBigQueryTableSpec(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val datasetId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/tableProjectId")
}

abstract class UpdateDataSourceResponseFieldGridRange(private val path: String) : FieldsList<UpdateDataSourceResponseField>(path) {
	val endColumnIndex: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateDataSourceResponseField> get() = fieldsList("${path}/startRowIndex")
}

