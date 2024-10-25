package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CandlestickChartSpecField : Field

object CandlestickChartSpecFields {
    val ALL: FieldsList<CandlestickChartSpecField> = fieldsList("*")
	val data = object : CandlestickChartSpecFieldCandlestickData("data") {}
	val domain = object : CandlestickChartSpecFieldCandlestickDomain("domain") {}
}

abstract class CandlestickChartSpecFieldCandlestickData(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val closeSeries by lazy { object : CandlestickChartSpecFieldCandlestickSeries("${path}/closeSeries") {} }
	val highSeries by lazy { object : CandlestickChartSpecFieldCandlestickSeries("${path}/highSeries") {} }
	val lowSeries by lazy { object : CandlestickChartSpecFieldCandlestickSeries("${path}/lowSeries") {} }
	val openSeries by lazy { object : CandlestickChartSpecFieldCandlestickSeries("${path}/openSeries") {} }
}

abstract class CandlestickChartSpecFieldCandlestickDomain(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val data by lazy { object : CandlestickChartSpecFieldChartData("${path}/data") {} }
	val reversed: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/reversed")
}

abstract class CandlestickChartSpecFieldCandlestickSeries(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val data by lazy { object : CandlestickChartSpecFieldChartData("${path}/data") {} }
}

abstract class CandlestickChartSpecFieldChartData(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val aggregateType: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : CandlestickChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : CandlestickChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : CandlestickChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class CandlestickChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val name: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/name")
}

abstract class CandlestickChartSpecFieldChartGroupRule(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val dateTimeRule by lazy { object : CandlestickChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : CandlestickChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class CandlestickChartSpecFieldChartSourceRange(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val sources by lazy { object : CandlestickChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class CandlestickChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val type: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/type")
}

abstract class CandlestickChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val intervalSize: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class CandlestickChartSpecFieldGridRange(private val path: String) : FieldsList<CandlestickChartSpecField>(path) {
	val endColumnIndex: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<CandlestickChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

