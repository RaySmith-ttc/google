package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ObjectReferencesField : Field

object ObjectReferencesFields {
    val ALL: FieldsList<ObjectReferencesField> = fieldsList("*")
	val objectIds: FieldsList<ObjectReferencesField> get() = fieldsList("objectIds")
}

