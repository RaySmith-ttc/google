package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextStyleSuggestionStateField : Field

object TextStyleSuggestionStateFields {
    val ALL: FieldsList<TextStyleSuggestionStateField> = fieldsList("*")
	val backgroundColorSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("baselineOffsetSuggested")
	val boldSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("boldSuggested")
	val fontSizeSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("foregroundColorSuggested")
	val italicSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("italicSuggested")
	val linkSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("linkSuggested")
	val smallCapsSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("smallCapsSuggested")
	val strikethroughSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("strikethroughSuggested")
	val underlineSuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<TextStyleSuggestionStateField> get() = fieldsList("weightedFontFamilySuggested")
}

