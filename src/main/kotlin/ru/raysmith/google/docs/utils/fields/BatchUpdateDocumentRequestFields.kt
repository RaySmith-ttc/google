package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface BatchUpdateDocumentRequestField : Field

object BatchUpdateDocumentRequestFields {
    val ALL: FieldsList<BatchUpdateDocumentRequestField> = fieldsList("*")
	val requests = object : BatchUpdateDocumentRequestFieldRequest("requests") {}
	val writeControl = object : BatchUpdateDocumentRequestFieldWriteControl("writeControl") {}
}

abstract class BatchUpdateDocumentRequestFieldRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val createFooter by lazy { object : BatchUpdateDocumentRequestFieldCreateFooterRequest("${path}/createFooter") {} }
	val createFootnote by lazy { object : BatchUpdateDocumentRequestFieldCreateFootnoteRequest("${path}/createFootnote") {} }
	val createHeader by lazy { object : BatchUpdateDocumentRequestFieldCreateHeaderRequest("${path}/createHeader") {} }
	val createNamedRange by lazy { object : BatchUpdateDocumentRequestFieldCreateNamedRangeRequest("${path}/createNamedRange") {} }
	val createParagraphBullets by lazy { object : BatchUpdateDocumentRequestFieldCreateParagraphBulletsRequest("${path}/createParagraphBullets") {} }
	val deleteContentRange by lazy { object : BatchUpdateDocumentRequestFieldDeleteContentRangeRequest("${path}/deleteContentRange") {} }
	val deleteFooter by lazy { object : BatchUpdateDocumentRequestFieldDeleteFooterRequest("${path}/deleteFooter") {} }
	val deleteHeader by lazy { object : BatchUpdateDocumentRequestFieldDeleteHeaderRequest("${path}/deleteHeader") {} }
	val deleteNamedRange by lazy { object : BatchUpdateDocumentRequestFieldDeleteNamedRangeRequest("${path}/deleteNamedRange") {} }
	val deleteParagraphBullets by lazy { object : BatchUpdateDocumentRequestFieldDeleteParagraphBulletsRequest("${path}/deleteParagraphBullets") {} }
	val deletePositionedObject by lazy { object : BatchUpdateDocumentRequestFieldDeletePositionedObjectRequest("${path}/deletePositionedObject") {} }
	val deleteTableColumn by lazy { object : BatchUpdateDocumentRequestFieldDeleteTableColumnRequest("${path}/deleteTableColumn") {} }
	val deleteTableRow by lazy { object : BatchUpdateDocumentRequestFieldDeleteTableRowRequest("${path}/deleteTableRow") {} }
	val insertInlineImage by lazy { object : BatchUpdateDocumentRequestFieldInsertInlineImageRequest("${path}/insertInlineImage") {} }
	val insertPageBreak by lazy { object : BatchUpdateDocumentRequestFieldInsertPageBreakRequest("${path}/insertPageBreak") {} }
	val insertSectionBreak by lazy { object : BatchUpdateDocumentRequestFieldInsertSectionBreakRequest("${path}/insertSectionBreak") {} }
	val insertTable by lazy { object : BatchUpdateDocumentRequestFieldInsertTableRequest("${path}/insertTable") {} }
	val insertTableColumn by lazy { object : BatchUpdateDocumentRequestFieldInsertTableColumnRequest("${path}/insertTableColumn") {} }
	val insertTableRow by lazy { object : BatchUpdateDocumentRequestFieldInsertTableRowRequest("${path}/insertTableRow") {} }
	val insertText by lazy { object : BatchUpdateDocumentRequestFieldInsertTextRequest("${path}/insertText") {} }
	val mergeTableCells by lazy { object : BatchUpdateDocumentRequestFieldMergeTableCellsRequest("${path}/mergeTableCells") {} }
	val pinTableHeaderRows by lazy { object : BatchUpdateDocumentRequestFieldPinTableHeaderRowsRequest("${path}/pinTableHeaderRows") {} }
	val replaceAllText by lazy { object : BatchUpdateDocumentRequestFieldReplaceAllTextRequest("${path}/replaceAllText") {} }
	val replaceImage by lazy { object : BatchUpdateDocumentRequestFieldReplaceImageRequest("${path}/replaceImage") {} }
	val replaceNamedRangeContent by lazy { object : BatchUpdateDocumentRequestFieldReplaceNamedRangeContentRequest("${path}/replaceNamedRangeContent") {} }
	val unmergeTableCells by lazy { object : BatchUpdateDocumentRequestFieldUnmergeTableCellsRequest("${path}/unmergeTableCells") {} }
	val updateDocumentStyle by lazy { object : BatchUpdateDocumentRequestFieldUpdateDocumentStyleRequest("${path}/updateDocumentStyle") {} }
	val updateParagraphStyle by lazy { object : BatchUpdateDocumentRequestFieldUpdateParagraphStyleRequest("${path}/updateParagraphStyle") {} }
	val updateSectionStyle by lazy { object : BatchUpdateDocumentRequestFieldUpdateSectionStyleRequest("${path}/updateSectionStyle") {} }
	val updateTableCellStyle by lazy { object : BatchUpdateDocumentRequestFieldUpdateTableCellStyleRequest("${path}/updateTableCellStyle") {} }
	val updateTableColumnProperties by lazy { object : BatchUpdateDocumentRequestFieldUpdateTableColumnPropertiesRequest("${path}/updateTableColumnProperties") {} }
	val updateTableRowStyle by lazy { object : BatchUpdateDocumentRequestFieldUpdateTableRowStyleRequest("${path}/updateTableRowStyle") {} }
	val updateTextStyle by lazy { object : BatchUpdateDocumentRequestFieldUpdateTextStyleRequest("${path}/updateTextStyle") {} }
}

abstract class BatchUpdateDocumentRequestFieldWriteControl(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val requiredRevisionId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/requiredRevisionId")
	val targetRevisionId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/targetRevisionId")
}

abstract class BatchUpdateDocumentRequestFieldCreateFooterRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val sectionBreakLocation by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/sectionBreakLocation") {} }
	val type: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateDocumentRequestFieldCreateFootnoteRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val endOfSegmentLocation by lazy { object : BatchUpdateDocumentRequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/location") {} }
}

abstract class BatchUpdateDocumentRequestFieldCreateHeaderRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val sectionBreakLocation by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/sectionBreakLocation") {} }
	val type: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/type")
}

abstract class BatchUpdateDocumentRequestFieldCreateNamedRangeRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val name: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/name")
	val range by lazy { object : BatchUpdateDocumentRequestFieldRange("${path}/range") {} }
}

abstract class BatchUpdateDocumentRequestFieldCreateParagraphBulletsRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val bulletPreset: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/bulletPreset")
	val range by lazy { object : BatchUpdateDocumentRequestFieldRange("${path}/range") {} }
}

abstract class BatchUpdateDocumentRequestFieldDeleteContentRangeRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val range by lazy { object : BatchUpdateDocumentRequestFieldRange("${path}/range") {} }
}

abstract class BatchUpdateDocumentRequestFieldDeleteFooterRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val footerId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/footerId")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldDeleteHeaderRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val headerId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/headerId")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldDeleteNamedRangeRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val name: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/namedRangeId")
	val tabsCriteria by lazy { object : BatchUpdateDocumentRequestFieldTabsCriteria("${path}/tabsCriteria") {} }
}

abstract class BatchUpdateDocumentRequestFieldDeleteParagraphBulletsRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val range by lazy { object : BatchUpdateDocumentRequestFieldRange("${path}/range") {} }
}

abstract class BatchUpdateDocumentRequestFieldDeletePositionedObjectRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val objectId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/objectId")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldDeleteTableColumnRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val tableCellLocation by lazy { object : BatchUpdateDocumentRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldDeleteTableRowRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val tableCellLocation by lazy { object : BatchUpdateDocumentRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldInsertInlineImageRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val endOfSegmentLocation by lazy { object : BatchUpdateDocumentRequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/location") {} }
	val objectSize by lazy { object : BatchUpdateDocumentRequestFieldSize("${path}/objectSize") {} }
	val uri: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/uri")
}

abstract class BatchUpdateDocumentRequestFieldInsertPageBreakRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val endOfSegmentLocation by lazy { object : BatchUpdateDocumentRequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/location") {} }
}

abstract class BatchUpdateDocumentRequestFieldInsertSectionBreakRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val endOfSegmentLocation by lazy { object : BatchUpdateDocumentRequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/location") {} }
	val sectionType: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/sectionType")
}

abstract class BatchUpdateDocumentRequestFieldInsertTableRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val columns: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/columns")
	val endOfSegmentLocation by lazy { object : BatchUpdateDocumentRequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/location") {} }
	val rows: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/rows")
}

abstract class BatchUpdateDocumentRequestFieldInsertTableColumnRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val insertRight: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/insertRight")
	val tableCellLocation by lazy { object : BatchUpdateDocumentRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldInsertTableRowRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val insertBelow: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/insertBelow")
	val tableCellLocation by lazy { object : BatchUpdateDocumentRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldInsertTextRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val endOfSegmentLocation by lazy { object : BatchUpdateDocumentRequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/location") {} }
	val text: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/text")
}

abstract class BatchUpdateDocumentRequestFieldMergeTableCellsRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val tableRange by lazy { object : BatchUpdateDocumentRequestFieldTableRange("${path}/tableRange") {} }
}

abstract class BatchUpdateDocumentRequestFieldPinTableHeaderRowsRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val pinnedHeaderRowsCount: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/pinnedHeaderRowsCount")
	val tableStartLocation by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldReplaceAllTextRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val containsText by lazy { object : BatchUpdateDocumentRequestFieldSubstringMatchCriteria("${path}/containsText") {} }
	val replaceText: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/replaceText")
	val tabsCriteria by lazy { object : BatchUpdateDocumentRequestFieldTabsCriteria("${path}/tabsCriteria") {} }
}

abstract class BatchUpdateDocumentRequestFieldReplaceImageRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val imageObjectId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/imageObjectId")
	val imageReplaceMethod: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/imageReplaceMethod")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
	val uri: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/uri")
}

abstract class BatchUpdateDocumentRequestFieldReplaceNamedRangeContentRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val namedRangeId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/namedRangeId")
	val namedRangeName: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/namedRangeName")
	val tabsCriteria by lazy { object : BatchUpdateDocumentRequestFieldTabsCriteria("${path}/tabsCriteria") {} }
	val text: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/text")
}

abstract class BatchUpdateDocumentRequestFieldUnmergeTableCellsRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val tableRange by lazy { object : BatchUpdateDocumentRequestFieldTableRange("${path}/tableRange") {} }
}

abstract class BatchUpdateDocumentRequestFieldUpdateDocumentStyleRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val documentStyle by lazy { object : BatchUpdateDocumentRequestFieldDocumentStyle("${path}/documentStyle") {} }
	val fields: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fields")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldUpdateParagraphStyleRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val fields: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fields")
	val paragraphStyle by lazy { object : BatchUpdateDocumentRequestFieldParagraphStyle("${path}/paragraphStyle") {} }
	val range by lazy { object : BatchUpdateDocumentRequestFieldRange("${path}/range") {} }
}

abstract class BatchUpdateDocumentRequestFieldUpdateSectionStyleRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val fields: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : BatchUpdateDocumentRequestFieldRange("${path}/range") {} }
	val sectionStyle by lazy { object : BatchUpdateDocumentRequestFieldSectionStyle("${path}/sectionStyle") {} }
}

abstract class BatchUpdateDocumentRequestFieldUpdateTableCellStyleRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val fields: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fields")
	val tableCellStyle by lazy { object : BatchUpdateDocumentRequestFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableRange by lazy { object : BatchUpdateDocumentRequestFieldTableRange("${path}/tableRange") {} }
	val tableStartLocation by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldUpdateTableColumnPropertiesRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val columnIndices: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/columnIndices")
	val fields: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fields")
	val tableColumnProperties by lazy { object : BatchUpdateDocumentRequestFieldTableColumnProperties("${path}/tableColumnProperties") {} }
	val tableStartLocation by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldUpdateTableRowStyleRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val fields: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fields")
	val rowIndices: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/rowIndices")
	val tableRowStyle by lazy { object : BatchUpdateDocumentRequestFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableStartLocation by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldUpdateTextStyleRequest(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val fields: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : BatchUpdateDocumentRequestFieldRange("${path}/range") {} }
	val textStyle by lazy { object : BatchUpdateDocumentRequestFieldTextStyle("${path}/textStyle") {} }
}

abstract class BatchUpdateDocumentRequestFieldLocation(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val index: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val segmentId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldRange(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val endIndex: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldTabsCriteria(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val tabIds: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabIds")
}

abstract class BatchUpdateDocumentRequestFieldTableCellLocation(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val columnIndex: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : BatchUpdateDocumentRequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldSize(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val height by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/height") {} }
	val width by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/width") {} }
}

abstract class BatchUpdateDocumentRequestFieldTableRange(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val columnSpan: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/columnSpan")
	val rowSpan: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/rowSpan")
	val tableCellLocation by lazy { object : BatchUpdateDocumentRequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class BatchUpdateDocumentRequestFieldSubstringMatchCriteria(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val matchCase: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/matchCase")
	val text: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/text")
}

abstract class BatchUpdateDocumentRequestFieldDocumentStyle(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val background by lazy { object : BatchUpdateDocumentRequestFieldBackground("${path}/background") {} }
	val defaultFooterId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/pageNumberStart")
	val pageSize by lazy { object : BatchUpdateDocumentRequestFieldSize("${path}/pageSize") {} }
	val useCustomHeaderFooterMargins: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class BatchUpdateDocumentRequestFieldParagraphStyle(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val alignment: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : BatchUpdateDocumentRequestFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : BatchUpdateDocumentRequestFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : BatchUpdateDocumentRequestFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : BatchUpdateDocumentRequestFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : BatchUpdateDocumentRequestFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : BatchUpdateDocumentRequestFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : BatchUpdateDocumentRequestFieldTabStop("${path}/tabStops") {} }
}

abstract class BatchUpdateDocumentRequestFieldSectionStyle(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val columnProperties by lazy { object : BatchUpdateDocumentRequestFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class BatchUpdateDocumentRequestFieldTableCellStyle(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val backgroundColor by lazy { object : BatchUpdateDocumentRequestFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : BatchUpdateDocumentRequestFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : BatchUpdateDocumentRequestFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : BatchUpdateDocumentRequestFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : BatchUpdateDocumentRequestFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/rowSpan")
}

abstract class BatchUpdateDocumentRequestFieldTableColumnProperties(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val width by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/width") {} }
	val widthType: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/widthType")
}

abstract class BatchUpdateDocumentRequestFieldTableRowStyle(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val minRowHeight by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tableHeader")
}

abstract class BatchUpdateDocumentRequestFieldTextStyle(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val backgroundColor by lazy { object : BatchUpdateDocumentRequestFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : BatchUpdateDocumentRequestFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : BatchUpdateDocumentRequestFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : BatchUpdateDocumentRequestFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class BatchUpdateDocumentRequestFieldDimension(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val magnitude: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/unit")
}

abstract class BatchUpdateDocumentRequestFieldBackground(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val color by lazy { object : BatchUpdateDocumentRequestFieldOptionalColor("${path}/color") {} }
}

abstract class BatchUpdateDocumentRequestFieldParagraphBorder(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val color by lazy { object : BatchUpdateDocumentRequestFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/padding") {} }
	val width by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/width") {} }
}

abstract class BatchUpdateDocumentRequestFieldShading(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val backgroundColor by lazy { object : BatchUpdateDocumentRequestFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class BatchUpdateDocumentRequestFieldTabStop(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val alignment: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/offset") {} }
}

abstract class BatchUpdateDocumentRequestFieldSectionColumnProperties(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val paddingEnd by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/width") {} }
}

abstract class BatchUpdateDocumentRequestFieldOptionalColor(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val color by lazy { object : BatchUpdateDocumentRequestFieldColor("${path}/color") {} }
}

abstract class BatchUpdateDocumentRequestFieldTableCellBorder(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val color by lazy { object : BatchUpdateDocumentRequestFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : BatchUpdateDocumentRequestFieldDimension("${path}/width") {} }
}

abstract class BatchUpdateDocumentRequestFieldLink(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val bookmark by lazy { object : BatchUpdateDocumentRequestFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : BatchUpdateDocumentRequestFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/url")
}

abstract class BatchUpdateDocumentRequestFieldWeightedFontFamily(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val fontFamily: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/weight")
}

abstract class BatchUpdateDocumentRequestFieldColor(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val rgbColor by lazy { object : BatchUpdateDocumentRequestFieldRgbColor("${path}/rgbColor") {} }
}

abstract class BatchUpdateDocumentRequestFieldBookmarkLink(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val id: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldHeadingLink(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val id: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/tabId")
}

abstract class BatchUpdateDocumentRequestFieldRgbColor(private val path: String) : FieldsList<BatchUpdateDocumentRequestField>(path) {
	val blue: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<BatchUpdateDocumentRequestField> get() = fieldsList("${path}/red")
}

