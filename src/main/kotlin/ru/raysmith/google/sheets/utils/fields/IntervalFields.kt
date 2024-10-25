package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface IntervalField : Field

object IntervalFields {
    val ALL: FieldsList<IntervalField> = fieldsList("*")
	val endTime: FieldsList<IntervalField> get() = fieldsList("endTime")
	val startTime: FieldsList<IntervalField> get() = fieldsList("startTime")
}

