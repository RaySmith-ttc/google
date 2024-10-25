package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ReplaceAllTextResponseField : Field

object ReplaceAllTextResponseFields {
    val ALL: FieldsList<ReplaceAllTextResponseField> = fieldsList("*")
	val occurrencesChanged: FieldsList<ReplaceAllTextResponseField> get() = fieldsList("occurrencesChanged")
}

