package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ColumnBreakField : Field

object ColumnBreakFields {
    val ALL: FieldsList<ColumnBreakField> = fieldsList("*")
	val suggestedDeletionIds: FieldsList<ColumnBreakField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<ColumnBreakField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : ColumnBreakFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : ColumnBreakFieldTextStyle("textStyle") {}
}

abstract class ColumnBreakFieldSuggestedTextStyle(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val textStyle by lazy { object : ColumnBreakFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : ColumnBreakFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class ColumnBreakFieldTextStyle(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val backgroundColor by lazy { object : ColumnBreakFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<ColumnBreakField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<ColumnBreakField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : ColumnBreakFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : ColumnBreakFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<ColumnBreakField> get() = fieldsList("${path}/italic")
	val link by lazy { object : ColumnBreakFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<ColumnBreakField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<ColumnBreakField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<ColumnBreakField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : ColumnBreakFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class ColumnBreakFieldTextStyleSuggestionState(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val backgroundColorSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<ColumnBreakField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class ColumnBreakFieldOptionalColor(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val color by lazy { object : ColumnBreakFieldColor("${path}/color") {} }
}

abstract class ColumnBreakFieldDimension(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val magnitude: FieldsList<ColumnBreakField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<ColumnBreakField> get() = fieldsList("${path}/unit")
}

abstract class ColumnBreakFieldLink(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val bookmark by lazy { object : ColumnBreakFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<ColumnBreakField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : ColumnBreakFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<ColumnBreakField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<ColumnBreakField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<ColumnBreakField> get() = fieldsList("${path}/url")
}

abstract class ColumnBreakFieldWeightedFontFamily(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val fontFamily: FieldsList<ColumnBreakField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<ColumnBreakField> get() = fieldsList("${path}/weight")
}

abstract class ColumnBreakFieldColor(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val rgbColor by lazy { object : ColumnBreakFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ColumnBreakFieldBookmarkLink(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val id: FieldsList<ColumnBreakField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ColumnBreakField> get() = fieldsList("${path}/tabId")
}

abstract class ColumnBreakFieldHeadingLink(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val id: FieldsList<ColumnBreakField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<ColumnBreakField> get() = fieldsList("${path}/tabId")
}

abstract class ColumnBreakFieldRgbColor(private val path: String) : FieldsList<ColumnBreakField>(path) {
	val blue: FieldsList<ColumnBreakField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ColumnBreakField> get() = fieldsList("${path}/green")
	val red: FieldsList<ColumnBreakField> get() = fieldsList("${path}/red")
}

