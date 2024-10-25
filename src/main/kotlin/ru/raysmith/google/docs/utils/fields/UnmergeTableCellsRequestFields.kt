package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface UnmergeTableCellsRequestField : Field

object UnmergeTableCellsRequestFields {
    val ALL: FieldsList<UnmergeTableCellsRequestField> = fieldsList("*")
	val tableRange = object : UnmergeTableCellsRequestFieldTableRange("tableRange") {}
}

abstract class UnmergeTableCellsRequestFieldTableRange(private val path: String) : FieldsList<UnmergeTableCellsRequestField>(path) {
	val columnSpan: FieldsList<UnmergeTableCellsRequestField> get() = fieldsList("${path}/columnSpan")
	val rowSpan: FieldsList<UnmergeTableCellsRequestField> get() = fieldsList("${path}/rowSpan")
	val tableCellLocation by lazy { object : UnmergeTableCellsRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class UnmergeTableCellsRequestFieldTableCellLocation(private val path: String) : FieldsList<UnmergeTableCellsRequestField>(path) {
	val columnIndex: FieldsList<UnmergeTableCellsRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<UnmergeTableCellsRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : UnmergeTableCellsRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class UnmergeTableCellsRequestFieldLocation(private val path: String) : FieldsList<UnmergeTableCellsRequestField>(path) {
	val index: FieldsList<UnmergeTableCellsRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<UnmergeTableCellsRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<UnmergeTableCellsRequestField> get() = fieldsList("${path}/tabId")
}

