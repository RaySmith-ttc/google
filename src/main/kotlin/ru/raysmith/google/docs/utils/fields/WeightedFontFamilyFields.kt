package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WeightedFontFamilyField : Field

object WeightedFontFamilyFields {
    val ALL: FieldsList<WeightedFontFamilyField> = fieldsList("*")
	val fontFamily: FieldsList<WeightedFontFamilyField> get() = fieldsList("fontFamily")
	val weight: FieldsList<WeightedFontFamilyField> get() = fieldsList("weight")
}

