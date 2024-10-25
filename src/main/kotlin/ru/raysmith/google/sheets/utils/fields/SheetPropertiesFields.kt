package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SheetPropertiesField : Field

object SheetPropertiesFields {
    val ALL: FieldsList<SheetPropertiesField> = fieldsList("*")
	val dataSourceSheetProperties = object : SheetPropertiesFieldDataSourceSheetProperties("dataSourceSheetProperties") {}
	val gridProperties = object : SheetPropertiesFieldGridProperties("gridProperties") {}
	val hidden: FieldsList<SheetPropertiesField> get() = fieldsList("hidden")
	val index: FieldsList<SheetPropertiesField> get() = fieldsList("index")
	val rightToLeft: FieldsList<SheetPropertiesField> get() = fieldsList("rightToLeft")
	val sheetId: FieldsList<SheetPropertiesField> get() = fieldsList("sheetId")
	val sheetType: FieldsList<SheetPropertiesField> get() = fieldsList("sheetType")
	val tabColor = object : SheetPropertiesFieldColor("tabColor") {}
	val tabColorStyle = object : SheetPropertiesFieldColorStyle("tabColorStyle") {}
	val title: FieldsList<SheetPropertiesField> get() = fieldsList("title")
}

abstract class SheetPropertiesFieldDataSourceSheetProperties(private val path: String) : FieldsList<SheetPropertiesField>(path) {
	val columns by lazy { object : SheetPropertiesFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : SheetPropertiesFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/dataSourceId")
}

abstract class SheetPropertiesFieldGridProperties(private val path: String) : FieldsList<SheetPropertiesField>(path) {
	val columnCount: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class SheetPropertiesFieldColor(private val path: String) : FieldsList<SheetPropertiesField>(path) {
	val alpha: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/red")
}

abstract class SheetPropertiesFieldColorStyle(private val path: String) : FieldsList<SheetPropertiesField>(path) {
	val rgbColor by lazy { object : SheetPropertiesFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/themeColor")
}

abstract class SheetPropertiesFieldDataSourceColumn(private val path: String) : FieldsList<SheetPropertiesField>(path) {
	val formula: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : SheetPropertiesFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class SheetPropertiesFieldDataExecutionStatus(private val path: String) : FieldsList<SheetPropertiesField>(path) {
	val errorCode: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/state")
}

abstract class SheetPropertiesFieldDataSourceColumnReference(private val path: String) : FieldsList<SheetPropertiesField>(path) {
	val name: FieldsList<SheetPropertiesField> get() = fieldsList("${path}/name")
}

