package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BigQueryQuerySpecField : Field

object BigQueryQuerySpecFields {
    val ALL: FieldsList<BigQueryQuerySpecField> = fieldsList("*")
	val rawQuery: FieldsList<BigQueryQuerySpecField> get() = fieldsList("rawQuery")
}

