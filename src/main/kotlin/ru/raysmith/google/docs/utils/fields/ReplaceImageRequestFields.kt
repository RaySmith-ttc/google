package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ReplaceImageRequestField : Field

object ReplaceImageRequestFields {
    val ALL: FieldsList<ReplaceImageRequestField> = fieldsList("*")
	val imageObjectId: FieldsList<ReplaceImageRequestField> get() = fieldsList("imageObjectId")
	val imageReplaceMethod: FieldsList<ReplaceImageRequestField> get() = fieldsList("imageReplaceMethod")
	val tabId: FieldsList<ReplaceImageRequestField> get() = fieldsList("tabId")
	val uri: FieldsList<ReplaceImageRequestField> get() = fieldsList("uri")
}

