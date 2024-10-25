package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface RequestField : Field

object RequestFields {
    val ALL: FieldsList<RequestField> = fieldsList("*")
	val createFooter = object : RequestFieldCreateFooterRequest("createFooter") {}
	val createFootnote = object : RequestFieldCreateFootnoteRequest("createFootnote") {}
	val createHeader = object : RequestFieldCreateHeaderRequest("createHeader") {}
	val createNamedRange = object : RequestFieldCreateNamedRangeRequest("createNamedRange") {}
	val createParagraphBullets = object : RequestFieldCreateParagraphBulletsRequest("createParagraphBullets") {}
	val deleteContentRange = object : RequestFieldDeleteContentRangeRequest("deleteContentRange") {}
	val deleteFooter = object : RequestFieldDeleteFooterRequest("deleteFooter") {}
	val deleteHeader = object : RequestFieldDeleteHeaderRequest("deleteHeader") {}
	val deleteNamedRange = object : RequestFieldDeleteNamedRangeRequest("deleteNamedRange") {}
	val deleteParagraphBullets = object : RequestFieldDeleteParagraphBulletsRequest("deleteParagraphBullets") {}
	val deletePositionedObject = object : RequestFieldDeletePositionedObjectRequest("deletePositionedObject") {}
	val deleteTableColumn = object : RequestFieldDeleteTableColumnRequest("deleteTableColumn") {}
	val deleteTableRow = object : RequestFieldDeleteTableRowRequest("deleteTableRow") {}
	val insertInlineImage = object : RequestFieldInsertInlineImageRequest("insertInlineImage") {}
	val insertPageBreak = object : RequestFieldInsertPageBreakRequest("insertPageBreak") {}
	val insertSectionBreak = object : RequestFieldInsertSectionBreakRequest("insertSectionBreak") {}
	val insertTable = object : RequestFieldInsertTableRequest("insertTable") {}
	val insertTableColumn = object : RequestFieldInsertTableColumnRequest("insertTableColumn") {}
	val insertTableRow = object : RequestFieldInsertTableRowRequest("insertTableRow") {}
	val insertText = object : RequestFieldInsertTextRequest("insertText") {}
	val mergeTableCells = object : RequestFieldMergeTableCellsRequest("mergeTableCells") {}
	val pinTableHeaderRows = object : RequestFieldPinTableHeaderRowsRequest("pinTableHeaderRows") {}
	val replaceAllText = object : RequestFieldReplaceAllTextRequest("replaceAllText") {}
	val replaceImage = object : RequestFieldReplaceImageRequest("replaceImage") {}
	val replaceNamedRangeContent = object : RequestFieldReplaceNamedRangeContentRequest("replaceNamedRangeContent") {}
	val unmergeTableCells = object : RequestFieldUnmergeTableCellsRequest("unmergeTableCells") {}
	val updateDocumentStyle = object : RequestFieldUpdateDocumentStyleRequest("updateDocumentStyle") {}
	val updateParagraphStyle = object : RequestFieldUpdateParagraphStyleRequest("updateParagraphStyle") {}
	val updateSectionStyle = object : RequestFieldUpdateSectionStyleRequest("updateSectionStyle") {}
	val updateTableCellStyle = object : RequestFieldUpdateTableCellStyleRequest("updateTableCellStyle") {}
	val updateTableColumnProperties = object : RequestFieldUpdateTableColumnPropertiesRequest("updateTableColumnProperties") {}
	val updateTableRowStyle = object : RequestFieldUpdateTableRowStyleRequest("updateTableRowStyle") {}
	val updateTextStyle = object : RequestFieldUpdateTextStyleRequest("updateTextStyle") {}
}

abstract class RequestFieldCreateFooterRequest(private val path: String) : FieldsList<RequestField>(path) {
	val sectionBreakLocation by lazy { object : RequestFieldLocation("${path}/sectionBreakLocation") {} }
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldCreateFootnoteRequest(private val path: String) : FieldsList<RequestField>(path) {
	val endOfSegmentLocation by lazy { object : RequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : RequestFieldLocation("${path}/location") {} }
}

abstract class RequestFieldCreateHeaderRequest(private val path: String) : FieldsList<RequestField>(path) {
	val sectionBreakLocation by lazy { object : RequestFieldLocation("${path}/sectionBreakLocation") {} }
	val type: FieldsList<RequestField> get() = fieldsList("${path}/type")
}

abstract class RequestFieldCreateNamedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val name: FieldsList<RequestField> get() = fieldsList("${path}/name")
	val range by lazy { object : RequestFieldRange("${path}/range") {} }
}

abstract class RequestFieldCreateParagraphBulletsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val bulletPreset: FieldsList<RequestField> get() = fieldsList("${path}/bulletPreset")
	val range by lazy { object : RequestFieldRange("${path}/range") {} }
}

abstract class RequestFieldDeleteContentRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldRange("${path}/range") {} }
}

abstract class RequestFieldDeleteFooterRequest(private val path: String) : FieldsList<RequestField>(path) {
	val footerId: FieldsList<RequestField> get() = fieldsList("${path}/footerId")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldDeleteHeaderRequest(private val path: String) : FieldsList<RequestField>(path) {
	val headerId: FieldsList<RequestField> get() = fieldsList("${path}/headerId")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldDeleteNamedRangeRequest(private val path: String) : FieldsList<RequestField>(path) {
	val name: FieldsList<RequestField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeId")
	val tabsCriteria by lazy { object : RequestFieldTabsCriteria("${path}/tabsCriteria") {} }
}

abstract class RequestFieldDeleteParagraphBulletsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val range by lazy { object : RequestFieldRange("${path}/range") {} }
}

abstract class RequestFieldDeletePositionedObjectRequest(private val path: String) : FieldsList<RequestField>(path) {
	val objectId: FieldsList<RequestField> get() = fieldsList("${path}/objectId")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldDeleteTableColumnRequest(private val path: String) : FieldsList<RequestField>(path) {
	val tableCellLocation by lazy { object : RequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class RequestFieldDeleteTableRowRequest(private val path: String) : FieldsList<RequestField>(path) {
	val tableCellLocation by lazy { object : RequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class RequestFieldInsertInlineImageRequest(private val path: String) : FieldsList<RequestField>(path) {
	val endOfSegmentLocation by lazy { object : RequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : RequestFieldLocation("${path}/location") {} }
	val objectSize by lazy { object : RequestFieldSize("${path}/objectSize") {} }
	val uri: FieldsList<RequestField> get() = fieldsList("${path}/uri")
}

abstract class RequestFieldInsertPageBreakRequest(private val path: String) : FieldsList<RequestField>(path) {
	val endOfSegmentLocation by lazy { object : RequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : RequestFieldLocation("${path}/location") {} }
}

abstract class RequestFieldInsertSectionBreakRequest(private val path: String) : FieldsList<RequestField>(path) {
	val endOfSegmentLocation by lazy { object : RequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : RequestFieldLocation("${path}/location") {} }
	val sectionType: FieldsList<RequestField> get() = fieldsList("${path}/sectionType")
}

abstract class RequestFieldInsertTableRequest(private val path: String) : FieldsList<RequestField>(path) {
	val columns: FieldsList<RequestField> get() = fieldsList("${path}/columns")
	val endOfSegmentLocation by lazy { object : RequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : RequestFieldLocation("${path}/location") {} }
	val rows: FieldsList<RequestField> get() = fieldsList("${path}/rows")
}

abstract class RequestFieldInsertTableColumnRequest(private val path: String) : FieldsList<RequestField>(path) {
	val insertRight: FieldsList<RequestField> get() = fieldsList("${path}/insertRight")
	val tableCellLocation by lazy { object : RequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class RequestFieldInsertTableRowRequest(private val path: String) : FieldsList<RequestField>(path) {
	val insertBelow: FieldsList<RequestField> get() = fieldsList("${path}/insertBelow")
	val tableCellLocation by lazy { object : RequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class RequestFieldInsertTextRequest(private val path: String) : FieldsList<RequestField>(path) {
	val endOfSegmentLocation by lazy { object : RequestFieldEndOfSegmentLocation("${path}/endOfSegmentLocation") {} }
	val location by lazy { object : RequestFieldLocation("${path}/location") {} }
	val text: FieldsList<RequestField> get() = fieldsList("${path}/text")
}

abstract class RequestFieldMergeTableCellsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val tableRange by lazy { object : RequestFieldTableRange("${path}/tableRange") {} }
}

abstract class RequestFieldPinTableHeaderRowsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val pinnedHeaderRowsCount: FieldsList<RequestField> get() = fieldsList("${path}/pinnedHeaderRowsCount")
	val tableStartLocation by lazy { object : RequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class RequestFieldReplaceAllTextRequest(private val path: String) : FieldsList<RequestField>(path) {
	val containsText by lazy { object : RequestFieldSubstringMatchCriteria("${path}/containsText") {} }
	val replaceText: FieldsList<RequestField> get() = fieldsList("${path}/replaceText")
	val tabsCriteria by lazy { object : RequestFieldTabsCriteria("${path}/tabsCriteria") {} }
}

abstract class RequestFieldReplaceImageRequest(private val path: String) : FieldsList<RequestField>(path) {
	val imageObjectId: FieldsList<RequestField> get() = fieldsList("${path}/imageObjectId")
	val imageReplaceMethod: FieldsList<RequestField> get() = fieldsList("${path}/imageReplaceMethod")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
	val uri: FieldsList<RequestField> get() = fieldsList("${path}/uri")
}

abstract class RequestFieldReplaceNamedRangeContentRequest(private val path: String) : FieldsList<RequestField>(path) {
	val namedRangeId: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeId")
	val namedRangeName: FieldsList<RequestField> get() = fieldsList("${path}/namedRangeName")
	val tabsCriteria by lazy { object : RequestFieldTabsCriteria("${path}/tabsCriteria") {} }
	val text: FieldsList<RequestField> get() = fieldsList("${path}/text")
}

abstract class RequestFieldUnmergeTableCellsRequest(private val path: String) : FieldsList<RequestField>(path) {
	val tableRange by lazy { object : RequestFieldTableRange("${path}/tableRange") {} }
}

abstract class RequestFieldUpdateDocumentStyleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val documentStyle by lazy { object : RequestFieldDocumentStyle("${path}/documentStyle") {} }
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldUpdateParagraphStyleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val paragraphStyle by lazy { object : RequestFieldParagraphStyle("${path}/paragraphStyle") {} }
	val range by lazy { object : RequestFieldRange("${path}/range") {} }
}

abstract class RequestFieldUpdateSectionStyleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : RequestFieldRange("${path}/range") {} }
	val sectionStyle by lazy { object : RequestFieldSectionStyle("${path}/sectionStyle") {} }
}

abstract class RequestFieldUpdateTableCellStyleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val tableCellStyle by lazy { object : RequestFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableRange by lazy { object : RequestFieldTableRange("${path}/tableRange") {} }
	val tableStartLocation by lazy { object : RequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class RequestFieldUpdateTableColumnPropertiesRequest(private val path: String) : FieldsList<RequestField>(path) {
	val columnIndices: FieldsList<RequestField> get() = fieldsList("${path}/columnIndices")
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val tableColumnProperties by lazy { object : RequestFieldTableColumnProperties("${path}/tableColumnProperties") {} }
	val tableStartLocation by lazy { object : RequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class RequestFieldUpdateTableRowStyleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val rowIndices: FieldsList<RequestField> get() = fieldsList("${path}/rowIndices")
	val tableRowStyle by lazy { object : RequestFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableStartLocation by lazy { object : RequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class RequestFieldUpdateTextStyleRequest(private val path: String) : FieldsList<RequestField>(path) {
	val fields: FieldsList<RequestField> get() = fieldsList("${path}/fields")
	val range by lazy { object : RequestFieldRange("${path}/range") {} }
	val textStyle by lazy { object : RequestFieldTextStyle("${path}/textStyle") {} }
}

abstract class RequestFieldLocation(private val path: String) : FieldsList<RequestField>(path) {
	val index: FieldsList<RequestField> get() = fieldsList("${path}/index")
	val segmentId: FieldsList<RequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldEndOfSegmentLocation(private val path: String) : FieldsList<RequestField>(path) {
	val segmentId: FieldsList<RequestField> get() = fieldsList("${path}/segmentId")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldRange(private val path: String) : FieldsList<RequestField>(path) {
	val endIndex: FieldsList<RequestField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<RequestField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<RequestField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldTabsCriteria(private val path: String) : FieldsList<RequestField>(path) {
	val tabIds: FieldsList<RequestField> get() = fieldsList("${path}/tabIds")
}

abstract class RequestFieldTableCellLocation(private val path: String) : FieldsList<RequestField>(path) {
	val columnIndex: FieldsList<RequestField> get() = fieldsList("${path}/columnIndex")
	val rowIndex: FieldsList<RequestField> get() = fieldsList("${path}/rowIndex")
	val tableStartLocation by lazy { object : RequestFieldLocation("${path}/tableStartLocation") {} }
}

abstract class RequestFieldSize(private val path: String) : FieldsList<RequestField>(path) {
	val height by lazy { object : RequestFieldDimension("${path}/height") {} }
	val width by lazy { object : RequestFieldDimension("${path}/width") {} }
}

abstract class RequestFieldTableRange(private val path: String) : FieldsList<RequestField>(path) {
	val columnSpan: FieldsList<RequestField> get() = fieldsList("${path}/columnSpan")
	val rowSpan: FieldsList<RequestField> get() = fieldsList("${path}/rowSpan")
	val tableCellLocation by lazy { object : RequestFieldTableCellLocation("${path}/tableCellLocation") {} }
}

abstract class RequestFieldSubstringMatchCriteria(private val path: String) : FieldsList<RequestField>(path) {
	val matchCase: FieldsList<RequestField> get() = fieldsList("${path}/matchCase")
	val text: FieldsList<RequestField> get() = fieldsList("${path}/text")
}

abstract class RequestFieldDocumentStyle(private val path: String) : FieldsList<RequestField>(path) {
	val background by lazy { object : RequestFieldBackground("${path}/background") {} }
	val defaultFooterId: FieldsList<RequestField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<RequestField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<RequestField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<RequestField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<RequestField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<RequestField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<RequestField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : RequestFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : RequestFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : RequestFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : RequestFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : RequestFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : RequestFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<RequestField> get() = fieldsList("${path}/pageNumberStart")
	val pageSize by lazy { object : RequestFieldSize("${path}/pageSize") {} }
	val useCustomHeaderFooterMargins: FieldsList<RequestField> get() = fieldsList("${path}/useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<RequestField> get() = fieldsList("${path}/useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<RequestField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class RequestFieldParagraphStyle(private val path: String) : FieldsList<RequestField>(path) {
	val alignment: FieldsList<RequestField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<RequestField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : RequestFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : RequestFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : RequestFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : RequestFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : RequestFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<RequestField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<RequestField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : RequestFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : RequestFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : RequestFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<RequestField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<RequestField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<RequestField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<RequestField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<RequestField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : RequestFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : RequestFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : RequestFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<RequestField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : RequestFieldTabStop("${path}/tabStops") {} }
}

abstract class RequestFieldSectionStyle(private val path: String) : FieldsList<RequestField>(path) {
	val columnProperties by lazy { object : RequestFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<RequestField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<RequestField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<RequestField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<RequestField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<RequestField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<RequestField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<RequestField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<RequestField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<RequestField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : RequestFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : RequestFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : RequestFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : RequestFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : RequestFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : RequestFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<RequestField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<RequestField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<RequestField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class RequestFieldTableCellStyle(private val path: String) : FieldsList<RequestField>(path) {
	val backgroundColor by lazy { object : RequestFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : RequestFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : RequestFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : RequestFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : RequestFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<RequestField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<RequestField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : RequestFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : RequestFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : RequestFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : RequestFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<RequestField> get() = fieldsList("${path}/rowSpan")
}

abstract class RequestFieldTableColumnProperties(private val path: String) : FieldsList<RequestField>(path) {
	val width by lazy { object : RequestFieldDimension("${path}/width") {} }
	val widthType: FieldsList<RequestField> get() = fieldsList("${path}/widthType")
}

abstract class RequestFieldTableRowStyle(private val path: String) : FieldsList<RequestField>(path) {
	val minRowHeight by lazy { object : RequestFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<RequestField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<RequestField> get() = fieldsList("${path}/tableHeader")
}

abstract class RequestFieldTextStyle(private val path: String) : FieldsList<RequestField>(path) {
	val backgroundColor by lazy { object : RequestFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<RequestField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<RequestField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : RequestFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : RequestFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<RequestField> get() = fieldsList("${path}/italic")
	val link by lazy { object : RequestFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<RequestField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<RequestField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<RequestField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : RequestFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class RequestFieldDimension(private val path: String) : FieldsList<RequestField>(path) {
	val magnitude: FieldsList<RequestField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<RequestField> get() = fieldsList("${path}/unit")
}

abstract class RequestFieldBackground(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldOptionalColor("${path}/color") {} }
}

abstract class RequestFieldParagraphBorder(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<RequestField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : RequestFieldDimension("${path}/padding") {} }
	val width by lazy { object : RequestFieldDimension("${path}/width") {} }
}

abstract class RequestFieldShading(private val path: String) : FieldsList<RequestField>(path) {
	val backgroundColor by lazy { object : RequestFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class RequestFieldTabStop(private val path: String) : FieldsList<RequestField>(path) {
	val alignment: FieldsList<RequestField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : RequestFieldDimension("${path}/offset") {} }
}

abstract class RequestFieldSectionColumnProperties(private val path: String) : FieldsList<RequestField>(path) {
	val paddingEnd by lazy { object : RequestFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : RequestFieldDimension("${path}/width") {} }
}

abstract class RequestFieldOptionalColor(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldColor("${path}/color") {} }
}

abstract class RequestFieldTableCellBorder(private val path: String) : FieldsList<RequestField>(path) {
	val color by lazy { object : RequestFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<RequestField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : RequestFieldDimension("${path}/width") {} }
}

abstract class RequestFieldLink(private val path: String) : FieldsList<RequestField>(path) {
	val bookmark by lazy { object : RequestFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<RequestField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : RequestFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<RequestField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<RequestField> get() = fieldsList("${path}/url")
}

abstract class RequestFieldWeightedFontFamily(private val path: String) : FieldsList<RequestField>(path) {
	val fontFamily: FieldsList<RequestField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<RequestField> get() = fieldsList("${path}/weight")
}

abstract class RequestFieldColor(private val path: String) : FieldsList<RequestField>(path) {
	val rgbColor by lazy { object : RequestFieldRgbColor("${path}/rgbColor") {} }
}

abstract class RequestFieldBookmarkLink(private val path: String) : FieldsList<RequestField>(path) {
	val id: FieldsList<RequestField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldHeadingLink(private val path: String) : FieldsList<RequestField>(path) {
	val id: FieldsList<RequestField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<RequestField> get() = fieldsList("${path}/tabId")
}

abstract class RequestFieldRgbColor(private val path: String) : FieldsList<RequestField>(path) {
	val blue: FieldsList<RequestField> get() = fieldsList("${path}/blue")
	val green: FieldsList<RequestField> get() = fieldsList("${path}/green")
	val red: FieldsList<RequestField> get() = fieldsList("${path}/red")
}

