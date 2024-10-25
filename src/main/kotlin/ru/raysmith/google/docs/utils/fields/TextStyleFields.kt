package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextStyleField : Field

object TextStyleFields {
    val ALL: FieldsList<TextStyleField> = fieldsList("*")
	val backgroundColor = object : TextStyleFieldOptionalColor("backgroundColor") {}
	val baselineOffset: FieldsList<TextStyleField> get() = fieldsList("baselineOffset")
	val bold: FieldsList<TextStyleField> get() = fieldsList("bold")
	val fontSize = object : TextStyleFieldDimension("fontSize") {}
	val foregroundColor = object : TextStyleFieldOptionalColor("foregroundColor") {}
	val italic: FieldsList<TextStyleField> get() = fieldsList("italic")
	val link = object : TextStyleFieldLink("link") {}
	val smallCaps: FieldsList<TextStyleField> get() = fieldsList("smallCaps")
	val strikethrough: FieldsList<TextStyleField> get() = fieldsList("strikethrough")
	val underline: FieldsList<TextStyleField> get() = fieldsList("underline")
	val weightedFontFamily = object : TextStyleFieldWeightedFontFamily("weightedFontFamily") {}
}

abstract class TextStyleFieldOptionalColor(private val path: String) : FieldsList<TextStyleField>(path) {
	val color by lazy { object : TextStyleFieldColor("${path}/color") {} }
}

abstract class TextStyleFieldDimension(private val path: String) : FieldsList<TextStyleField>(path) {
	val magnitude: FieldsList<TextStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TextStyleField> get() = fieldsList("${path}/unit")
}

abstract class TextStyleFieldLink(private val path: String) : FieldsList<TextStyleField>(path) {
	val bookmark by lazy { object : TextStyleFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<TextStyleField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : TextStyleFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<TextStyleField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<TextStyleField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<TextStyleField> get() = fieldsList("${path}/url")
}

abstract class TextStyleFieldWeightedFontFamily(private val path: String) : FieldsList<TextStyleField>(path) {
	val fontFamily: FieldsList<TextStyleField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<TextStyleField> get() = fieldsList("${path}/weight")
}

abstract class TextStyleFieldColor(private val path: String) : FieldsList<TextStyleField>(path) {
	val rgbColor by lazy { object : TextStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TextStyleFieldBookmarkLink(private val path: String) : FieldsList<TextStyleField>(path) {
	val id: FieldsList<TextStyleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TextStyleField> get() = fieldsList("${path}/tabId")
}

abstract class TextStyleFieldHeadingLink(private val path: String) : FieldsList<TextStyleField>(path) {
	val id: FieldsList<TextStyleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TextStyleField> get() = fieldsList("${path}/tabId")
}

abstract class TextStyleFieldRgbColor(private val path: String) : FieldsList<TextStyleField>(path) {
	val blue: FieldsList<TextStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TextStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<TextStyleField> get() = fieldsList("${path}/red")
}

