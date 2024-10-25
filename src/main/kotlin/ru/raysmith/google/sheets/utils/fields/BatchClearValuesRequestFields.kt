package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchClearValuesRequestField : Field

object BatchClearValuesRequestFields {
    val ALL: FieldsList<BatchClearValuesRequestField> = fieldsList("*")
	val ranges: FieldsList<BatchClearValuesRequestField> get() = fieldsList("ranges")
}

