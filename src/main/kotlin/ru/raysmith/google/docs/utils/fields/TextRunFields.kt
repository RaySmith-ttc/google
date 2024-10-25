package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface TextRunField : Field

object TextRunFields {
    val ALL: FieldsList<TextRunField> = fieldsList("*")
	val content: FieldsList<TextRunField> get() = fieldsList("content")
	val suggestedDeletionIds: FieldsList<TextRunField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<TextRunField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : TextRunFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : TextRunFieldTextStyle("textStyle") {}
}

abstract class TextRunFieldSuggestedTextStyle(private val path: String) : FieldsList<TextRunField>(path) {
	val textStyle by lazy { object : TextRunFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : TextRunFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class TextRunFieldTextStyle(private val path: String) : FieldsList<TextRunField>(path) {
	val backgroundColor by lazy { object : TextRunFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<TextRunField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<TextRunField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : TextRunFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : TextRunFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<TextRunField> get() = fieldsList("${path}/italic")
	val link by lazy { object : TextRunFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<TextRunField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<TextRunField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<TextRunField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : TextRunFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class TextRunFieldTextStyleSuggestionState(private val path: String) : FieldsList<TextRunField>(path) {
	val backgroundColorSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<TextRunField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<TextRunField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class TextRunFieldOptionalColor(private val path: String) : FieldsList<TextRunField>(path) {
	val color by lazy { object : TextRunFieldColor("${path}/color") {} }
}

abstract class TextRunFieldDimension(private val path: String) : FieldsList<TextRunField>(path) {
	val magnitude: FieldsList<TextRunField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<TextRunField> get() = fieldsList("${path}/unit")
}

abstract class TextRunFieldLink(private val path: String) : FieldsList<TextRunField>(path) {
	val bookmark by lazy { object : TextRunFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<TextRunField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : TextRunFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<TextRunField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<TextRunField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<TextRunField> get() = fieldsList("${path}/url")
}

abstract class TextRunFieldWeightedFontFamily(private val path: String) : FieldsList<TextRunField>(path) {
	val fontFamily: FieldsList<TextRunField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<TextRunField> get() = fieldsList("${path}/weight")
}

abstract class TextRunFieldColor(private val path: String) : FieldsList<TextRunField>(path) {
	val rgbColor by lazy { object : TextRunFieldRgbColor("${path}/rgbColor") {} }
}

abstract class TextRunFieldBookmarkLink(private val path: String) : FieldsList<TextRunField>(path) {
	val id: FieldsList<TextRunField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TextRunField> get() = fieldsList("${path}/tabId")
}

abstract class TextRunFieldHeadingLink(private val path: String) : FieldsList<TextRunField>(path) {
	val id: FieldsList<TextRunField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<TextRunField> get() = fieldsList("${path}/tabId")
}

abstract class TextRunFieldRgbColor(private val path: String) : FieldsList<TextRunField>(path) {
	val blue: FieldsList<TextRunField> get() = fieldsList("${path}/blue")
	val green: FieldsList<TextRunField> get() = fieldsList("${path}/green")
	val red: FieldsList<TextRunField> get() = fieldsList("${path}/red")
}

