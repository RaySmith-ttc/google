package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataFilterValueRangeField : Field

object DataFilterValueRangeFields {
    val ALL: FieldsList<DataFilterValueRangeField> = fieldsList("*")
	val dataFilter = object : DataFilterValueRangeFieldDataFilter("dataFilter") {}
	val majorDimension: FieldsList<DataFilterValueRangeField> get() = fieldsList("majorDimension")
	val values: FieldsList<DataFilterValueRangeField> get() = fieldsList("values")
}

abstract class DataFilterValueRangeFieldDataFilter(private val path: String) : FieldsList<DataFilterValueRangeField>(path) {
	val a1Range: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : DataFilterValueRangeFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : DataFilterValueRangeFieldGridRange("${path}/gridRange") {} }
}

abstract class DataFilterValueRangeFieldDeveloperMetadataLookup(private val path: String) : FieldsList<DataFilterValueRangeField>(path) {
	val locationMatchingStrategy: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : DataFilterValueRangeFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/visibility")
}

abstract class DataFilterValueRangeFieldGridRange(private val path: String) : FieldsList<DataFilterValueRangeField>(path) {
	val endColumnIndex: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/startRowIndex")
}

abstract class DataFilterValueRangeFieldDeveloperMetadataLocation(private val path: String) : FieldsList<DataFilterValueRangeField>(path) {
	val dimensionRange by lazy { object : DataFilterValueRangeFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/spreadsheet")
}

abstract class DataFilterValueRangeFieldDimensionRange(private val path: String) : FieldsList<DataFilterValueRangeField>(path) {
	val dimension: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DataFilterValueRangeField> get() = fieldsList("${path}/startIndex")
}

