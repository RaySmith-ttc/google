package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CandlestickDataField : Field

object CandlestickDataFields {
    val ALL: FieldsList<CandlestickDataField> = fieldsList("*")
	val closeSeries = object : CandlestickDataFieldCandlestickSeries("closeSeries") {}
	val highSeries = object : CandlestickDataFieldCandlestickSeries("highSeries") {}
	val lowSeries = object : CandlestickDataFieldCandlestickSeries("lowSeries") {}
	val openSeries = object : CandlestickDataFieldCandlestickSeries("openSeries") {}
}

abstract class CandlestickDataFieldCandlestickSeries(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val data by lazy { object : CandlestickDataFieldChartData("${path}/data") {} }
}

abstract class CandlestickDataFieldChartData(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val aggregateType: FieldsList<CandlestickDataField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : CandlestickDataFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : CandlestickDataFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : CandlestickDataFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class CandlestickDataFieldDataSourceColumnReference(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val name: FieldsList<CandlestickDataField> get() = fieldsList("${path}/name")
}

abstract class CandlestickDataFieldChartGroupRule(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val dateTimeRule by lazy { object : CandlestickDataFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : CandlestickDataFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class CandlestickDataFieldChartSourceRange(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val sources by lazy { object : CandlestickDataFieldGridRange("${path}/sources") {} }
}

abstract class CandlestickDataFieldChartDateTimeRule(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val type: FieldsList<CandlestickDataField> get() = fieldsList("${path}/type")
}

abstract class CandlestickDataFieldChartHistogramRule(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val intervalSize: FieldsList<CandlestickDataField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<CandlestickDataField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<CandlestickDataField> get() = fieldsList("${path}/minValue")
}

abstract class CandlestickDataFieldGridRange(private val path: String) : FieldsList<CandlestickDataField>(path) {
	val endColumnIndex: FieldsList<CandlestickDataField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<CandlestickDataField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<CandlestickDataField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<CandlestickDataField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<CandlestickDataField> get() = fieldsList("${path}/startRowIndex")
}

