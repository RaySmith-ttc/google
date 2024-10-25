package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MatchedDeveloperMetadataField : Field

object MatchedDeveloperMetadataFields {
    val ALL: FieldsList<MatchedDeveloperMetadataField> = fieldsList("*")
	val dataFilters = object : MatchedDeveloperMetadataFieldDataFilter("dataFilters") {}
	val developerMetadata = object : MatchedDeveloperMetadataFieldDeveloperMetadata("developerMetadata") {}
}

abstract class MatchedDeveloperMetadataFieldDataFilter(private val path: String) : FieldsList<MatchedDeveloperMetadataField>(path) {
	val a1Range: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : MatchedDeveloperMetadataFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : MatchedDeveloperMetadataFieldGridRange("${path}/gridRange") {} }
}

abstract class MatchedDeveloperMetadataFieldDeveloperMetadata(private val path: String) : FieldsList<MatchedDeveloperMetadataField>(path) {
	val location by lazy { object : MatchedDeveloperMetadataFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/visibility")
}

abstract class MatchedDeveloperMetadataFieldDeveloperMetadataLookup(private val path: String) : FieldsList<MatchedDeveloperMetadataField>(path) {
	val locationMatchingStrategy: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : MatchedDeveloperMetadataFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/visibility")
}

abstract class MatchedDeveloperMetadataFieldGridRange(private val path: String) : FieldsList<MatchedDeveloperMetadataField>(path) {
	val endColumnIndex: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/startRowIndex")
}

abstract class MatchedDeveloperMetadataFieldDeveloperMetadataLocation(private val path: String) : FieldsList<MatchedDeveloperMetadataField>(path) {
	val dimensionRange by lazy { object : MatchedDeveloperMetadataFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/spreadsheet")
}

abstract class MatchedDeveloperMetadataFieldDimensionRange(private val path: String) : FieldsList<MatchedDeveloperMetadataField>(path) {
	val dimension: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<MatchedDeveloperMetadataField> get() = fieldsList("${path}/startIndex")
}

