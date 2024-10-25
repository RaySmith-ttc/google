package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateFootnoteResponseField : Field

object CreateFootnoteResponseFields {
    val ALL: FieldsList<CreateFootnoteResponseField> = fieldsList("*")
	val footnoteId: FieldsList<CreateFootnoteResponseField> get() = fieldsList("footnoteId")
}

