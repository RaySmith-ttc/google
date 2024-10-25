package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NamedStylesField : Field

object NamedStylesFields {
    val ALL: FieldsList<NamedStylesField> = fieldsList("*")
	val styles = object : NamedStylesFieldNamedStyle("styles") {}
}

abstract class NamedStylesFieldNamedStyle(private val path: String) : FieldsList<NamedStylesField>(path) {
	val namedStyleType: FieldsList<NamedStylesField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyle by lazy { object : NamedStylesFieldParagraphStyle("${path}/paragraphStyle") {} }
	val textStyle by lazy { object : NamedStylesFieldTextStyle("${path}/textStyle") {} }
}

abstract class NamedStylesFieldParagraphStyle(private val path: String) : FieldsList<NamedStylesField>(path) {
	val alignment: FieldsList<NamedStylesField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<NamedStylesField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : NamedStylesFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : NamedStylesFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : NamedStylesFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : NamedStylesFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : NamedStylesFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<NamedStylesField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<NamedStylesField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : NamedStylesFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : NamedStylesFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : NamedStylesFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<NamedStylesField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<NamedStylesField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<NamedStylesField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<NamedStylesField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<NamedStylesField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : NamedStylesFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : NamedStylesFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : NamedStylesFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<NamedStylesField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : NamedStylesFieldTabStop("${path}/tabStops") {} }
}

abstract class NamedStylesFieldTextStyle(private val path: String) : FieldsList<NamedStylesField>(path) {
	val backgroundColor by lazy { object : NamedStylesFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<NamedStylesField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<NamedStylesField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : NamedStylesFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : NamedStylesFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<NamedStylesField> get() = fieldsList("${path}/italic")
	val link by lazy { object : NamedStylesFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<NamedStylesField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<NamedStylesField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<NamedStylesField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : NamedStylesFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class NamedStylesFieldParagraphBorder(private val path: String) : FieldsList<NamedStylesField>(path) {
	val color by lazy { object : NamedStylesFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<NamedStylesField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : NamedStylesFieldDimension("${path}/padding") {} }
	val width by lazy { object : NamedStylesFieldDimension("${path}/width") {} }
}

abstract class NamedStylesFieldDimension(private val path: String) : FieldsList<NamedStylesField>(path) {
	val magnitude: FieldsList<NamedStylesField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<NamedStylesField> get() = fieldsList("${path}/unit")
}

abstract class NamedStylesFieldShading(private val path: String) : FieldsList<NamedStylesField>(path) {
	val backgroundColor by lazy { object : NamedStylesFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class NamedStylesFieldTabStop(private val path: String) : FieldsList<NamedStylesField>(path) {
	val alignment: FieldsList<NamedStylesField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : NamedStylesFieldDimension("${path}/offset") {} }
}

abstract class NamedStylesFieldOptionalColor(private val path: String) : FieldsList<NamedStylesField>(path) {
	val color by lazy { object : NamedStylesFieldColor("${path}/color") {} }
}

abstract class NamedStylesFieldLink(private val path: String) : FieldsList<NamedStylesField>(path) {
	val bookmark by lazy { object : NamedStylesFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<NamedStylesField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : NamedStylesFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<NamedStylesField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<NamedStylesField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<NamedStylesField> get() = fieldsList("${path}/url")
}

abstract class NamedStylesFieldWeightedFontFamily(private val path: String) : FieldsList<NamedStylesField>(path) {
	val fontFamily: FieldsList<NamedStylesField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<NamedStylesField> get() = fieldsList("${path}/weight")
}

abstract class NamedStylesFieldColor(private val path: String) : FieldsList<NamedStylesField>(path) {
	val rgbColor by lazy { object : NamedStylesFieldRgbColor("${path}/rgbColor") {} }
}

abstract class NamedStylesFieldBookmarkLink(private val path: String) : FieldsList<NamedStylesField>(path) {
	val id: FieldsList<NamedStylesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<NamedStylesField> get() = fieldsList("${path}/tabId")
}

abstract class NamedStylesFieldHeadingLink(private val path: String) : FieldsList<NamedStylesField>(path) {
	val id: FieldsList<NamedStylesField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<NamedStylesField> get() = fieldsList("${path}/tabId")
}

abstract class NamedStylesFieldRgbColor(private val path: String) : FieldsList<NamedStylesField>(path) {
	val blue: FieldsList<NamedStylesField> get() = fieldsList("${path}/blue")
	val green: FieldsList<NamedStylesField> get() = fieldsList("${path}/green")
	val red: FieldsList<NamedStylesField> get() = fieldsList("${path}/red")
}

