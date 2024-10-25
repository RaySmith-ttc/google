package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchClearValuesByDataFilterRequestField : Field

object BatchClearValuesByDataFilterRequestFields {
    val ALL: FieldsList<BatchClearValuesByDataFilterRequestField> = fieldsList("*")
	val dataFilters = object : BatchClearValuesByDataFilterRequestFieldDataFilter("dataFilters") {}
}

abstract class BatchClearValuesByDataFilterRequestFieldDataFilter(private val path: String) : FieldsList<BatchClearValuesByDataFilterRequestField>(path) {
	val a1Range: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : BatchClearValuesByDataFilterRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : BatchClearValuesByDataFilterRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class BatchClearValuesByDataFilterRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<BatchClearValuesByDataFilterRequestField>(path) {
	val locationMatchingStrategy: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : BatchClearValuesByDataFilterRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/visibility")
}

abstract class BatchClearValuesByDataFilterRequestFieldGridRange(private val path: String) : FieldsList<BatchClearValuesByDataFilterRequestField>(path) {
	val endColumnIndex: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class BatchClearValuesByDataFilterRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<BatchClearValuesByDataFilterRequestField>(path) {
	val dimensionRange by lazy { object : BatchClearValuesByDataFilterRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class BatchClearValuesByDataFilterRequestFieldDimensionRange(private val path: String) : FieldsList<BatchClearValuesByDataFilterRequestField>(path) {
	val dimension: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<BatchClearValuesByDataFilterRequestField> get() = fieldsList("${path}/startIndex")
}

