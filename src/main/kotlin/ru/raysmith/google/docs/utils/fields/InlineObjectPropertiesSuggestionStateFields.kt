package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InlineObjectPropertiesSuggestionStateField : Field

object InlineObjectPropertiesSuggestionStateFields {
    val ALL: FieldsList<InlineObjectPropertiesSuggestionStateField> = fieldsList("*")
	val embeddedObjectSuggestionState = object : InlineObjectPropertiesSuggestionStateFieldEmbeddedObjectSuggestionState("embeddedObjectSuggestionState") {}
}

abstract class InlineObjectPropertiesSuggestionStateFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<InlineObjectPropertiesSuggestionStateField>(path) {
	val descriptionSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : InlineObjectPropertiesSuggestionStateFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : InlineObjectPropertiesSuggestionStateFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : InlineObjectPropertiesSuggestionStateFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : InlineObjectPropertiesSuggestionStateFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/titleSuggested")
}

abstract class InlineObjectPropertiesSuggestionStateFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<InlineObjectPropertiesSuggestionStateField>(path) {
	val colorSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/widthSuggested")
}

abstract class InlineObjectPropertiesSuggestionStateFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<InlineObjectPropertiesSuggestionStateField>(path) {
	val angleSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : InlineObjectPropertiesSuggestionStateFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class InlineObjectPropertiesSuggestionStateFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<InlineObjectPropertiesSuggestionStateField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : InlineObjectPropertiesSuggestionStateFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class InlineObjectPropertiesSuggestionStateFieldSizeSuggestionState(private val path: String) : FieldsList<InlineObjectPropertiesSuggestionStateField>(path) {
	val heightSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/widthSuggested")
}

abstract class InlineObjectPropertiesSuggestionStateFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<InlineObjectPropertiesSuggestionStateField>(path) {
	val angleSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class InlineObjectPropertiesSuggestionStateFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<InlineObjectPropertiesSuggestionStateField>(path) {
	val chartIdSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<InlineObjectPropertiesSuggestionStateField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

