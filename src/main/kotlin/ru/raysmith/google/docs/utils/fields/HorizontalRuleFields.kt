package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface HorizontalRuleField : Field

object HorizontalRuleFields {
    val ALL: FieldsList<HorizontalRuleField> = fieldsList("*")
	val suggestedDeletionIds: FieldsList<HorizontalRuleField> get() = fieldsList("suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<HorizontalRuleField> get() = fieldsList("suggestedInsertionIds")
	val suggestedTextStyleChanges = object : HorizontalRuleFieldSuggestedTextStyle("suggestedTextStyleChanges") {}
	val textStyle = object : HorizontalRuleFieldTextStyle("textStyle") {}
}

abstract class HorizontalRuleFieldSuggestedTextStyle(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val textStyle by lazy { object : HorizontalRuleFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : HorizontalRuleFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class HorizontalRuleFieldTextStyle(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val backgroundColor by lazy { object : HorizontalRuleFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : HorizontalRuleFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : HorizontalRuleFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/italic")
	val link by lazy { object : HorizontalRuleFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : HorizontalRuleFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class HorizontalRuleFieldTextStyleSuggestionState(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val backgroundColorSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class HorizontalRuleFieldOptionalColor(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val color by lazy { object : HorizontalRuleFieldColor("${path}/color") {} }
}

abstract class HorizontalRuleFieldDimension(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val magnitude: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/unit")
}

abstract class HorizontalRuleFieldLink(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val bookmark by lazy { object : HorizontalRuleFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : HorizontalRuleFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/url")
}

abstract class HorizontalRuleFieldWeightedFontFamily(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val fontFamily: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/weight")
}

abstract class HorizontalRuleFieldColor(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val rgbColor by lazy { object : HorizontalRuleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class HorizontalRuleFieldBookmarkLink(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val id: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/tabId")
}

abstract class HorizontalRuleFieldHeadingLink(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val id: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/tabId")
}

abstract class HorizontalRuleFieldRgbColor(private val path: String) : FieldsList<HorizontalRuleField>(path) {
	val blue: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/green")
	val red: FieldsList<HorizontalRuleField> get() = fieldsList("${path}/red")
}

