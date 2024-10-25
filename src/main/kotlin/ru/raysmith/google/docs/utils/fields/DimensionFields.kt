package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DimensionField : Field

object DimensionFields {
    val ALL: FieldsList<DimensionField> = fieldsList("*")
	val magnitude: FieldsList<DimensionField> get() = fieldsList("magnitude")
	val unit: FieldsList<DimensionField> get() = fieldsList("unit")
}

