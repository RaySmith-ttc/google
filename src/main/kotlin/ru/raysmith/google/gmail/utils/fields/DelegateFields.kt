package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DelegateField : Field

object DelegateFields {
    val ALL: FieldsList<DelegateField> = fieldsList("*")
	val delegateEmail: FieldsList<DelegateField> get() = fieldsList("delegateEmail")
	val verificationStatus: FieldsList<DelegateField> get() = fieldsList("verificationStatus")
}

