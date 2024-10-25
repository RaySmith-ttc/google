package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NestingLevelField : Field

object NestingLevelFields {
    val ALL: FieldsList<NestingLevelField> = fieldsList("*")
	val bulletAlignment: FieldsList<NestingLevelField> get() = fieldsList("bulletAlignment")
	val glyphFormat: FieldsList<NestingLevelField> get() = fieldsList("glyphFormat")
	val glyphSymbol: FieldsList<NestingLevelField> get() = fieldsList("glyphSymbol")
	val glyphType: FieldsList<NestingLevelField> get() = fieldsList("glyphType")
	val indentFirstLine = object : NestingLevelFieldDimension("indentFirstLine") {}
	val indentStart = object : NestingLevelFieldDimension("indentStart") {}
	val startNumber: FieldsList<NestingLevelField> get() = fieldsList("startNumber")
	val textStyle = object : NestingLevelFieldTextStyle("textStyle") {}
}

abstract class NestingLevelFieldDimension(private val path: String) : FieldsList<NestingLevelField>(path) {
	val magnitude: FieldsList<NestingLevelField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<NestingLevelField> get() = fieldsList("${path}/unit")
}

abstract class NestingLevelFieldTextStyle(private val path: String) : FieldsList<NestingLevelField>(path) {
	val backgroundColor by lazy { object : NestingLevelFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<NestingLevelField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<NestingLevelField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : NestingLevelFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : NestingLevelFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<NestingLevelField> get() = fieldsList("${path}/italic")
	val link by lazy { object : NestingLevelFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<NestingLevelField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<NestingLevelField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<NestingLevelField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : NestingLevelFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class NestingLevelFieldOptionalColor(private val path: String) : FieldsList<NestingLevelField>(path) {
	val color by lazy { object : NestingLevelFieldColor("${path}/color") {} }
}

abstract class NestingLevelFieldLink(private val path: String) : FieldsList<NestingLevelField>(path) {
	val bookmark by lazy { object : NestingLevelFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<NestingLevelField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : NestingLevelFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<NestingLevelField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<NestingLevelField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<NestingLevelField> get() = fieldsList("${path}/url")
}

abstract class NestingLevelFieldWeightedFontFamily(private val path: String) : FieldsList<NestingLevelField>(path) {
	val fontFamily: FieldsList<NestingLevelField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<NestingLevelField> get() = fieldsList("${path}/weight")
}

abstract class NestingLevelFieldColor(private val path: String) : FieldsList<NestingLevelField>(path) {
	val rgbColor by lazy { object : NestingLevelFieldRgbColor("${path}/rgbColor") {} }
}

abstract class NestingLevelFieldBookmarkLink(private val path: String) : FieldsList<NestingLevelField>(path) {
	val id: FieldsList<NestingLevelField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<NestingLevelField> get() = fieldsList("${path}/tabId")
}

abstract class NestingLevelFieldHeadingLink(private val path: String) : FieldsList<NestingLevelField>(path) {
	val id: FieldsList<NestingLevelField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<NestingLevelField> get() = fieldsList("${path}/tabId")
}

abstract class NestingLevelFieldRgbColor(private val path: String) : FieldsList<NestingLevelField>(path) {
	val blue: FieldsList<NestingLevelField> get() = fieldsList("${path}/blue")
	val green: FieldsList<NestingLevelField> get() = fieldsList("${path}/green")
	val red: FieldsList<NestingLevelField> get() = fieldsList("${path}/red")
}

