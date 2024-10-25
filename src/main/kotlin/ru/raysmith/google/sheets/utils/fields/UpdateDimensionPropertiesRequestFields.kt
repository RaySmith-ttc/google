package ru.raysmith.google.sheets.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateDimensionPropertiesRequestField : Field

object UpdateDimensionPropertiesRequestFields {
    val ALL: FieldsList<UpdateDimensionPropertiesRequestField> = fieldsList("*")
	val dataSourceSheetRange = object : UpdateDimensionPropertiesRequestFieldDataSourceSheetDimensionRange("dataSourceSheetRange") {}
	val fields: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("fields")
	val properties = object : UpdateDimensionPropertiesRequestFieldDimensionProperties("properties") {}
	val range = object : UpdateDimensionPropertiesRequestFieldDimensionRange("range") {}
}

abstract class UpdateDimensionPropertiesRequestFieldDataSourceSheetDimensionRange(private val path: String) : FieldsList<UpdateDimensionPropertiesRequestField>(path) {
	val columnReferences by lazy { object : UpdateDimensionPropertiesRequestFieldDataSourceColumnReference("${path}/columnReferences") {} }
	val sheetId: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/sheetId")
}

abstract class UpdateDimensionPropertiesRequestFieldDimensionProperties(private val path: String) : FieldsList<UpdateDimensionPropertiesRequestField>(path) {
	val dataSourceColumnReference by lazy { object : UpdateDimensionPropertiesRequestFieldDataSourceColumnReference("${path}/dataSourceColumnReference") {} }
	val developerMetadata by lazy { object : UpdateDimensionPropertiesRequestFieldDeveloperMetadata("${path}/developerMetadata") {} }
	val hiddenByFilter: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/hiddenByFilter")
	val hiddenByUser: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/hiddenByUser")
	val pixelSize: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/pixelSize")
}

abstract class UpdateDimensionPropertiesRequestFieldDimensionRange(private val path: String) : FieldsList<UpdateDimensionPropertiesRequestField>(path) {
	val dimension: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/dimension")
	val endIndex: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/endIndex")
	val sheetId: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/sheetId")
	val startIndex: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/startIndex")
}

abstract class UpdateDimensionPropertiesRequestFieldDataSourceColumnReference(private val path: String) : FieldsList<UpdateDimensionPropertiesRequestField>(path) {
	val name: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/name")
}

abstract class UpdateDimensionPropertiesRequestFieldDeveloperMetadata(private val path: String) : FieldsList<UpdateDimensionPropertiesRequestField>(path) {
	val location by lazy { object : UpdateDimensionPropertiesRequestFieldDeveloperMetadataLocation("${path}/location") {} }
	val metadataId: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/metadataId")
	val metadataKey: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/metadataKey")
	val metadataValue: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/metadataValue")
	val visibility: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/visibility")
}

abstract class UpdateDimensionPropertiesRequestFieldDeveloperMetadataLocation(private val path: String) : FieldsList<UpdateDimensionPropertiesRequestField>(path) {
	val dimensionRange by lazy { object : UpdateDimensionPropertiesRequestFieldDimensionRange("${path}/dimensionRange") {} }
	val locationType: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/locationType")
	val sheetId: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/sheetId")
	val spreadsheet: FieldsList<UpdateDimensionPropertiesRequestField> get() = fieldsList("${path}/spreadsheet")
}

