package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataSourceColumnField : Field

object DataSourceColumnFields {
    val ALL: FieldsList<DataSourceColumnField> = fieldsList("*")
	val formula: FieldsList<DataSourceColumnField> get() = fieldsList("formula")
	val reference = object : DataSourceColumnFieldDataSourceColumnReference("reference") {}
}

abstract class DataSourceColumnFieldDataSourceColumnReference(private val path: String) : FieldsList<DataSourceColumnField>(path) {
	val name: FieldsList<DataSourceColumnField> get() = fieldsList("${path}/name")
}

