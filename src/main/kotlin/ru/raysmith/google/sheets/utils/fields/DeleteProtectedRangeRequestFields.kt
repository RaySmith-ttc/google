package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteProtectedRangeRequestField : Field

object DeleteProtectedRangeRequestFields {
    val ALL: FieldsList<DeleteProtectedRangeRequestField> = fieldsList("*")
	val protectedRangeId: FieldsList<DeleteProtectedRangeRequestField> get() = fieldsList("protectedRangeId")
}

