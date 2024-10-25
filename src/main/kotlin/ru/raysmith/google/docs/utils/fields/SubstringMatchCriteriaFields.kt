package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SubstringMatchCriteriaField : Field

object SubstringMatchCriteriaFields {
    val ALL: FieldsList<SubstringMatchCriteriaField> = fieldsList("*")
	val matchCase: FieldsList<SubstringMatchCriteriaField> get() = fieldsList("matchCase")
	val text: FieldsList<SubstringMatchCriteriaField> get() = fieldsList("text")
}

