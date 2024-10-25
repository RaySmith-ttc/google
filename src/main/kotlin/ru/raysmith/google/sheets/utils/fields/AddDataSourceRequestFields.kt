package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddDataSourceRequestField : Field

object AddDataSourceRequestFields {
    val ALL: FieldsList<AddDataSourceRequestField> = fieldsList("*")
	val dataSource = object : AddDataSourceRequestFieldDataSource("dataSource") {}
}

abstract class AddDataSourceRequestFieldDataSource(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val calculatedColumns by lazy { object : AddDataSourceRequestFieldDataSourceColumn("${path}/calculatedColumns") {} }
	val dataSourceId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/dataSourceId")
	val sheetId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/sheetId")
	val spec by lazy { object : AddDataSourceRequestFieldDataSourceSpec("${path}/spec") {} }
}

abstract class AddDataSourceRequestFieldDataSourceColumn(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val formula: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : AddDataSourceRequestFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class AddDataSourceRequestFieldDataSourceSpec(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val bigQuery by lazy { object : AddDataSourceRequestFieldBigQueryDataSourceSpec("${path}/bigQuery") {} }
	val looker by lazy { object : AddDataSourceRequestFieldLookerDataSourceSpec("${path}/looker") {} }
	val parameters by lazy { object : AddDataSourceRequestFieldDataSourceParameter("${path}/parameters") {} }
}

abstract class AddDataSourceRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val name: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/name")
}

abstract class AddDataSourceRequestFieldBigQueryDataSourceSpec(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val projectId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/projectId")
	val querySpec by lazy { object : AddDataSourceRequestFieldBigQueryQuerySpec("${path}/querySpec") {} }
	val tableSpec by lazy { object : AddDataSourceRequestFieldBigQueryTableSpec("${path}/tableSpec") {} }
}

abstract class AddDataSourceRequestFieldLookerDataSourceSpec(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val explore: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/explore")
	val instanceUri: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/instanceUri")
	val model: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/model")
}

abstract class AddDataSourceRequestFieldDataSourceParameter(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val name: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/namedRangeId")
	val range by lazy { object : AddDataSourceRequestFieldGridRange("${path}/range") {} }
}

abstract class AddDataSourceRequestFieldBigQueryQuerySpec(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val rawQuery: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/rawQuery")
}

abstract class AddDataSourceRequestFieldBigQueryTableSpec(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val datasetId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/tableProjectId")
}

abstract class AddDataSourceRequestFieldGridRange(private val path: String) : FieldsList<AddDataSourceRequestField>(path) {
	val endColumnIndex: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddDataSourceRequestField> get() = fieldsList("${path}/startRowIndex")
}

