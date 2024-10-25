package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateValuesByDataFilterRequestField : Field

object BatchUpdateValuesByDataFilterRequestFields {
    val ALL: FieldsList<BatchUpdateValuesByDataFilterRequestField> = fieldsList("*")
	val data = object : BatchUpdateValuesByDataFilterRequestFieldDataFilterValueRange("data") {}
	val includeValuesInResponse: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("includeValuesInResponse")
	val responseDateTimeRenderOption: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("responseDateTimeRenderOption")
	val responseValueRenderOption: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("responseValueRenderOption")
	val valueInputOption: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("valueInputOption")
}

abstract class BatchUpdateValuesByDataFilterRequestFieldDataFilterValueRange(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterRequestField>(path) {
	val dataFilter by lazy { object : BatchUpdateValuesByDataFilterRequestFieldDataFilter("${path}/dataFilter") {} }
	val majorDimension: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/majorDimension")
	val values: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/values")
}

abstract class BatchUpdateValuesByDataFilterRequestFieldDataFilter(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterRequestField>(path) {
	val a1Range: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : BatchUpdateValuesByDataFilterRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : BatchUpdateValuesByDataFilterRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class BatchUpdateValuesByDataFilterRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterRequestField>(path) {
	val locationMatchingStrategy: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : BatchUpdateValuesByDataFilterRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/visibility")
}

abstract class BatchUpdateValuesByDataFilterRequestFieldGridRange(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterRequestField>(path) {
	val endColumnIndex: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BatchUpdateValuesByDataFilterRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterRequestField>(path) {
	val dimensionRange by lazy { object : BatchUpdateValuesByDataFilterRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class BatchUpdateValuesByDataFilterRequestFieldDimensionRange(private val path: String) : FieldsList<BatchUpdateValuesByDataFilterRequestField>(path) {
	val dimension: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<BatchUpdateValuesByDataFilterRequestField> get() = fieldsList("${path}/startIndex")
}

