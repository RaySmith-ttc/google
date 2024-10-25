package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface LinkField : Field

object LinkFields {
    val ALL: FieldsList<LinkField> = fieldsList("*")
	val bookmark = object : LinkFieldBookmarkLink("bookmark") {}
	val bookmarkId: FieldsList<LinkField> get() = fieldsList("bookmarkId")
	val heading = object : LinkFieldHeadingLink("heading") {}
	val headingId: FieldsList<LinkField> get() = fieldsList("headingId")
	val tabId: FieldsList<LinkField> get() = fieldsList("tabId")
	val url: FieldsList<LinkField> get() = fieldsList("url")
}

abstract class LinkFieldBookmarkLink(private val path: String) : FieldsList<LinkField>(path) {
	val id: FieldsList<LinkField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<LinkField> get() = fieldsList("${path}/tabId")
}

abstract class LinkFieldHeadingLink(private val path: String) : FieldsList<LinkField>(path) {
	val id: FieldsList<LinkField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<LinkField> get() = fieldsList("${path}/tabId")
}

