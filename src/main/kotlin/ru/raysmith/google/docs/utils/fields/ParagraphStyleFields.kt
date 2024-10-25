package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface ParagraphStyleField : Field

object ParagraphStyleFields {
    val ALL: FieldsList<ParagraphStyleField> = fieldsList("*")
	val alignment: FieldsList<ParagraphStyleField> get() = fieldsList("alignment")
	val avoidWidowAndOrphan: FieldsList<ParagraphStyleField> get() = fieldsList("avoidWidowAndOrphan")
	val borderBetween = object : ParagraphStyleFieldParagraphBorder("borderBetween") {}
	val borderBottom = object : ParagraphStyleFieldParagraphBorder("borderBottom") {}
	val borderLeft = object : ParagraphStyleFieldParagraphBorder("borderLeft") {}
	val borderRight = object : ParagraphStyleFieldParagraphBorder("borderRight") {}
	val borderTop = object : ParagraphStyleFieldParagraphBorder("borderTop") {}
	val direction: FieldsList<ParagraphStyleField> get() = fieldsList("direction")
	val headingId: FieldsList<ParagraphStyleField> get() = fieldsList("headingId")
	val indentEnd = object : ParagraphStyleFieldDimension("indentEnd") {}
	val indentFirstLine = object : ParagraphStyleFieldDimension("indentFirstLine") {}
	val indentStart = object : ParagraphStyleFieldDimension("indentStart") {}
	val keepLinesTogether: FieldsList<ParagraphStyleField> get() = fieldsList("keepLinesTogether")
	val keepWithNext: FieldsList<ParagraphStyleField> get() = fieldsList("keepWithNext")
	val lineSpacing: FieldsList<ParagraphStyleField> get() = fieldsList("lineSpacing")
	val namedStyleType: FieldsList<ParagraphStyleField> get() = fieldsList("namedStyleType")
	val pageBreakBefore: FieldsList<ParagraphStyleField> get() = fieldsList("pageBreakBefore")
	val shading = object : ParagraphStyleFieldShading("shading") {}
	val spaceAbove = object : ParagraphStyleFieldDimension("spaceAbove") {}
	val spaceBelow = object : ParagraphStyleFieldDimension("spaceBelow") {}
	val spacingMode: FieldsList<ParagraphStyleField> get() = fieldsList("spacingMode")
	val tabStops = object : ParagraphStyleFieldTabStop("tabStops") {}
}

abstract class ParagraphStyleFieldParagraphBorder(private val path: String) : FieldsList<ParagraphStyleField>(path) {
	val color by lazy { object : ParagraphStyleFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<ParagraphStyleField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : ParagraphStyleFieldDimension("${path}/padding") {} }
	val width by lazy { object : ParagraphStyleFieldDimension("${path}/width") {} }
}

abstract class ParagraphStyleFieldDimension(private val path: String) : FieldsList<ParagraphStyleField>(path) {
	val magnitude: FieldsList<ParagraphStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<ParagraphStyleField> get() = fieldsList("${path}/unit")
}

abstract class ParagraphStyleFieldShading(private val path: String) : FieldsList<ParagraphStyleField>(path) {
	val backgroundColor by lazy { object : ParagraphStyleFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class ParagraphStyleFieldTabStop(private val path: String) : FieldsList<ParagraphStyleField>(path) {
	val alignment: FieldsList<ParagraphStyleField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : ParagraphStyleFieldDimension("${path}/offset") {} }
}

abstract class ParagraphStyleFieldOptionalColor(private val path: String) : FieldsList<ParagraphStyleField>(path) {
	val color by lazy { object : ParagraphStyleFieldColor("${path}/color") {} }
}

abstract class ParagraphStyleFieldColor(private val path: String) : FieldsList<ParagraphStyleField>(path) {
	val rgbColor by lazy { object : ParagraphStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class ParagraphStyleFieldRgbColor(private val path: String) : FieldsList<ParagraphStyleField>(path) {
	val blue: FieldsList<ParagraphStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<ParagraphStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<ParagraphStyleField> get() = fieldsList("${path}/red")
}

