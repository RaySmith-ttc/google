package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CropPropertiesField : Field

object CropPropertiesFields {
    val ALL: FieldsList<CropPropertiesField> = fieldsList("*")
	val angle: FieldsList<CropPropertiesField> get() = fieldsList("angle")
	val offsetBottom: FieldsList<CropPropertiesField> get() = fieldsList("offsetBottom")
	val offsetLeft: FieldsList<CropPropertiesField> get() = fieldsList("offsetLeft")
	val offsetRight: FieldsList<CropPropertiesField> get() = fieldsList("offsetRight")
	val offsetTop: FieldsList<CropPropertiesField> get() = fieldsList("offsetTop")
}

