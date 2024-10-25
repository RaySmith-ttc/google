package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DocumentStyleSuggestionStateField : Field

object DocumentStyleSuggestionStateFields {
    val ALL: FieldsList<DocumentStyleSuggestionStateField> = fieldsList("*")
	val backgroundSuggestionState = object : DocumentStyleSuggestionStateFieldBackgroundSuggestionState("backgroundSuggestionState") {}
	val defaultFooterIdSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("defaultFooterIdSuggested")
	val defaultHeaderIdSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("defaultHeaderIdSuggested")
	val evenPageFooterIdSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("evenPageFooterIdSuggested")
	val evenPageHeaderIdSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("evenPageHeaderIdSuggested")
	val firstPageFooterIdSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("firstPageFooterIdSuggested")
	val firstPageHeaderIdSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("firstPageHeaderIdSuggested")
	val flipPageOrientationSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("flipPageOrientationSuggested")
	val marginBottomSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("marginBottomSuggested")
	val marginFooterSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("marginFooterSuggested")
	val marginHeaderSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("marginHeaderSuggested")
	val marginLeftSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("marginLeftSuggested")
	val marginRightSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("marginRightSuggested")
	val marginTopSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("marginTopSuggested")
	val pageNumberStartSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("pageNumberStartSuggested")
	val pageSizeSuggestionState = object : DocumentStyleSuggestionStateFieldSizeSuggestionState("pageSizeSuggestionState") {}
	val useCustomHeaderFooterMarginsSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("useCustomHeaderFooterMarginsSuggested")
	val useEvenPageHeaderFooterSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("useEvenPageHeaderFooterSuggested")
	val useFirstPageHeaderFooterSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("useFirstPageHeaderFooterSuggested")
}

abstract class DocumentStyleSuggestionStateFieldBackgroundSuggestionState(private val path: String) : FieldsList<DocumentStyleSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class DocumentStyleSuggestionStateFieldSizeSuggestionState(private val path: String) : FieldsList<DocumentStyleSuggestionStateField>(path) {
	val heightSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<DocumentStyleSuggestionStateField> get() = fieldsList("${path}/widthSuggested")
}

