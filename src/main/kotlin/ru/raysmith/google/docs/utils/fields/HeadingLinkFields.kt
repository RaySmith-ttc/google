package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HeadingLinkField : Field

object HeadingLinkFields {
    val ALL: FieldsList<HeadingLinkField> = fieldsList("*")
	val id: FieldsList<HeadingLinkField> get() = fieldsList("id")
	val tabId: FieldsList<HeadingLinkField> get() = fieldsList("tabId")
}

