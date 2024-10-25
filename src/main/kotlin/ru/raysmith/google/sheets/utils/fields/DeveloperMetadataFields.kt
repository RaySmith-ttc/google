package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeveloperMetadataField : Field

object DeveloperMetadataFields {
    val ALL: FieldsList<DeveloperMetadataField> = fieldsList("*")
	val location = object : DeveloperMetadataFieldDeveloperMetadataLocation("location") {}
	val metadataId: FieldsList<DeveloperMetadataField> get() = fieldsList("metadataId")
	val metadataKey: FieldsList<DeveloperMetadataField> get() = fieldsList("metadataKey")
	val metadataValue: FieldsList<DeveloperMetadataField> get() = fieldsList("metadataValue")
	val visibility: FieldsList<DeveloperMetadataField> get() = fieldsList("visibility")
}

abstract class DeveloperMetadataFieldDeveloperMetadataLocation(private val path: String) : FieldsList<DeveloperMetadataField>(path) {
	val dimensionRange by lazy { object : DeveloperMetadataFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<DeveloperMetadataField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<DeveloperMetadataField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<DeveloperMetadataField> get() = fieldsList("${path}/spreadsheet")
}

abstract class DeveloperMetadataFieldDimensionRange(private val path: String) : FieldsList<DeveloperMetadataField>(path) {
	val dimension: FieldsList<DeveloperMetadataField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeveloperMetadataField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeveloperMetadataField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeveloperMetadataField> get() = fieldsList("${path}/startIndex")
}

