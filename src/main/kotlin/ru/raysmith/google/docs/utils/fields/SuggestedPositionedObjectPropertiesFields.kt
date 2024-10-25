package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedPositionedObjectPropertiesField : Field

object SuggestedPositionedObjectPropertiesFields {
    val ALL: FieldsList<SuggestedPositionedObjectPropertiesField> = fieldsList("*")
	val positionedObjectProperties = object : SuggestedPositionedObjectPropertiesFieldPositionedObjectProperties("positionedObjectProperties") {}
	val positionedObjectPropertiesSuggestionState = object : SuggestedPositionedObjectPropertiesFieldPositionedObjectPropertiesSuggestionState("positionedObjectPropertiesSuggestionState") {}
}

abstract class SuggestedPositionedObjectPropertiesFieldPositionedObjectProperties(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val embeddedObject by lazy { object : SuggestedPositionedObjectPropertiesFieldEmbeddedObject("${path}/embeddedObject") {} }
	val positioning by lazy { object : SuggestedPositionedObjectPropertiesFieldPositionedObjectPositioning("${path}/positioning") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldPositionedObjectPropertiesSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val embeddedObjectSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
	val positioningSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldPositionedObjectPositioningSuggestionState("${path}/positioningSuggestionState") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldEmbeddedObject(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val description: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : SuggestedPositionedObjectPropertiesFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : SuggestedPositionedObjectPropertiesFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : SuggestedPositionedObjectPropertiesFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : SuggestedPositionedObjectPropertiesFieldSize("${path}/size") {} }
	val title: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/title")
}

abstract class SuggestedPositionedObjectPropertiesFieldPositionedObjectPositioning(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val layout: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/layout")
	val leftOffset by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/leftOffset") {} }
	val topOffset by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/topOffset") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val descriptionSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/titleSuggested")
}

abstract class SuggestedPositionedObjectPropertiesFieldPositionedObjectPositioningSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val layoutSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/layoutSuggested")
	val leftOffsetSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/leftOffsetSuggested")
	val topOffsetSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/topOffsetSuggested")
}

abstract class SuggestedPositionedObjectPropertiesFieldEmbeddedObjectBorder(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val color by lazy { object : SuggestedPositionedObjectPropertiesFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldImageProperties(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val angle: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : SuggestedPositionedObjectPropertiesFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/transparency")
}

abstract class SuggestedPositionedObjectPropertiesFieldLinkedContentReference(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val sheetsChartReference by lazy { object : SuggestedPositionedObjectPropertiesFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldDimension(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val magnitude: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedPositionedObjectPropertiesFieldSize(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val height by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/height") {} }
	val width by lazy { object : SuggestedPositionedObjectPropertiesFieldDimension("${path}/width") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val colorSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/widthSuggested")
}

abstract class SuggestedPositionedObjectPropertiesFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val angleSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class SuggestedPositionedObjectPropertiesFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : SuggestedPositionedObjectPropertiesFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldSizeSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val heightSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/widthSuggested")
}

abstract class SuggestedPositionedObjectPropertiesFieldOptionalColor(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val color by lazy { object : SuggestedPositionedObjectPropertiesFieldColor("${path}/color") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldCropProperties(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val angle: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetTop")
}

abstract class SuggestedPositionedObjectPropertiesFieldSheetsChartReference(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val chartId: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class SuggestedPositionedObjectPropertiesFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val angleSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class SuggestedPositionedObjectPropertiesFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val chartIdSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

abstract class SuggestedPositionedObjectPropertiesFieldColor(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val rgbColor by lazy { object : SuggestedPositionedObjectPropertiesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedPositionedObjectPropertiesFieldRgbColor(private val path: String) : FieldsList<SuggestedPositionedObjectPropertiesField>(path) {
	val blue: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedPositionedObjectPropertiesField> get() = fieldsList("${path}/red")
}

