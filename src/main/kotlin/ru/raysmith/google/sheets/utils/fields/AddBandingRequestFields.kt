package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddBandingRequestField : Field

object AddBandingRequestFields {
    val ALL: FieldsList<AddBandingRequestField> = fieldsList("*")
	val bandedRange = object : AddBandingRequestFieldBandedRange("bandedRange") {}
}

abstract class AddBandingRequestFieldBandedRange(private val path: String) : FieldsList<AddBandingRequestField>(path) {
	val bandedRangeId: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : AddBandingRequestFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : AddBandingRequestFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : AddBandingRequestFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class AddBandingRequestFieldBandingProperties(private val path: String) : FieldsList<AddBandingRequestField>(path) {
	val firstBandColor by lazy { object : AddBandingRequestFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : AddBandingRequestFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : AddBandingRequestFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : AddBandingRequestFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : AddBandingRequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : AddBandingRequestFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : AddBandingRequestFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : AddBandingRequestFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class AddBandingRequestFieldGridRange(private val path: String) : FieldsList<AddBandingRequestField>(path) {
	val endColumnIndex: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddBandingRequestFieldColor(private val path: String) : FieldsList<AddBandingRequestField>(path) {
	val alpha: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/red")
}

abstract class AddBandingRequestFieldColorStyle(private val path: String) : FieldsList<AddBandingRequestField>(path) {
	val rgbColor by lazy { object : AddBandingRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddBandingRequestField> get() = fieldsList("${path}/themeColor")
}

