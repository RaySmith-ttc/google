package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DocumentStyleField : Field

object DocumentStyleFields {
    val ALL: FieldsList<DocumentStyleField> = fieldsList("*")
	val background = object : DocumentStyleFieldBackground("background") {}
	val defaultFooterId: FieldsList<DocumentStyleField> get() = fieldsList("defaultFooterId")
	val defaultHeaderId: FieldsList<DocumentStyleField> get() = fieldsList("defaultHeaderId")
	val evenPageFooterId: FieldsList<DocumentStyleField> get() = fieldsList("evenPageFooterId")
	val evenPageHeaderId: FieldsList<DocumentStyleField> get() = fieldsList("evenPageHeaderId")
	val firstPageFooterId: FieldsList<DocumentStyleField> get() = fieldsList("firstPageFooterId")
	val firstPageHeaderId: FieldsList<DocumentStyleField> get() = fieldsList("firstPageHeaderId")
	val flipPageOrientation: FieldsList<DocumentStyleField> get() = fieldsList("flipPageOrientation")
	val marginBottom = object : DocumentStyleFieldDimension("marginBottom") {}
	val marginFooter = object : DocumentStyleFieldDimension("marginFooter") {}
	val marginHeader = object : DocumentStyleFieldDimension("marginHeader") {}
	val marginLeft = object : DocumentStyleFieldDimension("marginLeft") {}
	val marginRight = object : DocumentStyleFieldDimension("marginRight") {}
	val marginTop = object : DocumentStyleFieldDimension("marginTop") {}
	val pageNumberStart: FieldsList<DocumentStyleField> get() = fieldsList("pageNumberStart")
	val pageSize = object : DocumentStyleFieldSize("pageSize") {}
	val useCustomHeaderFooterMargins: FieldsList<DocumentStyleField> get() = fieldsList("useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<DocumentStyleField> get() = fieldsList("useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<DocumentStyleField> get() = fieldsList("useFirstPageHeaderFooter")
}

abstract class DocumentStyleFieldBackground(private val path: String) : FieldsList<DocumentStyleField>(path) {
	val color by lazy { object : DocumentStyleFieldOptionalColor("${path}/color") {} }
}

abstract class DocumentStyleFieldDimension(private val path: String) : FieldsList<DocumentStyleField>(path) {
	val magnitude: FieldsList<DocumentStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<DocumentStyleField> get() = fieldsList("${path}/unit")
}

abstract class DocumentStyleFieldSize(private val path: String) : FieldsList<DocumentStyleField>(path) {
	val height by lazy { object : DocumentStyleFieldDimension("${path}/height") {} }
	val width by lazy { object : DocumentStyleFieldDimension("${path}/width") {} }
}

abstract class DocumentStyleFieldOptionalColor(private val path: String) : FieldsList<DocumentStyleField>(path) {
	val color by lazy { object : DocumentStyleFieldColor("${path}/color") {} }
}

abstract class DocumentStyleFieldColor(private val path: String) : FieldsList<DocumentStyleField>(path) {
	val rgbColor by lazy { object : DocumentStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class DocumentStyleFieldRgbColor(private val path: String) : FieldsList<DocumentStyleField>(path) {
	val blue: FieldsList<DocumentStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DocumentStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<DocumentStyleField> get() = fieldsList("${path}/red")
}

