package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ChartCustomNumberFormatOptionsField : Field

object ChartCustomNumberFormatOptionsFields {
    val ALL: FieldsList<ChartCustomNumberFormatOptionsField> = fieldsList("*")
	val prefix: FieldsList<ChartCustomNumberFormatOptionsField> get() = fieldsList("prefix")
	val suffix: FieldsList<ChartCustomNumberFormatOptionsField> get() = fieldsList("suffix")
}

