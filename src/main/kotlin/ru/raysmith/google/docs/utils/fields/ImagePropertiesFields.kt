package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ImagePropertiesField : Field

object ImagePropertiesFields {
    val ALL: FieldsList<ImagePropertiesField> = fieldsList("*")
	val angle: FieldsList<ImagePropertiesField> get() = fieldsList("angle")
	val brightness: FieldsList<ImagePropertiesField> get() = fieldsList("brightness")
	val contentUri: FieldsList<ImagePropertiesField> get() = fieldsList("contentUri")
	val contrast: FieldsList<ImagePropertiesField> get() = fieldsList("contrast")
	val cropProperties = object : ImagePropertiesFieldCropProperties("cropProperties") {}
	val sourceUri: FieldsList<ImagePropertiesField> get() = fieldsList("sourceUri")
	val transparency: FieldsList<ImagePropertiesField> get() = fieldsList("transparency")
}

abstract class ImagePropertiesFieldCropProperties(private val path: String) : FieldsList<ImagePropertiesField>(path) {
	val angle: FieldsList<ImagePropertiesField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<ImagePropertiesField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<ImagePropertiesField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<ImagePropertiesField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<ImagePropertiesField> get() = fieldsList("${path}/offsetTop")
}

