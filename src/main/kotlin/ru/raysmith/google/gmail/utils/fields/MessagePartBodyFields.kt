package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MessagePartBodyField : Field

object MessagePartBodyFields {
    val ALL: FieldsList<MessagePartBodyField> = fieldsList("*")
	val attachmentId: FieldsList<MessagePartBodyField> get() = fieldsList("attachmentId")
	val data: FieldsList<MessagePartBodyField> get() = fieldsList("data")
	val size: FieldsList<MessagePartBodyField> get() = fieldsList("size")
}

