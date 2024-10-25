package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteBandingRequestField : Field

object DeleteBandingRequestFields {
    val ALL: FieldsList<DeleteBandingRequestField> = fieldsList("*")
	val bandedRangeId: FieldsList<DeleteBandingRequestField> get() = fieldsList("bandedRangeId")
}

