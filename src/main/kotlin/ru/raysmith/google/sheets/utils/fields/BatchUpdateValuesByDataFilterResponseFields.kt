package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateValuesByDataFilterResponseField : Field

object BatchUpdateValuesByDataFilterResponseFields {
    val ALL: FieldsList<BatchUpdateValuesByDataFilterResponseField> = fieldsList("*")
	val responses = object : BatchUpdateValuesByDataFilterResponseFieldUpdateValuesByDataFilterResponse("responses") {}
	val spreadsheetId: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("spreadsheetId")
	val totalUpdatedCells: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("totalUpdatedCells")
	val totalUpdatedColumns: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("totalUpdatedColumns")
	val totalUpdatedRows: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("totalUpdatedRows")
	val totalUpdatedSheets: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("totalUpdatedSheets")
}

abstract class BatchUpdateValuesByDataFilterResponseFieldUpdateValuesByDataFilterResponse(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterResponseField>(path) {
	val dataFilter by lazy { object : BatchUpdateValuesByDataFilterResponseFieldDataFilter("${path}/dataFilter") {} }
	val updatedCells: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/updatedCells")
	val updatedColumns: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/updatedColumns")
	val updatedData by lazy { object : BatchUpdateValuesByDataFilterResponseFieldValueRange("${path}/updatedData") {} }
	val updatedRange: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/updatedRange")
	val updatedRows: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/updatedRows")
}

abstract class BatchUpdateValuesByDataFilterResponseFieldDataFilter(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterResponseField>(path) {
	val a1Range: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : BatchUpdateValuesByDataFilterResponseFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : BatchUpdateValuesByDataFilterResponseFieldGridRange("${path}/gridRange") {} }
}

abstract class BatchUpdateValuesByDataFilterResponseFieldValueRange(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterResponseField>(path) {
	val majorDimension: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/range")
	val values: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/values")
}

abstract class BatchUpdateValuesByDataFilterResponseFieldDeveloperMetadataLookup(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterResponseField>(path) {
	val locationMatchingStrategy: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : BatchUpdateValuesByDataFilterResponseFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/visibility")
}

abstract class BatchUpdateValuesByDataFilterResponseFieldGridRange(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterResponseField>(path) {
	val endColumnIndex: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BatchUpdateValuesByDataFilterResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterResponseField>(path) {
	val dimensionRange by lazy { object : BatchUpdateValuesByDataFilterResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class BatchUpdateValuesByDataFilterResponseFieldDimensionRange(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterResponseField>(path) {
	val dimension: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<BatchUpdateValuesByDataFilterResponseField> get() = fieldsList("${path}/startIndex")
}

