package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchDeleteMessagesRequestField : Field

object BatchDeleteMessagesRequestFields {
    val ALL: FieldsList<BatchDeleteMessagesRequestField> = fieldsList("*")
	val ids: FieldsList<BatchDeleteMessagesRequestField> get() = fieldsList("ids")
}

