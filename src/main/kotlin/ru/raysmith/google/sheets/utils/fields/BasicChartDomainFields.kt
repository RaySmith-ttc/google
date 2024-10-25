package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BasicChartDomainField : Field

object BasicChartDomainFields {
    val ALL: FieldsList<BasicChartDomainField> = fieldsList("*")
	val domain = object : BasicChartDomainFieldChartData("domain") {}
	val reversed: FieldsList<BasicChartDomainField> get() = fieldsList("reversed")
}

abstract class BasicChartDomainFieldChartData(private val path: String) : FieldsList<BasicChartDomainField>(path) {
	val aggregateType: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : BasicChartDomainFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : BasicChartDomainFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : BasicChartDomainFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class BasicChartDomainFieldDataSourceColumnReference(private val path: String) : FieldsList<BasicChartDomainField>(path) {
	val name: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/name")
}

abstract class BasicChartDomainFieldChartGroupRule(private val path: String) : FieldsList<BasicChartDomainField>(path) {
	val dateTimeRule by lazy { object : BasicChartDomainFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : BasicChartDomainFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class BasicChartDomainFieldChartSourceRange(private val path: String) : FieldsList<BasicChartDomainField>(path) {
	val sources by lazy { object : BasicChartDomainFieldGridRange("${path}/sources") {} }
}

abstract class BasicChartDomainFieldChartDateTimeRule(private val path: String) : FieldsList<BasicChartDomainField>(path) {
	val type: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/type")
}

abstract class BasicChartDomainFieldChartHistogramRule(private val path: String) : FieldsList<BasicChartDomainField>(path) {
	val intervalSize: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/minValue")
}

abstract class BasicChartDomainFieldGridRange(private val path: String) : FieldsList<BasicChartDomainField>(path) {
	val endColumnIndex: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BasicChartDomainField> get() = fieldsList("${path}/startRowIndex")
}

