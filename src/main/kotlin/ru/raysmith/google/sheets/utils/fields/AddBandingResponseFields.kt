package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddBandingResponseField : Field

object AddBandingResponseFields {
    val ALL: FieldsList<AddBandingResponseField> = fieldsList("*")
	val bandedRange = object : AddBandingResponseFieldBandedRange("bandedRange") {}
}

abstract class AddBandingResponseFieldBandedRange(private val path: String) : FieldsList<AddBandingResponseField>(path) {
	val bandedRangeId: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : AddBandingResponseFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : AddBandingResponseFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : AddBandingResponseFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class AddBandingResponseFieldBandingProperties(private val path: String) : FieldsList<AddBandingResponseField>(path) {
	val firstBandColor by lazy { object : AddBandingResponseFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : AddBandingResponseFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : AddBandingResponseFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : AddBandingResponseFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : AddBandingResponseFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : AddBandingResponseFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : AddBandingResponseFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : AddBandingResponseFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class AddBandingResponseFieldGridRange(private val path: String) : FieldsList<AddBandingResponseField>(path) {
	val endColumnIndex: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddBandingResponseFieldColor(private val path: String) : FieldsList<AddBandingResponseField>(path) {
	val alpha: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/red")
}

abstract class AddBandingResponseFieldColorStyle(private val path: String) : FieldsList<AddBandingResponseField>(path) {
	val rgbColor by lazy { object : AddBandingResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddBandingResponseField> get() = fieldsList("${path}/themeColor")
}

