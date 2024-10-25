package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CandlestickSeriesField : Field

object CandlestickSeriesFields {
    val ALL: FieldsList<CandlestickSeriesField> = fieldsList("*")
	val data = object : CandlestickSeriesFieldChartData("data") {}
}

abstract class CandlestickSeriesFieldChartData(private val path: String) : FieldsList<CandlestickSeriesField>(path) {
	val aggregateType: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : CandlestickSeriesFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : CandlestickSeriesFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : CandlestickSeriesFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class CandlestickSeriesFieldDataSourceColumnReference(private val path: String) : FieldsList<CandlestickSeriesField>(path) {
	val name: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/name")
}

abstract class CandlestickSeriesFieldChartGroupRule(private val path: String) : FieldsList<CandlestickSeriesField>(path) {
	val dateTimeRule by lazy { object : CandlestickSeriesFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : CandlestickSeriesFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class CandlestickSeriesFieldChartSourceRange(private val path: String) : FieldsList<CandlestickSeriesField>(path) {
	val sources by lazy { object : CandlestickSeriesFieldGridRange("${path}/sources") {} }
}

abstract class CandlestickSeriesFieldChartDateTimeRule(private val path: String) : FieldsList<CandlestickSeriesField>(path) {
	val type: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/type")
}

abstract class CandlestickSeriesFieldChartHistogramRule(private val path: String) : FieldsList<CandlestickSeriesField>(path) {
	val intervalSize: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/minValue")
}

abstract class CandlestickSeriesFieldGridRange(private val path: String) : FieldsList<CandlestickSeriesField>(path) {
	val endColumnIndex: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<CandlestickSeriesField> get() = fieldsList("${path}/startRowIndex")
}

