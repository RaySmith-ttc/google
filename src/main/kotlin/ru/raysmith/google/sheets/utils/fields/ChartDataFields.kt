package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartDataField : Field

object ChartDataFields {
    val ALL: FieldsList<ChartDataField> = fieldsList("*")
	val aggregateType: FieldsList<ChartDataField> get() = fieldsList("aggregateType")
	val columnReference = object : ChartDataFieldDataSourceColumnReference("columnReference") {}
	val groupRule = object : ChartDataFieldChartGroupRule("groupRule") {}
	val sourceRange = object : ChartDataFieldChartSourceRange("sourceRange") {}
}

abstract class ChartDataFieldDataSourceColumnReference(private val path: String) : FieldsList<ChartDataField>(path) {
	val name: FieldsList<ChartDataField> get() = fieldsList("${path}/name")
}

abstract class ChartDataFieldChartGroupRule(private val path: String) : FieldsList<ChartDataField>(path) {
	val dateTimeRule by lazy { object : ChartDataFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : ChartDataFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class ChartDataFieldChartSourceRange(private val path: String) : FieldsList<ChartDataField>(path) {
	val sources by lazy { object : ChartDataFieldGridRange("${path}/sources") {} }
}

abstract class ChartDataFieldChartDateTimeRule(private val path: String) : FieldsList<ChartDataField>(path) {
	val type: FieldsList<ChartDataField> get() = fieldsList("${path}/type")
}

abstract class ChartDataFieldChartHistogramRule(private val path: String) : FieldsList<ChartDataField>(path) {
	val intervalSize: FieldsList<ChartDataField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<ChartDataField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<ChartDataField> get() = fieldsList("${path}/minValue")
}

abstract class ChartDataFieldGridRange(private val path: String) : FieldsList<ChartDataField>(path) {
	val endColumnIndex: FieldsList<ChartDataField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<ChartDataField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<ChartDataField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<ChartDataField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<ChartDataField> get() = fieldsList("${path}/startRowIndex")
}

