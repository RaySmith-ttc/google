package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EquationField : Field

object EquationFields {
    val ALL: FieldsList<EquationField> = fieldsList("*")
	val suggestedDeletionIds: FieldsList<EquationField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<EquationField> get() = fieldsList("suggestedInsertionIds")
}

