package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedObjectBorderSuggestionStateField : Field

object EmbeddedObjectBorderSuggestionStateFields {
    val ALL: FieldsList<EmbeddedObjectBorderSuggestionStateField> = fieldsList("*")
	val colorSuggested: FieldsList<EmbeddedObjectBorderSuggestionStateField> get() = fieldsList("colorSuggested")
	val dashStyleSuggested: FieldsList<EmbeddedObjectBorderSuggestionStateField> get() = fieldsList("dashStyleSuggested")
	val propertyStateSuggested: FieldsList<EmbeddedObjectBorderSuggestionStateField> get() = fieldsList("propertyStateSuggested")
	val widthSuggested: FieldsList<EmbeddedObjectBorderSuggestionStateField> get() = fieldsList("widthSuggested")
}

