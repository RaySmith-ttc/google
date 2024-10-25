package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface SuggestedTableCellStyleField : Field

object SuggestedTableCellStyleFields {
    val ALL: FieldsList<SuggestedTableCellStyleField> = fieldsList("*")
	val tableCellStyle = object : SuggestedTableCellStyleFieldTableCellStyle("tableCellStyle") {}
	val tableCellStyleSuggestionState = object : SuggestedTableCellStyleFieldTableCellStyleSuggestionState("tableCellStyleSuggestionState") {}
}

abstract class SuggestedTableCellStyleFieldTableCellStyle(private val path: String) : FieldsList<SuggestedTableCellStyleField>(path) {
	val backgroundColor by lazy { object : SuggestedTableCellStyleFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : SuggestedTableCellStyleFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : SuggestedTableCellStyleFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : SuggestedTableCellStyleFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : SuggestedTableCellStyleFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : SuggestedTableCellStyleFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : SuggestedTableCellStyleFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : SuggestedTableCellStyleFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : SuggestedTableCellStyleFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/rowSpan")
}

abstract class SuggestedTableCellStyleFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<SuggestedTableCellStyleField>(path) {
	val backgroundColorSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class SuggestedTableCellStyleFieldOptionalColor(private val path: String) : FieldsList<SuggestedTableCellStyleField>(path) {
	val color by lazy { object : SuggestedTableCellStyleFieldColor("${path}/color") {} }
}

abstract class SuggestedTableCellStyleFieldTableCellBorder(private val path: String) : FieldsList<SuggestedTableCellStyleField>(path) {
	val color by lazy { object : SuggestedTableCellStyleFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : SuggestedTableCellStyleFieldDimension("${path}/width") {} }
}

abstract class SuggestedTableCellStyleFieldDimension(private val path: String) : FieldsList<SuggestedTableCellStyleField>(path) {
	val magnitude: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/unit")
}

abstract class SuggestedTableCellStyleFieldColor(private val path: String) : FieldsList<SuggestedTableCellStyleField>(path) {
	val rgbColor by lazy { object : SuggestedTableCellStyleFieldRgbColor("${path}/rgbColor") {} }
}

abstract class SuggestedTableCellStyleFieldRgbColor(private val path: String) : FieldsList<SuggestedTableCellStyleField>(path) {
	val blue: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/blue")
	val green: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/green")
	val red: FieldsList<SuggestedTableCellStyleField> get() = fieldsList("${path}/red")
}

