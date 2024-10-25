package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface WriteControlField : Field

object WriteControlFields {
    val ALL: FieldsList<WriteControlField> = fieldsList("*")
	val requiredRevisionId: FieldsList<WriteControlField> get() = fieldsList("requiredRevisionId")
	val targetRevisionId: FieldsList<WriteControlField> get() = fieldsList("targetRevisionId")
}

