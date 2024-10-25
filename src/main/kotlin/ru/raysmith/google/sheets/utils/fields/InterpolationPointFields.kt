package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InterpolationPointField : Field

object InterpolationPointFields {
    val ALL: FieldsList<InterpolationPointField> = fieldsList("*")
	val color = object : InterpolationPointFieldColor("color") {}
	val colorStyle = object : InterpolationPointFieldColorStyle("colorStyle") {}
	val type: FieldsList<InterpolationPointField> get() = fieldsList("type")
	val value: FieldsList<InterpolationPointField> get() = fieldsList("value")
}

abstract class InterpolationPointFieldColor(private val path: String) : FieldsList<InterpolationPointField>(path) {
	val alpha: FieldsList<InterpolationPointField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<InterpolationPointField> get() = fieldsList("${path}/blue")
	val green: FieldsList<InterpolationPointField> get() = fieldsList("${path}/green")
	val red: FieldsList<InterpolationPointField> get() = fieldsList("${path}/red")
}

abstract class InterpolationPointFieldColorStyle(private val path: String) : FieldsList<InterpolationPointField>(path) {
	val rgbColor by lazy { object : InterpolationPointFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<InterpolationPointField> get() = fieldsList("${path}/themeColor")
}

