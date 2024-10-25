package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddSheetResponseField : Field

object AddSheetResponseFields {
    val ALL: FieldsList<AddSheetResponseField> = fieldsList("*")
	val properties = object : AddSheetResponseFieldSheetProperties("properties") {}
}

abstract class AddSheetResponseFieldSheetProperties(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val dataSourceSheetProperties by lazy { object : AddSheetResponseFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : AddSheetResponseFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : AddSheetResponseFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : AddSheetResponseFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/title")
}

abstract class AddSheetResponseFieldDataSourceSheetProperties(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val columns by lazy { object : AddSheetResponseFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : AddSheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class AddSheetResponseFieldGridProperties(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val columnCount: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class AddSheetResponseFieldColor(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val alpha: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/red")
}

abstract class AddSheetResponseFieldColorStyle(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val rgbColor by lazy { object : AddSheetResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class AddSheetResponseFieldDataSourceColumn(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val formula: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : AddSheetResponseFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class AddSheetResponseFieldDataExecutionStatus(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val errorCode: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/state")
}

abstract class AddSheetResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<AddSheetResponseField>(path) {
	val name: FieldsList<AddSheetResponseField> get() = fieldsList("${path}/name")
}

