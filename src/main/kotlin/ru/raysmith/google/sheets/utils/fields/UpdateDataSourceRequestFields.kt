package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateDataSourceRequestField : Field

object UpdateDataSourceRequestFields {
    val ALL: FieldsList<UpdateDataSourceRequestField> = fieldsList("*")
	val dataSource = object : UpdateDataSourceRequestFieldDataSource("dataSource") {}
	val fields: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("fields")
}

abstract class UpdateDataSourceRequestFieldDataSource(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val calculatedColumns by lazy { object : UpdateDataSourceRequestFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : UpdateDataSourceRequestFieldDataSourceSpec("${path}/spec") {} }
}

abstract class UpdateDataSourceRequestFieldDataSourceColumn(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val formula: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : UpdateDataSourceRequestFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class UpdateDataSourceRequestFieldDataSourceSpec(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val bigQuery by lazy { object : UpdateDataSourceRequestFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : UpdateDataSourceRequestFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : UpdateDataSourceRequestFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class UpdateDataSourceRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val name: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/name")
}

abstract class UpdateDataSourceRequestFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val projectId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : UpdateDataSourceRequestFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : UpdateDataSourceRequestFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class UpdateDataSourceRequestFieldLookerDataSourceSpec(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val explore: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/model")
}

abstract class UpdateDataSourceRequestFieldDataSourceParameter(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val name: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : UpdateDataSourceRequestFieldGridRange("${path}/range") {} }
}

abstract class UpdateDataSourceRequestFieldBigQueryQuerySpec(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val rawQuery: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/rawQuery")
}

abstract class UpdateDataSourceRequestFieldBigQueryTableSpec(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val datasetId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/tableProjectId")
}

abstract class UpdateDataSourceRequestFieldGridRange(private val path: String) : FieldsList<UpdateDataSourceRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateDataSourceRequestField> get() = fieldsList("${path}/startRowIndex")
}

