package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PositionedObjectPropertiesSuggestionStateField : Field

object PositionedObjectPropertiesSuggestionStateFields {
    val ALL: FieldsList<PositionedObjectPropertiesSuggestionStateField> = fieldsList("*")
	val embeddedObjectSuggestionState = object : PositionedObjectPropertiesSuggestionStateFieldEmbeddedObjectSuggestionState("embeddedObjectSuggestionState") {}
	val positioningSuggestionState = object : PositionedObjectPropertiesSuggestionStateFieldPositionedObjectPositioningSuggestionState("positioningSuggestionState") {}
}

abstract class PositionedObjectPropertiesSuggestionStateFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val descriptionSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : PositionedObjectPropertiesSuggestionStateFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : PositionedObjectPropertiesSuggestionStateFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : PositionedObjectPropertiesSuggestionStateFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : PositionedObjectPropertiesSuggestionStateFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/titleSuggested")
}

abstract class PositionedObjectPropertiesSuggestionStateFieldPositionedObjectPositioningSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val layoutSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/layoutSuggested")
	val leftOffsetSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/leftOffsetSuggested")
	val topOffsetSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/topOffsetSuggested")
}

abstract class PositionedObjectPropertiesSuggestionStateFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val colorSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/widthSuggested")
}

abstract class PositionedObjectPropertiesSuggestionStateFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val angleSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : PositionedObjectPropertiesSuggestionStateFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class PositionedObjectPropertiesSuggestionStateFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : PositionedObjectPropertiesSuggestionStateFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class PositionedObjectPropertiesSuggestionStateFieldSizeSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val heightSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/widthSuggested")
}

abstract class PositionedObjectPropertiesSuggestionStateFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val angleSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class PositionedObjectPropertiesSuggestionStateFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<PositionedObjectPropertiesSuggestionStateField>(path) {
	val chartIdSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<PositionedObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

