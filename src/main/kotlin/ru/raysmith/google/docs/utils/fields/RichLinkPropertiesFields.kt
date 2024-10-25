package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RichLinkPropertiesField : Field

object RichLinkPropertiesFields {
    val ALL: FieldsList<RichLinkPropertiesField> = fieldsList("*")
	val mimeType: FieldsList<RichLinkPropertiesField> get() = fieldsList("mimeType")
	val title: FieldsList<RichLinkPropertiesField> get() = fieldsList("title")
	val uri: FieldsList<RichLinkPropertiesField> get() = fieldsList("uri")
}

