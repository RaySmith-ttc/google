package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BulletField : Field

object BulletFields {
    val ALL: FieldsList<BulletField> = fieldsList("*")
	val listId: FieldsList<BulletField> get() = fieldsList("listId")
	val nestingLevel: FieldsList<BulletField> get() = fieldsList("nestingLevel")
	val textStyle = object : BulletFieldTextStyle("textStyle") {}
}

abstract class BulletFieldTextStyle(private val path: String) : FieldsList<BulletField>(path) {
	val backgroundColor by lazy { object : BulletFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<BulletField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<BulletField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : BulletFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : BulletFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<BulletField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BulletFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<BulletField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<BulletField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BulletField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : BulletFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class BulletFieldOptionalColor(private val path: String) : FieldsList<BulletField>(path) {
	val color by lazy { object : BulletFieldColor("${path}/color") {} }
}

abstract class BulletFieldDimension(private val path: String) : FieldsList<BulletField>(path) {
	val magnitude: FieldsList<BulletField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<BulletField> get() = fieldsList("${path}/unit")
}

abstract class BulletFieldLink(private val path: String) : FieldsList<BulletField>(path) {
	val bookmark by lazy { object : BulletFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<BulletField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : BulletFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<BulletField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<BulletField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<BulletField> get() = fieldsList("${path}/url")
}

abstract class BulletFieldWeightedFontFamily(private val path: String) : FieldsList<BulletField>(path) {
	val fontFamily: FieldsList<BulletField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<BulletField> get() = fieldsList("${path}/weight")
}

abstract class BulletFieldColor(private val path: String) : FieldsList<BulletField>(path) {
	val rgbColor by lazy { object : BulletFieldRgbColor("${path}/rgbColor") {} }
}

abstract class BulletFieldBookmarkLink(private val path: String) : FieldsList<BulletField>(path) {
	val id: FieldsList<BulletField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<BulletField> get() = fieldsList("${path}/tabId")
}

abstract class BulletFieldHeadingLink(private val path: String) : FieldsList<BulletField>(path) {
	val id: FieldsList<BulletField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<BulletField> get() = fieldsList("${path}/tabId")
}

abstract class BulletFieldRgbColor(private val path: String) : FieldsList<BulletField>(path) {
	val blue: FieldsList<BulletField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BulletField> get() = fieldsList("${path}/green")
	val red: FieldsList<BulletField> get() = fieldsList("${path}/red")
}

