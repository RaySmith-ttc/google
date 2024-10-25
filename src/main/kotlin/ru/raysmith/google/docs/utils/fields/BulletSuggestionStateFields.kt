package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BulletSuggestionStateField : Field

object BulletSuggestionStateFields {
    val ALL: FieldsList<BulletSuggestionStateField> = fieldsList("*")
	val listIdSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("listIdSuggested")
	val nestingLevelSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("nestingLevelSuggested")
	val textStyleSuggestionState = object : BulletSuggestionStateFieldTextStyleSuggestionState("textStyleSuggestionState") {}
}

abstract class BulletSuggestionStateFieldTextStyleSuggestionState(private val path: String) : FieldsList<BulletSuggestionStateField>(path) {
	val backgroundColorSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<BulletSuggestionStateField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

