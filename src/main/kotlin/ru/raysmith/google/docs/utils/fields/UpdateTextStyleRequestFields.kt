package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateTextStyleRequestField : Field

object UpdateTextStyleRequestFields {
    val ALL: FieldsList<UpdateTextStyleRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("fields")
	val range = object : UpdateTextStyleRequestFieldRange("range") {}
	val textStyle = object : UpdateTextStyleRequestFieldTextStyle("textStyle") {}
}

abstract class UpdateTextStyleRequestFieldRange(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val endIndex: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateTextStyleRequestFieldTextStyle(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val backgroundColor by lazy { object : UpdateTextStyleRequestFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : UpdateTextStyleRequestFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : UpdateTextStyleRequestFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : UpdateTextStyleRequestFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : UpdateTextStyleRequestFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class UpdateTextStyleRequestFieldOptionalColor(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val color by lazy { object : UpdateTextStyleRequestFieldColor("${path}/color") {} }
}

abstract class UpdateTextStyleRequestFieldDimension(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val magnitude: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/unit")
}

abstract class UpdateTextStyleRequestFieldLink(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val bookmark by lazy { object : UpdateTextStyleRequestFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : UpdateTextStyleRequestFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/url")
}

abstract class UpdateTextStyleRequestFieldWeightedFontFamily(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val fontFamily: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/weight")
}

abstract class UpdateTextStyleRequestFieldColor(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val rgbColor by lazy { object : UpdateTextStyleRequestFieldRgbColor("${path}/rgbColor") {} }
}

abstract class UpdateTextStyleRequestFieldBookmarkLink(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val id: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateTextStyleRequestFieldHeadingLink(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val id: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateTextStyleRequestFieldRgbColor(private val path: String) : FieldsList<UpdateTextStyleRequestField>(path) {
	val blue: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateTextStyleRequestField> get() = fieldsList("${path}/red")
}

