package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceSpecField : Field

object DataSourceSpecFields {
    val ALL: FieldsList<DataSourceSpecField> = fieldsList("*")
	val bigQuery = object : DataSourceSpecFieldBigQueryDataSourceSpec("bigQuery") {}
	val looker = object : DataSourceSpecFieldLookerDataSourceSpec("looker") {}
	val parameters = object : DataSourceSpecFieldDataSourceParameter("parameters") {}
}

abstract class DataSourceSpecFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<DataSourceSpecField>(path) {
	val projectId: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : DataSourceSpecFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : DataSourceSpecFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class DataSourceSpecFieldLookerDataSourceSpec(private val path: String) : FieldsList<DataSourceSpecField>(path) {
	val explore: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/model")
}

abstract class DataSourceSpecFieldDataSourceParameter(private val path: String) : FieldsList<DataSourceSpecField>(path) {
	val name: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : DataSourceSpecFieldGridRange("${path}/range") {} }
}

abstract class DataSourceSpecFieldBigQueryQuerySpec(private val path: String) : FieldsList<DataSourceSpecField>(path) {
	val rawQuery: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/rawQuery")
}

abstract class DataSourceSpecFieldBigQueryTableSpec(private val path: String) : FieldsList<DataSourceSpecField>(path) {
	val datasetId: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/tableProjectId")
}

abstract class DataSourceSpecFieldGridRange(private val path: String) : FieldsList<DataSourceSpecField>(path) {
	val endColumnIndex: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DataSourceSpecField> get() = fieldsList("${path}/startRowIndex")
}

