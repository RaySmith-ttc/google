package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BandedRangeField : Field

object BandedRangeFields {
    val ALL: FieldsList<BandedRangeField> = fieldsList("*")
	val bandedRangeId: FieldsList<BandedRangeField> get() = fieldsList("bandedRangeId")
	val columnProperties = object : BandedRangeFieldBandingProperties("columnProperties") {}
	val range = object : BandedRangeFieldGridRange("range") {}
	val rowProperties = object : BandedRangeFieldBandingProperties("rowProperties") {}
}

abstract class BandedRangeFieldBandingProperties(private val path: String) : FieldsList<BandedRangeField>(path) {
	val firstBandColor by lazy { object : BandedRangeFieldColor("${path}/firstBandColor") {} }
	val firstBandColorStyle by lazy { object : BandedRangeFieldColorStyle("${path}/firstBandColorStyle") {} }
	val footerColor by lazy { object : BandedRangeFieldColor("${path}/footerColor") {} }
	val footerColorStyle by lazy { object : BandedRangeFieldColorStyle("${path}/footerColorStyle") {} }
	val headerColor by lazy { object : BandedRangeFieldColor("${path}/headerColor") {} }
	val headerColorStyle by lazy { object : BandedRangeFieldColorStyle("${path}/headerColorStyle") {} }
	val secondBandColor by lazy { object : BandedRangeFieldColor("${path}/secondBandColor") {} }
	val secondBandColorStyle by lazy { object : BandedRangeFieldColorStyle("${path}/secondBandColorStyle") {} }
}

abstract class BandedRangeFieldGridRange(private val path: String) : FieldsList<BandedRangeField>(path) {
	val endColumnIndex: FieldsList<BandedRangeField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BandedRangeField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BandedRangeField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BandedRangeField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BandedRangeField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BandedRangeFieldColor(private val path: String) : FieldsList<BandedRangeField>(path) {
	val alpha: FieldsList<BandedRangeField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BandedRangeField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BandedRangeField> get() = fieldsList("${path}/green")
	val red: FieldsList<BandedRangeField> get() = fieldsList("${path}/red")
}

abstract class BandedRangeFieldColorStyle(private val path: String) : FieldsList<BandedRangeField>(path) {
	val rgbColor by lazy { object : BandedRangeFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BandedRangeField> get() = fieldsList("${path}/themeColor")
}

