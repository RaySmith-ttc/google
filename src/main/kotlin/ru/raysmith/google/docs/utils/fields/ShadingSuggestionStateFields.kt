package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ShadingSuggestionStateField : Field

object ShadingSuggestionStateFields {
    val ALL: FieldsList<ShadingSuggestionStateField> = fieldsList("*")
	val backgroundColorSuggested: FieldsList<ShadingSuggestionStateField> get() = fieldsList("backgroundColorSuggested")
}

