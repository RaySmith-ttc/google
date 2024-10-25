package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartGroupRuleField : Field

object ChartGroupRuleFields {
    val ALL: FieldsList<ChartGroupRuleField> = fieldsList("*")
	val dateTimeRule = object : ChartGroupRuleFieldChartDateTimeRule("dateTimeRule") {}
	val histogramRule = object : ChartGroupRuleFieldChartHistogramRule("histogramRule") {}
}

abstract class ChartGroupRuleFieldChartDateTimeRule(private val path: String) : FieldsList<ChartGroupRuleField>(path) {
	val type: FieldsList<ChartGroupRuleField> get() = fieldsList("${path}/type")
}

abstract class ChartGroupRuleFieldChartHistogramRule(private val path: String) : FieldsList<ChartGroupRuleField>(path) {
	val intervalSize: FieldsList<ChartGroupRuleField> get() = fieldsList("${path}/intervalSize")
	val maxValue: FieldsList<ChartGroupRuleField> get() = fieldsList("${path}/maxValue")
	val minValue: FieldsList<ChartGroupRuleField> get() = fieldsList("${path}/minValue")
}

