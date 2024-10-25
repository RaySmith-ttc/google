package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataLabelField : Field

object DataLabelFields {
    val ALL: FieldsList<DataLabelField> = fieldsList("*")
	val customLabelData = object : DataLabelFieldChartData("customLabelData") {}
	val placement: FieldsList<DataLabelField> get() = fieldsList("placement")
	val textFormat = object : DataLabelFieldTextFormat("textFormat") {}
	val type: FieldsList<DataLabelField> get() = fieldsList("type")
}

abstract class DataLabelFieldChartData(private val path: String) : FieldsList<DataLabelField>(path) {
	val aggregateType: FieldsList<DataLabelField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : DataLabelFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : DataLabelFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : DataLabelFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class DataLabelFieldTextFormat(private val path: String) : FieldsList<DataLabelField>(path) {
	val bold: FieldsList<DataLabelField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<DataLabelField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<DataLabelField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : DataLabelFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : DataLabelFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<DataLabelField> get() = fieldsList("${path}/italic")
	val link by lazy { object : DataLabelFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<DataLabelField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<DataLabelField> get() = fieldsList("${path}/underline")
}

abstract class DataLabelFieldDataSourceColumnReference(private val path: String) : FieldsList<DataLabelField>(path) {
	val name: FieldsList<DataLabelField> get() = fieldsList("${path}/name")
}

abstract class DataLabelFieldChartGroupRule(private val path: String) : FieldsList<DataLabelField>(path) {
	val dateTimeRule by lazy { object : DataLabelFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : DataLabelFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class DataLabelFieldChartSourceRange(private val path: String) : FieldsList<DataLabelField>(path) {
	val sources by lazy { object : DataLabelFieldGridRange("${path}/sources") {} }
}

abstract class DataLabelFieldColor(private val path: String) : FieldsList<DataLabelField>(path) {
	val alpha: FieldsList<DataLabelField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<DataLabelField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DataLabelField> get() = fieldsList("${path}/green")
	val red: FieldsList<DataLabelField> get() = fieldsList("${path}/red")
}

abstract class DataLabelFieldColorStyle(private val path: String) : FieldsList<DataLabelField>(path) {
	val rgbColor by lazy { object : DataLabelFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<DataLabelField> get() = fieldsList("${path}/themeColor")
}

abstract class DataLabelFieldLink(private val path: String) : FieldsList<DataLabelField>(path) {
	val uri: FieldsList<DataLabelField> get() = fieldsList("${path}/uri")
}

abstract class DataLabelFieldChartDateTimeRule(private val path: String) : FieldsList<DataLabelField>(path) {
	val type: FieldsList<DataLabelField> get() = fieldsList("${path}/type")
}

abstract class DataLabelFieldChartHistogramRule(private val path: String) : FieldsList<DataLabelField>(path) {
	val intervalSize: FieldsList<DataLabelField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<DataLabelField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<DataLabelField> get() = fieldsList("${path}/minValue")
}

abstract class DataLabelFieldGridRange(private val path: String) : FieldsList<DataLabelField>(path) {
	val endColumnIndex: FieldsList<DataLabelField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DataLabelField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DataLabelField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DataLabelField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DataLabelField> get() = fieldsList("${path}/startRowIndex")
}

