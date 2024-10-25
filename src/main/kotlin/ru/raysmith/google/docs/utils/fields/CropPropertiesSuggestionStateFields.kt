package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface CropPropertiesSuggestionStateField : Field

object CropPropertiesSuggestionStateFields {
    val ALL: FieldsList<CropPropertiesSuggestionStateField> = fieldsList("*")
	val angleSuggested: FieldsList<CropPropertiesSuggestionStateField> get() = fieldsList("angleSuggested")
	val offsetBottomSuggested: FieldsList<CropPropertiesSuggestionStateField> get() = fieldsList("offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<CropPropertiesSuggestionStateField> get() = fieldsList("offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<CropPropertiesSuggestionStateField> get() = fieldsList("offsetRightSuggested")
	val offsetTopSuggested: FieldsList<CropPropertiesSuggestionStateField> get() = fieldsList("offsetTopSuggested")
}

