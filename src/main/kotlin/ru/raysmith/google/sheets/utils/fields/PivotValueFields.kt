package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PivotValueField : Field

object PivotValueFields {
    val ALL: FieldsList<PivotValueField> = fieldsList("*")
	val calculatedDisplayType: FieldsList<PivotValueField> get() = fieldsList("calculatedDisplayType")
	val dataSourceColumnReference = object : PivotValueFieldDataSourceColumnReference("dataSourceColumnReference") {}
	val formula: FieldsList<PivotValueField> get() = fieldsList("formula")
	val name: FieldsList<PivotValueField> get() = fieldsList("name")
	val sourceColumnOffset: FieldsList<PivotValueField> get() = fieldsList("sourceColumnOffset")
	val summarizeFunction: FieldsList<PivotValueField> get() = fieldsList("summarizeFunction")
}

abstract class PivotValueFieldDataSourceColumnReference(private val path: String) : FieldsList<PivotValueField>(path) {
	val name: FieldsList<PivotValueField> get() = fieldsList("${path}/name")
}

