package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BasicChartAxisField : Field

object BasicChartAxisFields {
    val ALL: FieldsList<BasicChartAxisField> = fieldsList("*")
	val format = object : BasicChartAxisFieldTextFormat("format") {}
	val position: FieldsList<BasicChartAxisField> get() = fieldsList("position")
	val title: FieldsList<BasicChartAxisField> get() = fieldsList("title")
	val titleTextPosition = object : BasicChartAxisFieldTextPosition("titleTextPosition") {}
	val viewWindowOptions = object : BasicChartAxisFieldChartAxisViewWindowOptions("viewWindowOptions") {}
}

abstract class BasicChartAxisFieldTextFormat(private val path: String) : FieldsList<BasicChartAxisField>(path) {
	val bold: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/bold")
	val fontFamily: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/fontFamily")
	val fontSize: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/fontSize")
	val foregroundColor by lazy { object : BasicChartAxisFieldColor("${path}/foregroundColor") {} }
	val foregroundColorStyle by lazy { object : BasicChartAxisFieldColorStyle("${path}/foregroundColorStyle") {} }
	val italic: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BasicChartAxisFieldLink("${path}/link") {} }
	val strikethrough: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/underline")
}

abstract class BasicChartAxisFieldTextPosition(private val path: String) : FieldsList<BasicChartAxisField>(path) {
	val horizontalAlignment: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/horizontalAlignment")
}

abstract class BasicChartAxisFieldChartAxisViewWindowOptions(private val path: String) : FieldsList<BasicChartAxisField>(path) {
	val viewWindowMax: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/viewWindowMax")
	val viewWindowMin: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/viewWindowMin")
	val viewWindowMode: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/viewWindowMode")
}

abstract class BasicChartAxisFieldColor(private val path: String) : FieldsList<BasicChartAxisField>(path) {
	val alpha: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/green")
	val red: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/red")
}

abstract class BasicChartAxisFieldColorStyle(private val path: String) : FieldsList<BasicChartAxisField>(path) {
	val rgbColor by lazy { object : BasicChartAxisFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/themeColor")
}

abstract class BasicChartAxisFieldLink(private val path: String) : FieldsList<BasicChartAxisField>(path) {
	val uri: FieldsList<BasicChartAxisField> get() = fieldsList("${path}/uri")
}

