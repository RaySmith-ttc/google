package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MatchedValueRangeField : Field

object MatchedValueRangeFields {
    val ALL: FieldsList<MatchedValueRangeField> = fieldsList("*")
	val dataFilters = object : MatchedValueRangeFieldDataFilter("dataFilters") {}
	val valueRange = object : MatchedValueRangeFieldValueRange("valueRange") {}
}

abstract class MatchedValueRangeFieldDataFilter(private val path: String) : FieldsList<MatchedValueRangeField>(path) {
	val a1Range: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : MatchedValueRangeFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : MatchedValueRangeFieldGridRange("${path}/gridRange") {} }
}

abstract class MatchedValueRangeFieldValueRange(private val path: String) : FieldsList<MatchedValueRangeField>(path) {
	val majorDimension: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/majorDimension")
	val range: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/range")
	val values: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/values")
}

abstract class MatchedValueRangeFieldDeveloperMetadataLookup(private val path: String) : FieldsList<MatchedValueRangeField>(path) {
	val locationMatchingStrategy: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : MatchedValueRangeFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/visibility")
}

abstract class MatchedValueRangeFieldGridRange(private val path: String) : FieldsList<MatchedValueRangeField>(path) {
	val endColumnIndex: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/startRowIndex")
}

abstract class MatchedValueRangeFieldDeveloperMetadataLocation(private val path: String) : FieldsList<MatchedValueRangeField>(path) {
	val dimensionRange by lazy { object : MatchedValueRangeFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/spreadsheet")
}

abstract class MatchedValueRangeFieldDimensionRange(private val path: String) : FieldsList<MatchedValueRangeField>(path) {
	val dimension: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<MatchedValueRangeField> get() = fieldsList("${path}/startIndex")
}

