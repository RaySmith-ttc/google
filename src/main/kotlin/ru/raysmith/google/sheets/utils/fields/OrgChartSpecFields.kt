package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface OrgChartSpecField : Field

object OrgChartSpecFields {
    val ALL: FieldsList<OrgChartSpecField> = fieldsList("*")
	val labels = object : OrgChartSpecFieldChartData("labels") {}
	val nodeColor = object : OrgChartSpecFieldColor("nodeColor") {}
	val nodeColorStyle = object : OrgChartSpecFieldColorStyle("nodeColorStyle") {}
	val nodeSize: FieldsList<OrgChartSpecField> get() = fieldsList("nodeSize")
	val parentLabels = object : OrgChartSpecFieldChartData("parentLabels") {}
	val selectedNodeColor = object : OrgChartSpecFieldColor("selectedNodeColor") {}
	val selectedNodeColorStyle = object : OrgChartSpecFieldColorStyle("selectedNodeColorStyle") {}
	val tooltips = object : OrgChartSpecFieldChartData("tooltips") {}
}

abstract class OrgChartSpecFieldChartData(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val aggregateType: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : OrgChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : OrgChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : OrgChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class OrgChartSpecFieldColor(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val alpha: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/red")
}

abstract class OrgChartSpecFieldColorStyle(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val rgbColor by lazy { object : OrgChartSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class OrgChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val name: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/name")
}

abstract class OrgChartSpecFieldChartGroupRule(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val dateTimeRule by lazy { object : OrgChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : OrgChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class OrgChartSpecFieldChartSourceRange(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val sources by lazy { object : OrgChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class OrgChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val type: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/type")
}

abstract class OrgChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val intervalSize: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class OrgChartSpecFieldGridRange(private val path: String) : FieldsList<OrgChartSpecField>(path) {
	val endColumnIndex: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<OrgChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

