package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DimensionPropertiesField : Field

object DimensionPropertiesFields {
    val ALL: FieldsList<DimensionPropertiesField> = fieldsList("*")
	val dataSourceColumnReference = object : DimensionPropertiesFieldDataSourceColumnReference("dataSourceColumnReference") {}
	val developerMetadata = object : DimensionPropertiesFieldDeveloperMetadata("developerMetadata") {}
	val hiddenByFilter: FieldsList<DimensionPropertiesField> get() = fieldsList("hiddenByFilter")
	val hiddenByUser: FieldsList<DimensionPropertiesField> get() = fieldsList("hiddenByUser")
	val pixelSize: FieldsList<DimensionPropertiesField> get() = fieldsList("pixelSize")
}

abstract class DimensionPropertiesFieldDataSourceColumnReference(private val path: String) : FieldsList<DimensionPropertiesField>(path) {
	val name: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/name")
}

abstract class DimensionPropertiesFieldDeveloperMetadata(private val path: String) : FieldsList<DimensionPropertiesField>(path) {
	val location by lazy { object : DimensionPropertiesFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/visibility")
}

abstract class DimensionPropertiesFieldDeveloperMetadataLocation(private val path: String) : FieldsList<DimensionPropertiesField>(path) {
	val dimensionRange by lazy { object : DimensionPropertiesFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/spreadsheet")
}

abstract class DimensionPropertiesFieldDimensionRange(private val path: String) : FieldsList<DimensionPropertiesField>(path) {
	val dimension: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<DimensionPropertiesField> get() = fieldsList("${path}/startIndex")
}

