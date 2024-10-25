package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CreateDeveloperMetadataResponseField : Field

object CreateDeveloperMetadataResponseFields {
    val ALL: FieldsList<CreateDeveloperMetadataResponseField> = fieldsList("*")
	val developerMetadata = object : CreateDeveloperMetadataResponseFieldDeveloperMetadata("developerMetadata") {}
}

abstract class CreateDeveloperMetadataResponseFieldDeveloperMetadata(private val path: String) : FieldsList<CreateDeveloperMetadataResponseField>(path) {
	val location by lazy { object : CreateDeveloperMetadataResponseFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/visibility")
}

abstract class CreateDeveloperMetadataResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<CreateDeveloperMetadataResponseField>(path) {
	val dimensionRange by lazy { object : CreateDeveloperMetadataResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class CreateDeveloperMetadataResponseFieldDimensionRange(private val path: String) : FieldsList<CreateDeveloperMetadataResponseField>(path) {
	val dimension: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<CreateDeveloperMetadataResponseField> get() = fieldsList("${path}/startIndex")
}

