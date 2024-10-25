package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InsertInlineImageResponseField : Field

object InsertInlineImageResponseFields {
    val ALL: FieldsList<InsertInlineImageResponseField> = fieldsList("*")
	val objectId: FieldsList<InsertInlineImageResponseField> get() = fieldsList("objectId")
}

