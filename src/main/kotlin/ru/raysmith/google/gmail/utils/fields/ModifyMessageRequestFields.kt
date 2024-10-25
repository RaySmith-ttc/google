package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ModifyMessageRequestField : Field

object ModifyMessageRequestFields {
    val ALL: FieldsList<ModifyMessageRequestField> = fieldsList("*")
	val addLabelIds: FieldsList<ModifyMessageRequestField> get() = fieldsList("addLabelIds")
	val removeLabelIds: FieldsList<ModifyMessageRequestField> get() = fieldsList("removeLabelIds")
}

