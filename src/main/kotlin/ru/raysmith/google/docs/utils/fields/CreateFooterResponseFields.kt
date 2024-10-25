package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateFooterResponseField : Field

object CreateFooterResponseFields {
    val ALL: FieldsList<CreateFooterResponseField> = fieldsList("*")
	val footerId: FieldsList<CreateFooterResponseField> get() = fieldsList("footerId")
}

