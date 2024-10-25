package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface InlineObjectElementField : Field

object InlineObjectElementFields {
    val ALL: FieldsList<InlineObjectElementField> = fieldsList("*")
	val inlineObjectId: FieldsList<InlineObjectElementField> get() = fieldsList("inlineObjectId")
	val suggestedDeletionIds: FieldsList<InlineObjectElementField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<InlineObjectElementField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : InlineObjectElementFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : InlineObjectElementFieldTextStyle("textStyle") {}
}

abstract class InlineObjectElementFieldSuggestedTextStyle(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val textStyle by lazy { object : InlineObjectElementFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : InlineObjectElementFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class InlineObjectElementFieldTextStyle(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val backgroundColor by lazy { object : InlineObjectElementFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : InlineObjectElementFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : InlineObjectElementFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/italic")
	val link by lazy { object : InlineObjectElementFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : InlineObjectElementFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class InlineObjectElementFieldTextStyleSuggestionState(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val backgroundColorSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class InlineObjectElementFieldOptionalColor(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val color by lazy { object : InlineObjectElementFieldColor("${path}/color") {} }
}

abstract class InlineObjectElementFieldDimension(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val magnitude: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/unit")
}

abstract class InlineObjectElementFieldLink(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val bookmark by lazy { object : InlineObjectElementFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : InlineObjectElementFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/url")
}

abstract class InlineObjectElementFieldWeightedFontFamily(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val fontFamily: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/weight")
}

abstract class InlineObjectElementFieldColor(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val rgbColor by lazy { object : InlineObjectElementFieldRgbColor("${path}/rgbColor") {} }
}

abstract class InlineObjectElementFieldBookmarkLink(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val id: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/tabId")
}

abstract class InlineObjectElementFieldHeadingLink(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val id: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/tabId")
}

abstract class InlineObjectElementFieldRgbColor(private val path: String) : FieldsList<InlineObjectElementField>(path) {
	val blue: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/blue")
	val green: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/green")
	val red: FieldsList<InlineObjectElementField> get() = fieldsList("${path}/red")
}

