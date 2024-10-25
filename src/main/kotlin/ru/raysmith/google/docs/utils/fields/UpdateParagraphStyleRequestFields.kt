package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UpdateParagraphStyleRequestField : Field

object UpdateParagraphStyleRequestFields {
    val ALL: FieldsList<UpdateParagraphStyleRequestField> = fieldsList("*")
	val fields: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("fields")
	val paragraphStyle = object : UpdateParagraphStyleRequestFieldParagraphStyle("paragraphStyle") {}
	val range = object : UpdateParagraphStyleRequestFieldRange("range") {}
}

abstract class UpdateParagraphStyleRequestFieldParagraphStyle(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val alignment: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : UpdateParagraphStyleRequestFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : UpdateParagraphStyleRequestFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : UpdateParagraphStyleRequestFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : UpdateParagraphStyleRequestFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : UpdateParagraphStyleRequestFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : UpdateParagraphStyleRequestFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : UpdateParagraphStyleRequestFieldTabStop("${path}/tabStops") {} }
}

abstract class UpdateParagraphStyleRequestFieldRange(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val endIndex: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/tabId")
}

abstract class UpdateParagraphStyleRequestFieldParagraphBorder(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val color by lazy { object : UpdateParagraphStyleRequestFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/padding") {} }
	val width by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/width") {} }
}

abstract class UpdateParagraphStyleRequestFieldDimension(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val magnitude: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/unit")
}

abstract class UpdateParagraphStyleRequestFieldShading(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val backgroundColor by lazy { object : UpdateParagraphStyleRequestFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class UpdateParagraphStyleRequestFieldTabStop(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val alignment: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : UpdateParagraphStyleRequestFieldDimension("${path}/offset") {} }
}

abstract class UpdateParagraphStyleRequestFieldOptionalColor(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val color by lazy { object : UpdateParagraphStyleRequestFieldColor("${path}/color") {} }
}

abstract class UpdateParagraphStyleRequestFieldColor(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val rgbColor by lazy { object : UpdateParagraphStyleRequestFieldRgbColor("${path}/rgbColor") {} }
}

abstract class UpdateParagraphStyleRequestFieldRgbColor(private val path: String) : FieldsList<UpdateParagraphStyleRequestField>(path) {
	val blue: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<UpdateParagraphStyleRequestField> get() = fieldsList("${path}/red")
}

