package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PointStyleField : Field

object PointStyleFields {
    val ALL: FieldsList<PointStyleField> = fieldsList("*")
	val shape: FieldsList<PointStyleField> get() = fieldsList("shape")
	val size: FieldsList<PointStyleField> get() = fieldsList("size")
}

