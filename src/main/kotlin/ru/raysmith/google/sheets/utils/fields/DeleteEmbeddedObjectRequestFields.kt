package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteEmbeddedObjectRequestField : Field

object DeleteEmbeddedObjectRequestFields {
    val ALL: FieldsList<DeleteEmbeddedObjectRequestField> = fieldsList("*")
	val objectId: FieldsList<DeleteEmbeddedObjectRequestField> get() = fieldsList("objectId")
}

