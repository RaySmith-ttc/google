package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateDocumentStyleRequestField : Field

object UpdateDocumentStyleRequestFields {
    val ALL: FieldsList<UpdateDocumentStyleRequestField> = fieldsList("*")
	val documentStyle = object : UpdateDocumentStyleRequestFieldDocumentStyle("documentStyle") {}
	val fields: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("fields")
	val tabId: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("tabId")
}

abstract class UpdateDocumentStyleRequestFieldDocumentStyle(private val path: String) : FieldsList<UpdateDocumentStyleRequestField>(path) {
	val background by lazy { object : UpdateDocumentStyleRequestFieldBackground("${path}/background") {} }
	val defaultFooterId: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/pageNumberStart")
	val pageSize by lazy { object : UpdateDocumentStyleRequestFieldSize("${path}/pageSize") {} }
	val useCustomHeaderFooterMargins: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class UpdateDocumentStyleRequestFieldBackground(private val path: String) : FieldsList<UpdateDocumentStyleRequestField>(path) {
	val color by lazy { object : UpdateDocumentStyleRequestFieldOptionalColor("${path}/color") {} }
}

abstract class UpdateDocumentStyleRequestFieldDimension(private val path: String) : FieldsList<UpdateDocumentStyleRequestField>(path) {
	val magnitude: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/unit")
}

abstract class UpdateDocumentStyleRequestFieldSize(private val path: String) : FieldsList<UpdateDocumentStyleRequestField>(path) {
	val height by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/height") {} }
	val width by lazy { object : UpdateDocumentStyleRequestFieldDimension("${path}/width") {} }
}

abstract class UpdateDocumentStyleRequestFieldOptionalColor(private val path: String) : FieldsList<UpdateDocumentStyleRequestField>(path) {
	val color by lazy { object : UpdateDocumentStyleRequestFieldColor("${path}/color") {} }
}

abstract class UpdateDocumentStyleRequestFieldColor(private val path: String) : FieldsList<UpdateDocumentStyleRequestField>(path) {
	val rgbColor by lazy { object : UpdateDocumentStyleRequestFieldRgbColor("${path}/rgbColor") {} }
}

abstract class UpdateDocumentStyleRequestFieldRgbColor(private val path: String) : FieldsList<UpdateDocumentStyleRequestField>(path) {
	val blue: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateDocumentStyleRequestField> get() = fieldsList("${path}/red")
}

