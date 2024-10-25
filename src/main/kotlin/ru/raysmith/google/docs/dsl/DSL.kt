@file:Suppress("OVERRIDE_BY_INLINE", "unused")

package ru.raysmith.google.docs.dsl

import com.google.api.services.docs.v1.model.*
import ru.raysmith.google.utils.GoogleDSL

@GoogleDSL
class AutoTextSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun AutoText.suggestedTextStyleChanges(setup: AutoTextSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = AutoTextSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun AutoText.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun Background.color(setup: OptionalColor.() -> Unit) {
	color = OptionalColor().apply(setup)
}

interface BatchUpdateDocumentRequestRequestsBuilder {

	@GoogleDSL
	fun request(setup: Request.() -> Unit)
	val all: List<Request>
}

@GoogleDSL
fun BatchUpdateDocumentRequest.requests(setup: BatchUpdateDocumentRequestRequestsBuilder.() -> Unit) {
	val builder = object : BatchUpdateDocumentRequestRequestsBuilder {
		override val all = mutableListOf<Request>()

		@GoogleDSL
		override inline fun request(setup: Request.() -> Unit) {
			all.add(Request().apply(setup))
		}
	}

	this.requests = builder.apply(setup).all
}

@GoogleDSL
fun BatchUpdateDocumentRequest.writeControl(setup: WriteControl.() -> Unit) {
	writeControl = WriteControl().apply(setup)
}

interface BatchUpdateDocumentResponseRepliesBuilder {

	@GoogleDSL
	fun response(setup: Response.() -> Unit)
	val all: List<Response>
}

@GoogleDSL
fun BatchUpdateDocumentResponse.replies(setup: BatchUpdateDocumentResponseRepliesBuilder.() -> Unit) {
	val builder = object : BatchUpdateDocumentResponseRepliesBuilder {
		override val all = mutableListOf<Response>()

		@GoogleDSL
		override inline fun response(setup: Response.() -> Unit) {
			all.add(Response().apply(setup))
		}
	}

	this.replies = builder.apply(setup).all
}

@GoogleDSL
fun BatchUpdateDocumentResponse.writeControl(setup: WriteControl.() -> Unit) {
	writeControl = WriteControl().apply(setup)
}

interface BodyContentBuilder {

	@GoogleDSL
	fun structuralElement(setup: StructuralElement.() -> Unit)
	val all: List<StructuralElement>
}

@GoogleDSL
fun Body.content(setup: BodyContentBuilder.() -> Unit) {
	val builder = object : BodyContentBuilder {
		override val all = mutableListOf<StructuralElement>()

		@GoogleDSL
		override inline fun structuralElement(setup: StructuralElement.() -> Unit) {
			all.add(StructuralElement().apply(setup))
		}
	}

	this.content = builder.apply(setup).all
}

@GoogleDSL
fun Bullet.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun BulletSuggestionState.textStyleSuggestionState(setup: TextStyleSuggestionState.() -> Unit) {
	textStyleSuggestionState = TextStyleSuggestionState().apply(setup)
}

@GoogleDSL
fun Color.rgbColor(setup: RgbColor.() -> Unit) {
	rgbColor = RgbColor().apply(setup)
}

@GoogleDSL
class ColumnBreakSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun ColumnBreak.suggestedTextStyleChanges(setup: ColumnBreakSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = ColumnBreakSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun ColumnBreak.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun CreateFooterRequest.sectionBreakLocation(setup: Location.() -> Unit) {
	sectionBreakLocation = Location().apply(setup)
}

@GoogleDSL
fun CreateFootnoteRequest.endOfSegmentLocation(setup: EndOfSegmentLocation.() -> Unit) {
	endOfSegmentLocation = EndOfSegmentLocation().apply(setup)
}

@GoogleDSL
fun CreateFootnoteRequest.location(setup: Location.() -> Unit) {
	location = Location().apply(setup)
}

@GoogleDSL
fun CreateHeaderRequest.sectionBreakLocation(setup: Location.() -> Unit) {
	sectionBreakLocation = Location().apply(setup)
}

@GoogleDSL
fun CreateNamedRangeRequest.range(setup: Range.() -> Unit) {
	range = Range().apply(setup)
}

@GoogleDSL
fun CreateParagraphBulletsRequest.range(setup: Range.() -> Unit) {
	range = Range().apply(setup)
}

@GoogleDSL
fun DeleteContentRangeRequest.range(setup: Range.() -> Unit) {
	range = Range().apply(setup)
}

@GoogleDSL
fun DeleteNamedRangeRequest.tabsCriteria(setup: TabsCriteria.() -> Unit) {
	tabsCriteria = TabsCriteria().apply(setup)
}

@GoogleDSL
fun DeleteParagraphBulletsRequest.range(setup: Range.() -> Unit) {
	range = Range().apply(setup)
}

@GoogleDSL
fun DeleteTableColumnRequest.tableCellLocation(setup: TableCellLocation.() -> Unit) {
	tableCellLocation = TableCellLocation().apply(setup)
}

@GoogleDSL
fun DeleteTableRowRequest.tableCellLocation(setup: TableCellLocation.() -> Unit) {
	tableCellLocation = TableCellLocation().apply(setup)
}

@GoogleDSL
fun Document.body(setup: Body.() -> Unit) {
	body = Body().apply(setup)
}

@GoogleDSL
fun Document.documentStyle(setup: DocumentStyle.() -> Unit) {
	documentStyle = DocumentStyle().apply(setup)
}

@GoogleDSL
class DocumentFootersBuilder {

	val all = mutableMapOf<String, Footer>()
	infix fun String.to(that: Footer) = all.put(this, that)
}

@GoogleDSL
fun Document.footers(setup: DocumentFootersBuilder.() -> Unit) {
	footers = DocumentFootersBuilder().apply(setup).all
}

@GoogleDSL
class DocumentFootnotesBuilder {

	val all = mutableMapOf<String, Footnote>()
	infix fun String.to(that: Footnote) = all.put(this, that)
}

@GoogleDSL
fun Document.footnotes(setup: DocumentFootnotesBuilder.() -> Unit) {
	footnotes = DocumentFootnotesBuilder().apply(setup).all
}

@GoogleDSL
class DocumentHeadersBuilder {

	val all = mutableMapOf<String, Header>()
	infix fun String.to(that: Header) = all.put(this, that)
}

@GoogleDSL
fun Document.headers(setup: DocumentHeadersBuilder.() -> Unit) {
	headers = DocumentHeadersBuilder().apply(setup).all
}

@GoogleDSL
class DocumentInlineObjectsBuilder {

	val all = mutableMapOf<String, InlineObject>()
	infix fun String.to(that: InlineObject) = all.put(this, that)
}

@GoogleDSL
fun Document.inlineObjects(setup: DocumentInlineObjectsBuilder.() -> Unit) {
	inlineObjects = DocumentInlineObjectsBuilder().apply(setup).all
}

@GoogleDSL
class DocumentListsBuilder {

	val all = mutableMapOf<String, com.google.api.services.docs.v1.model.List>()
	infix fun String.to(that: com.google.api.services.docs.v1.model.List) = all.put(this, that)
}

@GoogleDSL
fun Document.lists(setup: DocumentListsBuilder.() -> Unit) {
	lists = DocumentListsBuilder().apply(setup).all
}

@GoogleDSL
class DocumentNamedRangesBuilder {

	val all = mutableMapOf<String, NamedRanges>()
	infix fun String.to(that: NamedRanges) = all.put(this, that)
}

@GoogleDSL
fun Document.namedRanges(setup: DocumentNamedRangesBuilder.() -> Unit) {
	namedRanges = DocumentNamedRangesBuilder().apply(setup).all
}

@GoogleDSL
fun Document.namedStyles(setup: NamedStyles.() -> Unit) {
	namedStyles = NamedStyles().apply(setup)
}

@GoogleDSL
class DocumentPositionedObjectsBuilder {

	val all = mutableMapOf<String, PositionedObject>()
	infix fun String.to(that: PositionedObject) = all.put(this, that)
}

@GoogleDSL
fun Document.positionedObjects(setup: DocumentPositionedObjectsBuilder.() -> Unit) {
	positionedObjects = DocumentPositionedObjectsBuilder().apply(setup).all
}

@GoogleDSL
class DocumentSuggestedDocumentStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedDocumentStyle>()
	infix fun String.to(that: SuggestedDocumentStyle) = all.put(this, that)
}

@GoogleDSL
fun Document.suggestedDocumentStyleChanges(setup: DocumentSuggestedDocumentStyleChangesBuilder.() -> Unit) {
	suggestedDocumentStyleChanges = DocumentSuggestedDocumentStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
class DocumentSuggestedNamedStylesChangesBuilder {

	val all = mutableMapOf<String, SuggestedNamedStyles>()
	infix fun String.to(that: SuggestedNamedStyles) = all.put(this, that)
}

@GoogleDSL
fun Document.suggestedNamedStylesChanges(setup: DocumentSuggestedNamedStylesChangesBuilder.() -> Unit) {
	suggestedNamedStylesChanges = DocumentSuggestedNamedStylesChangesBuilder().apply(setup).all
}

interface DocumentTabsBuilder {

	@GoogleDSL
	fun tab(setup: Tab.() -> Unit)
	val all: List<Tab>
}

@GoogleDSL
fun Document.tabs(setup: DocumentTabsBuilder.() -> Unit) {
	val builder = object : DocumentTabsBuilder {
		override val all = mutableListOf<Tab>()

		@GoogleDSL
		override inline fun tab(setup: Tab.() -> Unit) {
			all.add(Tab().apply(setup))
		}
	}

	this.tabs = builder.apply(setup).all
}

@GoogleDSL
fun DocumentStyle.background(setup: Background.() -> Unit) {
	background = Background().apply(setup)
}

@GoogleDSL
fun DocumentStyle.marginBottom(setup: Dimension.() -> Unit) {
	marginBottom = Dimension().apply(setup)
}

@GoogleDSL
fun DocumentStyle.marginFooter(setup: Dimension.() -> Unit) {
	marginFooter = Dimension().apply(setup)
}

@GoogleDSL
fun DocumentStyle.marginHeader(setup: Dimension.() -> Unit) {
	marginHeader = Dimension().apply(setup)
}

@GoogleDSL
fun DocumentStyle.marginLeft(setup: Dimension.() -> Unit) {
	marginLeft = Dimension().apply(setup)
}

@GoogleDSL
fun DocumentStyle.marginRight(setup: Dimension.() -> Unit) {
	marginRight = Dimension().apply(setup)
}

@GoogleDSL
fun DocumentStyle.marginTop(setup: Dimension.() -> Unit) {
	marginTop = Dimension().apply(setup)
}

@GoogleDSL
fun DocumentStyle.pageSize(setup: Size.() -> Unit) {
	pageSize = Size().apply(setup)
}

@GoogleDSL
fun DocumentStyleSuggestionState.backgroundSuggestionState(setup: BackgroundSuggestionState.() -> Unit) {
	backgroundSuggestionState = BackgroundSuggestionState().apply(setup)
}

@GoogleDSL
fun DocumentStyleSuggestionState.pageSizeSuggestionState(setup: SizeSuggestionState.() -> Unit) {
	pageSizeSuggestionState = SizeSuggestionState().apply(setup)
}

@GoogleDSL
fun DocumentTab.body(setup: Body.() -> Unit) {
	body = Body().apply(setup)
}

@GoogleDSL
fun DocumentTab.documentStyle(setup: DocumentStyle.() -> Unit) {
	documentStyle = DocumentStyle().apply(setup)
}

@GoogleDSL
class DocumentTabFootersBuilder {

	val all = mutableMapOf<String, Footer>()
	infix fun String.to(that: Footer) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.footers(setup: DocumentTabFootersBuilder.() -> Unit) {
	footers = DocumentTabFootersBuilder().apply(setup).all
}

@GoogleDSL
class DocumentTabFootnotesBuilder {

	val all = mutableMapOf<String, Footnote>()
	infix fun String.to(that: Footnote) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.footnotes(setup: DocumentTabFootnotesBuilder.() -> Unit) {
	footnotes = DocumentTabFootnotesBuilder().apply(setup).all
}

@GoogleDSL
class DocumentTabHeadersBuilder {

	val all = mutableMapOf<String, Header>()
	infix fun String.to(that: Header) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.headers(setup: DocumentTabHeadersBuilder.() -> Unit) {
	headers = DocumentTabHeadersBuilder().apply(setup).all
}

@GoogleDSL
class DocumentTabInlineObjectsBuilder {

	val all = mutableMapOf<String, InlineObject>()
	infix fun String.to(that: InlineObject) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.inlineObjects(setup: DocumentTabInlineObjectsBuilder.() -> Unit) {
	inlineObjects = DocumentTabInlineObjectsBuilder().apply(setup).all
}

@GoogleDSL
class DocumentTabListsBuilder {

	val all = mutableMapOf<String, com.google.api.services.docs.v1.model.List>()
	infix fun String.to(that: com.google.api.services.docs.v1.model.List) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.lists(setup: DocumentTabListsBuilder.() -> Unit) {
	lists = DocumentTabListsBuilder().apply(setup).all
}

@GoogleDSL
class DocumentTabNamedRangesBuilder {

	val all = mutableMapOf<String, NamedRanges>()
	infix fun String.to(that: NamedRanges) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.namedRanges(setup: DocumentTabNamedRangesBuilder.() -> Unit) {
	namedRanges = DocumentTabNamedRangesBuilder().apply(setup).all
}

@GoogleDSL
fun DocumentTab.namedStyles(setup: NamedStyles.() -> Unit) {
	namedStyles = NamedStyles().apply(setup)
}

@GoogleDSL
class DocumentTabPositionedObjectsBuilder {

	val all = mutableMapOf<String, PositionedObject>()
	infix fun String.to(that: PositionedObject) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.positionedObjects(setup: DocumentTabPositionedObjectsBuilder.() -> Unit) {
	positionedObjects = DocumentTabPositionedObjectsBuilder().apply(setup).all
}

@GoogleDSL
class DocumentTabSuggestedDocumentStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedDocumentStyle>()
	infix fun String.to(that: SuggestedDocumentStyle) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.suggestedDocumentStyleChanges(setup: DocumentTabSuggestedDocumentStyleChangesBuilder.() -> Unit) {
	suggestedDocumentStyleChanges = DocumentTabSuggestedDocumentStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
class DocumentTabSuggestedNamedStylesChangesBuilder {

	val all = mutableMapOf<String, SuggestedNamedStyles>()
	infix fun String.to(that: SuggestedNamedStyles) = all.put(this, that)
}

@GoogleDSL
fun DocumentTab.suggestedNamedStylesChanges(setup: DocumentTabSuggestedNamedStylesChangesBuilder.() -> Unit) {
	suggestedNamedStylesChanges = DocumentTabSuggestedNamedStylesChangesBuilder().apply(setup).all
}

@GoogleDSL
fun EmbeddedObject.embeddedDrawingProperties(setup: EmbeddedDrawingProperties.() -> Unit) {
	embeddedDrawingProperties = EmbeddedDrawingProperties().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.embeddedObjectBorder(setup: EmbeddedObjectBorder.() -> Unit) {
	embeddedObjectBorder = EmbeddedObjectBorder().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.imageProperties(setup: ImageProperties.() -> Unit) {
	imageProperties = ImageProperties().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.linkedContentReference(setup: LinkedContentReference.() -> Unit) {
	linkedContentReference = LinkedContentReference().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.marginBottom(setup: Dimension.() -> Unit) {
	marginBottom = Dimension().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.marginLeft(setup: Dimension.() -> Unit) {
	marginLeft = Dimension().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.marginRight(setup: Dimension.() -> Unit) {
	marginRight = Dimension().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.marginTop(setup: Dimension.() -> Unit) {
	marginTop = Dimension().apply(setup)
}

@GoogleDSL
fun EmbeddedObject.size(setup: Size.() -> Unit) {
	setSize(Size().apply(setup))
}

@GoogleDSL
fun EmbeddedObjectBorder.color(setup: OptionalColor.() -> Unit) {
	color = OptionalColor().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectBorder.width(setup: Dimension.() -> Unit) {
	width = Dimension().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectSuggestionState.embeddedDrawingPropertiesSuggestionState(setup: EmbeddedDrawingPropertiesSuggestionState.() -> Unit) {
	embeddedDrawingPropertiesSuggestionState = EmbeddedDrawingPropertiesSuggestionState().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectSuggestionState.embeddedObjectBorderSuggestionState(setup: EmbeddedObjectBorderSuggestionState.() -> Unit) {
	embeddedObjectBorderSuggestionState = EmbeddedObjectBorderSuggestionState().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectSuggestionState.imagePropertiesSuggestionState(setup: ImagePropertiesSuggestionState.() -> Unit) {
	imagePropertiesSuggestionState = ImagePropertiesSuggestionState().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectSuggestionState.linkedContentReferenceSuggestionState(setup: LinkedContentReferenceSuggestionState.() -> Unit) {
	linkedContentReferenceSuggestionState = LinkedContentReferenceSuggestionState().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectSuggestionState.sizeSuggestionState(setup: SizeSuggestionState.() -> Unit) {
	sizeSuggestionState = SizeSuggestionState().apply(setup)
}

interface FooterContentBuilder {

	@GoogleDSL
	fun structuralElement(setup: StructuralElement.() -> Unit)
	val all: List<StructuralElement>
}

@GoogleDSL
fun Footer.content(setup: FooterContentBuilder.() -> Unit) {
	val builder = object : FooterContentBuilder {
		override val all = mutableListOf<StructuralElement>()

		@GoogleDSL
		override inline fun structuralElement(setup: StructuralElement.() -> Unit) {
			all.add(StructuralElement().apply(setup))
		}
	}

	this.content = builder.apply(setup).all
}

interface FootnoteContentBuilder {

	@GoogleDSL
	fun structuralElement(setup: StructuralElement.() -> Unit)
	val all: List<StructuralElement>
}

@GoogleDSL
fun Footnote.content(setup: FootnoteContentBuilder.() -> Unit) {
	val builder = object : FootnoteContentBuilder {
		override val all = mutableListOf<StructuralElement>()

		@GoogleDSL
		override inline fun structuralElement(setup: StructuralElement.() -> Unit) {
			all.add(StructuralElement().apply(setup))
		}
	}

	this.content = builder.apply(setup).all
}

@GoogleDSL
class FootnoteReferenceSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun FootnoteReference.suggestedTextStyleChanges(setup: FootnoteReferenceSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = FootnoteReferenceSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun FootnoteReference.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

interface HeaderContentBuilder {

	@GoogleDSL
	fun structuralElement(setup: StructuralElement.() -> Unit)
	val all: List<StructuralElement>
}

@GoogleDSL
fun Header.content(setup: HeaderContentBuilder.() -> Unit) {
	val builder = object : HeaderContentBuilder {
		override val all = mutableListOf<StructuralElement>()

		@GoogleDSL
		override inline fun structuralElement(setup: StructuralElement.() -> Unit) {
			all.add(StructuralElement().apply(setup))
		}
	}

	this.content = builder.apply(setup).all
}

@GoogleDSL
class HorizontalRuleSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun HorizontalRule.suggestedTextStyleChanges(setup: HorizontalRuleSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = HorizontalRuleSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun HorizontalRule.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun ImageProperties.cropProperties(setup: CropProperties.() -> Unit) {
	cropProperties = CropProperties().apply(setup)
}

@GoogleDSL
fun ImagePropertiesSuggestionState.cropPropertiesSuggestionState(setup: CropPropertiesSuggestionState.() -> Unit) {
	cropPropertiesSuggestionState = CropPropertiesSuggestionState().apply(setup)
}

@GoogleDSL
fun InlineObject.inlineObjectProperties(setup: InlineObjectProperties.() -> Unit) {
	inlineObjectProperties = InlineObjectProperties().apply(setup)
}

@GoogleDSL
class InlineObjectSuggestedInlineObjectPropertiesChangesBuilder {

	val all = mutableMapOf<String, SuggestedInlineObjectProperties>()
	infix fun String.to(that: SuggestedInlineObjectProperties) = all.put(this, that)
}

@GoogleDSL
fun InlineObject.suggestedInlineObjectPropertiesChanges(setup: InlineObjectSuggestedInlineObjectPropertiesChangesBuilder.() -> Unit) {
	suggestedInlineObjectPropertiesChanges = InlineObjectSuggestedInlineObjectPropertiesChangesBuilder().apply(setup).all
}

@GoogleDSL
class InlineObjectElementSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun InlineObjectElement.suggestedTextStyleChanges(setup: InlineObjectElementSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = InlineObjectElementSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun InlineObjectElement.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun InlineObjectProperties.embeddedObject(setup: EmbeddedObject.() -> Unit) {
	embeddedObject = EmbeddedObject().apply(setup)
}

@GoogleDSL
fun InlineObjectPropertiesSuggestionState.embeddedObjectSuggestionState(setup: EmbeddedObjectSuggestionState.() -> Unit) {
	embeddedObjectSuggestionState = EmbeddedObjectSuggestionState().apply(setup)
}

@GoogleDSL
fun InsertInlineImageRequest.endOfSegmentLocation(setup: EndOfSegmentLocation.() -> Unit) {
	endOfSegmentLocation = EndOfSegmentLocation().apply(setup)
}

@GoogleDSL
fun InsertInlineImageRequest.location(setup: Location.() -> Unit) {
	location = Location().apply(setup)
}

@GoogleDSL
fun InsertInlineImageRequest.objectSize(setup: Size.() -> Unit) {
	objectSize = Size().apply(setup)
}

@GoogleDSL
fun InsertPageBreakRequest.endOfSegmentLocation(setup: EndOfSegmentLocation.() -> Unit) {
	endOfSegmentLocation = EndOfSegmentLocation().apply(setup)
}

@GoogleDSL
fun InsertPageBreakRequest.location(setup: Location.() -> Unit) {
	location = Location().apply(setup)
}

@GoogleDSL
fun InsertSectionBreakRequest.endOfSegmentLocation(setup: EndOfSegmentLocation.() -> Unit) {
	endOfSegmentLocation = EndOfSegmentLocation().apply(setup)
}

@GoogleDSL
fun InsertSectionBreakRequest.location(setup: Location.() -> Unit) {
	location = Location().apply(setup)
}

@GoogleDSL
fun InsertTableColumnRequest.tableCellLocation(setup: TableCellLocation.() -> Unit) {
	tableCellLocation = TableCellLocation().apply(setup)
}

@GoogleDSL
fun InsertTableRequest.endOfSegmentLocation(setup: EndOfSegmentLocation.() -> Unit) {
	endOfSegmentLocation = EndOfSegmentLocation().apply(setup)
}

@GoogleDSL
fun InsertTableRequest.location(setup: Location.() -> Unit) {
	location = Location().apply(setup)
}

@GoogleDSL
fun InsertTableRowRequest.tableCellLocation(setup: TableCellLocation.() -> Unit) {
	tableCellLocation = TableCellLocation().apply(setup)
}

@GoogleDSL
fun InsertTextRequest.endOfSegmentLocation(setup: EndOfSegmentLocation.() -> Unit) {
	endOfSegmentLocation = EndOfSegmentLocation().apply(setup)
}

@GoogleDSL
fun InsertTextRequest.location(setup: Location.() -> Unit) {
	location = Location().apply(setup)
}

@GoogleDSL
fun Link.bookmark(setup: BookmarkLink.() -> Unit) {
	bookmark = BookmarkLink().apply(setup)
}

@GoogleDSL
fun Link.heading(setup: HeadingLink.() -> Unit) {
	heading = HeadingLink().apply(setup)
}

@GoogleDSL
fun LinkedContentReference.sheetsChartReference(setup: SheetsChartReference.() -> Unit) {
	sheetsChartReference = SheetsChartReference().apply(setup)
}

@GoogleDSL
fun LinkedContentReferenceSuggestionState.sheetsChartReferenceSuggestionState(setup: SheetsChartReferenceSuggestionState.() -> Unit) {
	sheetsChartReferenceSuggestionState = SheetsChartReferenceSuggestionState().apply(setup)
}

@GoogleDSL
fun com.google.api.services.docs.v1.model.List.listProperties(setup: ListProperties.() -> Unit) {
	listProperties = ListProperties().apply(setup)
}

@GoogleDSL
class ListSuggestedListPropertiesChangesBuilder {

	val all = mutableMapOf<String, SuggestedListProperties>()
	infix fun String.to(that: SuggestedListProperties) = all.put(this, that)
}

@GoogleDSL
fun com.google.api.services.docs.v1.model.List.suggestedListPropertiesChanges(setup: ListSuggestedListPropertiesChangesBuilder.() -> Unit) {
	suggestedListPropertiesChanges = ListSuggestedListPropertiesChangesBuilder().apply(setup).all
}

interface ListPropertiesNestingLevelsBuilder {

	@GoogleDSL
	fun nestingLevel(setup: NestingLevel.() -> Unit)
	val all: List<NestingLevel>
}

@GoogleDSL
fun ListProperties.nestingLevels(setup: ListPropertiesNestingLevelsBuilder.() -> Unit) {
	val builder = object : ListPropertiesNestingLevelsBuilder {
		override val all = mutableListOf<NestingLevel>()

		@GoogleDSL
		override inline fun nestingLevel(setup: NestingLevel.() -> Unit) {
			all.add(NestingLevel().apply(setup))
		}
	}

	this.nestingLevels = builder.apply(setup).all
}

interface ListPropertiesSuggestionStateNestingLevelsSuggestionStatesBuilder {

	@GoogleDSL
	fun nestingLevelSuggestionState(setup: NestingLevelSuggestionState.() -> Unit)
	val all: List<NestingLevelSuggestionState>
}

@GoogleDSL
fun ListPropertiesSuggestionState.nestingLevelsSuggestionStates(setup: ListPropertiesSuggestionStateNestingLevelsSuggestionStatesBuilder.() -> Unit) {
	val builder = object : ListPropertiesSuggestionStateNestingLevelsSuggestionStatesBuilder {
		override val all = mutableListOf<NestingLevelSuggestionState>()

		@GoogleDSL
		override inline fun nestingLevelSuggestionState(setup: NestingLevelSuggestionState.() -> Unit) {
			all.add(NestingLevelSuggestionState().apply(setup))
		}
	}

	this.nestingLevelsSuggestionStates = builder.apply(setup).all
}

@GoogleDSL
fun MergeTableCellsRequest.tableRange(setup: TableRange.() -> Unit) {
	tableRange = TableRange().apply(setup)
}

interface NamedRangeRangesBuilder {

	@GoogleDSL
	fun range(setup: Range.() -> Unit)
	val all: List<Range>
}

@GoogleDSL
fun NamedRange.ranges(setup: NamedRangeRangesBuilder.() -> Unit) {
	val builder = object : NamedRangeRangesBuilder {
		override val all = mutableListOf<Range>()

		@GoogleDSL
		override inline fun range(setup: Range.() -> Unit) {
			all.add(Range().apply(setup))
		}
	}

	this.ranges = builder.apply(setup).all
}

interface NamedRangesNamedRangesBuilder {

	@GoogleDSL
	fun namedRange(setup: NamedRange.() -> Unit)
	val all: List<NamedRange>
}

@GoogleDSL
fun NamedRanges.namedRanges(setup: NamedRangesNamedRangesBuilder.() -> Unit) {
	val builder = object : NamedRangesNamedRangesBuilder {
		override val all = mutableListOf<NamedRange>()

		@GoogleDSL
		override inline fun namedRange(setup: NamedRange.() -> Unit) {
			all.add(NamedRange().apply(setup))
		}
	}

	this.namedRanges = builder.apply(setup).all
}

@GoogleDSL
fun NamedStyle.paragraphStyle(setup: ParagraphStyle.() -> Unit) {
	paragraphStyle = ParagraphStyle().apply(setup)
}

@GoogleDSL
fun NamedStyle.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun NamedStyleSuggestionState.paragraphStyleSuggestionState(setup: ParagraphStyleSuggestionState.() -> Unit) {
	paragraphStyleSuggestionState = ParagraphStyleSuggestionState().apply(setup)
}

@GoogleDSL
fun NamedStyleSuggestionState.textStyleSuggestionState(setup: TextStyleSuggestionState.() -> Unit) {
	textStyleSuggestionState = TextStyleSuggestionState().apply(setup)
}

interface NamedStylesStylesBuilder {

	@GoogleDSL
	fun namedStyle(setup: NamedStyle.() -> Unit)
	val all: List<NamedStyle>
}

@GoogleDSL
fun NamedStyles.styles(setup: NamedStylesStylesBuilder.() -> Unit) {
	val builder = object : NamedStylesStylesBuilder {
		override val all = mutableListOf<NamedStyle>()

		@GoogleDSL
		override inline fun namedStyle(setup: NamedStyle.() -> Unit) {
			all.add(NamedStyle().apply(setup))
		}
	}

	this.styles = builder.apply(setup).all
}

interface NamedStylesSuggestionStateStylesSuggestionStatesBuilder {

	@GoogleDSL
	fun namedStyleSuggestionState(setup: NamedStyleSuggestionState.() -> Unit)
	val all: List<NamedStyleSuggestionState>
}

@GoogleDSL
fun NamedStylesSuggestionState.stylesSuggestionStates(setup: NamedStylesSuggestionStateStylesSuggestionStatesBuilder.() -> Unit) {
	val builder = object : NamedStylesSuggestionStateStylesSuggestionStatesBuilder {
		override val all = mutableListOf<NamedStyleSuggestionState>()

		@GoogleDSL
		override inline fun namedStyleSuggestionState(setup: NamedStyleSuggestionState.() -> Unit) {
			all.add(NamedStyleSuggestionState().apply(setup))
		}
	}

	this.stylesSuggestionStates = builder.apply(setup).all
}

@GoogleDSL
fun NestingLevel.indentFirstLine(setup: Dimension.() -> Unit) {
	indentFirstLine = Dimension().apply(setup)
}

@GoogleDSL
fun NestingLevel.indentStart(setup: Dimension.() -> Unit) {
	indentStart = Dimension().apply(setup)
}

@GoogleDSL
fun NestingLevel.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun NestingLevelSuggestionState.textStyleSuggestionState(setup: TextStyleSuggestionState.() -> Unit) {
	textStyleSuggestionState = TextStyleSuggestionState().apply(setup)
}

@GoogleDSL
fun OptionalColor.color(setup: Color.() -> Unit) {
	color = Color().apply(setup)
}

@GoogleDSL
class PageBreakSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun PageBreak.suggestedTextStyleChanges(setup: PageBreakSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = PageBreakSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun PageBreak.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun Paragraph.bullet(setup: Bullet.() -> Unit) {
	bullet = Bullet().apply(setup)
}

interface ParagraphElementsBuilder {

	@GoogleDSL
	fun paragraphElement(setup: ParagraphElement.() -> Unit)
	val all: List<ParagraphElement>
}

@GoogleDSL
fun Paragraph.elements(setup: ParagraphElementsBuilder.() -> Unit) {
	val builder = object : ParagraphElementsBuilder {
		override val all = mutableListOf<ParagraphElement>()

		@GoogleDSL
		override inline fun paragraphElement(setup: ParagraphElement.() -> Unit) {
			all.add(ParagraphElement().apply(setup))
		}
	}

	this.elements = builder.apply(setup).all
}

@GoogleDSL
fun Paragraph.paragraphStyle(setup: ParagraphStyle.() -> Unit) {
	paragraphStyle = ParagraphStyle().apply(setup)
}

@GoogleDSL
class ParagraphSuggestedBulletChangesBuilder {

	val all = mutableMapOf<String, SuggestedBullet>()
	infix fun String.to(that: SuggestedBullet) = all.put(this, that)
}

@GoogleDSL
fun Paragraph.suggestedBulletChanges(setup: ParagraphSuggestedBulletChangesBuilder.() -> Unit) {
	suggestedBulletChanges = ParagraphSuggestedBulletChangesBuilder().apply(setup).all
}

@GoogleDSL
class ParagraphSuggestedParagraphStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedParagraphStyle>()
	infix fun String.to(that: SuggestedParagraphStyle) = all.put(this, that)
}

@GoogleDSL
fun Paragraph.suggestedParagraphStyleChanges(setup: ParagraphSuggestedParagraphStyleChangesBuilder.() -> Unit) {
	suggestedParagraphStyleChanges = ParagraphSuggestedParagraphStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
class ParagraphSuggestedPositionedObjectIdsBuilder {

	val all = mutableMapOf<String, ObjectReferences>()
	infix fun String.to(that: ObjectReferences) = all.put(this, that)
}

@GoogleDSL
fun Paragraph.suggestedPositionedObjectIds(setup: ParagraphSuggestedPositionedObjectIdsBuilder.() -> Unit) {
	suggestedPositionedObjectIds = ParagraphSuggestedPositionedObjectIdsBuilder().apply(setup).all
}

@GoogleDSL
fun ParagraphBorder.color(setup: OptionalColor.() -> Unit) {
	color = OptionalColor().apply(setup)
}

@GoogleDSL
fun ParagraphBorder.padding(setup: Dimension.() -> Unit) {
	padding = Dimension().apply(setup)
}

@GoogleDSL
fun ParagraphBorder.width(setup: Dimension.() -> Unit) {
	width = Dimension().apply(setup)
}

@GoogleDSL
fun ParagraphElement.autoText(setup: AutoText.() -> Unit) {
	autoText = AutoText().apply(setup)
}

@GoogleDSL
fun ParagraphElement.columnBreak(setup: ColumnBreak.() -> Unit) {
	columnBreak = ColumnBreak().apply(setup)
}

@GoogleDSL
fun ParagraphElement.equation(setup: Equation.() -> Unit) {
	equation = Equation().apply(setup)
}

@GoogleDSL
fun ParagraphElement.footnoteReference(setup: FootnoteReference.() -> Unit) {
	footnoteReference = FootnoteReference().apply(setup)
}

@GoogleDSL
fun ParagraphElement.horizontalRule(setup: HorizontalRule.() -> Unit) {
	horizontalRule = HorizontalRule().apply(setup)
}

@GoogleDSL
fun ParagraphElement.inlineObjectElement(setup: InlineObjectElement.() -> Unit) {
	inlineObjectElement = InlineObjectElement().apply(setup)
}

@GoogleDSL
fun ParagraphElement.pageBreak(setup: PageBreak.() -> Unit) {
	pageBreak = PageBreak().apply(setup)
}

@GoogleDSL
fun ParagraphElement.person(setup: Person.() -> Unit) {
	person = Person().apply(setup)
}

@GoogleDSL
fun ParagraphElement.richLink(setup: RichLink.() -> Unit) {
	richLink = RichLink().apply(setup)
}

@GoogleDSL
fun ParagraphElement.textRun(setup: TextRun.() -> Unit) {
	textRun = TextRun().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.borderBetween(setup: ParagraphBorder.() -> Unit) {
	borderBetween = ParagraphBorder().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.borderBottom(setup: ParagraphBorder.() -> Unit) {
	borderBottom = ParagraphBorder().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.borderLeft(setup: ParagraphBorder.() -> Unit) {
	borderLeft = ParagraphBorder().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.borderRight(setup: ParagraphBorder.() -> Unit) {
	borderRight = ParagraphBorder().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.borderTop(setup: ParagraphBorder.() -> Unit) {
	borderTop = ParagraphBorder().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.indentEnd(setup: Dimension.() -> Unit) {
	indentEnd = Dimension().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.indentFirstLine(setup: Dimension.() -> Unit) {
	indentFirstLine = Dimension().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.indentStart(setup: Dimension.() -> Unit) {
	indentStart = Dimension().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.shading(setup: Shading.() -> Unit) {
	shading = Shading().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.spaceAbove(setup: Dimension.() -> Unit) {
	spaceAbove = Dimension().apply(setup)
}

@GoogleDSL
fun ParagraphStyle.spaceBelow(setup: Dimension.() -> Unit) {
	spaceBelow = Dimension().apply(setup)
}

interface ParagraphStyleTabStopsBuilder {

	@GoogleDSL
	fun tabStop(setup: TabStop.() -> Unit)
	val all: List<TabStop>
}

@GoogleDSL
fun ParagraphStyle.tabStops(setup: ParagraphStyleTabStopsBuilder.() -> Unit) {
	val builder = object : ParagraphStyleTabStopsBuilder {
		override val all = mutableListOf<TabStop>()

		@GoogleDSL
		override inline fun tabStop(setup: TabStop.() -> Unit) {
			all.add(TabStop().apply(setup))
		}
	}

	this.tabStops = builder.apply(setup).all
}

@GoogleDSL
fun ParagraphStyleSuggestionState.shadingSuggestionState(setup: ShadingSuggestionState.() -> Unit) {
	shadingSuggestionState = ShadingSuggestionState().apply(setup)
}

@GoogleDSL
fun Person.personProperties(setup: PersonProperties.() -> Unit) {
	personProperties = PersonProperties().apply(setup)
}

@GoogleDSL
class PersonSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun Person.suggestedTextStyleChanges(setup: PersonSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = PersonSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun Person.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun PinTableHeaderRowsRequest.tableStartLocation(setup: Location.() -> Unit) {
	tableStartLocation = Location().apply(setup)
}

@GoogleDSL
fun PositionedObject.positionedObjectProperties(setup: PositionedObjectProperties.() -> Unit) {
	positionedObjectProperties = PositionedObjectProperties().apply(setup)
}

@GoogleDSL
class PositionedObjectSuggestedPositionedObjectPropertiesChangesBuilder {

	val all = mutableMapOf<String, SuggestedPositionedObjectProperties>()
	infix fun String.to(that: SuggestedPositionedObjectProperties) = all.put(this, that)
}

@GoogleDSL
fun PositionedObject.suggestedPositionedObjectPropertiesChanges(setup: PositionedObjectSuggestedPositionedObjectPropertiesChangesBuilder.() -> Unit) {
	suggestedPositionedObjectPropertiesChanges = PositionedObjectSuggestedPositionedObjectPropertiesChangesBuilder().apply(setup).all
}

@GoogleDSL
fun PositionedObjectPositioning.leftOffset(setup: Dimension.() -> Unit) {
	leftOffset = Dimension().apply(setup)
}

@GoogleDSL
fun PositionedObjectPositioning.topOffset(setup: Dimension.() -> Unit) {
	topOffset = Dimension().apply(setup)
}

@GoogleDSL
fun PositionedObjectProperties.embeddedObject(setup: EmbeddedObject.() -> Unit) {
	embeddedObject = EmbeddedObject().apply(setup)
}

@GoogleDSL
fun PositionedObjectProperties.positioning(setup: PositionedObjectPositioning.() -> Unit) {
	positioning = PositionedObjectPositioning().apply(setup)
}

@GoogleDSL
fun PositionedObjectPropertiesSuggestionState.embeddedObjectSuggestionState(setup: EmbeddedObjectSuggestionState.() -> Unit) {
	embeddedObjectSuggestionState = EmbeddedObjectSuggestionState().apply(setup)
}

@GoogleDSL
fun PositionedObjectPropertiesSuggestionState.positioningSuggestionState(setup: PositionedObjectPositioningSuggestionState.() -> Unit) {
	positioningSuggestionState = PositionedObjectPositioningSuggestionState().apply(setup)
}

@GoogleDSL
fun ReplaceAllTextRequest.containsText(setup: SubstringMatchCriteria.() -> Unit) {
	containsText = SubstringMatchCriteria().apply(setup)
}

@GoogleDSL
fun ReplaceAllTextRequest.tabsCriteria(setup: TabsCriteria.() -> Unit) {
	tabsCriteria = TabsCriteria().apply(setup)
}

@GoogleDSL
fun ReplaceNamedRangeContentRequest.tabsCriteria(setup: TabsCriteria.() -> Unit) {
	tabsCriteria = TabsCriteria().apply(setup)
}

@GoogleDSL
fun Request.createFooter(setup: CreateFooterRequest.() -> Unit) {
	createFooter = CreateFooterRequest().apply(setup)
}

@GoogleDSL
fun Request.createFootnote(setup: CreateFootnoteRequest.() -> Unit) {
	createFootnote = CreateFootnoteRequest().apply(setup)
}

@GoogleDSL
fun Request.createHeader(setup: CreateHeaderRequest.() -> Unit) {
	createHeader = CreateHeaderRequest().apply(setup)
}

@GoogleDSL
fun Request.createNamedRange(setup: CreateNamedRangeRequest.() -> Unit) {
	createNamedRange = CreateNamedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.createParagraphBullets(setup: CreateParagraphBulletsRequest.() -> Unit) {
	createParagraphBullets = CreateParagraphBulletsRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteContentRange(setup: DeleteContentRangeRequest.() -> Unit) {
	deleteContentRange = DeleteContentRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteFooter(setup: DeleteFooterRequest.() -> Unit) {
	deleteFooter = DeleteFooterRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteHeader(setup: DeleteHeaderRequest.() -> Unit) {
	deleteHeader = DeleteHeaderRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteNamedRange(setup: DeleteNamedRangeRequest.() -> Unit) {
	deleteNamedRange = DeleteNamedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteParagraphBullets(setup: DeleteParagraphBulletsRequest.() -> Unit) {
	deleteParagraphBullets = DeleteParagraphBulletsRequest().apply(setup)
}

@GoogleDSL
fun Request.deletePositionedObject(setup: DeletePositionedObjectRequest.() -> Unit) {
	deletePositionedObject = DeletePositionedObjectRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteTableColumn(setup: DeleteTableColumnRequest.() -> Unit) {
	deleteTableColumn = DeleteTableColumnRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteTableRow(setup: DeleteTableRowRequest.() -> Unit) {
	deleteTableRow = DeleteTableRowRequest().apply(setup)
}

@GoogleDSL
fun Request.insertInlineImage(setup: InsertInlineImageRequest.() -> Unit) {
	insertInlineImage = InsertInlineImageRequest().apply(setup)
}

@GoogleDSL
fun Request.insertPageBreak(setup: InsertPageBreakRequest.() -> Unit) {
	insertPageBreak = InsertPageBreakRequest().apply(setup)
}

@GoogleDSL
fun Request.insertSectionBreak(setup: InsertSectionBreakRequest.() -> Unit) {
	insertSectionBreak = InsertSectionBreakRequest().apply(setup)
}

@GoogleDSL
fun Request.insertTable(setup: InsertTableRequest.() -> Unit) {
	insertTable = InsertTableRequest().apply(setup)
}

@GoogleDSL
fun Request.insertTableColumn(setup: InsertTableColumnRequest.() -> Unit) {
	insertTableColumn = InsertTableColumnRequest().apply(setup)
}

@GoogleDSL
fun Request.insertTableRow(setup: InsertTableRowRequest.() -> Unit) {
	insertTableRow = InsertTableRowRequest().apply(setup)
}

@GoogleDSL
fun Request.insertText(setup: InsertTextRequest.() -> Unit) {
	insertText = InsertTextRequest().apply(setup)
}

@GoogleDSL
fun Request.mergeTableCells(setup: MergeTableCellsRequest.() -> Unit) {
	mergeTableCells = MergeTableCellsRequest().apply(setup)
}

@GoogleDSL
fun Request.pinTableHeaderRows(setup: PinTableHeaderRowsRequest.() -> Unit) {
	pinTableHeaderRows = PinTableHeaderRowsRequest().apply(setup)
}

@GoogleDSL
fun Request.replaceAllText(setup: ReplaceAllTextRequest.() -> Unit) {
	replaceAllText = ReplaceAllTextRequest().apply(setup)
}

@GoogleDSL
fun Request.replaceImage(setup: ReplaceImageRequest.() -> Unit) {
	replaceImage = ReplaceImageRequest().apply(setup)
}

@GoogleDSL
fun Request.replaceNamedRangeContent(setup: ReplaceNamedRangeContentRequest.() -> Unit) {
	replaceNamedRangeContent = ReplaceNamedRangeContentRequest().apply(setup)
}

@GoogleDSL
fun Request.unmergeTableCells(setup: UnmergeTableCellsRequest.() -> Unit) {
	unmergeTableCells = UnmergeTableCellsRequest().apply(setup)
}

@GoogleDSL
fun Request.updateDocumentStyle(setup: UpdateDocumentStyleRequest.() -> Unit) {
	updateDocumentStyle = UpdateDocumentStyleRequest().apply(setup)
}

@GoogleDSL
fun Request.updateParagraphStyle(setup: UpdateParagraphStyleRequest.() -> Unit) {
	updateParagraphStyle = UpdateParagraphStyleRequest().apply(setup)
}

@GoogleDSL
fun Request.updateSectionStyle(setup: UpdateSectionStyleRequest.() -> Unit) {
	updateSectionStyle = UpdateSectionStyleRequest().apply(setup)
}

@GoogleDSL
fun Request.updateTableCellStyle(setup: UpdateTableCellStyleRequest.() -> Unit) {
	updateTableCellStyle = UpdateTableCellStyleRequest().apply(setup)
}

@GoogleDSL
fun Request.updateTableColumnProperties(setup: UpdateTableColumnPropertiesRequest.() -> Unit) {
	updateTableColumnProperties = UpdateTableColumnPropertiesRequest().apply(setup)
}

@GoogleDSL
fun Request.updateTableRowStyle(setup: UpdateTableRowStyleRequest.() -> Unit) {
	updateTableRowStyle = UpdateTableRowStyleRequest().apply(setup)
}

@GoogleDSL
fun Request.updateTextStyle(setup: UpdateTextStyleRequest.() -> Unit) {
	updateTextStyle = UpdateTextStyleRequest().apply(setup)
}

@GoogleDSL
fun Response.createFooter(setup: CreateFooterResponse.() -> Unit) {
	createFooter = CreateFooterResponse().apply(setup)
}

@GoogleDSL
fun Response.createFootnote(setup: CreateFootnoteResponse.() -> Unit) {
	createFootnote = CreateFootnoteResponse().apply(setup)
}

@GoogleDSL
fun Response.createHeader(setup: CreateHeaderResponse.() -> Unit) {
	createHeader = CreateHeaderResponse().apply(setup)
}

@GoogleDSL
fun Response.createNamedRange(setup: CreateNamedRangeResponse.() -> Unit) {
	createNamedRange = CreateNamedRangeResponse().apply(setup)
}

@GoogleDSL
fun Response.insertInlineImage(setup: InsertInlineImageResponse.() -> Unit) {
	insertInlineImage = InsertInlineImageResponse().apply(setup)
}

@GoogleDSL
fun Response.insertInlineSheetsChart(setup: InsertInlineSheetsChartResponse.() -> Unit) {
	insertInlineSheetsChart = InsertInlineSheetsChartResponse().apply(setup)
}

@GoogleDSL
fun Response.replaceAllText(setup: ReplaceAllTextResponse.() -> Unit) {
	replaceAllText = ReplaceAllTextResponse().apply(setup)
}

@GoogleDSL
fun RichLink.richLinkProperties(setup: RichLinkProperties.() -> Unit) {
	richLinkProperties = RichLinkProperties().apply(setup)
}

@GoogleDSL
class RichLinkSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun RichLink.suggestedTextStyleChanges(setup: RichLinkSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = RichLinkSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun RichLink.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun SectionBreak.sectionStyle(setup: SectionStyle.() -> Unit) {
	sectionStyle = SectionStyle().apply(setup)
}

@GoogleDSL
fun SectionColumnProperties.paddingEnd(setup: Dimension.() -> Unit) {
	paddingEnd = Dimension().apply(setup)
}

@GoogleDSL
fun SectionColumnProperties.width(setup: Dimension.() -> Unit) {
	width = Dimension().apply(setup)
}

interface SectionStyleColumnPropertiesBuilder {

	@GoogleDSL
	fun sectionColumnProperties(setup: SectionColumnProperties.() -> Unit)
	val all: List<SectionColumnProperties>
}

@GoogleDSL
fun SectionStyle.columnProperties(setup: SectionStyleColumnPropertiesBuilder.() -> Unit) {
	val builder = object : SectionStyleColumnPropertiesBuilder {
		override val all = mutableListOf<SectionColumnProperties>()

		@GoogleDSL
		override inline fun sectionColumnProperties(setup: SectionColumnProperties.() -> Unit) {
			all.add(SectionColumnProperties().apply(setup))
		}
	}

	this.columnProperties = builder.apply(setup).all
}

@GoogleDSL
fun SectionStyle.marginBottom(setup: Dimension.() -> Unit) {
	marginBottom = Dimension().apply(setup)
}

@GoogleDSL
fun SectionStyle.marginFooter(setup: Dimension.() -> Unit) {
	marginFooter = Dimension().apply(setup)
}

@GoogleDSL
fun SectionStyle.marginHeader(setup: Dimension.() -> Unit) {
	marginHeader = Dimension().apply(setup)
}

@GoogleDSL
fun SectionStyle.marginLeft(setup: Dimension.() -> Unit) {
	marginLeft = Dimension().apply(setup)
}

@GoogleDSL
fun SectionStyle.marginRight(setup: Dimension.() -> Unit) {
	marginRight = Dimension().apply(setup)
}

@GoogleDSL
fun SectionStyle.marginTop(setup: Dimension.() -> Unit) {
	marginTop = Dimension().apply(setup)
}

@GoogleDSL
fun Shading.backgroundColor(setup: OptionalColor.() -> Unit) {
	backgroundColor = OptionalColor().apply(setup)
}

@GoogleDSL
fun Size.height(setup: Dimension.() -> Unit) {
	height = Dimension().apply(setup)
}

@GoogleDSL
fun Size.width(setup: Dimension.() -> Unit) {
	width = Dimension().apply(setup)
}

@GoogleDSL
fun StructuralElement.paragraph(setup: Paragraph.() -> Unit) {
	paragraph = Paragraph().apply(setup)
}

@GoogleDSL
fun StructuralElement.sectionBreak(setup: SectionBreak.() -> Unit) {
	sectionBreak = SectionBreak().apply(setup)
}

@GoogleDSL
fun StructuralElement.table(setup: Table.() -> Unit) {
	table = Table().apply(setup)
}

@GoogleDSL
fun StructuralElement.tableOfContents(setup: TableOfContents.() -> Unit) {
	tableOfContents = TableOfContents().apply(setup)
}

@GoogleDSL
fun SuggestedBullet.bullet(setup: Bullet.() -> Unit) {
	bullet = Bullet().apply(setup)
}

@GoogleDSL
fun SuggestedBullet.bulletSuggestionState(setup: BulletSuggestionState.() -> Unit) {
	bulletSuggestionState = BulletSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedDocumentStyle.documentStyle(setup: DocumentStyle.() -> Unit) {
	documentStyle = DocumentStyle().apply(setup)
}

@GoogleDSL
fun SuggestedDocumentStyle.documentStyleSuggestionState(setup: DocumentStyleSuggestionState.() -> Unit) {
	documentStyleSuggestionState = DocumentStyleSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedInlineObjectProperties.inlineObjectProperties(setup: InlineObjectProperties.() -> Unit) {
	inlineObjectProperties = InlineObjectProperties().apply(setup)
}

@GoogleDSL
fun SuggestedInlineObjectProperties.inlineObjectPropertiesSuggestionState(setup: InlineObjectPropertiesSuggestionState.() -> Unit) {
	inlineObjectPropertiesSuggestionState = InlineObjectPropertiesSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedListProperties.listProperties(setup: ListProperties.() -> Unit) {
	listProperties = ListProperties().apply(setup)
}

@GoogleDSL
fun SuggestedListProperties.listPropertiesSuggestionState(setup: ListPropertiesSuggestionState.() -> Unit) {
	listPropertiesSuggestionState = ListPropertiesSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedNamedStyles.namedStyles(setup: NamedStyles.() -> Unit) {
	namedStyles = NamedStyles().apply(setup)
}

@GoogleDSL
fun SuggestedNamedStyles.namedStylesSuggestionState(setup: NamedStylesSuggestionState.() -> Unit) {
	namedStylesSuggestionState = NamedStylesSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedParagraphStyle.paragraphStyle(setup: ParagraphStyle.() -> Unit) {
	paragraphStyle = ParagraphStyle().apply(setup)
}

@GoogleDSL
fun SuggestedParagraphStyle.paragraphStyleSuggestionState(setup: ParagraphStyleSuggestionState.() -> Unit) {
	paragraphStyleSuggestionState = ParagraphStyleSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedPositionedObjectProperties.positionedObjectProperties(setup: PositionedObjectProperties.() -> Unit) {
	positionedObjectProperties = PositionedObjectProperties().apply(setup)
}

@GoogleDSL
fun SuggestedPositionedObjectProperties.positionedObjectPropertiesSuggestionState(setup: PositionedObjectPropertiesSuggestionState.() -> Unit) {
	positionedObjectPropertiesSuggestionState = PositionedObjectPropertiesSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedTableCellStyle.tableCellStyle(setup: TableCellStyle.() -> Unit) {
	tableCellStyle = TableCellStyle().apply(setup)
}

@GoogleDSL
fun SuggestedTableCellStyle.tableCellStyleSuggestionState(setup: TableCellStyleSuggestionState.() -> Unit) {
	tableCellStyleSuggestionState = TableCellStyleSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedTableRowStyle.tableRowStyle(setup: TableRowStyle.() -> Unit) {
	tableRowStyle = TableRowStyle().apply(setup)
}

@GoogleDSL
fun SuggestedTableRowStyle.tableRowStyleSuggestionState(setup: TableRowStyleSuggestionState.() -> Unit) {
	tableRowStyleSuggestionState = TableRowStyleSuggestionState().apply(setup)
}

@GoogleDSL
fun SuggestedTextStyle.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun SuggestedTextStyle.textStyleSuggestionState(setup: TextStyleSuggestionState.() -> Unit) {
	textStyleSuggestionState = TextStyleSuggestionState().apply(setup)
}

interface TabChildTabsBuilder {

	@GoogleDSL
	fun tab(setup: Tab.() -> Unit)
	val all: List<Tab>
}

@GoogleDSL
fun Tab.childTabs(setup: TabChildTabsBuilder.() -> Unit) {
	val builder = object : TabChildTabsBuilder {
		override val all = mutableListOf<Tab>()

		@GoogleDSL
		override inline fun tab(setup: Tab.() -> Unit) {
			all.add(Tab().apply(setup))
		}
	}

	this.childTabs = builder.apply(setup).all
}

@GoogleDSL
fun Tab.documentTab(setup: DocumentTab.() -> Unit) {
	documentTab = DocumentTab().apply(setup)
}

@GoogleDSL
fun Tab.tabProperties(setup: TabProperties.() -> Unit) {
	tabProperties = TabProperties().apply(setup)
}

@GoogleDSL
fun TabStop.offset(setup: Dimension.() -> Unit) {
	offset = Dimension().apply(setup)
}

interface TableTableRowsBuilder {

	@GoogleDSL
	fun tableRow(setup: TableRow.() -> Unit)
	val all: List<TableRow>
}

@GoogleDSL
fun Table.tableRows(setup: TableTableRowsBuilder.() -> Unit) {
	val builder = object : TableTableRowsBuilder {
		override val all = mutableListOf<TableRow>()

		@GoogleDSL
		override inline fun tableRow(setup: TableRow.() -> Unit) {
			all.add(TableRow().apply(setup))
		}
	}

	this.tableRows = builder.apply(setup).all
}

@GoogleDSL
fun Table.tableStyle(setup: TableStyle.() -> Unit) {
	tableStyle = TableStyle().apply(setup)
}

interface TableCellContentBuilder {

	@GoogleDSL
	fun structuralElement(setup: StructuralElement.() -> Unit)
	val all: List<StructuralElement>
}

@GoogleDSL
fun TableCell.content(setup: TableCellContentBuilder.() -> Unit) {
	val builder = object : TableCellContentBuilder {
		override val all = mutableListOf<StructuralElement>()

		@GoogleDSL
		override inline fun structuralElement(setup: StructuralElement.() -> Unit) {
			all.add(StructuralElement().apply(setup))
		}
	}

	this.content = builder.apply(setup).all
}

@GoogleDSL
class TableCellSuggestedTableCellStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTableCellStyle>()
	infix fun String.to(that: SuggestedTableCellStyle) = all.put(this, that)
}

@GoogleDSL
fun TableCell.suggestedTableCellStyleChanges(setup: TableCellSuggestedTableCellStyleChangesBuilder.() -> Unit) {
	suggestedTableCellStyleChanges = TableCellSuggestedTableCellStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun TableCell.tableCellStyle(setup: TableCellStyle.() -> Unit) {
	tableCellStyle = TableCellStyle().apply(setup)
}

@GoogleDSL
fun TableCellBorder.color(setup: OptionalColor.() -> Unit) {
	color = OptionalColor().apply(setup)
}

@GoogleDSL
fun TableCellBorder.width(setup: Dimension.() -> Unit) {
	width = Dimension().apply(setup)
}

@GoogleDSL
fun TableCellLocation.tableStartLocation(setup: Location.() -> Unit) {
	tableStartLocation = Location().apply(setup)
}

@GoogleDSL
fun TableCellStyle.backgroundColor(setup: OptionalColor.() -> Unit) {
	backgroundColor = OptionalColor().apply(setup)
}

@GoogleDSL
fun TableCellStyle.borderBottom(setup: TableCellBorder.() -> Unit) {
	borderBottom = TableCellBorder().apply(setup)
}

@GoogleDSL
fun TableCellStyle.borderLeft(setup: TableCellBorder.() -> Unit) {
	borderLeft = TableCellBorder().apply(setup)
}

@GoogleDSL
fun TableCellStyle.borderRight(setup: TableCellBorder.() -> Unit) {
	borderRight = TableCellBorder().apply(setup)
}

@GoogleDSL
fun TableCellStyle.borderTop(setup: TableCellBorder.() -> Unit) {
	borderTop = TableCellBorder().apply(setup)
}

@GoogleDSL
fun TableCellStyle.paddingBottom(setup: Dimension.() -> Unit) {
	paddingBottom = Dimension().apply(setup)
}

@GoogleDSL
fun TableCellStyle.paddingLeft(setup: Dimension.() -> Unit) {
	paddingLeft = Dimension().apply(setup)
}

@GoogleDSL
fun TableCellStyle.paddingRight(setup: Dimension.() -> Unit) {
	paddingRight = Dimension().apply(setup)
}

@GoogleDSL
fun TableCellStyle.paddingTop(setup: Dimension.() -> Unit) {
	paddingTop = Dimension().apply(setup)
}

@GoogleDSL
fun TableColumnProperties.width(setup: Dimension.() -> Unit) {
	width = Dimension().apply(setup)
}

interface TableOfContentsContentBuilder {

	@GoogleDSL
	fun structuralElement(setup: StructuralElement.() -> Unit)
	val all: List<StructuralElement>
}

@GoogleDSL
fun TableOfContents.content(setup: TableOfContentsContentBuilder.() -> Unit) {
	val builder = object : TableOfContentsContentBuilder {
		override val all = mutableListOf<StructuralElement>()

		@GoogleDSL
		override inline fun structuralElement(setup: StructuralElement.() -> Unit) {
			all.add(StructuralElement().apply(setup))
		}
	}

	this.content = builder.apply(setup).all
}

@GoogleDSL
fun TableRange.tableCellLocation(setup: TableCellLocation.() -> Unit) {
	tableCellLocation = TableCellLocation().apply(setup)
}

@GoogleDSL
class TableRowSuggestedTableRowStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTableRowStyle>()
	infix fun String.to(that: SuggestedTableRowStyle) = all.put(this, that)
}

@GoogleDSL
fun TableRow.suggestedTableRowStyleChanges(setup: TableRowSuggestedTableRowStyleChangesBuilder.() -> Unit) {
	suggestedTableRowStyleChanges = TableRowSuggestedTableRowStyleChangesBuilder().apply(setup).all
}

interface TableRowTableCellsBuilder {

	@GoogleDSL
	fun tableCell(setup: TableCell.() -> Unit)
	val all: List<TableCell>
}

@GoogleDSL
fun TableRow.tableCells(setup: TableRowTableCellsBuilder.() -> Unit) {
	val builder = object : TableRowTableCellsBuilder {
		override val all = mutableListOf<TableCell>()

		@GoogleDSL
		override inline fun tableCell(setup: TableCell.() -> Unit) {
			all.add(TableCell().apply(setup))
		}
	}

	this.tableCells = builder.apply(setup).all
}

@GoogleDSL
fun TableRow.tableRowStyle(setup: TableRowStyle.() -> Unit) {
	tableRowStyle = TableRowStyle().apply(setup)
}

@GoogleDSL
fun TableRowStyle.minRowHeight(setup: Dimension.() -> Unit) {
	minRowHeight = Dimension().apply(setup)
}

interface TableStyleTableColumnPropertiesBuilder {

	@GoogleDSL
	fun tableColumnProperties(setup: TableColumnProperties.() -> Unit)
	val all: List<TableColumnProperties>
}

@GoogleDSL
fun TableStyle.tableColumnProperties(setup: TableStyleTableColumnPropertiesBuilder.() -> Unit) {
	val builder = object : TableStyleTableColumnPropertiesBuilder {
		override val all = mutableListOf<TableColumnProperties>()

		@GoogleDSL
		override inline fun tableColumnProperties(setup: TableColumnProperties.() -> Unit) {
			all.add(TableColumnProperties().apply(setup))
		}
	}

	this.tableColumnProperties = builder.apply(setup).all
}

@GoogleDSL
class TextRunSuggestedTextStyleChangesBuilder {

	val all = mutableMapOf<String, SuggestedTextStyle>()
	infix fun String.to(that: SuggestedTextStyle) = all.put(this, that)
}

@GoogleDSL
fun TextRun.suggestedTextStyleChanges(setup: TextRunSuggestedTextStyleChangesBuilder.() -> Unit) {
	suggestedTextStyleChanges = TextRunSuggestedTextStyleChangesBuilder().apply(setup).all
}

@GoogleDSL
fun TextRun.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

@GoogleDSL
fun TextStyle.backgroundColor(setup: OptionalColor.() -> Unit) {
	backgroundColor = OptionalColor().apply(setup)
}

@GoogleDSL
fun TextStyle.fontSize(setup: Dimension.() -> Unit) {
	fontSize = Dimension().apply(setup)
}

@GoogleDSL
fun TextStyle.foregroundColor(setup: OptionalColor.() -> Unit) {
	foregroundColor = OptionalColor().apply(setup)
}

@GoogleDSL
fun TextStyle.link(setup: Link.() -> Unit) {
	link = Link().apply(setup)
}

@GoogleDSL
fun TextStyle.weightedFontFamily(setup: WeightedFontFamily.() -> Unit) {
	weightedFontFamily = WeightedFontFamily().apply(setup)
}

@GoogleDSL
fun UnmergeTableCellsRequest.tableRange(setup: TableRange.() -> Unit) {
	tableRange = TableRange().apply(setup)
}

@GoogleDSL
fun UpdateDocumentStyleRequest.documentStyle(setup: DocumentStyle.() -> Unit) {
	documentStyle = DocumentStyle().apply(setup)
}

@GoogleDSL
fun UpdateParagraphStyleRequest.paragraphStyle(setup: ParagraphStyle.() -> Unit) {
	paragraphStyle = ParagraphStyle().apply(setup)
}

@GoogleDSL
fun UpdateParagraphStyleRequest.range(setup: Range.() -> Unit) {
	range = Range().apply(setup)
}

@GoogleDSL
fun UpdateSectionStyleRequest.range(setup: Range.() -> Unit) {
	range = Range().apply(setup)
}

@GoogleDSL
fun UpdateSectionStyleRequest.sectionStyle(setup: SectionStyle.() -> Unit) {
	sectionStyle = SectionStyle().apply(setup)
}

@GoogleDSL
fun UpdateTableCellStyleRequest.tableCellStyle(setup: TableCellStyle.() -> Unit) {
	tableCellStyle = TableCellStyle().apply(setup)
}

@GoogleDSL
fun UpdateTableCellStyleRequest.tableRange(setup: TableRange.() -> Unit) {
	tableRange = TableRange().apply(setup)
}

@GoogleDSL
fun UpdateTableCellStyleRequest.tableStartLocation(setup: Location.() -> Unit) {
	tableStartLocation = Location().apply(setup)
}

@GoogleDSL
fun UpdateTableColumnPropertiesRequest.tableColumnProperties(setup: TableColumnProperties.() -> Unit) {
	tableColumnProperties = TableColumnProperties().apply(setup)
}

@GoogleDSL
fun UpdateTableColumnPropertiesRequest.tableStartLocation(setup: Location.() -> Unit) {
	tableStartLocation = Location().apply(setup)
}

@GoogleDSL
fun UpdateTableRowStyleRequest.tableRowStyle(setup: TableRowStyle.() -> Unit) {
	tableRowStyle = TableRowStyle().apply(setup)
}

@GoogleDSL
fun UpdateTableRowStyleRequest.tableStartLocation(setup: Location.() -> Unit) {
	tableStartLocation = Location().apply(setup)
}

@GoogleDSL
fun UpdateTextStyleRequest.range(setup: Range.() -> Unit) {
	range = Range().apply(setup)
}

@GoogleDSL
fun UpdateTextStyleRequest.textStyle(setup: TextStyle.() -> Unit) {
	textStyle = TextStyle().apply(setup)
}

