package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SlicerField : Field

object SlicerFields {
    val ALL: FieldsList<SlicerField> = fieldsList("*")
	val position = object : SlicerFieldEmbeddedObjectPosition("position") {}
	val slicerId: FieldsList<SlicerField> get() = fieldsList("slicerId")
	val spec = object : SlicerFieldSlicerSpec("spec") {}
}

abstract class SlicerFieldEmbeddedObjectPosition(private val path: String) : FieldsList<SlicerField>(path) {
	val newSheet: FieldsList<SlicerField> get() = fieldsList("${path}/newSheet")
	val overlayPosition by lazy { object : SlicerFieldOverlayPosition("${path}/overlayPosition") {} }
	val sheetId: FieldsList<SlicerField> get() = fieldsList("${path}/sheetId")
}

abstract class SlicerFieldSlicerSpec(private val path: String) : FieldsList<SlicerField>(path) {
	val applyToPivotTables: FieldsList<SlicerField> get() = fieldsList("${path}/applyToPivotTables")
	val backgroundColor by lazy { object : SlicerFieldColor("${path}/backgroundColor") {} }
	val backgroundColorStyle by lazy { object : SlicerFieldColorStyle("${path}/backgroundColorStyle") {} }
	val columnIndex: FieldsList<SlicerField> get() = fieldsList("${path}/columnIndex")
	val dataRange by lazy { object : SlicerFieldGridRange("${path}/dataRange") {} }
	val filterCriteria by lazy { object : SlicerFieldFilterCriteria("${path}/filterCriteria") {} }
	val horizontalAlignment: FieldsList<SlicerField> get() = fieldsList("${path}/horizontalAlignment")
	val textFormat by lazy { object : SlicerFieldTextFormat("${path}/textFormat") {} }
	val title: FieldsList<SlicerField> get() = fieldsList("${path}/title")
}

abstract class SlicerFieldOverlayPosition(private val path: String) : FieldsList<SlicerField>(path) {
	val anchorCell by lazy { object : SlicerFieldGridCoordinate("${path}/anchorCell") {} }
	val heightPixels: FieldsList<SlicerField> get() = fieldsList("${path}/heightPixels")
	val offsetXPixels: FieldsList<SlicerField> get() = fieldsList("${path}/offsetXPixels")
	val offsetYPixels: FieldsList<SlicerField> get() = fieldsList("${path}/offsetYPixels")
	val widthPixels: FieldsList<SlicerField> get() = fieldsList("${path}/widthPixels")
}

abstract class SlicerFieldColor(private val path: String) : FieldsList<SlicerField>(path) {
	val alpha: FieldsList<SlicerField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SlicerField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SlicerField> get() = fieldsList("${path}/green")
	val red: FieldsList<SlicerField> get() = fieldsList("${path}/red")
}

abstract class SlicerFieldColorStyle(private val path: String) : FieldsList<SlicerField>(path) {
	val rgbColor by lazy { object : SlicerFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SlicerField> get() = fieldsList("${path}/themeColor")
}

abstract class SlicerFieldGridRange(private val path: String) : FieldsList<SlicerField>(path) {
	val endColumnIndex: FieldsList<SlicerField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SlicerField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SlicerField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SlicerField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SlicerField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SlicerFieldFilterCriteria(private val path: String) : FieldsList<SlicerField>(path) {
	val condition by lazy { object : SlicerFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<SlicerField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : SlicerFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : SlicerFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : SlicerFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : SlicerFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class SlicerFieldTextFormat(private val path: String) : FieldsList<SlicerField>(path) {
	val bold: FieldsList<SlicerField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<SlicerField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<SlicerField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : SlicerFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SlicerFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<SlicerField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SlicerFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<SlicerField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SlicerField> get() = fieldsList("${path}/underline")
}

abstract class SlicerFieldGridCoordinate(private val path: String) : FieldsList<SlicerField>(path) {
	val columnIndex: FieldsList<SlicerField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<SlicerField> get() = fieldsList("${path}/rowIndex")
	val sheetId: FieldsList<SlicerField> get() = fieldsList("${path}/sheetId")
}

abstract class SlicerFieldBooleanCondition(private val path: String) : FieldsList<SlicerField>(path) {
	val type: FieldsList<SlicerField> get() = fieldsList("${path}/type")
	val values by lazy { object : SlicerFieldConditionValue("${path}/values") {} }
}

abstract class SlicerFieldLink(private val path: String) : FieldsList<SlicerField>(path) {
	val uri: FieldsList<SlicerField> get() = fieldsList("${path}/uri")
}

abstract class SlicerFieldConditionValue(private val path: String) : FieldsList<SlicerField>(path) {
	val relativeDate: FieldsList<SlicerField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<SlicerField> get() = fieldsList("${path}/userEnteredValue")
}

