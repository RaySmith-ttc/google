package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceField : Field

object DataSourceFields {
    val ALL: FieldsList<DataSourceField> = fieldsList("*")
	val calculatedColumns = object : DataSourceFieldDataSourceColumn("calculatedColumns") {}
	val dataSourceId: FieldsList<DataSourceField> get() = fieldsList("dataSourceId")
	val sheetId: FieldsList<DataSourceField> get() = fieldsList("sheetId")
	val spec = object : DataSourceFieldDataSourceSpec("spec") {}
}

abstract class DataSourceFieldDataSourceColumn(private val path: String) : FieldsList<DataSourceField>(path) {
	val formula: FieldsList<DataSourceField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : DataSourceFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class DataSourceFieldDataSourceSpec(private val path: String) : FieldsList<DataSourceField>(path) {
	val bigQuery by lazy { object : DataSourceFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : DataSourceFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : DataSourceFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class DataSourceFieldDataSourceColumnReference(private val path: String) : FieldsList<DataSourceField>(path) {
	val name: FieldsList<DataSourceField> get() = fieldsList("${path}/name")
}

abstract class DataSourceFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<DataSourceField>(path) {
	val projectId: FieldsList<DataSourceField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : DataSourceFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : DataSourceFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class DataSourceFieldLookerDataSourceSpec(private val path: String) : FieldsList<DataSourceField>(path) {
	val explore: FieldsList<DataSourceField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<DataSourceField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<DataSourceField> get() = fieldsList("${path}/model")
}

abstract class DataSourceFieldDataSourceParameter(private val path: String) : FieldsList<DataSourceField>(path) {
	val name: FieldsList<DataSourceField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<DataSourceField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : DataSourceFieldGridRange("${path}/range") {} }
}

abstract class DataSourceFieldBigQueryQuerySpec(private val path: String) : FieldsList<DataSourceField>(path) {
	val rawQuery: FieldsList<DataSourceField> get() = fieldsList("${path}/rawQuery")
}

abstract class DataSourceFieldBigQueryTableSpec(private val path: String) : FieldsList<DataSourceField>(path) {
	val datasetId: FieldsList<DataSourceField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<DataSourceField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<DataSourceField> get() = fieldsList("${path}/tableProjectId")
}

abstract class DataSourceFieldGridRange(private val path: String) : FieldsList<DataSourceField>(path) {
	val endColumnIndex: FieldsList<DataSourceField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DataSourceField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DataSourceField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DataSourceField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DataSourceField> get() = fieldsList("${path}/startRowIndex")
}

