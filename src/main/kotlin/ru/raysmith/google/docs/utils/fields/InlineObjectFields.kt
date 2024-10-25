package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InlineObjectField : Field

object InlineObjectFields {
    val ALL: FieldsList<InlineObjectField> = fieldsList("*")
	val inlineObjectProperties = object : InlineObjectFieldInlineObjectProperties("inlineObjectProperties") {}
	val objectId: FieldsList<InlineObjectField> get() = fieldsList("objectId")
	val suggestedDeletionIds: FieldsList<InlineObjectField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInlineObjectPropertiesChanges = object : InlineObjectFieldSuggestedInlineObjectProperties("suggestedInlineObjectPropertiesChanges") {}
	val suggestedInsertionId: FieldsList<InlineObjectField> get() = fieldsList("suggestedInsertionId")
}

abstract class InlineObjectFieldInlineObjectProperties(private val path: String) : FieldsList<InlineObjectField>(path) {
	val embeddedObject by lazy { object : InlineObjectFieldEmbeddedObject("${path}/embeddedObject") {} }
}

abstract class InlineObjectFieldSuggestedInlineObjectProperties(private val path: String) : FieldsList<InlineObjectField>(path) {
	val inlineObjectProperties by lazy { object : InlineObjectFieldInlineObjectProperties("${path}/inlineObjectProperties") {} }
	val inlineObjectPropertiesSuggestionState by lazy { object : InlineObjectFieldInlineObjectPropertiesSuggestionState("${path}/inlineObjectPropertiesSuggestionState") {} }
}

abstract class InlineObjectFieldEmbeddedObject(private val path: String) : FieldsList<InlineObjectField>(path) {
	val description: FieldsList<InlineObjectField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<InlineObjectField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : InlineObjectFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : InlineObjectFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : InlineObjectFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : InlineObjectFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : InlineObjectFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : InlineObjectFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : InlineObjectFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : InlineObjectFieldSize("${path}/size") {} }
	val title: FieldsList<InlineObjectField> get() = fieldsList("${path}/title")
}

abstract class InlineObjectFieldInlineObjectPropertiesSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val embeddedObjectSuggestionState by lazy { object : InlineObjectFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
}

abstract class InlineObjectFieldEmbeddedObjectBorder(private val path: String) : FieldsList<InlineObjectField>(path) {
	val color by lazy { object : InlineObjectFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<InlineObjectField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<InlineObjectField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : InlineObjectFieldDimension("${path}/width") {} }
}

abstract class InlineObjectFieldImageProperties(private val path: String) : FieldsList<InlineObjectField>(path) {
	val angle: FieldsList<InlineObjectField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<InlineObjectField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<InlineObjectField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<InlineObjectField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : InlineObjectFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<InlineObjectField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<InlineObjectField> get() = fieldsList("${path}/transparency")
}

abstract class InlineObjectFieldLinkedContentReference(private val path: String) : FieldsList<InlineObjectField>(path) {
	val sheetsChartReference by lazy { object : InlineObjectFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class InlineObjectFieldDimension(private val path: String) : FieldsList<InlineObjectField>(path) {
	val magnitude: FieldsList<InlineObjectField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<InlineObjectField> get() = fieldsList("${path}/unit")
}

abstract class InlineObjectFieldSize(private val path: String) : FieldsList<InlineObjectField>(path) {
	val height by lazy { object : InlineObjectFieldDimension("${path}/height") {} }
	val width by lazy { object : InlineObjectFieldDimension("${path}/width") {} }
}

abstract class InlineObjectFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val descriptionSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<InlineObjectField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : InlineObjectFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : InlineObjectFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : InlineObjectFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : InlineObjectFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/titleSuggested")
}

abstract class InlineObjectFieldOptionalColor(private val path: String) : FieldsList<InlineObjectField>(path) {
	val color by lazy { object : InlineObjectFieldColor("${path}/color") {} }
}

abstract class InlineObjectFieldCropProperties(private val path: String) : FieldsList<InlineObjectField>(path) {
	val angle: FieldsList<InlineObjectField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetTop")
}

abstract class InlineObjectFieldSheetsChartReference(private val path: String) : FieldsList<InlineObjectField>(path) {
	val chartId: FieldsList<InlineObjectField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<InlineObjectField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class InlineObjectFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val colorSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/widthSuggested")
}

abstract class InlineObjectFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val angleSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : InlineObjectFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class InlineObjectFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : InlineObjectFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class InlineObjectFieldSizeSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val heightSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/widthSuggested")
}

abstract class InlineObjectFieldColor(private val path: String) : FieldsList<InlineObjectField>(path) {
	val rgbColor by lazy { object : InlineObjectFieldRgbColor("${path}/rgbColor") {} }
}

abstract class InlineObjectFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val angleSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class InlineObjectFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<InlineObjectField>(path) {
	val chartIdSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<InlineObjectField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

abstract class InlineObjectFieldRgbColor(private val path: String) : FieldsList<InlineObjectField>(path) {
	val blue: FieldsList<InlineObjectField> get() = fieldsList("${path}/blue")
	val green: FieldsList<InlineObjectField> get() = fieldsList("${path}/green")
	val red: FieldsList<InlineObjectField> get() = fieldsList("${path}/red")
}

