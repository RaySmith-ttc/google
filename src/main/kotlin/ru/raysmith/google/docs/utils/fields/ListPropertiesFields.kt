package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ListPropertiesField : Field

object ListPropertiesFields {
    val ALL: FieldsList<ListPropertiesField> = fieldsList("*")
	val nestingLevels = object : ListPropertiesFieldNestingLevel("nestingLevels") {}
}

abstract class ListPropertiesFieldNestingLevel(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val bulletAlignment: FieldsList<ListPropertiesField> get() = fieldsList("${path}/bulletAlignment")
	val glyphFormat: FieldsList<ListPropertiesField> get() = fieldsList("${path}/glyphFormat")
	val glyphSymbol: FieldsList<ListPropertiesField> get() = fieldsList("${path}/glyphSymbol")
	val glyphType: FieldsList<ListPropertiesField> get() = fieldsList("${path}/glyphType")
	val indentFirstLine by lazy { object : ListPropertiesFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : ListPropertiesFieldDimension("${path}/indentStart") {} }
	val startNumber: FieldsList<ListPropertiesField> get() = fieldsList("${path}/startNumber")
	val textStyle by lazy { object : ListPropertiesFieldTextStyle("${path}/textStyle") {} }
}

abstract class ListPropertiesFieldDimension(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val magnitude: FieldsList<ListPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<ListPropertiesField> get() = fieldsList("${path}/unit")
}

abstract class ListPropertiesFieldTextStyle(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val backgroundColor by lazy { object : ListPropertiesFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<ListPropertiesField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<ListPropertiesField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : ListPropertiesFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : ListPropertiesFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<ListPropertiesField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ListPropertiesFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<ListPropertiesField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<ListPropertiesField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ListPropertiesField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : ListPropertiesFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class ListPropertiesFieldOptionalColor(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val color by lazy { object : ListPropertiesFieldColor("${path}/color") {} }
}

abstract class ListPropertiesFieldLink(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val bookmark by lazy { object : ListPropertiesFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<ListPropertiesField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : ListPropertiesFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<ListPropertiesField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<ListPropertiesField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<ListPropertiesField> get() = fieldsList("${path}/url")
}

abstract class ListPropertiesFieldWeightedFontFamily(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val fontFamily: FieldsList<ListPropertiesField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<ListPropertiesField> get() = fieldsList("${path}/weight")
}

abstract class ListPropertiesFieldColor(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val rgbColor by lazy { object : ListPropertiesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ListPropertiesFieldBookmarkLink(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val id: FieldsList<ListPropertiesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ListPropertiesField> get() = fieldsList("${path}/tabId")
}

abstract class ListPropertiesFieldHeadingLink(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val id: FieldsList<ListPropertiesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ListPropertiesField> get() = fieldsList("${path}/tabId")
}

abstract class ListPropertiesFieldRgbColor(private val path: String) : FieldsList<ListPropertiesField>(path) {
	val blue: FieldsList<ListPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ListPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<ListPropertiesField> get() = fieldsList("${path}/red")
}

