package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ModifyThreadRequestField : Field

object ModifyThreadRequestFields {
    val ALL: FieldsList<ModifyThreadRequestField> = fieldsList("*")
	val addLabelIds: FieldsList<ModifyThreadRequestField> get() = fieldsList("addLabelIds")
	val removeLabelIds: FieldsList<ModifyThreadRequestField> get() = fieldsList("removeLabelIds")
}

