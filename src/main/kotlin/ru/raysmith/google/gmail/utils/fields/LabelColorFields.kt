package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LabelColorField : Field

object LabelColorFields {
    val ALL: FieldsList<LabelColorField> = fieldsList("*")
	val backgroundColor: FieldsList<LabelColorField> get() = fieldsList("backgroundColor")
	val textColor: FieldsList<LabelColorField> get() = fieldsList("textColor")
}

