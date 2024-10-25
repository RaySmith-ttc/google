package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PersonPropertiesField : Field

object PersonPropertiesFields {
    val ALL: FieldsList<PersonPropertiesField> = fieldsList("*")
	val email: FieldsList<PersonPropertiesField> get() = fieldsList("email")
	val name: FieldsList<PersonPropertiesField> get() = fieldsList("name")
}

