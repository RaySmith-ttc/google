package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeletePositionedObjectRequestField : Field

object DeletePositionedObjectRequestFields {
    val ALL: FieldsList<DeletePositionedObjectRequestField> = fieldsList("*")
	val objectId: FieldsList<DeletePositionedObjectRequestField> get() = fieldsList("objectId")
	val tabId: FieldsList<DeletePositionedObjectRequestField> get() = fieldsList("tabId")
}

