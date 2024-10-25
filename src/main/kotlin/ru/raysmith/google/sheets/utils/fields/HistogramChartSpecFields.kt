package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistogramChartSpecField : Field

object HistogramChartSpecFields {
    val ALL: FieldsList<HistogramChartSpecField> = fieldsList("*")
	val bucketSize: FieldsList<HistogramChartSpecField> get() = fieldsList("bucketSize")
	val legendPosition: FieldsList<HistogramChartSpecField> get() = fieldsList("legendPosition")
	val outlierPercentile: FieldsList<HistogramChartSpecField> get() = fieldsList("outlierPercentile")
	val series = object : HistogramChartSpecFieldHistogramSeries("series") {}
	val showItemDividers: FieldsList<HistogramChartSpecField> get() = fieldsList("showItemDividers")
}

abstract class HistogramChartSpecFieldHistogramSeries(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val barColor by lazy { object : HistogramChartSpecFieldColor("${path}/barColor") {} }
	val barColorStyle by lazy { object : HistogramChartSpecFieldColorStyle("${path}/barColorStyle") {} }
	val data by lazy { object : HistogramChartSpecFieldChartData("${path}/data") {} }
}

abstract class HistogramChartSpecFieldColor(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val alpha: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/red")
}

abstract class HistogramChartSpecFieldColorStyle(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val rgbColor by lazy { object : HistogramChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class HistogramChartSpecFieldChartData(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val aggregateType: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : HistogramChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : HistogramChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : HistogramChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class HistogramChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val name: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/name")
}

abstract class HistogramChartSpecFieldChartGroupRule(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val dateTimeRule by lazy { object : HistogramChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : HistogramChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class HistogramChartSpecFieldChartSourceRange(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val sources by lazy { object : HistogramChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class HistogramChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val type: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/type")
}

abstract class HistogramChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val intervalSize: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class HistogramChartSpecFieldGridRange(private val path: String) : FieldsList<HistogramChartSpecField>(path) {
	val endColumnIndex: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<HistogramChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

