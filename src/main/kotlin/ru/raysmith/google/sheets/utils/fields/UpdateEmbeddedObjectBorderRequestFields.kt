package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateEmbeddedObjectBorderRequestField : Field

object UpdateEmbeddedObjectBorderRequestFields {
    val ALL: FieldsList<UpdateEmbeddedObjectBorderRequestField> = fieldsList("*")
	val border = object : UpdateEmbeddedObjectBorderRequestFieldEmbeddedObjectBorder("border") {}
	val fields: FieldsList<UpdateEmbeddedObjectBorderRequestField> get() = fieldsList("fields")
	val objectId: FieldsList<UpdateEmbeddedObjectBorderRequestField> get() = fieldsList("objectId")
}

abstract class UpdateEmbeddedObjectBorderRequestFieldEmbeddedObjectBorder(private val path: String) : FieldsList<UpdateEmbeddedObjectBorderRequestField>(path) {
	val color by lazy { object : UpdateEmbeddedObjectBorderRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateEmbeddedObjectBorderRequestFieldColorStyle("${path}/colorStyle") {} }
}

abstract class UpdateEmbeddedObjectBorderRequestFieldColor(private val path: String) : FieldsList<UpdateEmbeddedObjectBorderRequestField>(path) {
	val alpha: FieldsList<UpdateEmbeddedObjectBorderRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateEmbeddedObjectBorderRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateEmbeddedObjectBorderRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateEmbeddedObjectBorderRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateEmbeddedObjectBorderRequestFieldColorStyle(private val path: String) : FieldsList<UpdateEmbeddedObjectBorderRequestField>(path) {
	val rgbColor by lazy { object : UpdateEmbeddedObjectBorderRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateEmbeddedObjectBorderRequestField> get() = fieldsList("${path}/themeColor")
}

