package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SlicerSpecField : Field

object SlicerSpecFields {
    val ALL: FieldsList<SlicerSpecField> = fieldsList("*")
	val applyToPivotTables: FieldsList<SlicerSpecField> get() = fieldsList("applyToPivotTables")
	val backgroundColor = object : SlicerSpecFieldColor("backgroundColor") {}
	val backgroundColorStyle = object : SlicerSpecFieldColorStyle("backgroundColorStyle") {}
	val columnIndex: FieldsList<SlicerSpecField> get() = fieldsList("columnIndex")
	val dataRange = object : SlicerSpecFieldGridRange("dataRange") {}
	val filterCriteria = object : SlicerSpecFieldFilterCriteria("filterCriteria") {}
	val horizontalAlignment: FieldsList<SlicerSpecField> get() = fieldsList("horizontalAlignment")
	val textFormat = object : SlicerSpecFieldTextFormat("textFormat") {}
	val title: FieldsList<SlicerSpecField> get() = fieldsList("title")
}

abstract class SlicerSpecFieldColor(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val alpha: FieldsList<SlicerSpecField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SlicerSpecField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SlicerSpecField> get() = fieldsList("${path}/green")
	val red: FieldsList<SlicerSpecField> get() = fieldsList("${path}/red")
}

abstract class SlicerSpecFieldColorStyle(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val rgbColor by lazy { object : SlicerSpecFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SlicerSpecField> get() = fieldsList("${path}/themeColor")
}

abstract class SlicerSpecFieldGridRange(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val endColumnIndex: FieldsList<SlicerSpecField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SlicerSpecField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SlicerSpecField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SlicerSpecField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SlicerSpecField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SlicerSpecFieldFilterCriteria(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val condition by lazy { object : SlicerSpecFieldBooleanCondition("${path}/condition") {} }
	val hiddenValues: FieldsList<SlicerSpecField> get() = fieldsList("${path}/hiddenValues")
	val visibleBackgroundColor by lazy { object : SlicerSpecFieldColor("${path}/visibleBackgroundColor") {} }
	val visibleBackgroundColorStyle by lazy { object : SlicerSpecFieldColorStyle("${path}/visibleBackgroundColorStyle") {} }
	val visibleForegroundColor by lazy { object : SlicerSpecFieldColor("${path}/visibleForegroundColor") {} }
	val visibleForegroundColorStyle by lazy { object : SlicerSpecFieldColorStyle("${path}/visibleForegroundColorStyle") {} }
}

abstract class SlicerSpecFieldTextFormat(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val bold: FieldsList<SlicerSpecField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<SlicerSpecField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<SlicerSpecField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : SlicerSpecFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : SlicerSpecFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<SlicerSpecField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SlicerSpecFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<SlicerSpecField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SlicerSpecField> get() = fieldsList("${path}/underline")
}

abstract class SlicerSpecFieldBooleanCondition(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val type: FieldsList<SlicerSpecField> get() = fieldsList("${path}/type")
	val values by lazy { object : SlicerSpecFieldConditionValue("${path}/values") {} }
}

abstract class SlicerSpecFieldLink(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val uri: FieldsList<SlicerSpecField> get() = fieldsList("${path}/uri")
}

abstract class SlicerSpecFieldConditionValue(private val path: String) : FieldsList<SlicerSpecField>(path) {
	val relativeDate: FieldsList<SlicerSpecField> get() = fieldsList("${path}/relativeDate")
	val userEnteredValue: FieldsList<SlicerSpecField> get() = fieldsList("${path}/userEnteredValue")
}

