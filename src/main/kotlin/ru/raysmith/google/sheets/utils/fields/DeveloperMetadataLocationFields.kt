package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DeveloperMetadataLocationField : Field

object DeveloperMetadataLocationFields {
    val ALL: FieldsList<DeveloperMetadataLocationField> = fieldsList("*")
	val dimensionRange = object : DeveloperMetadataLocationFieldDimensionRange("dimensionRange") {}
	val locationType: FieldsList<DeveloperMetadataLocationField> get() = fieldsList("locationType")
	val sheetId: FieldsList<DeveloperMetadataLocationField> get() = fieldsList("sheetId")
	val spreadsheet: FieldsList<DeveloperMetadataLocationField> get() = fieldsList("spreadsheet")
}

abstract class DeveloperMetadataLocationFieldDimensionRange(private val path: String) : FieldsList<DeveloperMetadataLocationField>(path) {
	val dimension: FieldsList<DeveloperMetadataLocationField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DeveloperMetadataLocationField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DeveloperMetadataLocationField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DeveloperMetadataLocationField> get() = fieldsList("${path}/startIndex")
}

