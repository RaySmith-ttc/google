package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LinkField : Field

object LinkFields {
    val ALL: FieldsList<LinkField> = fieldsList("*")
	val uri: FieldsList<LinkField> get() = fieldsList("uri")
}

