package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchGetValuesByDataFilterResponseField : Field

object BatchGetValuesByDataFilterResponseFields {
    val ALL: FieldsList<BatchGetValuesByDataFilterResponseField> = fieldsList("*")
	val spreadsheetId: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("spreadsheetId")
	val valueRanges = object : BatchGetValuesByDataFilterResponseFieldMatchedValueRange("valueRanges") {}
}

abstract class BatchGetValuesByDataFilterResponseFieldMatchedValueRange(private val path: String) : FieldsList<BatchGetValuesByDataFilterResponseField>(path) {
	val dataFilters by lazy { object : BatchGetValuesByDataFilterResponseFieldDataFilter("${path}/dataFilters") {} }
	val valueRange by lazy { object : BatchGetValuesByDataFilterResponseFieldValueRange("${path}/valueRange") {} }
}

abstract class BatchGetValuesByDataFilterResponseFieldDataFilter(private val path: String) : FieldsList<BatchGetValuesByDataFilterResponseField>(path) {
	val a1Range: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : BatchGetValuesByDataFilterResponseFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : BatchGetValuesByDataFilterResponseFieldGridRange("${path}/gridRange") {} }
}

abstract class BatchGetValuesByDataFilterResponseFieldValueRange(private val path: String) : FieldsList<BatchGetValuesByDataFilterResponseField>(path) {
	val majorDimension: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/range")
	val values: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/values")
}

abstract class BatchGetValuesByDataFilterResponseFieldDeveloperMetadataLookup(private val path: String) : FieldsList<BatchGetValuesByDataFilterResponseField>(path) {
	val locationMatchingStrategy: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : BatchGetValuesByDataFilterResponseFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/visibility")
}

abstract class BatchGetValuesByDataFilterResponseFieldGridRange(private val path: String) : FieldsList<BatchGetValuesByDataFilterResponseField>(path) {
	val endColumnIndex: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BatchGetValuesByDataFilterResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<BatchGetValuesByDataFilterResponseField>(path) {
	val dimensionRange by lazy { object : BatchGetValuesByDataFilterResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class BatchGetValuesByDataFilterResponseFieldDimensionRange(private val path: String) : FieldsList<BatchGetValuesByDataFilterResponseField>(path) {
	val dimension: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<BatchGetValuesByDataFilterResponseField> get() = fieldsList("${path}/startIndex")
}

