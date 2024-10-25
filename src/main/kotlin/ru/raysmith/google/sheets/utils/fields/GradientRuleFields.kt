package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface GradientRuleField : Field

object GradientRuleFields {
    val ALL: FieldsList<GradientRuleField> = fieldsList("*")
	val maxpoint = object : GradientRuleFieldInterpolationPoint("maxpoint") {}
	val midpoint = object : GradientRuleFieldInterpolationPoint("midpoint") {}
	val minpoint = object : GradientRuleFieldInterpolationPoint("minpoint") {}
}

abstract class GradientRuleFieldInterpolationPoint(private val path: String) : FieldsList<GradientRuleField>(path) {
	val color by lazy { object : GradientRuleFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : GradientRuleFieldColorStyle("${path}/colorStyle") {} }
	val type: FieldsList<GradientRuleField> get() = fieldsList("${path}/type")
	val value: FieldsList<GradientRuleField> get() = fieldsList("${path}/value")
}

abstract class GradientRuleFieldColor(private val path: String) : FieldsList<GradientRuleField>(path) {
	val alpha: FieldsList<GradientRuleField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<GradientRuleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<GradientRuleField> get() = fieldsList("${path}/green")
	val red: FieldsList<GradientRuleField> get() = fieldsList("${path}/red")
}

abstract class GradientRuleFieldColorStyle(private val path: String) : FieldsList<GradientRuleField>(path) {
	val rgbColor by lazy { object : GradientRuleFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<GradientRuleField> get() = fieldsList("${path}/themeColor")
}

