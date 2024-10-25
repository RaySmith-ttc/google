package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CandlestickDomainField : Field

object CandlestickDomainFields {
    val ALL: FieldsList<CandlestickDomainField> = fieldsList("*")
	val data = object : CandlestickDomainFieldChartData("data") {}
	val reversed: FieldsList<CandlestickDomainField> get() = fieldsList("reversed")
}

abstract class CandlestickDomainFieldChartData(private val path: String) : FieldsList<CandlestickDomainField>(path) {
	val aggregateType: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : CandlestickDomainFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : CandlestickDomainFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : CandlestickDomainFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class CandlestickDomainFieldDataSourceColumnReference(private val path: String) : FieldsList<CandlestickDomainField>(path) {
	val name: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/name")
}

abstract class CandlestickDomainFieldChartGroupRule(private val path: String) : FieldsList<CandlestickDomainField>(path) {
	val dateTimeRule by lazy { object : CandlestickDomainFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : CandlestickDomainFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class CandlestickDomainFieldChartSourceRange(private val path: String) : FieldsList<CandlestickDomainField>(path) {
	val sources by lazy { object : CandlestickDomainFieldGridRange("${path}/sources") {} }
}

abstract class CandlestickDomainFieldChartDateTimeRule(private val path: String) : FieldsList<CandlestickDomainField>(path) {
	val type: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/type")
}

abstract class CandlestickDomainFieldChartHistogramRule(private val path: String) : FieldsList<CandlestickDomainField>(path) {
	val intervalSize: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/minValue")
}

abstract class CandlestickDomainFieldGridRange(private val path: String) : FieldsList<CandlestickDomainField>(path) {
	val endColumnIndex: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<CandlestickDomainField> get() = fieldsList("${path}/startRowIndex")
}

