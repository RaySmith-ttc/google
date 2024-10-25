package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteFilterViewRequestField : Field

object DeleteFilterViewRequestFields {
    val ALL: FieldsList<DeleteFilterViewRequestField> = fieldsList("*")
	val filterId: FieldsList<DeleteFilterViewRequestField> get() = fieldsList("filterId")
}

