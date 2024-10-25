package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListDelegatesResponseField : Field

object ListDelegatesResponseFields {
    val ALL: FieldsList<ListDelegatesResponseField> = fieldsList("*")
	val delegates = object : ListDelegatesResponseFieldDelegate("delegates") {}
}

abstract class ListDelegatesResponseFieldDelegate(private val path: String) : FieldsList<ListDelegatesResponseField>(path) {
	val delegateEmail: FieldsList<ListDelegatesResponseField> get() = fieldsList("${path}/delegateEmail")
	val verificationStatus: FieldsList<ListDelegatesResponseField> get() = fieldsList("${path}/verificationStatus")
}

