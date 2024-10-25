package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface StatusField : Field

object StatusFields {
    val ALL: FieldsList<StatusField> = fieldsList("*")
	val code: FieldsList<StatusField> get() = fieldsList("code")
	val details: FieldsList<StatusField> get() = fieldsList("details")
	val message: FieldsList<StatusField> get() = fieldsList("message")
}

