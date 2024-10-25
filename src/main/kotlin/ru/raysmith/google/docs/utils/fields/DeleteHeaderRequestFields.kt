package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteHeaderRequestField : Field

object DeleteHeaderRequestFields {
    val ALL: FieldsList<DeleteHeaderRequestField> = fieldsList("*")
	val headerId: FieldsList<DeleteHeaderRequestField> get() = fieldsList("headerId")
	val tabId: FieldsList<DeleteHeaderRequestField> get() = fieldsList("tabId")
}

