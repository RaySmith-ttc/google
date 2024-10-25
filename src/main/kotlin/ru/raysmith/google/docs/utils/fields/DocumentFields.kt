package ru.raysmith.google.docs.utils.fields

import ru.raysmith.google.utils.Field
import ru.raysmith.google.utils.FieldsList
import ru.raysmith.google.utils.fieldsList

interface DocumentField : Field

object DocumentFields {
    val ALL: FieldsList<DocumentField> = fieldsList("*")
	val body = object : DocumentFieldBody("body") {}
	val documentId: FieldsList<DocumentField> get() = fieldsList("documentId")
	val documentStyle = object : DocumentFieldDocumentStyle("documentStyle") {}
	val footers = object : DocumentFieldFooter("footers") {}
	val footnotes = object : DocumentFieldFootnote("footnotes") {}
	val headers = object : DocumentFieldHeader("headers") {}
	val inlineObjects = object : DocumentFieldInlineObject("inlineObjects") {}
	val lists = object : DocumentFieldList("lists") {}
	val namedRanges = object : DocumentFieldNamedRanges("namedRanges") {}
	val namedStyles = object : DocumentFieldNamedStyles("namedStyles") {}
	val positionedObjects = object : DocumentFieldPositionedObject("positionedObjects") {}
	val revisionId: FieldsList<DocumentField> get() = fieldsList("revisionId")
	val suggestedDocumentStyleChanges = object : DocumentFieldSuggestedDocumentStyle("suggestedDocumentStyleChanges") {}
	val suggestedNamedStylesChanges = object : DocumentFieldSuggestedNamedStyles("suggestedNamedStylesChanges") {}
	val suggestionsViewMode: FieldsList<DocumentField> get() = fieldsList("suggestionsViewMode")
	val tabs = object : DocumentFieldTab("tabs") {}
	val title: FieldsList<DocumentField> get() = fieldsList("title")
}

abstract class DocumentFieldBody(private val path: String) : FieldsList<DocumentField>(path) {
	val content by lazy { object : DocumentFieldStructuralElement("${path}/content") {} }
}

abstract class DocumentFieldDocumentStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val background by lazy { object : DocumentFieldBackground("${path}/background") {} }
	val defaultFooterId: FieldsList<DocumentField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<DocumentField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<DocumentField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<DocumentField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<DocumentField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<DocumentField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<DocumentField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : DocumentFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : DocumentFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : DocumentFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : DocumentFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : DocumentFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : DocumentFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<DocumentField> get() = fieldsList("${path}/pageNumberStart")
	val pageSize by lazy { object : DocumentFieldSize("${path}/pageSize") {} }
	val useCustomHeaderFooterMargins: FieldsList<DocumentField> get() = fieldsList("${path}/useCustomHeaderFooterMargins")
	val useEvenPageHeaderFooter: FieldsList<DocumentField> get() = fieldsList("${path}/useEvenPageHeaderFooter")
	val useFirstPageHeaderFooter: FieldsList<DocumentField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class DocumentFieldFooter(private val path: String) : FieldsList<DocumentField>(path) {
	val content by lazy { object : DocumentFieldStructuralElement("${path}/content") {} }
	val footerId: FieldsList<DocumentField> get() = fieldsList("${path}/footerId")
}

abstract class DocumentFieldFootnote(private val path: String) : FieldsList<DocumentField>(path) {
	val content by lazy { object : DocumentFieldStructuralElement("${path}/content") {} }
	val footnoteId: FieldsList<DocumentField> get() = fieldsList("${path}/footnoteId")
}

abstract class DocumentFieldHeader(private val path: String) : FieldsList<DocumentField>(path) {
	val content by lazy { object : DocumentFieldStructuralElement("${path}/content") {} }
	val headerId: FieldsList<DocumentField> get() = fieldsList("${path}/headerId")
}

abstract class DocumentFieldInlineObject(private val path: String) : FieldsList<DocumentField>(path) {
	val inlineObjectProperties by lazy { object : DocumentFieldInlineObjectProperties("${path}/inlineObjectProperties") {} }
	val objectId: FieldsList<DocumentField> get() = fieldsList("${path}/objectId")
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInlineObjectPropertiesChanges by lazy { object : DocumentFieldSuggestedInlineObjectProperties("${path}/suggestedInlineObjectPropertiesChanges") {} }
	val suggestedInsertionId: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionId")
}

abstract class DocumentFieldList(private val path: String) : FieldsList<DocumentField>(path) {
	val listProperties by lazy { object : DocumentFieldListProperties("${path}/listProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionId")
	val suggestedListPropertiesChanges by lazy { object : DocumentFieldSuggestedListProperties("${path}/suggestedListPropertiesChanges") {} }
}

abstract class DocumentFieldNamedRanges(private val path: String) : FieldsList<DocumentField>(path) {
	val name: FieldsList<DocumentField> get() = fieldsList("${path}/name")
	val namedRanges by lazy { object : DocumentFieldNamedRange("${path}/namedRanges") {} }
}

abstract class DocumentFieldNamedStyles(private val path: String) : FieldsList<DocumentField>(path) {
	val styles by lazy { object : DocumentFieldNamedStyle("${path}/styles") {} }
}

abstract class DocumentFieldPositionedObject(private val path: String) : FieldsList<DocumentField>(path) {
	val objectId: FieldsList<DocumentField> get() = fieldsList("${path}/objectId")
	val positionedObjectProperties by lazy { object : DocumentFieldPositionedObjectProperties("${path}/positionedObjectProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionId: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionId")
	val suggestedPositionedObjectPropertiesChanges by lazy { object : DocumentFieldSuggestedPositionedObjectProperties("${path}/suggestedPositionedObjectPropertiesChanges") {} }
}

abstract class DocumentFieldSuggestedDocumentStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val documentStyle by lazy { object : DocumentFieldDocumentStyle("${path}/documentStyle") {} }
	val documentStyleSuggestionState by lazy { object : DocumentFieldDocumentStyleSuggestionState("${path}/documentStyleSuggestionState") {} }
}

abstract class DocumentFieldSuggestedNamedStyles(private val path: String) : FieldsList<DocumentField>(path) {
	val namedStyles by lazy { object : DocumentFieldNamedStyles("${path}/namedStyles") {} }
	val namedStylesSuggestionState by lazy { object : DocumentFieldNamedStylesSuggestionState("${path}/namedStylesSuggestionState") {} }
}

abstract class DocumentFieldTab(private val path: String) : FieldsList<DocumentField>(path) {
	val childTabs by lazy { object : DocumentFieldTab("${path}/childTabs") {} }
	val documentTab by lazy { object : DocumentFieldDocumentTab("${path}/documentTab") {} }
	val tabProperties by lazy { object : DocumentFieldTabProperties("${path}/tabProperties") {} }
}

abstract class DocumentFieldStructuralElement(private val path: String) : FieldsList<DocumentField>(path) {
	val endIndex: FieldsList<DocumentField> get() = fieldsList("${path}/endIndex")
	val paragraph by lazy { object : DocumentFieldParagraph("${path}/paragraph") {} }
	val sectionBreak by lazy { object : DocumentFieldSectionBreak("${path}/sectionBreak") {} }
	val startIndex: FieldsList<DocumentField> get() = fieldsList("${path}/startIndex")
	val table by lazy { object : DocumentFieldTable("${path}/table") {} }
	val tableOfContents by lazy { object : DocumentFieldTableOfContents("${path}/tableOfContents") {} }
}

abstract class DocumentFieldBackground(private val path: String) : FieldsList<DocumentField>(path) {
	val color by lazy { object : DocumentFieldOptionalColor("${path}/color") {} }
}

abstract class DocumentFieldDimension(private val path: String) : FieldsList<DocumentField>(path) {
	val magnitude: FieldsList<DocumentField> get() = fieldsList("${path}/magnitude")
	val unit: FieldsList<DocumentField> get() = fieldsList("${path}/unit")
}

abstract class DocumentFieldSize(private val path: String) : FieldsList<DocumentField>(path) {
	val height by lazy { object : DocumentFieldDimension("${path}/height") {} }
	val width by lazy { object : DocumentFieldDimension("${path}/width") {} }
}

abstract class DocumentFieldInlineObjectProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val embeddedObject by lazy { object : DocumentFieldEmbeddedObject("${path}/embeddedObject") {} }
}

abstract class DocumentFieldSuggestedInlineObjectProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val inlineObjectProperties by lazy { object : DocumentFieldInlineObjectProperties("${path}/inlineObjectProperties") {} }
	val inlineObjectPropertiesSuggestionState by lazy { object : DocumentFieldInlineObjectPropertiesSuggestionState("${path}/inlineObjectPropertiesSuggestionState") {} }
}

abstract class DocumentFieldListProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val nestingLevels by lazy { object : DocumentFieldNestingLevel("${path}/nestingLevels") {} }
}

abstract class DocumentFieldSuggestedListProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val listProperties by lazy { object : DocumentFieldListProperties("${path}/listProperties") {} }
	val listPropertiesSuggestionState by lazy { object : DocumentFieldListPropertiesSuggestionState("${path}/listPropertiesSuggestionState") {} }
}

abstract class DocumentFieldNamedRange(private val path: String) : FieldsList<DocumentField>(path) {
	val name: FieldsList<DocumentField> get() = fieldsList("${path}/name")
	val namedRangeId: FieldsList<DocumentField> get() = fieldsList("${path}/namedRangeId")
	val ranges by lazy { object : DocumentFieldRange("${path}/ranges") {} }
}

abstract class DocumentFieldNamedStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val namedStyleType: FieldsList<DocumentField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyle by lazy { object : DocumentFieldParagraphStyle("${path}/paragraphStyle") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldPositionedObjectProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val embeddedObject by lazy { object : DocumentFieldEmbeddedObject("${path}/embeddedObject") {} }
	val positioning by lazy { object : DocumentFieldPositionedObjectPositioning("${path}/positioning") {} }
}

abstract class DocumentFieldSuggestedPositionedObjectProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val positionedObjectProperties by lazy { object : DocumentFieldPositionedObjectProperties("${path}/positionedObjectProperties") {} }
	val positionedObjectPropertiesSuggestionState by lazy { object : DocumentFieldPositionedObjectPropertiesSuggestionState("${path}/positionedObjectPropertiesSuggestionState") {} }
}

abstract class DocumentFieldDocumentStyleSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundSuggestionState by lazy { object : DocumentFieldBackgroundSuggestionState("${path}/backgroundSuggestionState") {} }
	val defaultFooterIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/defaultFooterIdSuggested")
	val defaultHeaderIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/defaultHeaderIdSuggested")
	val evenPageFooterIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/evenPageFooterIdSuggested")
	val evenPageHeaderIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/evenPageHeaderIdSuggested")
	val firstPageFooterIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/firstPageFooterIdSuggested")
	val firstPageHeaderIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/firstPageHeaderIdSuggested")
	val flipPageOrientationSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/flipPageOrientationSuggested")
	val marginBottomSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginFooterSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginFooterSuggested")
	val marginHeaderSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginHeaderSuggested")
	val marginLeftSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginTopSuggested")
	val pageNumberStartSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/pageNumberStartSuggested")
	val pageSizeSuggestionState by lazy { object : DocumentFieldSizeSuggestionState("${path}/pageSizeSuggestionState") {} }
	val useCustomHeaderFooterMarginsSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/useCustomHeaderFooterMarginsSuggested")
	val useEvenPageHeaderFooterSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/useEvenPageHeaderFooterSuggested")
	val useFirstPageHeaderFooterSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/useFirstPageHeaderFooterSuggested")
}

abstract class DocumentFieldNamedStylesSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val stylesSuggestionStates by lazy { object : DocumentFieldNamedStyleSuggestionState("${path}/stylesSuggestionStates") {} }
}

abstract class DocumentFieldDocumentTab(private val path: String) : FieldsList<DocumentField>(path) {
	val body by lazy { object : DocumentFieldBody("${path}/body") {} }
	val documentStyle by lazy { object : DocumentFieldDocumentStyle("${path}/documentStyle") {} }
	val footers by lazy { object : DocumentFieldFooter("${path}/footers") {} }
	val footnotes by lazy { object : DocumentFieldFootnote("${path}/footnotes") {} }
	val headers by lazy { object : DocumentFieldHeader("${path}/headers") {} }
	val inlineObjects by lazy { object : DocumentFieldInlineObject("${path}/inlineObjects") {} }
	val lists by lazy { object : DocumentFieldList("${path}/lists") {} }
	val namedRanges by lazy { object : DocumentFieldNamedRanges("${path}/namedRanges") {} }
	val namedStyles by lazy { object : DocumentFieldNamedStyles("${path}/namedStyles") {} }
	val positionedObjects by lazy { object : DocumentFieldPositionedObject("${path}/positionedObjects") {} }
	val suggestedDocumentStyleChanges by lazy { object : DocumentFieldSuggestedDocumentStyle("${path}/suggestedDocumentStyleChanges") {} }
	val suggestedNamedStylesChanges by lazy { object : DocumentFieldSuggestedNamedStyles("${path}/suggestedNamedStylesChanges") {} }
}

abstract class DocumentFieldTabProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val index: FieldsList<DocumentField> get() = fieldsList("${path}/index")
	val nestingLevel: FieldsList<DocumentField> get() = fieldsList("${path}/nestingLevel")
	val parentTabId: FieldsList<DocumentField> get() = fieldsList("${path}/parentTabId")
	val tabId: FieldsList<DocumentField> get() = fieldsList("${path}/tabId")
	val title: FieldsList<DocumentField> get() = fieldsList("${path}/title")
}

abstract class DocumentFieldParagraph(private val path: String) : FieldsList<DocumentField>(path) {
	val bullet by lazy { object : DocumentFieldBullet("${path}/bullet") {} }
	val elements by lazy { object : DocumentFieldParagraphElement("${path}/elements") {} }
	val paragraphStyle by lazy { object : DocumentFieldParagraphStyle("${path}/paragraphStyle") {} }
	val positionedObjectIds: FieldsList<DocumentField> get() = fieldsList("${path}/positionedObjectIds")
	val suggestedBulletChanges by lazy { object : DocumentFieldSuggestedBullet("${path}/suggestedBulletChanges") {} }
	val suggestedParagraphStyleChanges by lazy { object : DocumentFieldSuggestedParagraphStyle("${path}/suggestedParagraphStyleChanges") {} }
	val suggestedPositionedObjectIds by lazy { object : DocumentFieldObjectReferences("${path}/suggestedPositionedObjectIds") {} }
}

abstract class DocumentFieldSectionBreak(private val path: String) : FieldsList<DocumentField>(path) {
	val sectionStyle by lazy { object : DocumentFieldSectionStyle("${path}/sectionStyle") {} }
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class DocumentFieldTable(private val path: String) : FieldsList<DocumentField>(path) {
	val columns: FieldsList<DocumentField> get() = fieldsList("${path}/columns")
	val rows: FieldsList<DocumentField> get() = fieldsList("${path}/rows")
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val tableRows by lazy { object : DocumentFieldTableRow("${path}/tableRows") {} }
	val tableStyle by lazy { object : DocumentFieldTableStyle("${path}/tableStyle") {} }
}

abstract class DocumentFieldTableOfContents(private val path: String) : FieldsList<DocumentField>(path) {
	val content by lazy { object : DocumentFieldStructuralElement("${path}/content") {} }
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class DocumentFieldOptionalColor(private val path: String) : FieldsList<DocumentField>(path) {
	val color by lazy { object : DocumentFieldColor("${path}/color") {} }
}

abstract class DocumentFieldEmbeddedObject(private val path: String) : FieldsList<DocumentField>(path) {
	val description: FieldsList<DocumentField> get() = fieldsList("${path}/description")
	val embeddedDrawingProperties: FieldsList<DocumentField> get() = fieldsList("${path}/embeddedDrawingProperties")
	val embeddedObjectBorder by lazy { object : DocumentFieldEmbeddedObjectBorder("${path}/embeddedObjectBorder") {} }
	val imageProperties by lazy { object : DocumentFieldImageProperties("${path}/imageProperties") {} }
	val linkedContentReference by lazy { object : DocumentFieldLinkedContentReference("${path}/linkedContentReference") {} }
	val marginBottom by lazy { object : DocumentFieldDimension("${path}/marginBottom") {} }
	val marginLeft by lazy { object : DocumentFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : DocumentFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : DocumentFieldDimension("${path}/marginTop") {} }
	val size by lazy { object : DocumentFieldSize("${path}/size") {} }
	val title: FieldsList<DocumentField> get() = fieldsList("${path}/title")
}

abstract class DocumentFieldInlineObjectPropertiesSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val embeddedObjectSuggestionState by lazy { object : DocumentFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
}

abstract class DocumentFieldNestingLevel(private val path: String) : FieldsList<DocumentField>(path) {
	val bulletAlignment: FieldsList<DocumentField> get() = fieldsList("${path}/bulletAlignment")
	val glyphFormat: FieldsList<DocumentField> get() = fieldsList("${path}/glyphFormat")
	val glyphSymbol: FieldsList<DocumentField> get() = fieldsList("${path}/glyphSymbol")
	val glyphType: FieldsList<DocumentField> get() = fieldsList("${path}/glyphType")
	val indentFirstLine by lazy { object : DocumentFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : DocumentFieldDimension("${path}/indentStart") {} }
	val startNumber: FieldsList<DocumentField> get() = fieldsList("${path}/startNumber")
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldListPropertiesSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val nestingLevelsSuggestionStates by lazy { object : DocumentFieldNestingLevelSuggestionState("${path}/nestingLevelsSuggestionStates") {} }
}

abstract class DocumentFieldRange(private val path: String) : FieldsList<DocumentField>(path) {
	val endIndex: FieldsList<DocumentField> get() = fieldsList("${path}/endIndex")
	val segmentId: FieldsList<DocumentField> get() = fieldsList("${path}/segmentId")
	val startIndex: FieldsList<DocumentField> get() = fieldsList("${path}/startIndex")
	val tabId: FieldsList<DocumentField> get() = fieldsList("${path}/tabId")
}

abstract class DocumentFieldParagraphStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val alignment: FieldsList<DocumentField> get() = fieldsList("${path}/alignment")
	val avoidWidowAndOrphan: FieldsList<DocumentField> get() = fieldsList("${path}/avoidWidowAndOrphan")
	val borderBetween by lazy { object : DocumentFieldParagraphBorder("${path}/borderBetween") {} }
	val borderBottom by lazy { object : DocumentFieldParagraphBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : DocumentFieldParagraphBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : DocumentFieldParagraphBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : DocumentFieldParagraphBorder("${path}/borderTop") {} }
	val direction: FieldsList<DocumentField> get() = fieldsList("${path}/direction")
	val headingId: FieldsList<DocumentField> get() = fieldsList("${path}/headingId")
	val indentEnd by lazy { object : DocumentFieldDimension("${path}/indentEnd") {} }
	val indentFirstLine by lazy { object : DocumentFieldDimension("${path}/indentFirstLine") {} }
	val indentStart by lazy { object : DocumentFieldDimension("${path}/indentStart") {} }
	val keepLinesTogether: FieldsList<DocumentField> get() = fieldsList("${path}/keepLinesTogether")
	val keepWithNext: FieldsList<DocumentField> get() = fieldsList("${path}/keepWithNext")
	val lineSpacing: FieldsList<DocumentField> get() = fieldsList("${path}/lineSpacing")
	val namedStyleType: FieldsList<DocumentField> get() = fieldsList("${path}/namedStyleType")
	val pageBreakBefore: FieldsList<DocumentField> get() = fieldsList("${path}/pageBreakBefore")
	val shading by lazy { object : DocumentFieldShading("${path}/shading") {} }
	val spaceAbove by lazy { object : DocumentFieldDimension("${path}/spaceAbove") {} }
	val spaceBelow by lazy { object : DocumentFieldDimension("${path}/spaceBelow") {} }
	val spacingMode: FieldsList<DocumentField> get() = fieldsList("${path}/spacingMode")
	val tabStops by lazy { object : DocumentFieldTabStop("${path}/tabStops") {} }
}

abstract class DocumentFieldTextStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundColor by lazy { object : DocumentFieldOptionalColor("${path}/backgroundColor") {} }
	val baselineOffset: FieldsList<DocumentField> get() = fieldsList("${path}/baselineOffset")
	val bold: FieldsList<DocumentField> get() = fieldsList("${path}/bold")
	val fontSize by lazy { object : DocumentFieldDimension("${path}/fontSize") {} }
	val foregroundColor by lazy { object : DocumentFieldOptionalColor("${path}/foregroundColor") {} }
	val italic: FieldsList<DocumentField> get() = fieldsList("${path}/italic")
	val link by lazy { object : DocumentFieldLink("${path}/link") {} }
	val smallCaps: FieldsList<DocumentField> get() = fieldsList("${path}/smallCaps")
	val strikethrough: FieldsList<DocumentField> get() = fieldsList("${path}/strikethrough")
	val underline: FieldsList<DocumentField> get() = fieldsList("${path}/underline")
	val weightedFontFamily by lazy { object : DocumentFieldWeightedFontFamily("${path}/weightedFontFamily") {} }
}

abstract class DocumentFieldPositionedObjectPositioning(private val path: String) : FieldsList<DocumentField>(path) {
	val layout: FieldsList<DocumentField> get() = fieldsList("${path}/layout")
	val leftOffset by lazy { object : DocumentFieldDimension("${path}/leftOffset") {} }
	val topOffset by lazy { object : DocumentFieldDimension("${path}/topOffset") {} }
}

abstract class DocumentFieldPositionedObjectPropertiesSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val embeddedObjectSuggestionState by lazy { object : DocumentFieldEmbeddedObjectSuggestionState("${path}/embeddedObjectSuggestionState") {} }
	val positioningSuggestionState by lazy { object : DocumentFieldPositionedObjectPositioningSuggestionState("${path}/positioningSuggestionState") {} }
}

abstract class DocumentFieldBackgroundSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class DocumentFieldSizeSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val heightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/heightSuggested")
	val widthSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/widthSuggested")
}

abstract class DocumentFieldNamedStyleSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val namedStyleType: FieldsList<DocumentField> get() = fieldsList("${path}/namedStyleType")
	val paragraphStyleSuggestionState by lazy { object : DocumentFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
	val textStyleSuggestionState by lazy { object : DocumentFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentFieldBullet(private val path: String) : FieldsList<DocumentField>(path) {
	val listId: FieldsList<DocumentField> get() = fieldsList("${path}/listId")
	val nestingLevel: FieldsList<DocumentField> get() = fieldsList("${path}/nestingLevel")
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldParagraphElement(private val path: String) : FieldsList<DocumentField>(path) {
	val autoText by lazy { object : DocumentFieldAutoText("${path}/autoText") {} }
	val columnBreak by lazy { object : DocumentFieldColumnBreak("${path}/columnBreak") {} }
	val endIndex: FieldsList<DocumentField> get() = fieldsList("${path}/endIndex")
	val equation by lazy { object : DocumentFieldEquation("${path}/equation") {} }
	val footnoteReference by lazy { object : DocumentFieldFootnoteReference("${path}/footnoteReference") {} }
	val horizontalRule by lazy { object : DocumentFieldHorizontalRule("${path}/horizontalRule") {} }
	val inlineObjectElement by lazy { object : DocumentFieldInlineObjectElement("${path}/inlineObjectElement") {} }
	val pageBreak by lazy { object : DocumentFieldPageBreak("${path}/pageBreak") {} }
	val person by lazy { object : DocumentFieldPerson("${path}/person") {} }
	val richLink by lazy { object : DocumentFieldRichLink("${path}/richLink") {} }
	val startIndex: FieldsList<DocumentField> get() = fieldsList("${path}/startIndex")
	val textRun by lazy { object : DocumentFieldTextRun("${path}/textRun") {} }
}

abstract class DocumentFieldSuggestedBullet(private val path: String) : FieldsList<DocumentField>(path) {
	val bullet by lazy { object : DocumentFieldBullet("${path}/bullet") {} }
	val bulletSuggestionState by lazy { object : DocumentFieldBulletSuggestionState("${path}/bulletSuggestionState") {} }
}

abstract class DocumentFieldSuggestedParagraphStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val paragraphStyle by lazy { object : DocumentFieldParagraphStyle("${path}/paragraphStyle") {} }
	val paragraphStyleSuggestionState by lazy { object : DocumentFieldParagraphStyleSuggestionState("${path}/paragraphStyleSuggestionState") {} }
}

abstract class DocumentFieldObjectReferences(private val path: String) : FieldsList<DocumentField>(path) {
	val objectIds: FieldsList<DocumentField> get() = fieldsList("${path}/objectIds")
}

abstract class DocumentFieldSectionStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val columnProperties by lazy { object : DocumentFieldSectionColumnProperties("${path}/columnProperties") {} }
	val columnSeparatorStyle: FieldsList<DocumentField> get() = fieldsList("${path}/columnSeparatorStyle")
	val contentDirection: FieldsList<DocumentField> get() = fieldsList("${path}/contentDirection")
	val defaultFooterId: FieldsList<DocumentField> get() = fieldsList("${path}/defaultFooterId")
	val defaultHeaderId: FieldsList<DocumentField> get() = fieldsList("${path}/defaultHeaderId")
	val evenPageFooterId: FieldsList<DocumentField> get() = fieldsList("${path}/evenPageFooterId")
	val evenPageHeaderId: FieldsList<DocumentField> get() = fieldsList("${path}/evenPageHeaderId")
	val firstPageFooterId: FieldsList<DocumentField> get() = fieldsList("${path}/firstPageFooterId")
	val firstPageHeaderId: FieldsList<DocumentField> get() = fieldsList("${path}/firstPageHeaderId")
	val flipPageOrientation: FieldsList<DocumentField> get() = fieldsList("${path}/flipPageOrientation")
	val marginBottom by lazy { object : DocumentFieldDimension("${path}/marginBottom") {} }
	val marginFooter by lazy { object : DocumentFieldDimension("${path}/marginFooter") {} }
	val marginHeader by lazy { object : DocumentFieldDimension("${path}/marginHeader") {} }
	val marginLeft by lazy { object : DocumentFieldDimension("${path}/marginLeft") {} }
	val marginRight by lazy { object : DocumentFieldDimension("${path}/marginRight") {} }
	val marginTop by lazy { object : DocumentFieldDimension("${path}/marginTop") {} }
	val pageNumberStart: FieldsList<DocumentField> get() = fieldsList("${path}/pageNumberStart")
	val sectionType: FieldsList<DocumentField> get() = fieldsList("${path}/sectionType")
	val useFirstPageHeaderFooter: FieldsList<DocumentField> get() = fieldsList("${path}/useFirstPageHeaderFooter")
}

abstract class DocumentFieldTableRow(private val path: String) : FieldsList<DocumentField>(path) {
	val endIndex: FieldsList<DocumentField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<DocumentField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableRowStyleChanges by lazy { object : DocumentFieldSuggestedTableRowStyle("${path}/suggestedTableRowStyleChanges") {} }
	val tableCells by lazy { object : DocumentFieldTableCell("${path}/tableCells") {} }
	val tableRowStyle by lazy { object : DocumentFieldTableRowStyle("${path}/tableRowStyle") {} }
}

abstract class DocumentFieldTableStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val tableColumnProperties by lazy { object : DocumentFieldTableColumnProperties("${path}/tableColumnProperties") {} }
}

abstract class DocumentFieldColor(private val path: String) : FieldsList<DocumentField>(path) {
	val rgbColor by lazy { object : DocumentFieldRgbColor("${path}/rgbColor") {} }
}

abstract class DocumentFieldEmbeddedObjectBorder(private val path: String) : FieldsList<DocumentField>(path) {
	val color by lazy { object : DocumentFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<DocumentField> get() = fieldsList("${path}/dashStyle")
	val propertyState: FieldsList<DocumentField> get() = fieldsList("${path}/propertyState")
	val width by lazy { object : DocumentFieldDimension("${path}/width") {} }
}

abstract class DocumentFieldImageProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val angle: FieldsList<DocumentField> get() = fieldsList("${path}/angle")
	val brightness: FieldsList<DocumentField> get() = fieldsList("${path}/brightness")
	val contentUri: FieldsList<DocumentField> get() = fieldsList("${path}/contentUri")
	val contrast: FieldsList<DocumentField> get() = fieldsList("${path}/contrast")
	val cropProperties by lazy { object : DocumentFieldCropProperties("${path}/cropProperties") {} }
	val sourceUri: FieldsList<DocumentField> get() = fieldsList("${path}/sourceUri")
	val transparency: FieldsList<DocumentField> get() = fieldsList("${path}/transparency")
}

abstract class DocumentFieldLinkedContentReference(private val path: String) : FieldsList<DocumentField>(path) {
	val sheetsChartReference by lazy { object : DocumentFieldSheetsChartReference("${path}/sheetsChartReference") {} }
}

abstract class DocumentFieldEmbeddedObjectSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val descriptionSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/descriptionSuggested")
	val embeddedDrawingPropertiesSuggestionState: FieldsList<DocumentField> get() = fieldsList("${path}/embeddedDrawingPropertiesSuggestionState")
	val embeddedObjectBorderSuggestionState by lazy { object : DocumentFieldEmbeddedObjectBorderSuggestionState("${path}/embeddedObjectBorderSuggestionState") {} }
	val imagePropertiesSuggestionState by lazy { object : DocumentFieldImagePropertiesSuggestionState("${path}/imagePropertiesSuggestionState") {} }
	val linkedContentReferenceSuggestionState by lazy { object : DocumentFieldLinkedContentReferenceSuggestionState("${path}/linkedContentReferenceSuggestionState") {} }
	val marginBottomSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginBottomSuggested")
	val marginLeftSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginLeftSuggested")
	val marginRightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginRightSuggested")
	val marginTopSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/marginTopSuggested")
	val sizeSuggestionState by lazy { object : DocumentFieldSizeSuggestionState("${path}/sizeSuggestionState") {} }
	val titleSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/titleSuggested")
}

abstract class DocumentFieldNestingLevelSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val bulletAlignmentSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/bulletAlignmentSuggested")
	val glyphFormatSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/glyphFormatSuggested")
	val glyphSymbolSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/glyphSymbolSuggested")
	val glyphTypeSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/glyphTypeSuggested")
	val indentFirstLineSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/indentStartSuggested")
	val startNumberSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/startNumberSuggested")
	val textStyleSuggestionState by lazy { object : DocumentFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentFieldParagraphBorder(private val path: String) : FieldsList<DocumentField>(path) {
	val color by lazy { object : DocumentFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<DocumentField> get() = fieldsList("${path}/dashStyle")
	val padding by lazy { object : DocumentFieldDimension("${path}/padding") {} }
	val width by lazy { object : DocumentFieldDimension("${path}/width") {} }
}

abstract class DocumentFieldShading(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundColor by lazy { object : DocumentFieldOptionalColor("${path}/backgroundColor") {} }
}

abstract class DocumentFieldTabStop(private val path: String) : FieldsList<DocumentField>(path) {
	val alignment: FieldsList<DocumentField> get() = fieldsList("${path}/alignment")
	val offset by lazy { object : DocumentFieldDimension("${path}/offset") {} }
}

abstract class DocumentFieldLink(private val path: String) : FieldsList<DocumentField>(path) {
	val bookmark by lazy { object : DocumentFieldBookmarkLink("${path}/bookmark") {} }
	val bookmarkId: FieldsList<DocumentField> get() = fieldsList("${path}/bookmarkId")
	val heading by lazy { object : DocumentFieldHeadingLink("${path}/heading") {} }
	val headingId: FieldsList<DocumentField> get() = fieldsList("${path}/headingId")
	val tabId: FieldsList<DocumentField> get() = fieldsList("${path}/tabId")
	val url: FieldsList<DocumentField> get() = fieldsList("${path}/url")
}

abstract class DocumentFieldWeightedFontFamily(private val path: String) : FieldsList<DocumentField>(path) {
	val fontFamily: FieldsList<DocumentField> get() = fieldsList("${path}/fontFamily")
	val weight: FieldsList<DocumentField> get() = fieldsList("${path}/weight")
}

abstract class DocumentFieldPositionedObjectPositioningSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val layoutSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/layoutSuggested")
	val leftOffsetSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/leftOffsetSuggested")
	val topOffsetSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/topOffsetSuggested")
}

abstract class DocumentFieldParagraphStyleSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val alignmentSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/alignmentSuggested")
	val avoidWidowAndOrphanSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/avoidWidowAndOrphanSuggested")
	val borderBetweenSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderBetweenSuggested")
	val borderBottomSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderTopSuggested")
	val directionSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/directionSuggested")
	val headingIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/headingIdSuggested")
	val indentEndSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/indentEndSuggested")
	val indentFirstLineSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/indentFirstLineSuggested")
	val indentStartSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/indentStartSuggested")
	val keepLinesTogetherSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/keepLinesTogetherSuggested")
	val keepWithNextSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/keepWithNextSuggested")
	val lineSpacingSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/lineSpacingSuggested")
	val namedStyleTypeSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/namedStyleTypeSuggested")
	val pageBreakBeforeSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/pageBreakBeforeSuggested")
	val shadingSuggestionState by lazy { object : DocumentFieldShadingSuggestionState("${path}/shadingSuggestionState") {} }
	val spaceAboveSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/spaceAboveSuggested")
	val spaceBelowSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/spaceBelowSuggested")
	val spacingModeSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/spacingModeSuggested")
}

abstract class DocumentFieldTextStyleSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/backgroundColorSuggested")
	val baselineOffsetSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/baselineOffsetSuggested")
	val boldSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/boldSuggested")
	val fontSizeSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/fontSizeSuggested")
	val foregroundColorSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/foregroundColorSuggested")
	val italicSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/italicSuggested")
	val linkSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/linkSuggested")
	val smallCapsSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/smallCapsSuggested")
	val strikethroughSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/strikethroughSuggested")
	val underlineSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/underlineSuggested")
	val weightedFontFamilySuggested: FieldsList<DocumentField> get() = fieldsList("${path}/weightedFontFamilySuggested")
}

abstract class DocumentFieldAutoText(private val path: String) : FieldsList<DocumentField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
	val type: FieldsList<DocumentField> get() = fieldsList("${path}/type")
}

abstract class DocumentFieldColumnBreak(private val path: String) : FieldsList<DocumentField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldEquation(private val path: String) : FieldsList<DocumentField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
}

abstract class DocumentFieldFootnoteReference(private val path: String) : FieldsList<DocumentField>(path) {
	val footnoteId: FieldsList<DocumentField> get() = fieldsList("${path}/footnoteId")
	val footnoteNumber: FieldsList<DocumentField> get() = fieldsList("${path}/footnoteNumber")
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldHorizontalRule(private val path: String) : FieldsList<DocumentField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldInlineObjectElement(private val path: String) : FieldsList<DocumentField>(path) {
	val inlineObjectId: FieldsList<DocumentField> get() = fieldsList("${path}/inlineObjectId")
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldPageBreak(private val path: String) : FieldsList<DocumentField>(path) {
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldPerson(private val path: String) : FieldsList<DocumentField>(path) {
	val personId: FieldsList<DocumentField> get() = fieldsList("${path}/personId")
	val personProperties by lazy { object : DocumentFieldPersonProperties("${path}/personProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldRichLink(private val path: String) : FieldsList<DocumentField>(path) {
	val richLinkId: FieldsList<DocumentField> get() = fieldsList("${path}/richLinkId")
	val richLinkProperties by lazy { object : DocumentFieldRichLinkProperties("${path}/richLinkProperties") {} }
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldTextRun(private val path: String) : FieldsList<DocumentField>(path) {
	val content: FieldsList<DocumentField> get() = fieldsList("${path}/content")
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTextStyleChanges by lazy { object : DocumentFieldSuggestedTextStyle("${path}/suggestedTextStyleChanges") {} }
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
}

abstract class DocumentFieldBulletSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val listIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/listIdSuggested")
	val nestingLevelSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/nestingLevelSuggested")
	val textStyleSuggestionState by lazy { object : DocumentFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentFieldSectionColumnProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val paddingEnd by lazy { object : DocumentFieldDimension("${path}/paddingEnd") {} }
	val width by lazy { object : DocumentFieldDimension("${path}/width") {} }
}

abstract class DocumentFieldSuggestedTableRowStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val tableRowStyle by lazy { object : DocumentFieldTableRowStyle("${path}/tableRowStyle") {} }
	val tableRowStyleSuggestionState by lazy { object : DocumentFieldTableRowStyleSuggestionState("${path}/tableRowStyleSuggestionState") {} }
}

abstract class DocumentFieldTableCell(private val path: String) : FieldsList<DocumentField>(path) {
	val content by lazy { object : DocumentFieldStructuralElement("${path}/content") {} }
	val endIndex: FieldsList<DocumentField> get() = fieldsList("${path}/endIndex")
	val startIndex: FieldsList<DocumentField> get() = fieldsList("${path}/startIndex")
	val suggestedDeletionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedDeletionIds")
	val suggestedInsertionIds: FieldsList<DocumentField> get() = fieldsList("${path}/suggestedInsertionIds")
	val suggestedTableCellStyleChanges by lazy { object : DocumentFieldSuggestedTableCellStyle("${path}/suggestedTableCellStyleChanges") {} }
	val tableCellStyle by lazy { object : DocumentFieldTableCellStyle("${path}/tableCellStyle") {} }
}

abstract class DocumentFieldTableRowStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val minRowHeight by lazy { object : DocumentFieldDimension("${path}/minRowHeight") {} }
	val preventOverflow: FieldsList<DocumentField> get() = fieldsList("${path}/preventOverflow")
	val tableHeader: FieldsList<DocumentField> get() = fieldsList("${path}/tableHeader")
}

abstract class DocumentFieldTableColumnProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val width by lazy { object : DocumentFieldDimension("${path}/width") {} }
	val widthType: FieldsList<DocumentField> get() = fieldsList("${path}/widthType")
}

abstract class DocumentFieldRgbColor(private val path: String) : FieldsList<DocumentField>(path) {
	val blue: FieldsList<DocumentField> get() = fieldsList("${path}/blue")
	val green: FieldsList<DocumentField> get() = fieldsList("${path}/green")
	val red: FieldsList<DocumentField> get() = fieldsList("${path}/red")
}

abstract class DocumentFieldCropProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val angle: FieldsList<DocumentField> get() = fieldsList("${path}/angle")
	val offsetBottom: FieldsList<DocumentField> get() = fieldsList("${path}/offsetBottom")
	val offsetLeft: FieldsList<DocumentField> get() = fieldsList("${path}/offsetLeft")
	val offsetRight: FieldsList<DocumentField> get() = fieldsList("${path}/offsetRight")
	val offsetTop: FieldsList<DocumentField> get() = fieldsList("${path}/offsetTop")
}

abstract class DocumentFieldSheetsChartReference(private val path: String) : FieldsList<DocumentField>(path) {
	val chartId: FieldsList<DocumentField> get() = fieldsList("${path}/chartId")
	val spreadsheetId: FieldsList<DocumentField> get() = fieldsList("${path}/spreadsheetId")
}

abstract class DocumentFieldEmbeddedObjectBorderSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val colorSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/colorSuggested")
	val dashStyleSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/dashStyleSuggested")
	val propertyStateSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/propertyStateSuggested")
	val widthSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/widthSuggested")
}

abstract class DocumentFieldImagePropertiesSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val angleSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/angleSuggested")
	val brightnessSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/brightnessSuggested")
	val contentUriSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/contentUriSuggested")
	val contrastSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/contrastSuggested")
	val cropPropertiesSuggestionState by lazy { object : DocumentFieldCropPropertiesSuggestionState("${path}/cropPropertiesSuggestionState") {} }
	val sourceUriSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/sourceUriSuggested")
	val transparencySuggested: FieldsList<DocumentField> get() = fieldsList("${path}/transparencySuggested")
}

abstract class DocumentFieldLinkedContentReferenceSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val sheetsChartReferenceSuggestionState by lazy { object : DocumentFieldSheetsChartReferenceSuggestionState("${path}/sheetsChartReferenceSuggestionState") {} }
}

abstract class DocumentFieldBookmarkLink(private val path: String) : FieldsList<DocumentField>(path) {
	val id: FieldsList<DocumentField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<DocumentField> get() = fieldsList("${path}/tabId")
}

abstract class DocumentFieldHeadingLink(private val path: String) : FieldsList<DocumentField>(path) {
	val id: FieldsList<DocumentField> get() = fieldsList("${path}/id")
	val tabId: FieldsList<DocumentField> get() = fieldsList("${path}/tabId")
}

abstract class DocumentFieldShadingSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/backgroundColorSuggested")
}

abstract class DocumentFieldSuggestedTextStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val textStyle by lazy { object : DocumentFieldTextStyle("${path}/textStyle") {} }
	val textStyleSuggestionState by lazy { object : DocumentFieldTextStyleSuggestionState("${path}/textStyleSuggestionState") {} }
}

abstract class DocumentFieldPersonProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val email: FieldsList<DocumentField> get() = fieldsList("${path}/email")
	val name: FieldsList<DocumentField> get() = fieldsList("${path}/name")
}

abstract class DocumentFieldRichLinkProperties(private val path: String) : FieldsList<DocumentField>(path) {
	val mimeType: FieldsList<DocumentField> get() = fieldsList("${path}/mimeType")
	val title: FieldsList<DocumentField> get() = fieldsList("${path}/title")
	val uri: FieldsList<DocumentField> get() = fieldsList("${path}/uri")
}

abstract class DocumentFieldTableRowStyleSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val minRowHeightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/minRowHeightSuggested")
}

abstract class DocumentFieldSuggestedTableCellStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val tableCellStyle by lazy { object : DocumentFieldTableCellStyle("${path}/tableCellStyle") {} }
	val tableCellStyleSuggestionState by lazy { object : DocumentFieldTableCellStyleSuggestionState("${path}/tableCellStyleSuggestionState") {} }
}

abstract class DocumentFieldTableCellStyle(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundColor by lazy { object : DocumentFieldOptionalColor("${path}/backgroundColor") {} }
	val borderBottom by lazy { object : DocumentFieldTableCellBorder("${path}/borderBottom") {} }
	val borderLeft by lazy { object : DocumentFieldTableCellBorder("${path}/borderLeft") {} }
	val borderRight by lazy { object : DocumentFieldTableCellBorder("${path}/borderRight") {} }
	val borderTop by lazy { object : DocumentFieldTableCellBorder("${path}/borderTop") {} }
	val columnSpan: FieldsList<DocumentField> get() = fieldsList("${path}/columnSpan")
	val contentAlignment: FieldsList<DocumentField> get() = fieldsList("${path}/contentAlignment")
	val paddingBottom by lazy { object : DocumentFieldDimension("${path}/paddingBottom") {} }
	val paddingLeft by lazy { object : DocumentFieldDimension("${path}/paddingLeft") {} }
	val paddingRight by lazy { object : DocumentFieldDimension("${path}/paddingRight") {} }
	val paddingTop by lazy { object : DocumentFieldDimension("${path}/paddingTop") {} }
	val rowSpan: FieldsList<DocumentField> get() = fieldsList("${path}/rowSpan")
}

abstract class DocumentFieldCropPropertiesSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val angleSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/angleSuggested")
	val offsetBottomSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/offsetBottomSuggested")
	val offsetLeftSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/offsetLeftSuggested")
	val offsetRightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/offsetRightSuggested")
	val offsetTopSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/offsetTopSuggested")
}

abstract class DocumentFieldSheetsChartReferenceSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val chartIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/chartIdSuggested")
	val spreadsheetIdSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/spreadsheetIdSuggested")
}

abstract class DocumentFieldTableCellStyleSuggestionState(private val path: String) : FieldsList<DocumentField>(path) {
	val backgroundColorSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/backgroundColorSuggested")
	val borderBottomSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderBottomSuggested")
	val borderLeftSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderLeftSuggested")
	val borderRightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderRightSuggested")
	val borderTopSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/borderTopSuggested")
	val columnSpanSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/columnSpanSuggested")
	val contentAlignmentSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/contentAlignmentSuggested")
	val paddingBottomSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/paddingBottomSuggested")
	val paddingLeftSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/paddingLeftSuggested")
	val paddingRightSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/paddingRightSuggested")
	val paddingTopSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/paddingTopSuggested")
	val rowSpanSuggested: FieldsList<DocumentField> get() = fieldsList("${path}/rowSpanSuggested")
}

abstract class DocumentFieldTableCellBorder(private val path: String) : FieldsList<DocumentField>(path) {
	val color by lazy { object : DocumentFieldOptionalColor("${path}/color") {} }
	val dashStyle: FieldsList<DocumentField> get() = fieldsList("${path}/dashStyle")
	val width by lazy { object : DocumentFieldDimension("${path}/width") {} }
}

