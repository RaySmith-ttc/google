package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedDocumentStyleField : Field

object SuggestedDocumentStyleFields {
    val ALL: FieldsList<SuggestedDocumentStyleField> = fieldsList("*")
	val documentStyle = object : SuggestedDocumentStyleFieldDocumentStyle("documentStyle") {}
	val documentStyleSuggestionState = object : SuggestedDocumentStyleFieldDocumentStyleSuggestionState("documentStyleSuggestionState") {}
}

abstract class SuggestedDocumentStyleFieldDocumentStyle(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val background by lazy { object : SuggestedDocumentStyleFieldBackground("${path}/background") {} }
	val defaultFooterId: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/pageNumberStart")
	val pageSize by lazy { object : SuggestedDocumentStyleFieldSize("${path}/pageSize") {} }
	val useCustomHeaderFooterMargins: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class SuggestedDocumentStyleFieldDocumentStyleSuggestionState(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val backgroundSuggestionState by lazy { object : SuggestedDocumentStyleFieldBackgroundSuggestionState("${path}/backgroundSuggestionState") {} }
	val defaultFooterIdSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/defaultFooterIdSuggested")
	val defaultHeaderIdSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/defaultHeaderIdSuggested")
	val evenPageFooterIdSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/evenPageFooterIdSuggested")
	val evenPageHeaderIdSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/evenPageHeaderIdSuggested")
	val firstPageFooterIdSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/firstPageFooterIdSuggested")
	val firstPageHeaderIdSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/firstPageHeaderIdSuggested")
	val flipPageOrientationSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/flipPageOrientationSuggested")
	val marginBottomSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginFooterSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/marginFooterSuggested")
	val marginHeaderSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/marginHeaderSuggested")
	val marginLeftSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/marginTopSuggested")
	val pageNumberStartSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/pageNumberStartSuggested")
	val pageSizeSuggestionState by lazy { object : SuggestedDocumentStyleFieldSizeSuggestionState("${path}/pageSizeSuggestionState") {} }
	val useCustomHeaderFooterMarginsSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/useCustomHeaderFooterMarginsSuggested")
	val useEvenPageHeaderFooterSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/useEvenPageHeaderFooterSuggested")
	val useFirstPageHeaderFooterSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/useFirstPageHeaderFooterSuggested")
}

abstract class SuggestedDocumentStyleFieldBackground(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val color by lazy { object : SuggestedDocumentStyleFieldOptionalColor("${path}/color") {} }
}

abstract class SuggestedDocumentStyleFieldDimension(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val magnitude: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedDocumentStyleFieldSize(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val height by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/height") {} }
	val width by lazy { object : SuggestedDocumentStyleFieldDimension("${path}/width") {} }
}

abstract class SuggestedDocumentStyleFieldBackgroundSuggestionState(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class SuggestedDocumentStyleFieldSizeSuggestionState(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val heightSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/widthSuggested")
}

abstract class SuggestedDocumentStyleFieldOptionalColor(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val color by lazy { object : SuggestedDocumentStyleFieldColor("${path}/color") {} }
}

abstract class SuggestedDocumentStyleFieldColor(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val rgbColor by lazy { object : SuggestedDocumentStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedDocumentStyleFieldRgbColor(private val path: String) : FieldsList<SuggestedDocumentStyleField>(path) {
	val blue: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedDocumentStyleField> get() = fieldsList("${path}/red")
}

