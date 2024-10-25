package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface NamedStyleField : Field

object NamedStyleFields {
    val ALL: FieldsList<NamedStyleField> = fieldsList("*")
	val namedStyleType: FieldsList<NamedStyleField> get() = fieldsList("namedStyleType")
	val paragraphStyle = object : NamedStyleFieldParagraphStyle("paragraphStyle") {}
	val textStyle = object : NamedStyleFieldTextStyle("textStyle") {}
}

abstract class NamedStyleFieldParagraphStyle(private val path: String) : FieldsList<NamedStyleField>(path) {
	val alignment: FieldsList<NamedStyleField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<NamedStyleField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : NamedStyleFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : NamedStyleFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : NamedStyleFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : NamedStyleFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : NamedStyleFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<NamedStyleField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<NamedStyleField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : NamedStyleFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : NamedStyleFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : NamedStyleFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<NamedStyleField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<NamedStyleField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<NamedStyleField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<NamedStyleField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<NamedStyleField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : NamedStyleFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : NamedStyleFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : NamedStyleFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<NamedStyleField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : NamedStyleFieldTabStop("${path}/tabStops") {} }
}

abstract class NamedStyleFieldTextStyle(private val path: String) : FieldsList<NamedStyleField>(path) {
	val backgroundColor by lazy { object : NamedStyleFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<NamedStyleField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<NamedStyleField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : NamedStyleFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : NamedStyleFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<NamedStyleField> get() = fieldsList("${path}/italic")
	val link by lazy { object : NamedStyleFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<NamedStyleField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<NamedStyleField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<NamedStyleField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : NamedStyleFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class NamedStyleFieldParagraphBorder(private val path: String) : FieldsList<NamedStyleField>(path) {
	val color by lazy { object : NamedStyleFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<NamedStyleField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : NamedStyleFieldDimension("${path}/padding") {} }
	val width by lazy { object : NamedStyleFieldDimension("${path}/width") {} }
}

abstract class NamedStyleFieldDimension(private val path: String) : FieldsList<NamedStyleField>(path) {
	val magnitude: FieldsList<NamedStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<NamedStyleField> get() = fieldsList("${path}/unit")
}

abstract class NamedStyleFieldShading(private val path: String) : FieldsList<NamedStyleField>(path) {
	val backgroundColor by lazy { object : NamedStyleFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class NamedStyleFieldTabStop(private val path: String) : FieldsList<NamedStyleField>(path) {
	val alignment: FieldsList<NamedStyleField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : NamedStyleFieldDimension("${path}/offset") {} }
}

abstract class NamedStyleFieldOptionalColor(private val path: String) : FieldsList<NamedStyleField>(path) {
	val color by lazy { object : NamedStyleFieldColor("${path}/color") {} }
}

abstract class NamedStyleFieldLink(private val path: String) : FieldsList<NamedStyleField>(path) {
	val bookmark by lazy { object : NamedStyleFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<NamedStyleField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : NamedStyleFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<NamedStyleField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<NamedStyleField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<NamedStyleField> get() = fieldsList("${path}/url")
}

abstract class NamedStyleFieldWeightedFontFamily(private val path: String) : FieldsList<NamedStyleField>(path) {
	val fontFamily: FieldsList<NamedStyleField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<NamedStyleField> get() = fieldsList("${path}/weight")
}

abstract class NamedStyleFieldColor(private val path: String) : FieldsList<NamedStyleField>(path) {
	val rgbColor by lazy { object : NamedStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class NamedStyleFieldBookmarkLink(private val path: String) : FieldsList<NamedStyleField>(path) {
	val id: FieldsList<NamedStyleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<NamedStyleField> get() = fieldsList("${path}/tabId")
}

abstract class NamedStyleFieldHeadingLink(private val path: String) : FieldsList<NamedStyleField>(path) {
	val id: FieldsList<NamedStyleField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<NamedStyleField> get() = fieldsList("${path}/tabId")
}

abstract class NamedStyleFieldRgbColor(private val path: String) : FieldsList<NamedStyleField>(path) {
	val blue: FieldsList<NamedStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<NamedStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<NamedStyleField> get() = fieldsList("${path}/red")
}

