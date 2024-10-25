package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddSlicerRequestField : Field

object AddSlicerRequestFields {
    val ALL: FieldsList<AddSlicerRequestField> = fieldsList("*")
	val slicer = object : AddSlicerRequestFieldSlicer("slicer") {}
}

abstract class AddSlicerRequestFieldSlicer(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val position by lazy { object : AddSlicerRequestFieldEmbeddedObjectPosition("${path}/position") {} }
	val slicerId: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/slicerId")
	val spec by lazy { object : AddSlicerRequestFieldSlicerSpec("${path}/spec") {} }
}

abstract class AddSlicerRequestFieldEmbeddedObjectPosition(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val newSheet: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : AddSlicerRequestFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class AddSlicerRequestFieldSlicerSpec(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val applyToPivotTables: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : AddSlicerRequestFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : AddSlicerRequestFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : AddSlicerRequestFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : AddSlicerRequestFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : AddSlicerRequestFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/title")
}

abstract class AddSlicerRequestFieldOverlayPosition(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val anchorCell by lazy { object : AddSlicerRequestFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/widthPixels")
}

abstract class AddSlicerRequestFieldColor(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val alpha: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/red")
}

abstract class AddSlicerRequestFieldColorStyle(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val rgbColor by lazy { object : AddSlicerRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class AddSlicerRequestFieldGridRange(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val endColumnIndex: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class AddSlicerRequestFieldFilterCriteria(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val condition by lazy { object : AddSlicerRequestFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : AddSlicerRequestFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : AddSlicerRequestFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : AddSlicerRequestFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : AddSlicerRequestFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class AddSlicerRequestFieldTextFormat(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val bold: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : AddSlicerRequestFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : AddSlicerRequestFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : AddSlicerRequestFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/underline")
}

abstract class AddSlicerRequestFieldGridCoordinate(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val columnIndex: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class AddSlicerRequestFieldBooleanCondition(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val type: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/type")
	val values by lazy { object : AddSlicerRequestFieldConditionValue("${path}/values") {} }
}

abstract class AddSlicerRequestFieldLink(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val uri: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/uri")
}

abstract class AddSlicerRequestFieldConditionValue(private val path: String) : FieldsList<AddSlicerRequestField>(path) {
	val relativeDate: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<AddSlicerRequestField> get() = fieldsList("${path}/userEnteredValue")
}

