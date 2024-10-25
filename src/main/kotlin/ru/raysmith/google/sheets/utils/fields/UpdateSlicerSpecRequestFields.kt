package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateSlicerSpecRequestField : Field

object UpdateSlicerSpecRequestFields {
    val ALL: FieldsList<UpdateSlicerSpecRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("fields")
	val slicerId: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("slicerId")
	val spec = object : UpdateSlicerSpecRequestFieldSlicerSpec("spec") {}
}

abstract class UpdateSlicerSpecRequestFieldSlicerSpec(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val applyToPivotTables: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : UpdateSlicerSpecRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : UpdateSlicerSpecRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : UpdateSlicerSpecRequestFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : UpdateSlicerSpecRequestFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : UpdateSlicerSpecRequestFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/title")
}

abstract class UpdateSlicerSpecRequestFieldColor(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val alpha: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateSlicerSpecRequestFieldColorStyle(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val rgbColor by lazy { object : UpdateSlicerSpecRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateSlicerSpecRequestFieldGridRange(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateSlicerSpecRequestFieldFilterCriteria(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val condition by lazy { object : UpdateSlicerSpecRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : UpdateSlicerSpecRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : UpdateSlicerSpecRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : UpdateSlicerSpecRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : UpdateSlicerSpecRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class UpdateSlicerSpecRequestFieldTextFormat(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val bold: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : UpdateSlicerSpecRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : UpdateSlicerSpecRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : UpdateSlicerSpecRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/underline")
}

abstract class UpdateSlicerSpecRequestFieldBooleanCondition(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val type: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : UpdateSlicerSpecRequestFieldConditionValue("${path}/values") {} }
}

abstract class UpdateSlicerSpecRequestFieldLink(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val uri: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/uri")
}

abstract class UpdateSlicerSpecRequestFieldConditionValue(private val path: String) : FieldsList<UpdateSlicerSpecRequestField>(path) {
	val relativeDate: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<UpdateSlicerSpecRequestField> get() = fieldsList("${path}/userEnteredValue")
}

