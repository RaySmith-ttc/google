package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface PositionedObjectField : Field

object PositionedObjectFields {
    val ALL: FieldsList<PositionedObjectField> = fieldsList("*")
	val objectId: FieldsList<PositionedObjectField> get() = fieldsList("objectId")
	val positionedObjectProperties = object : PositionedObjectFieldPositionedObjectProperties("positionedObjectProperties") {}
	val suggestedDeletionIds: FieldsList<PositionedObjectField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<PositionedObjectField> get() = fieldsList("suggestedInsertionId")
	val suggestedPositionedObjectPropertiesChanges = object : PositionedObjectFieldSuggestedPositionedObjectProperties("suggestedPositionedObjectPropertiesChanges") {}
}

abstract class PositionedObjectFieldPositionedObjectProperties(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val embeddedObject by lazy { object : PositionedObjectFieldEmbeddedObject("${path}/embeddedObject") {} }
	val positioning by lazy { object : PositionedObjectFieldPositionedObjectPositioning("${path}/positioning") {} }
}

abstract class PositionedObjectFieldSuggestedPositionedObjectProperties(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val positionedObjectProperties by lazy { object : PositionedObjectFieldPositionedObjectProperties("${path}/positionedObjectProperties") {} }
	val positionedObjectPropertiesSuggestionState by lazy { object : PositionedObjectFieldPositionedObjectPropertiesSuggestionState("${path}/positionedObjectPropertiesSuggestionState") {} }
}

abstract class PositionedObjectFieldEmbeddedObject(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val description: FieldsList<PositionedObjectField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<PositionedObjectField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : PositionedObjectFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : PositionedObjectFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : PositionedObjectFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : PositionedObjectFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : PositionedObjectFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : PositionedObjectFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : PositionedObjectFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : PositionedObjectFieldSize("${path}/size") {} }
	val title: FieldsList<PositionedObjectField> get() = fieldsList("${path}/title")
}

abstract class PositionedObjectFieldPositionedObjectPositioning(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val layout: FieldsList<PositionedObjectField> get() = fieldsList("${path}/layout")
	val leftOffset by lazy { object : PositionedObjectFieldDimension("${path}/leftOffset") {} }
	val topOffset by lazy { object : PositionedObjectFieldDimension("${path}/topOffset") {} }
}

abstract class PositionedObjectFieldPositionedObjectPropertiesSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val embeddedObjectSuggestionState by lazy { object : PositionedObjectFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
	val positioningSuggestionState by lazy { object : PositionedObjectFieldPositionedObjectPositioningSuggestionState("${path}/positioningSuggestionState") {} }
}

abstract class PositionedObjectFieldEmbeddedObjectBorder(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val color by lazy { object : PositionedObjectFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<PositionedObjectField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<PositionedObjectField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : PositionedObjectFieldDimension("${path}/width") {} }
}

abstract class PositionedObjectFieldImageProperties(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val angle: FieldsList<PositionedObjectField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<PositionedObjectField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<PositionedObjectField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<PositionedObjectField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : PositionedObjectFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<PositionedObjectField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<PositionedObjectField> get() = fieldsList("${path}/transparency")
}

abstract class PositionedObjectFieldLinkedContentReference(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val sheetsChartReference by lazy { object : PositionedObjectFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class PositionedObjectFieldDimension(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val magnitude: FieldsList<PositionedObjectField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<PositionedObjectField> get() = fieldsList("${path}/unit")
}

abstract class PositionedObjectFieldSize(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val height by lazy { object : PositionedObjectFieldDimension("${path}/height") {} }
	val width by lazy { object : PositionedObjectFieldDimension("${path}/width") {} }
}

abstract class PositionedObjectFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val descriptionSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<PositionedObjectField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : PositionedObjectFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : PositionedObjectFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : PositionedObjectFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : PositionedObjectFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/titleSuggested")
}

abstract class PositionedObjectFieldPositionedObjectPositioningSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val layoutSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/layoutSuggested")
	val leftOffsetSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/leftOffsetSuggested")
	val topOffsetSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/topOffsetSuggested")
}

abstract class PositionedObjectFieldOptionalColor(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val color by lazy { object : PositionedObjectFieldColor("${path}/color") {} }
}

abstract class PositionedObjectFieldCropProperties(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val angle: FieldsList<PositionedObjectField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetTop")
}

abstract class PositionedObjectFieldSheetsChartReference(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val chartId: FieldsList<PositionedObjectField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<PositionedObjectField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class PositionedObjectFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val colorSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/widthSuggested")
}

abstract class PositionedObjectFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val angleSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : PositionedObjectFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class PositionedObjectFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : PositionedObjectFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class PositionedObjectFieldSizeSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val heightSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/widthSuggested")
}

abstract class PositionedObjectFieldColor(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val rgbColor by lazy { object : PositionedObjectFieldRgbColor("${path}/rgbColor") {} }
}

abstract class PositionedObjectFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val angleSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class PositionedObjectFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val chartIdSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<PositionedObjectField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

abstract class PositionedObjectFieldRgbColor(private val path: String) : FieldsList<PositionedObjectField>(path) {
	val blue: FieldsList<PositionedObjectField> get() = fieldsList("${path}/blue")
	val green: FieldsList<PositionedObjectField> get() = fieldsList("${path}/green")
	val red: FieldsList<PositionedObjectField> get() = fieldsList("${path}/red")
}

