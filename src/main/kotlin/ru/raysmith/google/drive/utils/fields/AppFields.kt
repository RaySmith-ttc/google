package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AppField : Field

object AppFields {
    val ALL: FieldsList<AppField> = fieldsList("*")
	val authorized: FieldsList<AppField> get() = fieldsList("authorized")
	val createInFolderTemplate: FieldsList<AppField> get() = fieldsList("createInFolderTemplate")
	val createUrl: FieldsList<AppField> get() = fieldsList("createUrl")
	val hasDriveWideScope: FieldsList<AppField> get() = fieldsList("hasDriveWideScope")
	val icons = object : AppFieldAppIcons("icons") {}
	val id: FieldsList<AppField> get() = fieldsList("id")
	val installed: FieldsList<AppField> get() = fieldsList("installed")
	val kind: FieldsList<AppField> get() = fieldsList("kind")
	val longDescription: FieldsList<AppField> get() = fieldsList("longDescription")
	val name: FieldsList<AppField> get() = fieldsList("name")
	val objectType: FieldsList<AppField> get() = fieldsList("objectType")
	val openUrlTemplate: FieldsList<AppField> get() = fieldsList("openUrlTemplate")
	val primaryFileExtensions: FieldsList<AppField> get() = fieldsList("primaryFileExtensions")
	val primaryMimeTypes: FieldsList<AppField> get() = fieldsList("primaryMimeTypes")
	val productId: FieldsList<AppField> get() = fieldsList("productId")
	val productUrl: FieldsList<AppField> get() = fieldsList("productUrl")
	val secondaryFileExtensions: FieldsList<AppField> get() = fieldsList("secondaryFileExtensions")
	val secondaryMimeTypes: FieldsList<AppField> get() = fieldsList("secondaryMimeTypes")
	val shortDescription: FieldsList<AppField> get() = fieldsList("shortDescription")
	val supportsCreate: FieldsList<AppField> get() = fieldsList("supportsCreate")
	val supportsImport: FieldsList<AppField> get() = fieldsList("supportsImport")
	val supportsMultiOpen: FieldsList<AppField> get() = fieldsList("supportsMultiOpen")
	val supportsOfflineCreate: FieldsList<AppField> get() = fieldsList("supportsOfflineCreate")
	val useByDefault: FieldsList<AppField> get() = fieldsList("useByDefault")
}

abstract class AppFieldAppIcons(private val path: String) : FieldsList<AppField>(path) {
	val category: FieldsList<AppField> get() = fieldsList("${path}/category")
	val iconUrl: FieldsList<AppField> get() = fieldsList("${path}/iconUrl")
	val size: FieldsList<AppField> get() = fieldsList("${path}/size")
}

