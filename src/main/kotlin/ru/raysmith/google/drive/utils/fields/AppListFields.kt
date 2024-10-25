package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AppListField : Field

object AppListFields {
    val ALL: FieldsList<AppListField> = fieldsList("*")
	val defaultAppIds: FieldsList<AppListField> get() = fieldsList("defaultAppIds")
	val items = object : AppListFieldApp("items") {}
	val kind: FieldsList<AppListField> get() = fieldsList("kind")
	val selfLink: FieldsList<AppListField> get() = fieldsList("selfLink")
}

abstract class AppListFieldApp(private val path: String) : FieldsList<AppListField>(path) {
	val authorized: FieldsList<AppListField> get() = fieldsList("${path}/authorized")
	val createInFolderTemplate: FieldsList<AppListField> get() = fieldsList("${path}/createInFolderTemplate")
	val createUrl: FieldsList<AppListField> get() = fieldsList("${path}/createUrl")
	val hasDriveWideScope: FieldsList<AppListField> get() = fieldsList("${path}/hasDriveWideScope")
	val icons by lazy { object : AppListFieldAppIcons("${path}/icons") {} }
	val id: FieldsList<AppListField> get() = fieldsList("${path}/id")
	val installed: FieldsList<AppListField> get() = fieldsList("${path}/installed")
	val kind: FieldsList<AppListField> get() = fieldsList("${path}/kind")
	val longDescription: FieldsList<AppListField> get() = fieldsList("${path}/longDescription")
	val name: FieldsList<AppListField> get() = fieldsList("${path}/name")
	val objectType: FieldsList<AppListField> get() = fieldsList("${path}/objectType")
	val openUrlTemplate: FieldsList<AppListField> get() = fieldsList("${path}/openUrlTemplate")
	val primaryFileExtensions: FieldsList<AppListField> get() = fieldsList("${path}/primaryFileExtensions")
	val primaryMimeTypes: FieldsList<AppListField> get() = fieldsList("${path}/primaryMimeTypes")
	val productId: FieldsList<AppListField> get() = fieldsList("${path}/productId")
	val productUrl: FieldsList<AppListField> get() = fieldsList("${path}/productUrl")
	val secondaryFileExtensions: FieldsList<AppListField> get() = fieldsList("${path}/secondaryFileExtensions")
	val secondaryMimeTypes: FieldsList<AppListField> get() = fieldsList("${path}/secondaryMimeTypes")
	val shortDescription: FieldsList<AppListField> get() = fieldsList("${path}/shortDescription")
	val supportsCreate: FieldsList<AppListField> get() = fieldsList("${path}/supportsCreate")
	val supportsImport: FieldsList<AppListField> get() = fieldsList("${path}/supportsImport")
	val supportsMultiOpen: FieldsList<AppListField> get() = fieldsList("${path}/supportsMultiOpen")
	val supportsOfflineCreate: FieldsList<AppListField> get() = fieldsList("${path}/supportsOfflineCreate")
	val useByDefault: FieldsList<AppListField> get() = fieldsList("${path}/useByDefault")
}

abstract class AppListFieldAppIcons(private val path: String) : FieldsList<AppListField>(path) {
	val category: FieldsList<AppListField> get() = fieldsList("${path}/category")
	val iconUrl: FieldsList<AppListField> get() = fieldsList("${path}/iconUrl")
	val size: FieldsList<AppListField> get() = fieldsList("${path}/size")
}

