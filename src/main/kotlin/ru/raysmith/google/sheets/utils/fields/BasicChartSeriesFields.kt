package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BasicChartSeriesField : Field

object BasicChartSeriesFields {
    val ALL: FieldsList<BasicChartSeriesField> = fieldsList("*")
	val color = object : BasicChartSeriesFieldColor("color") {}
	val colorStyle = object : BasicChartSeriesFieldColorStyle("colorStyle") {}
	val dataLabel = object : BasicChartSeriesFieldDataLabel("dataLabel") {}
	val lineStyle = object : BasicChartSeriesFieldLineStyle("lineStyle") {}
	val pointStyle = object : BasicChartSeriesFieldPointStyle("pointStyle") {}
	val series = object : BasicChartSeriesFieldChartData("series") {}
	val styleOverrides = object : BasicChartSeriesFieldBasicSeriesDataPointStyleOverride("styleOverrides") {}
	val targetAxis: FieldsList<BasicChartSeriesField> get() = fieldsList("targetAxis")
	val type: FieldsList<BasicChartSeriesField> get() = fieldsList("type")
}

abstract class BasicChartSeriesFieldColor(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val alpha: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/green")
	val red: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/red")
}

abstract class BasicChartSeriesFieldColorStyle(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val rgbColor by lazy { object : BasicChartSeriesFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/themeColor")
}

abstract class BasicChartSeriesFieldDataLabel(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val customLabelData by lazy { object : BasicChartSeriesFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : BasicChartSeriesFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/type")
}

abstract class BasicChartSeriesFieldLineStyle(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val type: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/type")
	val width: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/width")
}

abstract class BasicChartSeriesFieldPointStyle(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val shape: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/shape")
	val size: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/size")
}

abstract class BasicChartSeriesFieldChartData(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val aggregateType: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : BasicChartSeriesFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : BasicChartSeriesFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : BasicChartSeriesFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class BasicChartSeriesFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val color by lazy { object : BasicChartSeriesFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BasicChartSeriesFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : BasicChartSeriesFieldPointStyle("${path}/pointStyle") {} }
}

abstract class BasicChartSeriesFieldTextFormat(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val bold: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BasicChartSeriesFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BasicChartSeriesFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BasicChartSeriesFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/underline")
}

abstract class BasicChartSeriesFieldDataSourceColumnReference(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val name: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/name")
}

abstract class BasicChartSeriesFieldChartGroupRule(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val dateTimeRule by lazy { object : BasicChartSeriesFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BasicChartSeriesFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class BasicChartSeriesFieldChartSourceRange(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val sources by lazy { object : BasicChartSeriesFieldGridRange("${path}/sources") {} }
}

abstract class BasicChartSeriesFieldLink(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val uri: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/uri")
}

abstract class BasicChartSeriesFieldChartDateTimeRule(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val type: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/type")
}

abstract class BasicChartSeriesFieldChartHistogramRule(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val intervalSize: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/minValue")
}

abstract class BasicChartSeriesFieldGridRange(private val path: String) : FieldsList<BasicChartSeriesField>(path) {
	val endColumnIndex: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BasicChartSeriesField> get() = fieldsList("${path}/startRowIndex")
}

