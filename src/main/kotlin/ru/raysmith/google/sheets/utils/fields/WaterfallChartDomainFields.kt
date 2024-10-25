package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WaterfallChartDomainField : Field

object WaterfallChartDomainFields {
    val ALL: FieldsList<WaterfallChartDomainField> = fieldsList("*")
	val data = object : WaterfallChartDomainFieldChartData("data") {}
	val reversed: FieldsList<WaterfallChartDomainField> get() = fieldsList("reversed")
}

abstract class WaterfallChartDomainFieldChartData(private val path: String) : FieldsList<WaterfallChartDomainField>(path) {
	val aggregateType: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : WaterfallChartDomainFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : WaterfallChartDomainFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : WaterfallChartDomainFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class WaterfallChartDomainFieldDataSourceColumnReference(private val path: String) : FieldsList<WaterfallChartDomainField>(path) {
	val name: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/name")
}

abstract class WaterfallChartDomainFieldChartGroupRule(private val path: String) : FieldsList<WaterfallChartDomainField>(path) {
	val dateTimeRule by lazy { object : WaterfallChartDomainFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : WaterfallChartDomainFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class WaterfallChartDomainFieldChartSourceRange(private val path: String) : FieldsList<WaterfallChartDomainField>(path) {
	val sources by lazy { object : WaterfallChartDomainFieldGridRange("${path}/sources") {} }
}

abstract class WaterfallChartDomainFieldChartDateTimeRule(private val path: String) : FieldsList<WaterfallChartDomainField>(path) {
	val type: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/type")
}

abstract class WaterfallChartDomainFieldChartHistogramRule(private val path: String) : FieldsList<WaterfallChartDomainField>(path) {
	val intervalSize: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/minValue")
}

abstract class WaterfallChartDomainFieldGridRange(private val path: String) : FieldsList<WaterfallChartDomainField>(path) {
	val endColumnIndex: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<WaterfallChartDomainField> get() = fieldsList("${path}/startRowIndex")
}

