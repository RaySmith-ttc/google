package ru.raysmith.google.drive.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AppIconsField : Field

object AppIconsFields {
    val ALL: FieldsList<AppIconsField> = fieldsList("*")
	val category: FieldsList<AppIconsField> get() = fieldsList("category")
	val iconUrl: FieldsList<AppIconsField> get() = fieldsList("iconUrl")
	val size: FieldsList<AppIconsField> get() = fieldsList("size")
}

