package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TimeOfDayField : Field

object TimeOfDayFields {
    val ALL: FieldsList<TimeOfDayField> = fieldsList("*")
	val hours: FieldsList<TimeOfDayField> get() = fieldsList("hours")
	val minutes: FieldsList<TimeOfDayField> get() = fieldsList("minutes")
	val nanos: FieldsList<TimeOfDayField> get() = fieldsList("nanos")
	val seconds: FieldsList<TimeOfDayField> get() = fieldsList("seconds")
}

