package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HistogramRuleField : Field

object HistogramRuleFields {
    val ALL: FieldsList<HistogramRuleField> = fieldsList("*")
	val end: FieldsList<HistogramRuleField> get() = fieldsList("end")
	val interval: FieldsList<HistogramRuleField> get() = fieldsList("interval")
	val start: FieldsList<HistogramRuleField> get() = fieldsList("start")
}

