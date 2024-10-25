package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DateTimeRuleField : Field

object DateTimeRuleFields {
    val ALL: FieldsList<DateTimeRuleField> = fieldsList("*")
	val type: FieldsList<DateTimeRuleField> get() = fieldsList("type")
}

