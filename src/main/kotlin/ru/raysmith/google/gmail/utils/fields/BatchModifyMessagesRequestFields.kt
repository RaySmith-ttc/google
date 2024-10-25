package ru.raysmith.google.gmail.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchModifyMessagesRequestField : Field

object BatchModifyMessagesRequestFields {
    val ALL: FieldsList<BatchModifyMessagesRequestField> = fieldsList("*")
	val addLabelIds: FieldsList<BatchModifyMessagesRequestField> get() = fieldsList("addLabelIds")
	val ids: FieldsList<BatchModifyMessagesRequestField> get() = fieldsList("ids")
	val removeLabelIds: FieldsList<BatchModifyMessagesRequestField> get() = fieldsList("removeLabelIds")
}

