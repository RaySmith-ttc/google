package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface AutoTextField : Field

object AutoTextFields {
    val ALL: FieldsList<AutoTextField> = fieldsList("*")
	val suggestedDeletionIds: FieldsList<AutoTextField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<AutoTextField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : AutoTextFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : AutoTextFieldTextStyle("textStyle") {}
	val type: FieldsList<AutoTextField> get() = fieldsList("type")
}

abstract class AutoTextFieldSuggestedTextStyle(private val path: String) : FieldsList<AutoTextField>(path) {
	val textStyle by lazy { object : AutoTextFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : AutoTextFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class AutoTextFieldTextStyle(private val path: String) : FieldsList<AutoTextField>(path) {
	val backgroundColor by lazy { object : AutoTextFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<AutoTextField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<AutoTextField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : AutoTextFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : AutoTextFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<AutoTextField> get() = fieldsList("${path}/italic")
	val link by lazy { object : AutoTextFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<AutoTextField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<AutoTextField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<AutoTextField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : AutoTextFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class AutoTextFieldTextStyleSuggestionState(private val path: String) : FieldsList<AutoTextField>(path) {
	val backgroundColorSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<AutoTextField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class AutoTextFieldOptionalColor(private val path: String) : FieldsList<AutoTextField>(path) {
	val color by lazy { object : AutoTextFieldColor("${path}/color") {} }
}

abstract class AutoTextFieldDimension(private val path: String) : FieldsList<AutoTextField>(path) {
	val magnitude: FieldsList<AutoTextField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<AutoTextField> get() = fieldsList("${path}/unit")
}

abstract class AutoTextFieldLink(private val path: String) : FieldsList<AutoTextField>(path) {
	val bookmark by lazy { object : AutoTextFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<AutoTextField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : AutoTextFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<AutoTextField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<AutoTextField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<AutoTextField> get() = fieldsList("${path}/url")
}

abstract class AutoTextFieldWeightedFontFamily(private val path: String) : FieldsList<AutoTextField>(path) {
	val fontFamily: FieldsList<AutoTextField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<AutoTextField> get() = fieldsList("${path}/weight")
}

abstract class AutoTextFieldColor(private val path: String) : FieldsList<AutoTextField>(path) {
	val rgbColor by lazy { object : AutoTextFieldRgbColor("${path}/rgbColor") {} }
}

abstract class AutoTextFieldBookmarkLink(private val path: String) : FieldsList<AutoTextField>(path) {
	val id: FieldsList<AutoTextField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<AutoTextField> get() = fieldsList("${path}/tabId")
}

abstract class AutoTextFieldHeadingLink(private val path: String) : FieldsList<AutoTextField>(path) {
	val id: FieldsList<AutoTextField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<AutoTextField> get() = fieldsList("${path}/tabId")
}

abstract class AutoTextFieldRgbColor(private val path: String) : FieldsList<AutoTextField>(path) {
	val blue: FieldsList<AutoTextField> get() = fieldsList("${path}/blue")
	val green: FieldsList<AutoTextField> get() = fieldsList("${path}/green")
	val red: FieldsList<AutoTextField> get() = fieldsList("${path}/red")
}

