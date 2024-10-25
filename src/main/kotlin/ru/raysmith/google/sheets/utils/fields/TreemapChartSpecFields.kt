package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TreemapChartSpecField : Field

object TreemapChartSpecFields {
    val ALL: FieldsList<TreemapChartSpecField> = fieldsList("*")
	val colorData = object : TreemapChartSpecFieldChartData("colorData") {}
	val colorScale = object : TreemapChartSpecFieldTreemapChartColorScale("colorScale") {}
	val headerColor = object : TreemapChartSpecFieldColor("headerColor") {}
	val headerColorStyle = object : TreemapChartSpecFieldColorStyle("headerColorStyle") {}
	val hideTooltips: FieldsList<TreemapChartSpecField> get() = fieldsList("hideTooltips")
	val hintedLevels: FieldsList<TreemapChartSpecField> get() = fieldsList("hintedLevels")
	val labels = object : TreemapChartSpecFieldChartData("labels") {}
	val levels: FieldsList<TreemapChartSpecField> get() = fieldsList("levels")
	val maxValue: FieldsList<TreemapChartSpecField> get() = fieldsList("maxValue")
	val minValue: FieldsList<TreemapChartSpecField> get() = fieldsList("minValue")
	val parentLabels = object : TreemapChartSpecFieldChartData("parentLabels") {}
	val sizeData = object : TreemapChartSpecFieldChartData("sizeData") {}
	val textFormat = object : TreemapChartSpecFieldTextFormat("textFormat") {}
}

abstract class TreemapChartSpecFieldChartData(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val aggregateType: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : TreemapChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : TreemapChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : TreemapChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class TreemapChartSpecFieldTreemapChartColorScale(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val maxValueColor by lazy { object : TreemapChartSpecFieldColor("${path}/maxValueColor") {} }
	val maxValueColorStyle by lazy { object : TreemapChartSpecFieldColorStyle("${path}/maxValueColorStyle") {} }
	val midValueColor by lazy { object : TreemapChartSpecFieldColor("${path}/midValueColor") {} }
	val midValueColorStyle by lazy { object : TreemapChartSpecFieldColorStyle("${path}/midValueColorStyle") {} }
	val minValueColor by lazy { object : TreemapChartSpecFieldColor("${path}/minValueColor") {} }
	val minValueColorStyle by lazy { object : TreemapChartSpecFieldColorStyle("${path}/minValueColorStyle") {} }
	val noDataColor by lazy { object : TreemapChartSpecFieldColor("${path}/noDataColor") {} }
	val noDataColorStyle by lazy { object : TreemapChartSpecFieldColorStyle("${path}/noDataColorStyle") {} }
}

abstract class TreemapChartSpecFieldColor(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val alpha: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/red")
}

abstract class TreemapChartSpecFieldColorStyle(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val rgbColor by lazy { object : TreemapChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class TreemapChartSpecFieldTextFormat(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val bold: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : TreemapChartSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : TreemapChartSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TreemapChartSpecFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/underline")
}

abstract class TreemapChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val name: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/name")
}

abstract class TreemapChartSpecFieldChartGroupRule(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val dateTimeRule by lazy { object : TreemapChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : TreemapChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class TreemapChartSpecFieldChartSourceRange(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val sources by lazy { object : TreemapChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class TreemapChartSpecFieldLink(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val uri: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/uri")
}

abstract class TreemapChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val type: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/type")
}

abstract class TreemapChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val intervalSize: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class TreemapChartSpecFieldGridRange(private val path: String) : FieldsList<TreemapChartSpecField>(path) {
	val endColumnIndex: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<TreemapChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

