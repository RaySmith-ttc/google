package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchGetValuesByDataFilterRequestField : Field

object BatchGetValuesByDataFilterRequestFields {
    val ALL: FieldsList<BatchGetValuesByDataFilterRequestField> = fieldsList("*")
	val dataFilters = object : BatchGetValuesByDataFilterRequestFieldDataFilter("dataFilters") {}
	val dateTimeRenderOption: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("dateTimeRenderOption")
	val majorDimension: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("majorDimension")
	val valueRenderOption: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("valueRenderOption")
}

abstract class BatchGetValuesByDataFilterRequestFieldDataFilter(private val path: String) : FieldsList<BatchGetValuesByDataFilterRequestField>(path) {
	val a1Range: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : BatchGetValuesByDataFilterRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : BatchGetValuesByDataFilterRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class BatchGetValuesByDataFilterRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<BatchGetValuesByDataFilterRequestField>(path) {
	val locationMatchingStrategy: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : BatchGetValuesByDataFilterRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/visibility")
}

abstract class BatchGetValuesByDataFilterRequestFieldGridRange(private val path: String) : FieldsList<BatchGetValuesByDataFilterRequestField>(path) {
	val endColumnIndex: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BatchGetValuesByDataFilterRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<BatchGetValuesByDataFilterRequestField>(path) {
	val dimensionRange by lazy { object : BatchGetValuesByDataFilterRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class BatchGetValuesByDataFilterRequestFieldDimensionRange(private val path: String) : FieldsList<BatchGetValuesByDataFilterRequestField>(path) {
	val dimension: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<BatchGetValuesByDataFilterRequestField> get() = fieldsList("${path}/startIndex")
}

