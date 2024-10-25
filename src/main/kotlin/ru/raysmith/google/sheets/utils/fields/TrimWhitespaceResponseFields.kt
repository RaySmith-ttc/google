package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TrimWhitespaceResponseField : Field

object TrimWhitespaceResponseFields {
    val ALL: FieldsList<TrimWhitespaceResponseField> = fieldsList("*")
	val cellsChangedCount: FieldsList<TrimWhitespaceResponseField> get() = fieldsList("cellsChangedCount")
}

