package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateDeveloperMetadataResponseField : Field

object UpdateDeveloperMetadataResponseFields {
    val ALL: FieldsList<UpdateDeveloperMetadataResponseField> = fieldsList("*")
	val developerMetadata = object : UpdateDeveloperMetadataResponseFieldDeveloperMetadata("developerMetadata") {}
}

abstract class UpdateDeveloperMetadataResponseFieldDeveloperMetadata(private val path: String) : FieldsList<UpdateDeveloperMetadataResponseField>(path) {
	val location by lazy { object : UpdateDeveloperMetadataResponseFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/visibility")
}

abstract class UpdateDeveloperMetadataResponseFieldDeveloperMetadataLocation(private val path: String) : FieldsList<UpdateDeveloperMetadataResponseField>(path) {
	val dimensionRange by lazy { object : UpdateDeveloperMetadataResponseFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/spreadsheet")
}

abstract class UpdateDeveloperMetadataResponseFieldDimensionRange(private val path: String) : FieldsList<UpdateDeveloperMetadataResponseField>(path) {
	val dimension: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<UpdateDeveloperMetadataResponseField> get() = fieldsList("${path}/startIndex")
}

