package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartDateTimeRuleField : Field

object ChartDateTimeRuleFields {
    val ALL: FieldsList<ChartDateTimeRuleField> = fieldsList("*")
	val type: FieldsList<ChartDateTimeRuleField> get() = fieldsList("type")
}

