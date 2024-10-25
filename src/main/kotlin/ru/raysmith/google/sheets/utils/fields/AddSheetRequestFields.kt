package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AddSheetRequestField : Field

object AddSheetRequestFields {
    val ALL: FieldsList<AddSheetRequestField> = fieldsList("*")
	val properties = object : AddSheetRequestFieldSheetProperties("properties") {}
}

abstract class AddSheetRequestFieldSheetProperties(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val dataSourceSheetProperties by lazy { object : AddSheetRequestFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : AddSheetRequestFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : AddSheetRequestFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : AddSheetRequestFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/title")
}

abstract class AddSheetRequestFieldDataSourceSheetProperties(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val columns by lazy { object : AddSheetRequestFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : AddSheetRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class AddSheetRequestFieldGridProperties(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val columnCount: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class AddSheetRequestFieldColor(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val alpha: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/red")
}

abstract class AddSheetRequestFieldColorStyle(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val rgbColor by lazy { object : AddSheetRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class AddSheetRequestFieldDataSourceColumn(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val formula: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : AddSheetRequestFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class AddSheetRequestFieldDataExecutionStatus(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val errorCode: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/state")
}

abstract class AddSheetRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<AddSheetRequestField>(path) {
	val name: FieldsList<AddSheetRequestField> get() = fieldsList("${path}/name")
}

