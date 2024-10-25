package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedBulletField : Field

object SuggestedBulletFields {
    val ALL: FieldsList<SuggestedBulletField> = fieldsList("*")
	val bullet = object : SuggestedBulletFieldBullet("bullet") {}
	val bulletSuggestionState = object : SuggestedBulletFieldBulletSuggestionState("bulletSuggestionState") {}
}

abstract class SuggestedBulletFieldBullet(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val listId: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : SuggestedBulletFieldTextStyle("${path}/textStyle") {} }
}

abstract class SuggestedBulletFieldBulletSuggestionState(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val listIdSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : SuggestedBulletFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class SuggestedBulletFieldTextStyle(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val backgroundColor by lazy { object : SuggestedBulletFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : SuggestedBulletFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : SuggestedBulletFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/italic")
	val link by lazy { object : SuggestedBulletFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : SuggestedBulletFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class SuggestedBulletFieldTextStyleSuggestionState(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class SuggestedBulletFieldOptionalColor(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val color by lazy { object : SuggestedBulletFieldColor("${path}/color") {} }
}

abstract class SuggestedBulletFieldDimension(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val magnitude: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedBulletFieldLink(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val bookmark by lazy { object : SuggestedBulletFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : SuggestedBulletFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/url")
}

abstract class SuggestedBulletFieldWeightedFontFamily(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val fontFamily: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/weight")
}

abstract class SuggestedBulletFieldColor(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val rgbColor by lazy { object : SuggestedBulletFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedBulletFieldBookmarkLink(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val id: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedBulletFieldHeadingLink(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val id: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/tabId")
}

abstract class SuggestedBulletFieldRgbColor(private val path: String) : FieldsList<SuggestedBulletField>(path) {
	val blue: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedBulletField> get() = fieldsList("${path}/red")
}

