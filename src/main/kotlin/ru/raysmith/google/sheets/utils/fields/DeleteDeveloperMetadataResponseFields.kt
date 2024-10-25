package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeleteDeveloperMetadataResponseField : Field

object DeleteDeveloperMetadataResponseFields {
    val ALL: FieldsList<DeleteDeveloperMetadataResponseField> = fieldsList("*")
	val deletedDeveloperMetadata = object : DeleteDeveloperMetadataResponseFieldDeveloperMetadata("deletedDeveloperMetadata") {}
}

abstract class DeleteDeveloperMetadataResponseFieldDeveloperMetadata(private val path: String) : FieldsList<DeleteDeveloperMetadataResponseField>(path) {
	val location by lazy { object : DeleteDeveloperMetadataResponseFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/visibility")
}

abstract class DeleteDeveloperMetadataResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<DeleteDeveloperMetadataResponseField>(path) {
	val dimensionRange by lazy { object : DeleteDeveloperMetadataResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class DeleteDeveloperMetadataResponseFieldDimensionRange(private val path: String) : FieldsList<DeleteDeveloperMetadataResponseField>(path) {
	val dimension: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeleteDeveloperMetadataResponseField> get() = fieldsList("${path}/startIndex")
}

