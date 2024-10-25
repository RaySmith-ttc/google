package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BookmarkLinkField : Field

object BookmarkLinkFields {
    val ALL: FieldsList<BookmarkLinkField> = fieldsList("*")
	val id: FieldsList<BookmarkLinkField> get() = fieldsList("id")
	val tabId: FieldsList<BookmarkLinkField> get() = fieldsList("tabId")
}

