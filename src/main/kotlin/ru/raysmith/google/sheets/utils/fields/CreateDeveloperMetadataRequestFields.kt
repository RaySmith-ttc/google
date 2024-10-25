package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateDeveloperMetadataRequestField : Field

object CreateDeveloperMetadataRequestFields {
    val ALL: FieldsList<CreateDeveloperMetadataRequestField> = fieldsList("*")
	val developerMetadata = object : CreateDeveloperMetadataRequestFieldDeveloperMetadata("developerMetadata") {}
}

abstract class CreateDeveloperMetadataRequestFieldDeveloperMetadata(private val path: String) : FieldsList<CreateDeveloperMetadataRequestField>(path) {
	val location by lazy { object : CreateDeveloperMetadataRequestFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/visibility")
}

abstract class CreateDeveloperMetadataRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<CreateDeveloperMetadataRequestField>(path) {
	val dimensionRange by lazy { object : CreateDeveloperMetadataRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/spreadsheet")
}

abstract class CreateDeveloperMetadataRequestFieldDimensionRange(private val path: String) : FieldsList<CreateDeveloperMetadataRequestField>(path) {
	val dimension: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<CreateDeveloperMetadataRequestField> get() = fieldsList("${path}/startIndex")
}

