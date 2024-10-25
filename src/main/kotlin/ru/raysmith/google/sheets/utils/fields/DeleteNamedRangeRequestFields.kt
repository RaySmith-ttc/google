package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteNamedRangeRequestField : Field

object DeleteNamedRangeRequestFields {
    val ALL: FieldsList<DeleteNamedRangeRequestField> = fieldsList("*")
	val namedRangeId: FieldsList<DeleteNamedRangeRequestField> get() = fieldsList("namedRangeId")
}

