package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BigQueryDataSourceSpecField : Field

object BigQueryDataSourceSpecFields {
    val ALL: FieldsList<BigQueryDataSourceSpecField> = fieldsList("*")
	val projectId: FieldsList<BigQueryDataSourceSpecField> get() = fieldsList("projectId")
	val querySpec = object : BigQueryDataSourceSpecFieldBigQueryQuerySpec("querySpec") {}
	val tableSpec = object : BigQueryDataSourceSpecFieldBigQueryTableSpec("tableSpec") {}
}

abstract class BigQueryDataSourceSpecFieldBigQueryQuerySpec(private val path: String) : FieldsList<BigQueryDataSourceSpecField>(path) {
	val rawQuery: FieldsList<BigQueryDataSourceSpecField> get() = fieldsList("${path}/rawQuery")
}

abstract class BigQueryDataSourceSpecFieldBigQueryTableSpec(private val path: String) : FieldsList<BigQueryDataSourceSpecField>(path) {
	val datasetId: FieldsList<BigQueryDataSourceSpecField> get() = fieldsList("${path}/datasetId")
	val tableId: FieldsList<BigQueryDataSourceSpecField> get() = fieldsList("${path}/tableId")
	val tableProjectId: FieldsList<BigQueryDataSourceSpecField> get() = fieldsList("${path}/tableProjectId")
}

