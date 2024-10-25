package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DuplicateSheetResponseField : Field

object DuplicateSheetResponseFields {
    val ALL: FieldsList<DuplicateSheetResponseField> = fieldsList("*")
	val properties = object : DuplicateSheetResponseFieldSheetProperties("properties") {}
}

abstract class DuplicateSheetResponseFieldSheetProperties(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val dataSourceSheetProperties by lazy { object : DuplicateSheetResponseFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : DuplicateSheetResponseFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : DuplicateSheetResponseFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : DuplicateSheetResponseFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/title")
}

abstract class DuplicateSheetResponseFieldDataSourceSheetProperties(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val columns by lazy { object : DuplicateSheetResponseFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : DuplicateSheetResponseFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/dataSourceId")
}

abstract class DuplicateSheetResponseFieldGridProperties(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val columnCount: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class DuplicateSheetResponseFieldColor(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val alpha: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/green")
	val red: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/red")
}

abstract class DuplicateSheetResponseFieldColorStyle(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val rgbColor by lazy { object : DuplicateSheetResponseFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/themeColor")
}

abstract class DuplicateSheetResponseFieldDataSourceColumn(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val formula: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : DuplicateSheetResponseFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class DuplicateSheetResponseFieldDataExecutionStatus(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val errorCode: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/state")
}

abstract class DuplicateSheetResponseFieldDataSourceColumnReference(private val path: String) : FieldsList<DuplicateSheetResponseField>(path) {
	val name: FieldsList<DuplicateSheetResponseField> get() = fieldsList("${path}/name")
}

