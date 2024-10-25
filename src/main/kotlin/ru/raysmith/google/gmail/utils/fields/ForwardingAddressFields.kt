package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ForwardingAddressField : Field

object ForwardingAddressFields {
    val ALL: FieldsList<ForwardingAddressField> = fieldsList("*")
	val forwardingEmail: FieldsList<ForwardingAddressField> get() = fieldsList("forwardingEmail")
	val verificationStatus: FieldsList<ForwardingAddressField> get() = fieldsList("verificationStatus")
}

