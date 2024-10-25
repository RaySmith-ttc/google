package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface MergeTableCellsRequestField : Field

object MergeTableCellsRequestFields {
    val ALL: FieldsList<MergeTableCellsRequestField> = fieldsList("*")
	val tableRange = object : MergeTableCellsRequestFieldTableRange("tableRange") {}
}

abstract class MergeTableCellsRequestFieldTableRange(private val path: String) : FieldsList<MergeTableCellsRequestField>(path) {
	val columnSpan: FieldsList<MergeTableCellsRequestField> get() = fieldsList("${path}/columnSpan")
	val rowSpan: FieldsList<MergeTableCellsRequestField> get() = fieldsList("${path}/rowSpan")
	val tableCellLocation by lazy { object : MergeTableCellsRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class MergeTableCellsRequestFieldTableCellLocation(private val path: String) : FieldsList<MergeTableCellsRequestField>(path) {
	val columnIndex: FieldsList<MergeTableCellsRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<MergeTableCellsRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : MergeTableCellsRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class MergeTableCellsRequestFieldLocation(private val path: String) : FieldsList<MergeTableCellsRequestField>(path) {
	val index: FieldsList<MergeTableCellsRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<MergeTableCellsRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<MergeTableCellsRequestField> get() = fieldsList("${path}/tabId")
}

