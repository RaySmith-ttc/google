package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SearchDeveloperMetadataRequestField : Field

object SearchDeveloperMetadataRequestFields {
    val ALL: FieldsList<SearchDeveloperMetadataRequestField> = fieldsList("*")
	val dataFilters = object : SearchDeveloperMetadataRequestFieldDataFilter("dataFilters") {}
}

abstract class SearchDeveloperMetadataRequestFieldDataFilter(private val path: String) : FieldsList<SearchDeveloperMetadataRequestField>(path) {
	val a1Range: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : SearchDeveloperMetadataRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : SearchDeveloperMetadataRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class SearchDeveloperMetadataRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<SearchDeveloperMetadataRequestField>(path) {
	val locationMatchingStrategy: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : SearchDeveloperMetadataRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/visibility")
}

abstract class SearchDeveloperMetadataRequestFieldGridRange(private val path: String) : FieldsList<SearchDeveloperMetadataRequestField>(path) {
	val endColumnIndex: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SearchDeveloperMetadataRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<SearchDeveloperMetadataRequestField>(path) {
	val dimensionRange by lazy { object : SearchDeveloperMetadataRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class SearchDeveloperMetadataRequestFieldDimensionRange(private val path: String) : FieldsList<SearchDeveloperMetadataRequestField>(path) {
	val dimension: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<SearchDeveloperMetadataRequestField> get() = fieldsList("${path}/startIndex")
}

