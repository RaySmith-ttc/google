package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateBandingRequestField : Field

object UpdateBandingRequestFields {
    val ALL: FieldsList<UpdateBandingRequestField> = fieldsList("*")
	val bandedRange = object : UpdateBandingRequestFieldBandedRange("bandedRange") {}
	val fields: FieldsList<UpdateBandingRequestField> get() = fieldsList("fields")
}

abstract class UpdateBandingRequestFieldBandedRange(private val path: String) : FieldsList<UpdateBandingRequestField>(path) {
	val bandedRangeId: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/bandedRangeId")
	val columnProperties by lazy { object : UpdateBandingRequestFieldBandingProperties("${path}/columnProperties") {} }
	val range by lazy { object : UpdateBandingRequestFieldGridRange("${path}/range") {} }
	val rowProperties by lazy { object : UpdateBandingRequestFieldBandingProperties("${path}/rowProperties") {} }
}

abstract class UpdateBandingRequestFieldBandingProperties(private val path: String) : FieldsList<UpdateBandingRequestField>(path) {
	val firstBandColor by lazy { object : UpdateBandingRequestFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : UpdateBandingRequestFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : UpdateBandingRequestFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : UpdateBandingRequestFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : UpdateBandingRequestFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : UpdateBandingRequestFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : UpdateBandingRequestFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : UpdateBandingRequestFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class UpdateBandingRequestFieldGridRange(private val path: String) : FieldsList<UpdateBandingRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateBandingRequestFieldColor(private val path: String) : FieldsList<UpdateBandingRequestField>(path) {
	val alpha: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateBandingRequestFieldColorStyle(private val path: String) : FieldsList<UpdateBandingRequestField>(path) {
	val rgbColor by lazy { object : UpdateBandingRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateBandingRequestField> get() = fieldsList("${path}/themeColor")
}

