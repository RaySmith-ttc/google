package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TableRowStyleSuggestionStateField : Field

object TableRowStyleSuggestionStateFields {
    val ALL: FieldsList<TableRowStyleSuggestionStateField> = fieldsList("*")
	val minRowHeightSuggested: FieldsList<TableRowStyleSuggestionStateField> get() = fieldsList("minRowHeightSuggested")
}

