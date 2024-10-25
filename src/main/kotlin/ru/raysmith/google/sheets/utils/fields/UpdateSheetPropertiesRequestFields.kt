package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateSheetPropertiesRequestField : Field

object UpdateSheetPropertiesRequestFields {
    val ALL: FieldsList<UpdateSheetPropertiesRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("fields")
	val properties = object : UpdateSheetPropertiesRequestFieldSheetProperties("properties") {}
}

abstract class UpdateSheetPropertiesRequestFieldSheetProperties(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val dataSourceSheetProperties by lazy { object : UpdateSheetPropertiesRequestFieldDataSourceSheetProperties("${path}/dataSourceSheetProperties") {} }
	val gridProperties by lazy { object : UpdateSheetPropertiesRequestFieldGridProperties("${path}/gridProperties") {} }
	val hidden: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/hidden")
	val index: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/index")
	val rightToLeft: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/rightToLeft")
	val sheetId: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/sheetId")
	val sheetType: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/sheetType")
	val tabColor by lazy { object : UpdateSheetPropertiesRequestFieldColor("${path}/tabColor") {} }
	val tabColorStyle by lazy { object : UpdateSheetPropertiesRequestFieldColorStyle("${path}/tabColorStyle") {} }
	val title: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/title")
}

abstract class UpdateSheetPropertiesRequestFieldDataSourceSheetProperties(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val columns by lazy { object : UpdateSheetPropertiesRequestFieldDataSourceColumn("${path}/columns") {} }
	val dataExecutionStatus by lazy { object : UpdateSheetPropertiesRequestFieldDataExecutionStatus("${path}/dataExecutionStatus") {} }
	val dataSourceId: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/dataSourceId")
}

abstract class UpdateSheetPropertiesRequestFieldGridProperties(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val columnCount: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/columnCount")
	val columnGroupControlAfter: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/columnGroupControlAfter")
	val frozenColumnCount: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/frozenColumnCount")
	val frozenRowCount: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/frozenRowCount")
	val hideGridlines: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/hideGridlines")
	val rowCount: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/rowCount")
	val rowGroupControlAfter: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/rowGroupControlAfter")
}

abstract class UpdateSheetPropertiesRequestFieldColor(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val alpha: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/alpha")
	val blue: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/red")
}

abstract class UpdateSheetPropertiesRequestFieldColorStyle(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val rgbColor by lazy { object : UpdateSheetPropertiesRequestFieldColor("${path}/rgbColor") {} }
	val themeColor: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/themeColor")
}

abstract class UpdateSheetPropertiesRequestFieldDataSourceColumn(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val formula: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/formula")
	val reference by lazy { object : UpdateSheetPropertiesRequestFieldDataSourceColumnReference("${path}/reference") {} }
}

abstract class UpdateSheetPropertiesRequestFieldDataExecutionStatus(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val errorCode: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/errorCode")
	val errorMessage: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/errorMessage")
	val lastRefreshTime: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/lastRefreshTime")
	val state: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/state")
}

abstract class UpdateSheetPropertiesRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<UpdateSheetPropertiesRequestField>(path) {
	val name: FieldsList<UpdateSheetPropertiesRequestField> get() = fieldsList("${path}/name")
}

