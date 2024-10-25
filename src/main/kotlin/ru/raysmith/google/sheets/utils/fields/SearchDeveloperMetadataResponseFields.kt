package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SearchDeveloperMetadataResponseField : Field

object SearchDeveloperMetadataResponseFields {
    val ALL: FieldsList<SearchDeveloperMetadataResponseField> = fieldsList("*")
	val matchedDeveloperMetadata = object : SearchDeveloperMetadataResponseFieldMatchedDeveloperMetadata("matchedDeveloperMetadata") {}
}

abstract class SearchDeveloperMetadataResponseFieldMatchedDeveloperMetadata(private val path: String) : FieldsList<SearchDeveloperMetadataResponseField>(path) {
	val dataFilters by lazy { object : SearchDeveloperMetadataResponseFieldDataFilter("${path}/dataFilters") {} }
	val developerMetadata by lazy { object : SearchDeveloperMetadataResponseFieldDeveloperMetadata("${path}/developerMetadata") {} }
}

abstract class SearchDeveloperMetadataResponseFieldDataFilter(private val path: String) : FieldsList<SearchDeveloperMetadataResponseField>(path) {
	val a1Range: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : SearchDeveloperMetadataResponseFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : SearchDeveloperMetadataResponseFieldGridRange("${path}/gridRange") {} }
}

abstract class SearchDeveloperMetadataResponseFieldDeveloperMetadata(private val path: String) : FieldsList<SearchDeveloperMetadataResponseField>(path) {
	val location by lazy { object : SearchDeveloperMetadataResponseFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/visibility")
}

abstract class SearchDeveloperMetadataResponseFieldDeveloperMetadataLookup(private val path: String) : FieldsList<SearchDeveloperMetadataResponseField>(path) {
	val locationMatchingStrategy: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : SearchDeveloperMetadataResponseFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/visibility")
}

abstract class SearchDeveloperMetadataResponseFieldGridRange(private val path: String) : FieldsList<SearchDeveloperMetadataResponseField>(path) {
	val endColumnIndex: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/startRowIndex")
}

abstract class SearchDeveloperMetadataResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<SearchDeveloperMetadataResponseField>(path) {
	val dimensionRange by lazy { object : SearchDeveloperMetadataResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class SearchDeveloperMetadataResponseFieldDimensionRange(private val path: String) : FieldsList<SearchDeveloperMetadataResponseField>(path) {
	val dimension: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<SearchDeveloperMetadataResponseField> get() = fieldsList("${path}/startIndex")
}

