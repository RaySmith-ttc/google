package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface FilterActionField : Field

object FilterActionFields {
    val ALL: FieldsList<FilterActionField> = fieldsList("*")
	val addLabelIds: FieldsList<FilterActionField> get() = fieldsList("addLabelIds")
	val forward: FieldsList<FilterActionField> get() = fieldsList("forward")
	val removeLabelIds: FieldsList<FilterActionField> get() = fieldsList("removeLabelIds")
}

