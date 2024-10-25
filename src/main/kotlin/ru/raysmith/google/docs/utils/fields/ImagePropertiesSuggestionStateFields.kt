package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ImagePropertiesSuggestionStateField : Field

object ImagePropertiesSuggestionStateFields {
    val ALL: FieldsList<ImagePropertiesSuggestionStateField> = fieldsList("*")
	val angleSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("angleSuggested")
	val brightnessSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("brightnessSuggested")
	val contentUriSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("contentUriSuggested")
	val contrastSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("contrastSuggested")
	val cropPropertiesSuggestionState = object : ImagePropertiesSuggestionStateFieldCropPropertiesSuggestionState("cropPropertiesSuggestionState") {}
	val sourceUriSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("sourceUriSuggested")
	val transparencySuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("transparencySuggested")
}

abstract class ImagePropertiesSuggestionStateFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<ImagePropertiesSuggestionStateField>(path) {
	val angleSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<ImagePropertiesSuggestionStateField> get() = fieldsList("${path}/offsetTopSuggested")
}

