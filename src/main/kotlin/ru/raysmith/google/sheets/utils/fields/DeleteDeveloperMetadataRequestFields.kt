package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDeveloperMetadataRequestField : Field

object DeleteDeveloperMetadataRequestFields {
    val ALL: FieldsList<DeleteDeveloperMetadataRequestField> = fieldsList("*")
	val dataFilter = object : DeleteDeveloperMetadataRequestFieldDataFilter("dataFilter") {}
}

abstract class DeleteDeveloperMetadataRequestFieldDataFilter(private val path: String) : FieldsList<DeleteDeveloperMetadataRequestField>(path) {
	val a1Range: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : DeleteDeveloperMetadataRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : DeleteDeveloperMetadataRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class DeleteDeveloperMetadataRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<DeleteDeveloperMetadataRequestField>(path) {
	val locationMatchingStrategy: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : DeleteDeveloperMetadataRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/visibility")
}

abstract class DeleteDeveloperMetadataRequestFieldGridRange(private val path: String) : FieldsList<DeleteDeveloperMetadataRequestField>(path) {
	val endColumnIndex: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class DeleteDeveloperMetadataRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<DeleteDeveloperMetadataRequestField>(path) {
	val dimensionRange by lazy { object : DeleteDeveloperMetadataRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class DeleteDeveloperMetadataRequestFieldDimensionRange(private val path: String) : FieldsList<DeleteDeveloperMetadataRequestField>(path) {
	val dimension: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeleteDeveloperMetadataRequestField> get() = fieldsList("${path}/startIndex")
}

