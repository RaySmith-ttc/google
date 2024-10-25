package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface GetSpreadsheetByDataFilterRequestField : Field

object GetSpreadsheetByDataFilterRequestFields {
    val ALL: FieldsList<GetSpreadsheetByDataFilterRequestField> = fieldsList("*")
	val dataFilters = object : GetSpreadsheetByDataFilterRequestFieldDataFilter("dataFilters") {}
	val includeGridData: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("includeGridData")
}

abstract class GetSpreadsheetByDataFilterRequestFieldDataFilter(private val path: String) : FieldsList<GetSpreadsheetByDataFilterRequestField>(path) {
	val a1Range: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : GetSpreadsheetByDataFilterRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : GetSpreadsheetByDataFilterRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class GetSpreadsheetByDataFilterRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<GetSpreadsheetByDataFilterRequestField>(path) {
	val locationMatchingStrategy: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : GetSpreadsheetByDataFilterRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/visibility")
}

abstract class GetSpreadsheetByDataFilterRequestFieldGridRange(private val path: String) : FieldsList<GetSpreadsheetByDataFilterRequestField>(path) {
	val endColumnIndex: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class GetSpreadsheetByDataFilterRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<GetSpreadsheetByDataFilterRequestField>(path) {
	val dimensionRange by lazy { object : GetSpreadsheetByDataFilterRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class GetSpreadsheetByDataFilterRequestFieldDimensionRange(private val path: String) : FieldsList<GetSpreadsheetByDataFilterRequestField>(path) {
	val dimension: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<GetSpreadsheetByDataFilterRequestField> get() = fieldsList("${path}/startIndex")
}

