package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedInlineObjectPropertiesField : Field

object SuggestedInlineObjectPropertiesFields {
    val ALL: FieldsList<SuggestedInlineObjectPropertiesField> = fieldsList("*")
	val inlineObjectProperties = object : SuggestedInlineObjectPropertiesFieldInlineObjectProperties("inlineObjectProperties") {}
	val inlineObjectPropertiesSuggestionState = object : SuggestedInlineObjectPropertiesFieldInlineObjectPropertiesSuggestionState("inlineObjectPropertiesSuggestionState") {}
}

abstract class SuggestedInlineObjectPropertiesFieldInlineObjectProperties(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val embeddedObject by lazy { object : SuggestedInlineObjectPropertiesFieldEmbeddedObject("${path}/embeddedObject") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldInlineObjectPropertiesSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val embeddedObjectSuggestionState by lazy { object : SuggestedInlineObjectPropertiesFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldEmbeddedObject(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val description: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : SuggestedInlineObjectPropertiesFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : SuggestedInlineObjectPropertiesFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : SuggestedInlineObjectPropertiesFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : SuggestedInlineObjectPropertiesFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : SuggestedInlineObjectPropertiesFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : SuggestedInlineObjectPropertiesFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : SuggestedInlineObjectPropertiesFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : SuggestedInlineObjectPropertiesFieldSize("${path}/size") {} }
	val title: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/title")
}

abstract class SuggestedInlineObjectPropertiesFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val descriptionSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : SuggestedInlineObjectPropertiesFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : SuggestedInlineObjectPropertiesFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : SuggestedInlineObjectPropertiesFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : SuggestedInlineObjectPropertiesFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/titleSuggested")
}

abstract class SuggestedInlineObjectPropertiesFieldEmbeddedObjectBorder(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val color by lazy { object : SuggestedInlineObjectPropertiesFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : SuggestedInlineObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldImageProperties(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val angle: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : SuggestedInlineObjectPropertiesFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/transparency")
}

abstract class SuggestedInlineObjectPropertiesFieldLinkedContentReference(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val sheetsChartReference by lazy { object : SuggestedInlineObjectPropertiesFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldDimension(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val magnitude: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedInlineObjectPropertiesFieldSize(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val height by lazy { object : SuggestedInlineObjectPropertiesFieldDimension("${path}/height") {} }
	val width by lazy { object : SuggestedInlineObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val colorSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/widthSuggested")
}

abstract class SuggestedInlineObjectPropertiesFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val angleSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : SuggestedInlineObjectPropertiesFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class SuggestedInlineObjectPropertiesFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : SuggestedInlineObjectPropertiesFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldSizeSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val heightSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/widthSuggested")
}

abstract class SuggestedInlineObjectPropertiesFieldOptionalColor(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val color by lazy { object : SuggestedInlineObjectPropertiesFieldColor("${path}/color") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldCropProperties(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val angle: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetTop")
}

abstract class SuggestedInlineObjectPropertiesFieldSheetsChartReference(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val chartId: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class SuggestedInlineObjectPropertiesFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val angleSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class SuggestedInlineObjectPropertiesFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val chartIdSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

abstract class SuggestedInlineObjectPropertiesFieldColor(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val rgbColor by lazy { object : SuggestedInlineObjectPropertiesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedInlineObjectPropertiesFieldRgbColor(private val path: String) : FieldsList<SuggestedInlineObjectPropertiesField>(path) {
	val blue: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedInlineObjectPropertiesField> get() = fieldsList("${path}/red")
}

