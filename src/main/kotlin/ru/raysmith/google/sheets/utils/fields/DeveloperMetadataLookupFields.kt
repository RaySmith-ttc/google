package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeveloperMetadataLookupField : Field

object DeveloperMetadataLookupFields {
    val ALL: FieldsList<DeveloperMetadataLookupField> = fieldsList("*")
	val locationMatchingStrategy: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("locationMatchingStrategy")
	val locationType: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("locationType")
	val metadataId: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("metadataId")
	val metadataKey: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("metadataKey")
	val metadataLocation = object : DeveloperMetadataLookupFieldDeveloperMetadataLocation("metadataLocation") {}
	val metadataValue: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("metadataValue")
	val visibility: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("visibility")
}

abstract class DeveloperMetadataLookupFieldDeveloperMetadataLocation(private val path: String) : FieldsList<DeveloperMetadataLookupField>(path) {
	val dimensionRange by lazy { object : DeveloperMetadataLookupFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("${path}/spreadsheet")
}

abstract class DeveloperMetadataLookupFieldDimensionRange(private val path: String) : FieldsList<DeveloperMetadataLookupField>(path) {
	val dimension: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeveloperMetadataLookupField> get() = fieldsList("${path}/startIndex")
}

