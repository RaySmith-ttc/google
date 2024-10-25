package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateNamedRangeResponseField : Field

object CreateNamedRangeResponseFields {
    val ALL: FieldsList<CreateNamedRangeResponseField> = fieldsList("*")
	val namedRangeId: FieldsList<CreateNamedRangeResponseField> get() = fieldsList("namedRangeId")
}

