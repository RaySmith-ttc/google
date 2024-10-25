package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WaterfallChartColumnStyleField : Field

object WaterfallChartColumnStyleFields {
    val ALL: FieldsList<WaterfallChartColumnStyleField> = fieldsList("*")
	val color = object : WaterfallChartColumnStyleFieldColor("color") {}
	val colorStyle = object : WaterfallChartColumnStyleFieldColorStyle("colorStyle") {}
	val label: FieldsList<WaterfallChartColumnStyleField> get() = fieldsList("label")
}

abstract class WaterfallChartColumnStyleFieldColor(private val path: String) : FieldsList<WaterfallChartColumnStyleField>(path) {
	val alpha: FieldsList<WaterfallChartColumnStyleField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<WaterfallChartColumnStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<WaterfallChartColumnStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<WaterfallChartColumnStyleField> get() = fieldsList("${path}/red")
}

abstract class WaterfallChartColumnStyleFieldColorStyle(private val path: String) : FieldsList<WaterfallChartColumnStyleField>(path) {
	val rgbColor by lazy { object : WaterfallChartColumnStyleFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<WaterfallChartColumnStyleField> get() = fieldsList("${path}/themeColor")
}

