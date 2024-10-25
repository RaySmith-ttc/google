package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ExtendedValueField : Field

object ExtendedValueFields {
    val ALL: FieldsList<ExtendedValueField> = fieldsList("*")
	val boolValue: FieldsList<ExtendedValueField> get() = fieldsList("boolValue")
	val errorValue = object : ExtendedValueFieldErrorValue("errorValue") {}
	val formulaValue: FieldsList<ExtendedValueField> get() = fieldsList("formulaValue")
	val numberValue: FieldsList<ExtendedValueField> get() = fieldsList("numberValue")
	val stringValue: FieldsList<ExtendedValueField> get() = fieldsList("stringValue")
}

abstract class ExtendedValueFieldErrorValue(private val path: String) : FieldsList<ExtendedValueField>(path) {
	val message: FieldsList<ExtendedValueField> get() = fieldsList("${path}/message")
	val type: FieldsList<ExtendedValueField> get() = fieldsList("${path}/type")
}

