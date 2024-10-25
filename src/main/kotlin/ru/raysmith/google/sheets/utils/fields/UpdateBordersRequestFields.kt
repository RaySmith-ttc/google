package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateBordersRequestField : Field

object UpdateBordersRequestFields {
    val ALL: FieldsList<UpdateBordersRequestField> = fieldsList("*")
	val bottom = object : UpdateBordersRequestFieldBorder("bottom") {}
	val innerHorizontal = object : UpdateBordersRequestFieldBorder("innerHorizontal") {}
	val innerVertical = object : UpdateBordersRequestFieldBorder("innerVertical") {}
	val left = object : UpdateBordersRequestFieldBorder("left") {}
	val range = object : UpdateBordersRequestFieldGridRange("range") {}
	val right = object : UpdateBordersRequestFieldBorder("right") {}
	val top = object : UpdateBordersRequestFieldBorder("top") {}
}

abstract class UpdateBordersRequestFieldBorder(private val path: String) : FieldsList<UpdateBordersRequestField>(path) {
	val color by lazy { object : UpdateBordersRequestFieldColor("${path}/color") {} }
	val colorStyle by lazy { object : UpdateBordersRequestFieldColorStyle("${path}/colorStyle") {} }
	val style: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/style")
	val width: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/width")
}

abstract class UpdateBordersRequestFieldGridRange(private val path: String) : FieldsList<UpdateBordersRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateBordersRequestFieldColor(private val path: String) : FieldsList<UpdateBordersRequestField>(path) {
	val alpha: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateBordersRequestFieldColorStyle(private val path: String) : FieldsList<UpdateBordersRequestField>(path) {
	val rgbColor by lazy { object : UpdateBordersRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateBordersRequestField> get() = fieldsList("${path}/themeColor")
}

