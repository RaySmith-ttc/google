package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartHistogramRuleField : Field

object ChartHistogramRuleFields {
    val ALL: FieldsList<ChartHistogramRuleField> = fieldsList("*")
	val intervalSize: FieldsList<ChartHistogramRuleField> get() = fieldsList("intervalSize")
	val maxValue: FieldsList<ChartHistogramRuleField> get() = fieldsList("maxValue")
	val minValue: FieldsList<ChartHistogramRuleField> get() = fieldsList("minValue")
}

