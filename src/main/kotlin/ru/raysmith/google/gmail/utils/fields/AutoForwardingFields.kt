package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AutoForwardingField : Field

object AutoForwardingFields {
    val ALL: FieldsList<AutoForwardingField> = fieldsList("*")
	val disposition: FieldsList<AutoForwardingField> get() = fieldsList("disposition")
	val emailAddress: FieldsList<AutoForwardingField> get() = fieldsList("emailAddress")
	val enabled: FieldsList<AutoForwardingField> get() = fieldsList("enabled")
}

