package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BasicSeriesDataPointStyleOverrideField : Field

object BasicSeriesDataPointStyleOverrideFields {
    val ALL: FieldsList<BasicSeriesDataPointStyleOverrideField> = fieldsList("*")
	val color = object : BasicSeriesDataPointStyleOverrideFieldColor("color") {}
	val colorStyle = object : BasicSeriesDataPointStyleOverrideFieldColorStyle("colorStyle") {}
	val index: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("index")
	val pointStyle = object : BasicSeriesDataPointStyleOverrideFieldPointStyle("pointStyle") {}
}

abstract class BasicSeriesDataPointStyleOverrideFieldColor(private val path: String) : FieldsList<BasicSeriesDataPointStyleOverrideField>(path) {
	val alpha: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("${path}/green")
	val red: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("${path}/red")
}

abstract class BasicSeriesDataPointStyleOverrideFieldColorStyle(private val path: String) : FieldsList<BasicSeriesDataPointStyleOverrideField>(path) {
	val rgbColor by lazy { object : BasicSeriesDataPointStyleOverrideFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("${path}/themeColor")
}

abstract class BasicSeriesDataPointStyleOverrideFieldPointStyle(private val path: String) : FieldsList<BasicSeriesDataPointStyleOverrideField>(path) {
	val shape: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("${path}/shape")
	val size: FieldsList<BasicSeriesDataPointStyleOverrideField> get() = fieldsList("${path}/size")
}

