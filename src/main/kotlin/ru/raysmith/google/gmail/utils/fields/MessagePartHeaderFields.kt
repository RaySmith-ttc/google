package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MessagePartHeaderField : Field

object MessagePartHeaderFields {
    val ALL: FieldsList<MessagePartHeaderField> = fieldsList("*")
	val name: FieldsList<MessagePartHeaderField> get() = fieldsList("name")
	val value: FieldsList<MessagePartHeaderField> get() = fieldsList("value")
}

