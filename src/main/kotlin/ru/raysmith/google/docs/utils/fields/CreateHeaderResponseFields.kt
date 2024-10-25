package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateHeaderResponseField : Field

object CreateHeaderResponseFields {
    val ALL: FieldsList<CreateHeaderResponseField> = fieldsList("*")
	val headerId: FieldsList<CreateHeaderResponseField> get() = fieldsList("headerId")
}

