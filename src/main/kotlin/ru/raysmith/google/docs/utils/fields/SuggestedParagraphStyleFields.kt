package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedParagraphStyleField : Field

object SuggestedParagraphStyleFields {
    val ALL: FieldsList<SuggestedParagraphStyleField> = fieldsList("*")
	val paragraphStyle = object : SuggestedParagraphStyleFieldParagraphStyle("paragraphStyle") {}
	val paragraphStyleSuggestionState = object : SuggestedParagraphStyleFieldParagraphStyleSuggestionState("paragraphStyleSuggestionState") {}
}

abstract class SuggestedParagraphStyleFieldParagraphStyle(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val alignment: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : SuggestedParagraphStyleFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : SuggestedParagraphStyleFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : SuggestedParagraphStyleFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : SuggestedParagraphStyleFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : SuggestedParagraphStyleFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : SuggestedParagraphStyleFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : SuggestedParagraphStyleFieldTabStop("${path}/tabStops") {} }
}

abstract class SuggestedParagraphStyleFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val alignmentSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : SuggestedParagraphStyleFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class SuggestedParagraphStyleFieldParagraphBorder(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val color by lazy { object : SuggestedParagraphStyleFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/padding") {} }
	val width by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/width") {} }
}

abstract class SuggestedParagraphStyleFieldDimension(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val magnitude: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedParagraphStyleFieldShading(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val backgroundColor by lazy { object : SuggestedParagraphStyleFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class SuggestedParagraphStyleFieldTabStop(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val alignment: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : SuggestedParagraphStyleFieldDimension("${path}/offset") {} }
}

abstract class SuggestedParagraphStyleFieldShadingSuggestionState(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class SuggestedParagraphStyleFieldOptionalColor(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val color by lazy { object : SuggestedParagraphStyleFieldColor("${path}/color") {} }
}

abstract class SuggestedParagraphStyleFieldColor(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val rgbColor by lazy { object : SuggestedParagraphStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedParagraphStyleFieldRgbColor(private val path: String) : FieldsList<SuggestedParagraphStyleField>(path) {
	val blue: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedParagraphStyleField> get() = fieldsList("${path}/red")
}

