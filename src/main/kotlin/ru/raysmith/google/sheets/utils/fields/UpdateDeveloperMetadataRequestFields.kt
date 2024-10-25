package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateDeveloperMetadataRequestField : Field

object UpdateDeveloperMetadataRequestFields {
    val ALL: FieldsList<UpdateDeveloperMetadataRequestField> = fieldsList("*")
	val dataFilters = object : UpdateDeveloperMetadataRequestFieldDataFilter("dataFilters") {}
	val developerMetadata = object : UpdateDeveloperMetadataRequestFieldDeveloperMetadata("developerMetadata") {}
	val fields: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("fields")
}

abstract class UpdateDeveloperMetadataRequestFieldDataFilter(private val path: String) : FieldsList<UpdateDeveloperMetadataRequestField>(path) {
	val a1Range: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/a1Range")
	val developerMetadataLookup by lazy { object : UpdateDeveloperMetadataRequestFieldDeveloperMetadataLookup("${path}/developerMetadataLookup") {} }
	val gridRange by lazy { object : UpdateDeveloperMetadataRequestFieldGridRange("${path}/gridRange") {} }
}

abstract class UpdateDeveloperMetadataRequestFieldDeveloperMetadata(private val path: String) : FieldsList<UpdateDeveloperMetadataRequestField>(path) {
	val location by lazy { object : UpdateDeveloperMetadataRequestFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/visibility")
}

abstract class UpdateDeveloperMetadataRequestFieldDeveloperMetadataLookup(private val path: String) : FieldsList<UpdateDeveloperMetadataRequestField>(path) {
	val locationMatchingStrategy: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/locationMatchingStrategy")
	val locationType: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/locationType")
	val metadataId: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataLocation by lazy { object : UpdateDeveloperMetadataRequestFieldDeveloperMetadataLocation("${path}/metadataLocation") {} }
	val metadataValue: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/visibility")
}

abstract class UpdateDeveloperMetadataRequestFieldGridRange(private val path: String) : FieldsList<UpdateDeveloperMetadataRequestField>(path) {
	val endColumnIndex: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/endColumnIndex")
	val endRowIndex: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/endRowIndex")
	val sheetId: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val startColumnIndex: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/startColumnIndex")
	val startRowIndex: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/startRowIndex")
}

abstract class UpdateDeveloperMetadataRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<UpdateDeveloperMetadataRequestField>(path) {
	val dimensionRange by lazy { object : UpdateDeveloperMetadataRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class UpdateDeveloperMetadataRequestFieldDimensionRange(private val path: String) : FieldsList<UpdateDeveloperMetadataRequestField>(path) {
	val dimension: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<UpdateDeveloperMetadataRequestField> get() = fieldsList("${path}/startIndex")
}

