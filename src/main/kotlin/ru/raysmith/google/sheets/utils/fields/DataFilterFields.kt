package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DataFilterField : Field

object DataFilterFields {
    val ALL: FieldsList<DataFilterField> = fieldsList("*")
	val a1Range: FieldsList<DataFilterField> get() = fieldsList("a1Range")
	val developerMetadataLookup = object : DataFilterFieldDeveloperMetadataLookup("developerMetadataLookup") {}
	val gridRange = object : DataFilterFieldGridRange("gridRange") {}
}

abstract class DataFilterFieldDeveloperMetadataLookup(private val path: String) : FieldsList<DataFilterField>(path) {
	val locationMatchingStrategy: FieldsList<DataFilterField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<DataFilterField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<DataFilterField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<DataFilterField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : DataFilterFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<DataFilterField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<DataFilterField> get() = fieldsList("${path}/visibility")
}

abstract class DataFilterFieldGridRange(private val path: String) : FieldsList<DataFilterField>(path) {
	val endColumnIndex: FieldsList<DataFilterField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DataFilterField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DataFilterField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DataFilterField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DataFilterField> get() = fieldsList("${path}/startRowIndex")
}

abstract class DataFilterFieldDeveloperMetadataLocation(private val path: String) : FieldsList<DataFilterField>(path) {
	val dimensionRange by lazy { object : DataFilterFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<DataFilterField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<DataFilterField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<DataFilterField> get() = fieldsList("${path}/spreadsheet")
}

abstract class DataFilterFieldDimensionRange(private val path: String) : FieldsList<DataFilterField>(path) {
	val dimension: FieldsList<DataFilterField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DataFilterField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DataFilterField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DataFilterField> get() = fieldsList("${path}/startIndex")
}

