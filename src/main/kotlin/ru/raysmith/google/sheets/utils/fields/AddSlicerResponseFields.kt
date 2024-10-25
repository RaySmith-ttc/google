package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddSlicerResponseField : Field

object AddSlicerResponseFields {
    val ALL: FieldsList<AddSlicerResponseField> = fieldsList("*")
	val slicer = object : AddSlicerResponseFieldSlicer("slicer") {}
}

abstract class AddSlicerResponseFieldSlicer(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val position by lazy { object : AddSlicerResponseFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : AddSlicerResponseFieldSlicerSpec("${path}/spec") {} }
}

abstract class AddSlicerResponseFieldEmbeddedObjectPosition(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val newSheet: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : AddSlicerResponseFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class AddSlicerResponseFieldSlicerSpec(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val applyToPivotTables: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : AddSlicerResponseFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddSlicerResponseFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : AddSlicerResponseFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : AddSlicerResponseFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : AddSlicerResponseFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/title")
}

abstract class AddSlicerResponseFieldOverlayPosition(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val anchorCell by lazy { object : AddSlicerResponseFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/widthPixels")
}

abstract class AddSlicerResponseFieldColor(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val alpha: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/red")
}

abstract class AddSlicerResponseFieldColorStyle(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val rgbColor by lazy { object : AddSlicerResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class AddSlicerResponseFieldGridRange(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val endColumnIndex: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddSlicerResponseFieldFilterCriteria(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val condition by lazy { object : AddSlicerResponseFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : AddSlicerResponseFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : AddSlicerResponseFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : AddSlicerResponseFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : AddSlicerResponseFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class AddSlicerResponseFieldTextFormat(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val bold: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : AddSlicerResponseFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddSlicerResponseFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/italic")
	val link by lazy { object : AddSlicerResponseFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/underline")
}

abstract class AddSlicerResponseFieldGridCoordinate(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val columnIndex: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/sheetId")
}

abstract class AddSlicerResponseFieldBooleanCondition(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val type: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/type")
	val values by lazy { object : AddSlicerResponseFieldConditionValue("${path}/values") {} }
}

abstract class AddSlicerResponseFieldLink(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val uri: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/uri")
}

abstract class AddSlicerResponseFieldConditionValue(private val path: String) : FieldsList<AddSlicerResponseField>(path) {
	val relativeDate: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AddSlicerResponseField> get() = fieldsList("${path}/userEnteredValue")
}

