package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TreemapChartColorScaleField : Field

object TreemapChartColorScaleFields {
    val ALL: FieldsList<TreemapChartColorScaleField> = fieldsList("*")
	val maxValueColor = object : TreemapChartColorScaleFieldColor("maxValueColor") {}
	val maxValueColorStyle = object : TreemapChartColorScaleFieldColorStyle("maxValueColorStyle") {}
	val midValueColor = object : TreemapChartColorScaleFieldColor("midValueColor") {}
	val midValueColorStyle = object : TreemapChartColorScaleFieldColorStyle("midValueColorStyle") {}
	val minValueColor = object : TreemapChartColorScaleFieldColor("minValueColor") {}
	val minValueColorStyle = object : TreemapChartColorScaleFieldColorStyle("minValueColorStyle") {}
	val noDataColor = object : TreemapChartColorScaleFieldColor("noDataColor") {}
	val noDataColorStyle = object : TreemapChartColorScaleFieldColorStyle("noDataColorStyle") {}
}

abstract class TreemapChartColorScaleFieldColor(private val path: String) : FieldsList<TreemapChartColorScaleField>(path) {
	val alpha: FieldsList<TreemapChartColorScaleField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<TreemapChartColorScaleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TreemapChartColorScaleField> get() = fieldsList("${path}/green")
	val red: FieldsList<TreemapChartColorScaleField> get() = fieldsList("${path}/red")
}

abstract class TreemapChartColorScaleFieldColorStyle(private val path: String) : FieldsList<TreemapChartColorScaleField>(path) {
	val rgbColor by lazy { object : TreemapChartColorScaleFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<TreemapChartColorScaleField> get() = fieldsList("${path}/themeColor")
}

