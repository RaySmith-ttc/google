package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PieChartSpecField : Field

object PieChartSpecFields {
    val ALL: FieldsList<PieChartSpecField> = fieldsList("*")
	val domain = object : PieChartSpecFieldChartData("domain") {}
	val legendPosition: FieldsList<PieChartSpecField> get() = fieldsList("legendPosition")
	val pieHole: FieldsList<PieChartSpecField> get() = fieldsList("pieHole")
	val series = object : PieChartSpecFieldChartData("series") {}
	val threeDimensional: FieldsList<PieChartSpecField> get() = fieldsList("threeDimensional")
}

abstract class PieChartSpecFieldChartData(private val path: String) : FieldsList<PieChartSpecField>(path) {
	val aggregateType: FieldsList<PieChartSpecField> get() = fieldsList("${path}/aggregateType")
	val columnReference by lazy { object : PieChartSpecFieldDataSourceColumnReference("${path}/columnReference") {} }
	val groupRule by lazy { object : PieChartSpecFieldChartGroupRule("${path}/groupRule") {} }
	val sourceRange by lazy { object : PieChartSpecFieldChartSourceRange("${path}/sourceRange") {} }
}

abstract class PieChartSpecFieldDataSourceColumnReference(private val path: String) : FieldsList<PieChartSpecField>(path) {
	val name: FieldsList<PieChartSpecField> get() = fieldsList("${path}/name")
}

abstract class PieChartSpecFieldChartGroupRule(private val path: String) : FieldsList<PieChartSpecField>(path) {
	val dateTimeRule by lazy { object : PieChartSpecFieldChartDateTimeRule("${path}/dateTimeRule") {} }
	val histogramRule by lazy { object : PieChartSpecFieldChartHistogramRule("${path}/histogramRule") {} }
}

abstract class PieChartSpecFieldChartSourceRange(private val path: String) : FieldsList<PieChartSpecField>(path) {
	val sources by lazy { object : PieChartSpecFieldGridRange("${path}/sources") {} }
}

abstract class PieChartSpecFieldChartDateTimeRule(private val path: String) : FieldsList<PieChartSpecField>(path) {
	val type: FieldsList<PieChartSpecField> get() = fieldsList("${path}/type")
}

abstract class PieChartSpecFieldChartHistogramRule(private val path: String) : FieldsList<PieChartSpecField>(path) {
	val intervalSize: FieldsList<PieChartSpecField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<PieChartSpecField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<PieChartSpecField> get() = fieldsList("${path}/minValue")
}

abstract class PieChartSpecFieldGridRange(private val path: String) : FieldsList<PieChartSpecField>(path) {
	val endColumnIndex: FieldsList<PieChartSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<PieChartSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<PieChartSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<PieChartSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<PieChartSpecField> get() = fieldsList("${path}/startRowIndex")
}

