package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistogramSeriesField : Field

object HistogramSeriesFields {
    val ALL: FieldsList<HistogramSeriesField> = fieldsList("*")
	val barColor = object : HistogramSeriesFieldColor("barColor") {}
	val barColorStyle = object : HistogramSeriesFieldColorStyle("barColorStyle") {}
	val data = object : HistogramSeriesFieldChartData("data") {}
}

abstract class HistogramSeriesFieldColor(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val alpha: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/green")
	val red: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/red")
}

abstract class HistogramSeriesFieldColorStyle(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val rgbColor by lazy { object : HistogramSeriesFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/themeColor")
}

abstract class HistogramSeriesFieldChartData(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val aggregateType: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : HistogramSeriesFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : HistogramSeriesFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : HistogramSeriesFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class HistogramSeriesFieldDataSourceColumnReference(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val name: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/name")
}

abstract class HistogramSeriesFieldChartGroupRule(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val dateTimeRule by lazy { object : HistogramSeriesFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : HistogramSeriesFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class HistogramSeriesFieldChartSourceRange(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val sources by lazy { object : HistogramSeriesFieldGridRange("${path}/sources") {} }
}

abstract class HistogramSeriesFieldChartDateTimeRule(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val type: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/type")
}

abstract class HistogramSeriesFieldChartHistogramRule(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val intervalSize: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/minValue")
}

abstract class HistogramSeriesFieldGridRange(private val path: String) : FieldsList<HistogramSeriesField>(path) {
	val endColumnIndex: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<HistogramSeriesField> get() = fieldsList("${path}/startRowIndex")
}

