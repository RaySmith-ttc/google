package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LookerDataSourceSpecField : Field

object LookerDataSourceSpecFields {
    val ALL: FieldsList<LookerDataSourceSpecField> = fieldsList("*")
	val explore: FieldsList<LookerDataSourceSpecField> get() = fieldsList("explore")
	val instanceUri: FieldsList<LookerDataSourceSpecField> get() = fieldsList("instanceUri")
	val model: FieldsList<LookerDataSourceSpecField> get() = fieldsList("model")
}

