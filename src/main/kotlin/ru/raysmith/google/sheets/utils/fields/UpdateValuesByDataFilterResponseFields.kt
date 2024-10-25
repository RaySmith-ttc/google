package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateValuesByDataFilterResponseField : Field

object UpdateValuesByDataFilterResponseFields {
    val ALL: FieldsList<UpdateValuesByDataFilterResponseField> = fieldsList("*")
	val dataFilter = object : UpdateValuesByDataFilterResponseFieldDataFilter("dataFilter") {}
	val updatedCells: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("updatedCells")
	val updatedColumns: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("updatedColumns")
	val updatedData = object : UpdateValuesByDataFilterResponseFieldValueRange("updatedData") {}
	val updatedRange: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("updatedRange")
	val updatedRows: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("updatedRows")
}

abstract class UpdateValuesByDataFilterResponseFieldDataFilter(private val path: String) : FieldsList<UpdateValuesByDataFilterResponseField>(path) {
	val a1Range: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : UpdateValuesByDataFilterResponseFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : UpdateValuesByDataFilterResponseFieldGridRange("${path}/gridRange") {} }
}

abstract class UpdateValuesByDataFilterResponseFieldValueRange(private val path: String) : FieldsList<UpdateValuesByDataFilterResponseField>(path) {
	val majorDimension: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/range")
	val values: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/values")
}

abstract class UpdateValuesByDataFilterResponseFieldDeveloperMetadataLookup(private val path: String) : FieldsList<UpdateValuesByDataFilterResponseField>(path) {
	val locationMatchingStrategy: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : UpdateValuesByDataFilterResponseFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/visibility")
}

abstract class UpdateValuesByDataFilterResponseFieldGridRange(private val path: String) : FieldsList<UpdateValuesByDataFilterResponseField>(path) {
	val endColumnIndex: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateValuesByDataFilterResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<UpdateValuesByDataFilterResponseField>(path) {
	val dimensionRange by lazy { object : UpdateValuesByDataFilterResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class UpdateValuesByDataFilterResponseFieldDimensionRange(private val path: String) : FieldsList<UpdateValuesByDataFilterResponseField>(path) {
	val dimension: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<UpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/startIndex")
}

