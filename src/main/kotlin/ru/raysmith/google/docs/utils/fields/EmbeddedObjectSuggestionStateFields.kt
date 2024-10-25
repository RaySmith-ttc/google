package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface EmbeddedObjectSuggestionStateField : Field

object EmbeddedObjectSuggestionStateFields {
    val ALL: FieldsList<EmbeddedObjectSuggestionStateField> = fieldsList("*")
	val descriptionSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState = object : EmbeddedObjectSuggestionStateFieldEmbeddedObjectBorderSuggestionState("embeddedObjectBorderSuggestionState") {}
	val imagePropertiesSuggestionState = object : EmbeddedObjectSuggestionStateFieldImagePropertiesSuggestionState("imagePropertiesSuggestionState") {}
	val linkedContentReferenceSuggestionState = object : EmbeddedObjectSuggestionStateFieldLinkedContentReferenceSuggestionState("linkedContentReferenceSuggestionState") {}
	val marginBottomSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("marginBottomSuggested")
	val marginLeftSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("marginLeftSuggested")
	val marginRightSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("marginRightSuggested")
	val marginTopSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("marginTopSuggested")
	val sizeSuggestionState = object : EmbeddedObjectSuggestionStateFieldSizeSuggestionState("sizeSuggestionState") {}
	val titleSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("titleSuggested")
}

abstract class EmbeddedObjectSuggestionStateFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<EmbeddedObjectSuggestionStateField>(path) {
	val colorSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/widthSuggested")
}

abstract class EmbeddedObjectSuggestionStateFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<EmbeddedObjectSuggestionStateField>(path) {
	val angleSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : EmbeddedObjectSuggestionStateFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class EmbeddedObjectSuggestionStateFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<EmbeddedObjectSuggestionStateField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : EmbeddedObjectSuggestionStateFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class EmbeddedObjectSuggestionStateFieldSizeSuggestionState(private val path: String) : FieldsList<EmbeddedObjectSuggestionStateField>(path) {
	val heightSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/widthSuggested")
}

abstract class EmbeddedObjectSuggestionStateFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<EmbeddedObjectSuggestionStateField>(path) {
	val angleSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class EmbeddedObjectSuggestionStateFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<EmbeddedObjectSuggestionStateField>(path) {
	val chartIdSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<EmbeddedObjectSuggestionStateField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

