package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BandingPropertiesField : Field

object BandingPropertiesFields {
    val ALL: FieldsList<BandingPropertiesField> = fieldsList("*")
	val firstBandColor = object : BandingPropertiesFieldColor("firstBandColor") {}
	val firstBandColorStyle = object : BandingPropertiesFieldColorStyle("firstBandColorStyle") {}
	val footerColor = object : BandingPropertiesFieldColor("footerColor") {}
	val footerColorStyle = object : BandingPropertiesFieldColorStyle("footerColorStyle") {}
	val headerColor = object : BandingPropertiesFieldColor("headerColor") {}
	val headerColorStyle = object : BandingPropertiesFieldColorStyle("headerColorStyle") {}
	val secondBandColor = object : BandingPropertiesFieldColor("secondBandColor") {}
	val secondBandColorStyle = object : BandingPropertiesFieldColorStyle("secondBandColorStyle") {}
}

abstract class BandingPropertiesFieldColor(private val path: String) : FieldsList<BandingPropertiesField>(path) {
	val alpha: FieldsList<BandingPropertiesField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BandingPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BandingPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<BandingPropertiesField> get() = fieldsList("${path}/red")
}

abstract class BandingPropertiesFieldColorStyle(private val path: String) : FieldsList<BandingPropertiesField>(path) {
	val rgbColor by lazy { object : BandingPropertiesFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BandingPropertiesField> get() = fieldsList("${path}/themeColor")
}

