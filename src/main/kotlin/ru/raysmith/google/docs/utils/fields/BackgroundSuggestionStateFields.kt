package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BackgroundSuggestionStateField : Field

object BackgroundSuggestionStateFields {
    val ALL: FieldsList<BackgroundSuggestionStateField> = fieldsList("*")
	val backgroundColorSuggested: FieldsList<BackgroundSuggestionStateField> get() = fieldsList("backgroundColorSuggested")
}

