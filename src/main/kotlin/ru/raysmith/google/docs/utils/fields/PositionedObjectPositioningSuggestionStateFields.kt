package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PositionedObjectPositioningSuggestionStateField : Field

object PositionedObjectPositioningSuggestionStateFields {
    val ALL: FieldsList<PositionedObjectPositioningSuggestionStateField> = fieldsList("*")
	val layoutSuggested: FieldsList<PositionedObjectPositioningSuggestionStateField> get() = fieldsList("layoutSuggested")
	val leftOffsetSuggested: FieldsList<PositionedObjectPositioningSuggestionStateField> get() = fieldsList("leftOffsetSuggested")
	val topOffsetSuggested: FieldsList<PositionedObjectPositioningSuggestionStateField> get() = fieldsList("topOffsetSuggested")
}

