package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BasicChartSpecField : Field

object BasicChartSpecFields {
    val ALL: FieldsList<BasicChartSpecField> = fieldsList("*")
	val axis = object : BasicChartSpecFieldBasicChartAxis("axis") {}
	val chartType: FieldsList<BasicChartSpecField> get() = fieldsList("chartType")
	val compareMode: FieldsList<BasicChartSpecField> get() = fieldsList("compareMode")
	val domains = object : BasicChartSpecFieldBasicChartDomain("domains") {}
	val headerCount: FieldsList<BasicChartSpecField> get() = fieldsList("headerCount")
	val interpolateNulls: FieldsList<BasicChartSpecField> get() = fieldsList("interpolateNulls")
	val legendPosition: FieldsList<BasicChartSpecField> get() = fieldsList("legendPosition")
	val lineSmoothing: FieldsList<BasicChartSpecField> get() = fieldsList("lineSmoothing")
	val series = object : BasicChartSpecFieldBasicChartSeries("series") {}
	val stackedType: FieldsList<BasicChartSpecField> get() = fieldsList("stackedType")
	val threeDimensional: FieldsList<BasicChartSpecField> get() = fieldsList("threeDimensional")
	val totalDataLabel = object : BasicChartSpecFieldDataLabel("totalDataLabel") {}
}

abstract class BasicChartSpecFieldBasicChartAxis(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val format by lazy { object : BasicChartSpecFieldTextFormat("${path}/format") {} }
	val position: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/position")
	val title: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/title")
	val titleTextPosition by lazy { object : BasicChartSpecFieldTextPosition("${path}/titleTextPosition") {} }
	val viewWindowOptions by lazy { object : BasicChartSpecFieldChartAxisViewWindowOptions("${path}/viewWindowOptions") {} }
}

abstract class BasicChartSpecFieldBasicChartDomain(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val domain by lazy { object : BasicChartSpecFieldChartData("${path}/domain") {} }
	val reversed: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/reversed")
}

abstract class BasicChartSpecFieldBasicChartSeries(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val color by lazy { object : BasicChartSpecFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BasicChartSpecFieldColorStyle("${path}/colorStyle") {} }
	val dataLabel by lazy { object : BasicChartSpecFieldDataLabel("${path}/dataLabel") {} }
	val lineStyle by lazy { object : BasicChartSpecFieldLineStyle("${path}/lineStyle") {} }
	val pointStyle by lazy { object : BasicChartSpecFieldPointStyle("${path}/pointStyle") {} }
	val series by lazy { object : BasicChartSpecFieldChartData("${path}/series") {} }
	val styleOverrides by lazy { object : BasicChartSpecFieldBasicSeriesDataPointStyleOverride("${path}/styleOverrides") {} }
	val targetAxis: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/targetAxis")
	val type: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/type")
}

abstract class BasicChartSpecFieldDataLabel(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val customLabelData by lazy { object : BasicChartSpecFieldChartData("${path}/customLabelData") {} }
	val placement: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/placement")
	val textFormat by lazy { object : BasicChartSpecFieldTextFormat("${path}/textFormat") {} }
	val type: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/type")
}

abstract class BasicChartSpecFieldTextFormat(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val bold: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BasicChartSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BasicChartSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BasicChartSpecFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/underline")
}

abstract class BasicChartSpecFieldTextPosition(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val horizontalAlignment: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class BasicChartSpecFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val viewWindowMax: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class BasicChartSpecFieldChartData(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val aggregateType: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : BasicChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : BasicChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : BasicChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class BasicChartSpecFieldColor(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val alpha: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/red")
}

abstract class BasicChartSpecFieldColorStyle(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val rgbColor by lazy { object : BasicChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class BasicChartSpecFieldLineStyle(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val type: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/type")
	val width: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/width")
}

abstract class BasicChartSpecFieldPointStyle(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val shape: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/shape")
	val size: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/size")
}

abstract class BasicChartSpecFieldBasicSeriesDataPointStyleOverride(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val color by lazy { object : BasicChartSpecFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : BasicChartSpecFieldColorStyle("${path}/colorStyle") {} }
	val index: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/index")
	val pointStyle by lazy { object : BasicChartSpecFieldPointStyle("${path}/pointStyle") {} }
}

abstract class BasicChartSpecFieldLink(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val uri: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/uri")
}

abstract class BasicChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val name: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/name")
}

abstract class BasicChartSpecFieldChartGroupRule(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val dateTimeRule by lazy { object : BasicChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BasicChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class BasicChartSpecFieldChartSourceRange(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val sources by lazy { object : BasicChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class BasicChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val type: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/type")
}

abstract class BasicChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val intervalSize: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class BasicChartSpecFieldGridRange(private val path: String) : FieldsList<BasicChartSpecField>(path) {
	val endColumnIndex: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BasicChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

