package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SizeSuggestionStateField : Field

object SizeSuggestionStateFields {
    val ALL: FieldsList<SizeSuggestionStateField> = fieldsList("*")
	val heightSuggested: FieldsList<SizeSuggestionStateField> get() = fieldsList("heightSuggested")
	val widthSuggested: FieldsList<SizeSuggestionStateField> get() = fieldsList("widthSuggested")
}

