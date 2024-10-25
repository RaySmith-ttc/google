@file:Suppress("OVERRIDE_BY_INLINE", "unused")

package ru.raysmith.google.sheets.dsl

import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.utils.GoogleDSL

@GoogleDSL
fun AddBandingRequest.bandedRange(setup: BandedRange.() -> Unit) {
	bandedRange = BandedRange().apply(setup)
}

@GoogleDSL
fun AddBandingResponse.bandedRange(setup: BandedRange.() -> Unit) {
	bandedRange = BandedRange().apply(setup)
}

@GoogleDSL
fun AddChartRequest.chart(setup: EmbeddedChart.() -> Unit) {
	chart = EmbeddedChart().apply(setup)
}

@GoogleDSL
fun AddChartResponse.chart(setup: EmbeddedChart.() -> Unit) {
	chart = EmbeddedChart().apply(setup)
}

@GoogleDSL
fun AddConditionalFormatRuleRequest.rule(setup: ConditionalFormatRule.() -> Unit) {
	rule = ConditionalFormatRule().apply(setup)
}

@GoogleDSL
fun AddDataSourceRequest.dataSource(setup: DataSource.() -> Unit) {
	dataSource = DataSource().apply(setup)
}

@GoogleDSL
fun AddDataSourceResponse.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

@GoogleDSL
fun AddDataSourceResponse.dataSource(setup: DataSource.() -> Unit) {
	dataSource = DataSource().apply(setup)
}

@GoogleDSL
fun AddDimensionGroupRequest.range(setup: DimensionRange.() -> Unit) {
	range = DimensionRange().apply(setup)
}

interface AddDimensionGroupResponseDimensionGroupsBuilder {

	@GoogleDSL
	fun dimensionGroup(setup: DimensionGroup.() -> Unit)
	val all: List<DimensionGroup>
}

@GoogleDSL
fun AddDimensionGroupResponse.dimensionGroups(setup: AddDimensionGroupResponseDimensionGroupsBuilder.() -> Unit) {
	val builder = object : AddDimensionGroupResponseDimensionGroupsBuilder {
		override val all = mutableListOf<DimensionGroup>()

		@GoogleDSL
		override inline fun dimensionGroup(setup: DimensionGroup.() -> Unit) {
			all.add(DimensionGroup().apply(setup))
		}
	}

	this.dimensionGroups = builder.apply(setup).all
}

@GoogleDSL
fun AddFilterViewRequest.filter(setup: FilterView.() -> Unit) {
	filter = FilterView().apply(setup)
}

@GoogleDSL
fun AddFilterViewResponse.filter(setup: FilterView.() -> Unit) {
	filter = FilterView().apply(setup)
}

@GoogleDSL
fun AddNamedRangeRequest.namedRange(setup: NamedRange.() -> Unit) {
	namedRange = NamedRange().apply(setup)
}

@GoogleDSL
fun AddNamedRangeResponse.namedRange(setup: NamedRange.() -> Unit) {
	namedRange = NamedRange().apply(setup)
}

@GoogleDSL
fun AddProtectedRangeRequest.protectedRange(setup: ProtectedRange.() -> Unit) {
	protectedRange = ProtectedRange().apply(setup)
}

@GoogleDSL
fun AddProtectedRangeResponse.protectedRange(setup: ProtectedRange.() -> Unit) {
	protectedRange = ProtectedRange().apply(setup)
}

@GoogleDSL
fun AddSheetRequest.properties(setup: SheetProperties.() -> Unit) {
	properties = SheetProperties().apply(setup)
}

@GoogleDSL
fun AddSheetResponse.properties(setup: SheetProperties.() -> Unit) {
	properties = SheetProperties().apply(setup)
}

@GoogleDSL
fun AddSlicerRequest.slicer(setup: Slicer.() -> Unit) {
	slicer = Slicer().apply(setup)
}

@GoogleDSL
fun AddSlicerResponse.slicer(setup: Slicer.() -> Unit) {
	slicer = Slicer().apply(setup)
}

interface AppendCellsRequestRowsBuilder {

	@GoogleDSL
	fun rowData(setup: RowData.() -> Unit)
	val all: List<RowData>
}

@GoogleDSL
fun AppendCellsRequest.rows(setup: AppendCellsRequestRowsBuilder.() -> Unit) {
	val builder = object : AppendCellsRequestRowsBuilder {
		override val all = mutableListOf<RowData>()

		@GoogleDSL
		override inline fun rowData(setup: RowData.() -> Unit) {
			all.add(RowData().apply(setup))
		}
	}

	this.rows = builder.apply(setup).all
}

@GoogleDSL
fun AppendValuesResponse.updates(setup: UpdateValuesResponse.() -> Unit) {
	updates = UpdateValuesResponse().apply(setup)
}

@GoogleDSL
fun AutoFillRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun AutoFillRequest.sourceAndDestination(setup: SourceAndDestination.() -> Unit) {
	sourceAndDestination = SourceAndDestination().apply(setup)
}

@GoogleDSL
fun AutoResizeDimensionsRequest.dataSourceSheetDimensions(setup: DataSourceSheetDimensionRange.() -> Unit) {
	dataSourceSheetDimensions = DataSourceSheetDimensionRange().apply(setup)
}

@GoogleDSL
fun AutoResizeDimensionsRequest.dimensions(setup: DimensionRange.() -> Unit) {
	dimensions = DimensionRange().apply(setup)
}

@GoogleDSL
fun BandedRange.columnProperties(setup: BandingProperties.() -> Unit) {
	columnProperties = BandingProperties().apply(setup)
}

@GoogleDSL
fun BandedRange.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun BandedRange.rowProperties(setup: BandingProperties.() -> Unit) {
	rowProperties = BandingProperties().apply(setup)
}

@GoogleDSL
fun BandingProperties.firstBandColor(setup: Color.() -> Unit) {
	firstBandColor = Color().apply(setup)
}

@GoogleDSL
fun BandingProperties.firstBandColorStyle(setup: ColorStyle.() -> Unit) {
	firstBandColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BandingProperties.footerColor(setup: Color.() -> Unit) {
	footerColor = Color().apply(setup)
}

@GoogleDSL
fun BandingProperties.footerColorStyle(setup: ColorStyle.() -> Unit) {
	footerColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BandingProperties.headerColor(setup: Color.() -> Unit) {
	headerColor = Color().apply(setup)
}

@GoogleDSL
fun BandingProperties.headerColorStyle(setup: ColorStyle.() -> Unit) {
	headerColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BandingProperties.secondBandColor(setup: Color.() -> Unit) {
	secondBandColor = Color().apply(setup)
}

@GoogleDSL
fun BandingProperties.secondBandColorStyle(setup: ColorStyle.() -> Unit) {
	secondBandColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BaselineValueFormat.negativeColor(setup: Color.() -> Unit) {
	negativeColor = Color().apply(setup)
}

@GoogleDSL
fun BaselineValueFormat.negativeColorStyle(setup: ColorStyle.() -> Unit) {
	negativeColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BaselineValueFormat.position(setup: TextPosition.() -> Unit) {
	position = TextPosition().apply(setup)
}

@GoogleDSL
fun BaselineValueFormat.positiveColor(setup: Color.() -> Unit) {
	positiveColor = Color().apply(setup)
}

@GoogleDSL
fun BaselineValueFormat.positiveColorStyle(setup: ColorStyle.() -> Unit) {
	positiveColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BaselineValueFormat.textFormat(setup: TextFormat.() -> Unit) {
	textFormat = TextFormat().apply(setup)
}

@GoogleDSL
fun BasicChartAxis.format(setup: TextFormat.() -> Unit) {
	format = TextFormat().apply(setup)
}

@GoogleDSL
fun BasicChartAxis.titleTextPosition(setup: TextPosition.() -> Unit) {
	titleTextPosition = TextPosition().apply(setup)
}

@GoogleDSL
fun BasicChartAxis.viewWindowOptions(setup: ChartAxisViewWindowOptions.() -> Unit) {
	viewWindowOptions = ChartAxisViewWindowOptions().apply(setup)
}

@GoogleDSL
fun BasicChartDomain.domain(setup: ChartData.() -> Unit) {
	domain = ChartData().apply(setup)
}

@GoogleDSL
fun BasicChartSeries.color(setup: Color.() -> Unit) {
	color = Color().apply(setup)
}

@GoogleDSL
fun BasicChartSeries.colorStyle(setup: ColorStyle.() -> Unit) {
	colorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BasicChartSeries.dataLabel(setup: DataLabel.() -> Unit) {
	dataLabel = DataLabel().apply(setup)
}

@GoogleDSL
fun BasicChartSeries.lineStyle(setup: LineStyle.() -> Unit) {
	lineStyle = LineStyle().apply(setup)
}

@GoogleDSL
fun BasicChartSeries.pointStyle(setup: PointStyle.() -> Unit) {
	pointStyle = PointStyle().apply(setup)
}

@GoogleDSL
fun BasicChartSeries.series(setup: ChartData.() -> Unit) {
	series = ChartData().apply(setup)
}

interface BasicChartSeriesStyleOverridesBuilder {

	@GoogleDSL
	fun basicSeriesDataPointStyleOverride(setup: BasicSeriesDataPointStyleOverride.() -> Unit)
	val all: List<BasicSeriesDataPointStyleOverride>
}

@GoogleDSL
fun BasicChartSeries.styleOverrides(setup: BasicChartSeriesStyleOverridesBuilder.() -> Unit) {
	val builder = object : BasicChartSeriesStyleOverridesBuilder {
		override val all = mutableListOf<BasicSeriesDataPointStyleOverride>()

		@GoogleDSL
		override inline fun basicSeriesDataPointStyleOverride(setup: BasicSeriesDataPointStyleOverride.() -> Unit) {
			all.add(BasicSeriesDataPointStyleOverride().apply(setup))
		}
	}

	this.styleOverrides = builder.apply(setup).all
}

interface BasicChartSpecAxisBuilder {

	@GoogleDSL
	fun basicChartAxis(setup: BasicChartAxis.() -> Unit)
	val all: List<BasicChartAxis>
}

@GoogleDSL
fun BasicChartSpec.axis(setup: BasicChartSpecAxisBuilder.() -> Unit) {
	val builder = object : BasicChartSpecAxisBuilder {
		override val all = mutableListOf<BasicChartAxis>()

		@GoogleDSL
		override inline fun basicChartAxis(setup: BasicChartAxis.() -> Unit) {
			all.add(BasicChartAxis().apply(setup))
		}
	}

	this.axis = builder.apply(setup).all
}

interface BasicChartSpecDomainsBuilder {

	@GoogleDSL
	fun basicChartDomain(setup: BasicChartDomain.() -> Unit)
	val all: List<BasicChartDomain>
}

@GoogleDSL
fun BasicChartSpec.domains(setup: BasicChartSpecDomainsBuilder.() -> Unit) {
	val builder = object : BasicChartSpecDomainsBuilder {
		override val all = mutableListOf<BasicChartDomain>()

		@GoogleDSL
		override inline fun basicChartDomain(setup: BasicChartDomain.() -> Unit) {
			all.add(BasicChartDomain().apply(setup))
		}
	}

	this.domains = builder.apply(setup).all
}

interface BasicChartSpecSeriesBuilder {

	@GoogleDSL
	fun basicChartSeries(setup: BasicChartSeries.() -> Unit)
	val all: List<BasicChartSeries>
}

@GoogleDSL
fun BasicChartSpec.series(setup: BasicChartSpecSeriesBuilder.() -> Unit) {
	val builder = object : BasicChartSpecSeriesBuilder {
		override val all = mutableListOf<BasicChartSeries>()

		@GoogleDSL
		override inline fun basicChartSeries(setup: BasicChartSeries.() -> Unit) {
			all.add(BasicChartSeries().apply(setup))
		}
	}

	this.series = builder.apply(setup).all
}

@GoogleDSL
fun BasicChartSpec.totalDataLabel(setup: DataLabel.() -> Unit) {
	totalDataLabel = DataLabel().apply(setup)
}

@GoogleDSL
class BasicFilterCriteriaBuilder {

	val all = mutableMapOf<String, FilterCriteria>()
	infix fun String.to(that: FilterCriteria) = all.put(this, that)
}

@GoogleDSL
fun BasicFilter.criteria(setup: BasicFilterCriteriaBuilder.() -> Unit) {
	criteria = BasicFilterCriteriaBuilder().apply(setup).all
}

interface BasicFilterFilterSpecsBuilder {

	@GoogleDSL
	fun filterSpec(setup: FilterSpec.() -> Unit)
	val all: List<FilterSpec>
}

@GoogleDSL
fun BasicFilter.filterSpecs(setup: BasicFilterFilterSpecsBuilder.() -> Unit) {
	val builder = object : BasicFilterFilterSpecsBuilder {
		override val all = mutableListOf<FilterSpec>()

		@GoogleDSL
		override inline fun filterSpec(setup: FilterSpec.() -> Unit) {
			all.add(FilterSpec().apply(setup))
		}
	}

	this.filterSpecs = builder.apply(setup).all
}

@GoogleDSL
fun BasicFilter.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

interface BasicFilterSortSpecsBuilder {

	@GoogleDSL
	fun sortSpec(setup: SortSpec.() -> Unit)
	val all: List<SortSpec>
}

@GoogleDSL
fun BasicFilter.sortSpecs(setup: BasicFilterSortSpecsBuilder.() -> Unit) {
	val builder = object : BasicFilterSortSpecsBuilder {
		override val all = mutableListOf<SortSpec>()

		@GoogleDSL
		override inline fun sortSpec(setup: SortSpec.() -> Unit) {
			all.add(SortSpec().apply(setup))
		}
	}

	this.sortSpecs = builder.apply(setup).all
}

@GoogleDSL
fun BasicSeriesDataPointStyleOverride.color(setup: Color.() -> Unit) {
	color = Color().apply(setup)
}

@GoogleDSL
fun BasicSeriesDataPointStyleOverride.colorStyle(setup: ColorStyle.() -> Unit) {
	colorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BasicSeriesDataPointStyleOverride.pointStyle(setup: PointStyle.() -> Unit) {
	pointStyle = PointStyle().apply(setup)
}

interface BatchClearValuesByDataFilterRequestDataFiltersBuilder {

	@GoogleDSL
	fun dataFilter(setup: DataFilter.() -> Unit)
	val all: List<DataFilter>
}

@GoogleDSL
fun BatchClearValuesByDataFilterRequest.dataFilters(setup: BatchClearValuesByDataFilterRequestDataFiltersBuilder.() -> Unit) {
	val builder = object : BatchClearValuesByDataFilterRequestDataFiltersBuilder {
		override val all = mutableListOf<DataFilter>()

		@GoogleDSL
		override inline fun dataFilter(setup: DataFilter.() -> Unit) {
			all.add(DataFilter().apply(setup))
		}
	}

	this.dataFilters = builder.apply(setup).all
}

interface BatchGetValuesByDataFilterRequestDataFiltersBuilder {

	@GoogleDSL
	fun dataFilter(setup: DataFilter.() -> Unit)
	val all: List<DataFilter>
}

@GoogleDSL
fun BatchGetValuesByDataFilterRequest.dataFilters(setup: BatchGetValuesByDataFilterRequestDataFiltersBuilder.() -> Unit) {
	val builder = object : BatchGetValuesByDataFilterRequestDataFiltersBuilder {
		override val all = mutableListOf<DataFilter>()

		@GoogleDSL
		override inline fun dataFilter(setup: DataFilter.() -> Unit) {
			all.add(DataFilter().apply(setup))
		}
	}

	this.dataFilters = builder.apply(setup).all
}

interface BatchGetValuesByDataFilterResponseValueRangesBuilder {

	@GoogleDSL
	fun matchedValueRange(setup: MatchedValueRange.() -> Unit)
	val all: List<MatchedValueRange>
}

@GoogleDSL
fun BatchGetValuesByDataFilterResponse.valueRanges(setup: BatchGetValuesByDataFilterResponseValueRangesBuilder.() -> Unit) {
	val builder = object : BatchGetValuesByDataFilterResponseValueRangesBuilder {
		override val all = mutableListOf<MatchedValueRange>()

		@GoogleDSL
		override inline fun matchedValueRange(setup: MatchedValueRange.() -> Unit) {
			all.add(MatchedValueRange().apply(setup))
		}
	}

	this.valueRanges = builder.apply(setup).all
}

interface BatchGetValuesResponseValueRangesBuilder {

	@GoogleDSL
	fun valueRange(setup: ValueRange.() -> Unit)
	val all: List<ValueRange>
}

@GoogleDSL
fun BatchGetValuesResponse.valueRanges(setup: BatchGetValuesResponseValueRangesBuilder.() -> Unit) {
	val builder = object : BatchGetValuesResponseValueRangesBuilder {
		override val all = mutableListOf<ValueRange>()

		@GoogleDSL
		override inline fun valueRange(setup: ValueRange.() -> Unit) {
			all.add(ValueRange().apply(setup))
		}
	}

	this.valueRanges = builder.apply(setup).all
}

interface BatchUpdateSpreadsheetRequestRequestsBuilder {

	@GoogleDSL
	fun request(setup: Request.() -> Unit)
	val all: List<Request>
}

@GoogleDSL
fun BatchUpdateSpreadsheetRequest.requests(setup: BatchUpdateSpreadsheetRequestRequestsBuilder.() -> Unit) {
	val builder = object : BatchUpdateSpreadsheetRequestRequestsBuilder {
		override val all = mutableListOf<Request>()

		@GoogleDSL
		override inline fun request(setup: Request.() -> Unit) {
			all.add(Request().apply(setup))
		}
	}

	this.requests = builder.apply(setup).all
}

interface BatchUpdateSpreadsheetResponseRepliesBuilder {

	@GoogleDSL
	fun response(setup: Response.() -> Unit)
	val all: List<Response>
}

@GoogleDSL
fun BatchUpdateSpreadsheetResponse.replies(setup: BatchUpdateSpreadsheetResponseRepliesBuilder.() -> Unit) {
	val builder = object : BatchUpdateSpreadsheetResponseRepliesBuilder {
		override val all = mutableListOf<Response>()

		@GoogleDSL
		override inline fun response(setup: Response.() -> Unit) {
			all.add(Response().apply(setup))
		}
	}

	this.replies = builder.apply(setup).all
}

@GoogleDSL
fun BatchUpdateSpreadsheetResponse.updatedSpreadsheet(setup: Spreadsheet.() -> Unit) {
	updatedSpreadsheet = Spreadsheet().apply(setup)
}

interface BatchUpdateValuesByDataFilterRequestDataBuilder {

	@GoogleDSL
	fun dataFilterValueRange(setup: DataFilterValueRange.() -> Unit)
	val all: List<DataFilterValueRange>
}

@GoogleDSL
fun BatchUpdateValuesByDataFilterRequest.data(setup: BatchUpdateValuesByDataFilterRequestDataBuilder.() -> Unit) {
	val builder = object : BatchUpdateValuesByDataFilterRequestDataBuilder {
		override val all = mutableListOf<DataFilterValueRange>()

		@GoogleDSL
		override inline fun dataFilterValueRange(setup: DataFilterValueRange.() -> Unit) {
			all.add(DataFilterValueRange().apply(setup))
		}
	}

	this.data = builder.apply(setup).all
}

interface BatchUpdateValuesByDataFilterResponseResponsesBuilder {

	@GoogleDSL
	fun updateValuesByDataFilterResponse(setup: UpdateValuesByDataFilterResponse.() -> Unit)
	val all: List<UpdateValuesByDataFilterResponse>
}

@GoogleDSL
fun BatchUpdateValuesByDataFilterResponse.responses(setup: BatchUpdateValuesByDataFilterResponseResponsesBuilder.() -> Unit) {
	val builder = object : BatchUpdateValuesByDataFilterResponseResponsesBuilder {
		override val all = mutableListOf<UpdateValuesByDataFilterResponse>()

		@GoogleDSL
		override inline fun updateValuesByDataFilterResponse(setup: UpdateValuesByDataFilterResponse.() -> Unit) {
			all.add(UpdateValuesByDataFilterResponse().apply(setup))
		}
	}

	this.responses = builder.apply(setup).all
}

interface BatchUpdateValuesRequestDataBuilder {

	@GoogleDSL
	fun valueRange(setup: ValueRange.() -> Unit)
	val all: List<ValueRange>
}

@GoogleDSL
fun BatchUpdateValuesRequest.data(setup: BatchUpdateValuesRequestDataBuilder.() -> Unit) {
	val builder = object : BatchUpdateValuesRequestDataBuilder {
		override val all = mutableListOf<ValueRange>()

		@GoogleDSL
		override inline fun valueRange(setup: ValueRange.() -> Unit) {
			all.add(ValueRange().apply(setup))
		}
	}

	this.data = builder.apply(setup).all
}

interface BatchUpdateValuesResponseResponsesBuilder {

	@GoogleDSL
	fun updateValuesResponse(setup: UpdateValuesResponse.() -> Unit)
	val all: List<UpdateValuesResponse>
}

@GoogleDSL
fun BatchUpdateValuesResponse.responses(setup: BatchUpdateValuesResponseResponsesBuilder.() -> Unit) {
	val builder = object : BatchUpdateValuesResponseResponsesBuilder {
		override val all = mutableListOf<UpdateValuesResponse>()

		@GoogleDSL
		override inline fun updateValuesResponse(setup: UpdateValuesResponse.() -> Unit) {
			all.add(UpdateValuesResponse().apply(setup))
		}
	}

	this.responses = builder.apply(setup).all
}

@GoogleDSL
fun BigQueryDataSourceSpec.querySpec(setup: BigQueryQuerySpec.() -> Unit) {
	querySpec = BigQueryQuerySpec().apply(setup)
}

@GoogleDSL
fun BigQueryDataSourceSpec.tableSpec(setup: BigQueryTableSpec.() -> Unit) {
	tableSpec = BigQueryTableSpec().apply(setup)
}

interface BooleanConditionValuesBuilder {

	@GoogleDSL
	fun conditionValue(setup: ConditionValue.() -> Unit)
	val all: List<ConditionValue>
}

@GoogleDSL
fun BooleanCondition.values(setup: BooleanConditionValuesBuilder.() -> Unit) {
	val builder = object : BooleanConditionValuesBuilder {
		override val all = mutableListOf<ConditionValue>()

		@GoogleDSL
		override inline fun conditionValue(setup: ConditionValue.() -> Unit) {
			all.add(ConditionValue().apply(setup))
		}
	}

	this.setValues(builder.apply(setup).all)
}

@GoogleDSL
fun BooleanRule.condition(setup: BooleanCondition.() -> Unit) {
	condition = BooleanCondition().apply(setup)
}

@GoogleDSL
fun BooleanRule.format(setup: CellFormat.() -> Unit) {
	format = CellFormat().apply(setup)
}

@GoogleDSL
fun Border.color(setup: Color.() -> Unit) {
	color = Color().apply(setup)
}

@GoogleDSL
fun Border.colorStyle(setup: ColorStyle.() -> Unit) {
	colorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun Borders.bottom(setup: Border.() -> Unit) {
	bottom = Border().apply(setup)
}

@GoogleDSL
fun Borders.left(setup: Border.() -> Unit) {
	left = Border().apply(setup)
}

@GoogleDSL
fun Borders.right(setup: Border.() -> Unit) {
	right = Border().apply(setup)
}

@GoogleDSL
fun Borders.top(setup: Border.() -> Unit) {
	top = Border().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.bubbleBorderColor(setup: Color.() -> Unit) {
	bubbleBorderColor = Color().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.bubbleBorderColorStyle(setup: ColorStyle.() -> Unit) {
	bubbleBorderColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.bubbleLabels(setup: ChartData.() -> Unit) {
	bubbleLabels = ChartData().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.bubbleSizes(setup: ChartData.() -> Unit) {
	bubbleSizes = ChartData().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.bubbleTextStyle(setup: TextFormat.() -> Unit) {
	bubbleTextStyle = TextFormat().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.domain(setup: ChartData.() -> Unit) {
	domain = ChartData().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.groupIds(setup: ChartData.() -> Unit) {
	groupIds = ChartData().apply(setup)
}

@GoogleDSL
fun BubbleChartSpec.series(setup: ChartData.() -> Unit) {
	series = ChartData().apply(setup)
}

@GoogleDSL
fun CancelDataSourceRefreshRequest.references(setup: DataSourceObjectReferences.() -> Unit) {
	references = DataSourceObjectReferences().apply(setup)
}

interface CancelDataSourceRefreshResponseStatusesBuilder {

	@GoogleDSL
	fun cancelDataSourceRefreshStatus(setup: CancelDataSourceRefreshStatus.() -> Unit)
	val all: List<CancelDataSourceRefreshStatus>
}

@GoogleDSL
fun CancelDataSourceRefreshResponse.statuses(setup: CancelDataSourceRefreshResponseStatusesBuilder.() -> Unit) {
	val builder = object : CancelDataSourceRefreshResponseStatusesBuilder {
		override val all = mutableListOf<CancelDataSourceRefreshStatus>()

		@GoogleDSL
		override inline fun cancelDataSourceRefreshStatus(setup: CancelDataSourceRefreshStatus.() -> Unit) {
			all.add(CancelDataSourceRefreshStatus().apply(setup))
		}
	}

	this.statuses = builder.apply(setup).all
}

@GoogleDSL
fun CancelDataSourceRefreshStatus.reference(setup: DataSourceObjectReference.() -> Unit) {
	reference = DataSourceObjectReference().apply(setup)
}

@GoogleDSL
fun CancelDataSourceRefreshStatus.refreshCancellationStatus(setup: RefreshCancellationStatus.() -> Unit) {
	refreshCancellationStatus = RefreshCancellationStatus().apply(setup)
}

interface CandlestickChartSpecDataBuilder {

	@GoogleDSL
	fun candlestickData(setup: CandlestickData.() -> Unit)
	val all: List<CandlestickData>
}

@GoogleDSL
fun CandlestickChartSpec.data(setup: CandlestickChartSpecDataBuilder.() -> Unit) {
	val builder = object : CandlestickChartSpecDataBuilder {
		override val all = mutableListOf<CandlestickData>()

		@GoogleDSL
		override inline fun candlestickData(setup: CandlestickData.() -> Unit) {
			all.add(CandlestickData().apply(setup))
		}
	}

	this.data = builder.apply(setup).all
}

@GoogleDSL
fun CandlestickChartSpec.domain(setup: CandlestickDomain.() -> Unit) {
	domain = CandlestickDomain().apply(setup)
}

@GoogleDSL
fun CandlestickData.closeSeries(setup: CandlestickSeries.() -> Unit) {
	closeSeries = CandlestickSeries().apply(setup)
}

@GoogleDSL
fun CandlestickData.highSeries(setup: CandlestickSeries.() -> Unit) {
	highSeries = CandlestickSeries().apply(setup)
}

@GoogleDSL
fun CandlestickData.lowSeries(setup: CandlestickSeries.() -> Unit) {
	lowSeries = CandlestickSeries().apply(setup)
}

@GoogleDSL
fun CandlestickData.openSeries(setup: CandlestickSeries.() -> Unit) {
	openSeries = CandlestickSeries().apply(setup)
}

@GoogleDSL
fun CandlestickDomain.data(setup: ChartData.() -> Unit) {
	data = ChartData().apply(setup)
}

@GoogleDSL
fun CandlestickSeries.data(setup: ChartData.() -> Unit) {
	data = ChartData().apply(setup)
}

@GoogleDSL
fun CellData.dataSourceFormula(setup: DataSourceFormula.() -> Unit) {
	dataSourceFormula = DataSourceFormula().apply(setup)
}

@GoogleDSL
fun CellData.dataSourceTable(setup: DataSourceTable.() -> Unit) {
	dataSourceTable = DataSourceTable().apply(setup)
}

@GoogleDSL
fun CellData.dataValidation(setup: DataValidationRule.() -> Unit) {
	dataValidation = DataValidationRule().apply(setup)
}

@GoogleDSL
fun CellData.effectiveFormat(setup: CellFormat.() -> Unit) {
	effectiveFormat = CellFormat().apply(setup)
}

@GoogleDSL
fun CellData.effectiveValue(setup: ExtendedValue.() -> Unit) {
	effectiveValue = ExtendedValue().apply(setup)
}

@GoogleDSL
fun CellData.pivotTable(setup: PivotTable.() -> Unit) {
	pivotTable = PivotTable().apply(setup)
}

interface CellDataTextFormatRunsBuilder {

	@GoogleDSL
	fun textFormatRun(setup: TextFormatRun.() -> Unit)
	val all: List<TextFormatRun>
}

@GoogleDSL
fun CellData.textFormatRuns(setup: CellDataTextFormatRunsBuilder.() -> Unit) {
	val builder = object : CellDataTextFormatRunsBuilder {
		override val all = mutableListOf<TextFormatRun>()

		@GoogleDSL
		override inline fun textFormatRun(setup: TextFormatRun.() -> Unit) {
			all.add(TextFormatRun().apply(setup))
		}
	}

	this.textFormatRuns = builder.apply(setup).all
}

@GoogleDSL
fun CellData.userEnteredFormat(setup: CellFormat.() -> Unit) {
	userEnteredFormat = CellFormat().apply(setup)
}

@GoogleDSL
fun CellData.userEnteredValue(setup: ExtendedValue.() -> Unit) {
	userEnteredValue = ExtendedValue().apply(setup)
}

@GoogleDSL
fun CellFormat.backgroundColor(setup: Color.() -> Unit) {
	backgroundColor = Color().apply(setup)
}

@GoogleDSL
fun CellFormat.backgroundColorStyle(setup: ColorStyle.() -> Unit) {
	backgroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun CellFormat.borders(setup: Borders.() -> Unit) {
	borders = Borders().apply(setup)
}

@GoogleDSL
fun CellFormat.numberFormat(setup: NumberFormat.() -> Unit) {
	numberFormat = NumberFormat().apply(setup)
}

@GoogleDSL
fun CellFormat.padding(setup: Padding.() -> Unit) {
	padding = Padding().apply(setup)
}

@GoogleDSL
fun CellFormat.textFormat(setup: TextFormat.() -> Unit) {
	textFormat = TextFormat().apply(setup)
}

@GoogleDSL
fun CellFormat.textRotation(setup: TextRotation.() -> Unit) {
	textRotation = TextRotation().apply(setup)
}

@GoogleDSL
fun ChartData.columnReference(setup: DataSourceColumnReference.() -> Unit) {
	columnReference = DataSourceColumnReference().apply(setup)
}

@GoogleDSL
fun ChartData.groupRule(setup: ChartGroupRule.() -> Unit) {
	groupRule = ChartGroupRule().apply(setup)
}

@GoogleDSL
fun ChartData.sourceRange(setup: ChartSourceRange.() -> Unit) {
	sourceRange = ChartSourceRange().apply(setup)
}

@GoogleDSL
fun ChartGroupRule.dateTimeRule(setup: ChartDateTimeRule.() -> Unit) {
	dateTimeRule = ChartDateTimeRule().apply(setup)
}

@GoogleDSL
fun ChartGroupRule.histogramRule(setup: ChartHistogramRule.() -> Unit) {
	histogramRule = ChartHistogramRule().apply(setup)
}

interface ChartSourceRangeSourcesBuilder {

	@GoogleDSL
	fun gridRange(setup: GridRange.() -> Unit)
	val all: List<GridRange>
}

@GoogleDSL
fun ChartSourceRange.sources(setup: ChartSourceRangeSourcesBuilder.() -> Unit) {
	val builder = object : ChartSourceRangeSourcesBuilder {
		override val all = mutableListOf<GridRange>()

		@GoogleDSL
		override inline fun gridRange(setup: GridRange.() -> Unit) {
			all.add(GridRange().apply(setup))
		}
	}

	this.sources = builder.apply(setup).all
}

@GoogleDSL
fun ChartSpec.backgroundColor(setup: Color.() -> Unit) {
	backgroundColor = Color().apply(setup)
}

@GoogleDSL
fun ChartSpec.backgroundColorStyle(setup: ColorStyle.() -> Unit) {
	backgroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun ChartSpec.basicChart(setup: BasicChartSpec.() -> Unit) {
	basicChart = BasicChartSpec().apply(setup)
}

@GoogleDSL
fun ChartSpec.bubbleChart(setup: BubbleChartSpec.() -> Unit) {
	bubbleChart = BubbleChartSpec().apply(setup)
}

@GoogleDSL
fun ChartSpec.candlestickChart(setup: CandlestickChartSpec.() -> Unit) {
	candlestickChart = CandlestickChartSpec().apply(setup)
}

@GoogleDSL
fun ChartSpec.dataSourceChartProperties(setup: DataSourceChartProperties.() -> Unit) {
	dataSourceChartProperties = DataSourceChartProperties().apply(setup)
}

interface ChartSpecFilterSpecsBuilder {

	@GoogleDSL
	fun filterSpec(setup: FilterSpec.() -> Unit)
	val all: List<FilterSpec>
}

@GoogleDSL
fun ChartSpec.filterSpecs(setup: ChartSpecFilterSpecsBuilder.() -> Unit) {
	val builder = object : ChartSpecFilterSpecsBuilder {
		override val all = mutableListOf<FilterSpec>()

		@GoogleDSL
		override inline fun filterSpec(setup: FilterSpec.() -> Unit) {
			all.add(FilterSpec().apply(setup))
		}
	}

	this.filterSpecs = builder.apply(setup).all
}

@GoogleDSL
fun ChartSpec.histogramChart(setup: HistogramChartSpec.() -> Unit) {
	histogramChart = HistogramChartSpec().apply(setup)
}

@GoogleDSL
fun ChartSpec.orgChart(setup: OrgChartSpec.() -> Unit) {
	orgChart = OrgChartSpec().apply(setup)
}

@GoogleDSL
fun ChartSpec.pieChart(setup: PieChartSpec.() -> Unit) {
	pieChart = PieChartSpec().apply(setup)
}

@GoogleDSL
fun ChartSpec.scorecardChart(setup: ScorecardChartSpec.() -> Unit) {
	scorecardChart = ScorecardChartSpec().apply(setup)
}

interface ChartSpecSortSpecsBuilder {

	@GoogleDSL
	fun sortSpec(setup: SortSpec.() -> Unit)
	val all: List<SortSpec>
}

@GoogleDSL
fun ChartSpec.sortSpecs(setup: ChartSpecSortSpecsBuilder.() -> Unit) {
	val builder = object : ChartSpecSortSpecsBuilder {
		override val all = mutableListOf<SortSpec>()

		@GoogleDSL
		override inline fun sortSpec(setup: SortSpec.() -> Unit) {
			all.add(SortSpec().apply(setup))
		}
	}

	this.sortSpecs = builder.apply(setup).all
}

@GoogleDSL
fun ChartSpec.subtitleTextFormat(setup: TextFormat.() -> Unit) {
	subtitleTextFormat = TextFormat().apply(setup)
}

@GoogleDSL
fun ChartSpec.subtitleTextPosition(setup: TextPosition.() -> Unit) {
	subtitleTextPosition = TextPosition().apply(setup)
}

@GoogleDSL
fun ChartSpec.titleTextFormat(setup: TextFormat.() -> Unit) {
	titleTextFormat = TextFormat().apply(setup)
}

@GoogleDSL
fun ChartSpec.titleTextPosition(setup: TextPosition.() -> Unit) {
	titleTextPosition = TextPosition().apply(setup)
}

@GoogleDSL
fun ChartSpec.treemapChart(setup: TreemapChartSpec.() -> Unit) {
	treemapChart = TreemapChartSpec().apply(setup)
}

@GoogleDSL
fun ChartSpec.waterfallChart(setup: WaterfallChartSpec.() -> Unit) {
	waterfallChart = WaterfallChartSpec().apply(setup)
}

@GoogleDSL
fun ColorStyle.rgbColor(setup: Color.() -> Unit) {
	rgbColor = Color().apply(setup)
}

@GoogleDSL
fun ConditionalFormatRule.booleanRule(setup: BooleanRule.() -> Unit) {
	booleanRule = BooleanRule().apply(setup)
}

@GoogleDSL
fun ConditionalFormatRule.gradientRule(setup: GradientRule.() -> Unit) {
	gradientRule = GradientRule().apply(setup)
}

interface ConditionalFormatRuleRangesBuilder {

	@GoogleDSL
	fun gridRange(setup: GridRange.() -> Unit)
	val all: List<GridRange>
}

@GoogleDSL
fun ConditionalFormatRule.ranges(setup: ConditionalFormatRuleRangesBuilder.() -> Unit) {
	val builder = object : ConditionalFormatRuleRangesBuilder {
		override val all = mutableListOf<GridRange>()

		@GoogleDSL
		override inline fun gridRange(setup: GridRange.() -> Unit) {
			all.add(GridRange().apply(setup))
		}
	}

	this.ranges = builder.apply(setup).all
}

@GoogleDSL
fun CopyPasteRequest.destination(setup: GridRange.() -> Unit) {
	destination = GridRange().apply(setup)
}

@GoogleDSL
fun CopyPasteRequest.source(setup: GridRange.() -> Unit) {
	source = GridRange().apply(setup)
}

@GoogleDSL
fun CreateDeveloperMetadataRequest.developerMetadata(setup: DeveloperMetadata.() -> Unit) {
	developerMetadata = DeveloperMetadata().apply(setup)
}

@GoogleDSL
fun CreateDeveloperMetadataResponse.developerMetadata(setup: DeveloperMetadata.() -> Unit) {
	developerMetadata = DeveloperMetadata().apply(setup)
}

@GoogleDSL
fun CutPasteRequest.destination(setup: GridCoordinate.() -> Unit) {
	destination = GridCoordinate().apply(setup)
}

@GoogleDSL
fun CutPasteRequest.source(setup: GridRange.() -> Unit) {
	source = GridRange().apply(setup)
}

@GoogleDSL
fun DataFilter.developerMetadataLookup(setup: DeveloperMetadataLookup.() -> Unit) {
	developerMetadataLookup = DeveloperMetadataLookup().apply(setup)
}

@GoogleDSL
fun DataFilter.gridRange(setup: GridRange.() -> Unit) {
	gridRange = GridRange().apply(setup)
}

@GoogleDSL
fun DataFilterValueRange.dataFilter(setup: DataFilter.() -> Unit) {
	dataFilter = DataFilter().apply(setup)
}

@GoogleDSL
fun DataLabel.customLabelData(setup: ChartData.() -> Unit) {
	customLabelData = ChartData().apply(setup)
}

@GoogleDSL
fun DataLabel.textFormat(setup: TextFormat.() -> Unit) {
	textFormat = TextFormat().apply(setup)
}

interface DataSourceCalculatedColumnsBuilder {

	@GoogleDSL
	fun dataSourceColumn(setup: DataSourceColumn.() -> Unit)
	val all: List<DataSourceColumn>
}

@GoogleDSL
fun DataSource.calculatedColumns(setup: DataSourceCalculatedColumnsBuilder.() -> Unit) {
	val builder = object : DataSourceCalculatedColumnsBuilder {
		override val all = mutableListOf<DataSourceColumn>()

		@GoogleDSL
		override inline fun dataSourceColumn(setup: DataSourceColumn.() -> Unit) {
			all.add(DataSourceColumn().apply(setup))
		}
	}

	this.calculatedColumns = builder.apply(setup).all
}

@GoogleDSL
fun DataSource.spec(setup: DataSourceSpec.() -> Unit) {
	spec = DataSourceSpec().apply(setup)
}

@GoogleDSL
fun DataSourceChartProperties.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

@GoogleDSL
fun DataSourceColumn.reference(setup: DataSourceColumnReference.() -> Unit) {
	reference = DataSourceColumnReference().apply(setup)
}

@GoogleDSL
fun DataSourceFormula.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

@GoogleDSL
fun DataSourceObjectReference.dataSourceFormulaCell(setup: GridCoordinate.() -> Unit) {
	dataSourceFormulaCell = GridCoordinate().apply(setup)
}

@GoogleDSL
fun DataSourceObjectReference.dataSourcePivotTableAnchorCell(setup: GridCoordinate.() -> Unit) {
	dataSourcePivotTableAnchorCell = GridCoordinate().apply(setup)
}

@GoogleDSL
fun DataSourceObjectReference.dataSourceTableAnchorCell(setup: GridCoordinate.() -> Unit) {
	dataSourceTableAnchorCell = GridCoordinate().apply(setup)
}

interface DataSourceObjectReferencesReferencesBuilder {

	@GoogleDSL
	fun dataSourceObjectReference(setup: DataSourceObjectReference.() -> Unit)
	val all: List<DataSourceObjectReference>
}

@GoogleDSL
fun DataSourceObjectReferences.references(setup: DataSourceObjectReferencesReferencesBuilder.() -> Unit) {
	val builder = object : DataSourceObjectReferencesReferencesBuilder {
		override val all = mutableListOf<DataSourceObjectReference>()

		@GoogleDSL
		override inline fun dataSourceObjectReference(setup: DataSourceObjectReference.() -> Unit) {
			all.add(DataSourceObjectReference().apply(setup))
		}
	}

	this.references = builder.apply(setup).all
}

@GoogleDSL
fun DataSourceParameter.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun DataSourceRefreshDailySchedule.startTime(setup: TimeOfDay.() -> Unit) {
	startTime = TimeOfDay().apply(setup)
}

@GoogleDSL
fun DataSourceRefreshMonthlySchedule.startTime(setup: TimeOfDay.() -> Unit) {
	startTime = TimeOfDay().apply(setup)
}

@GoogleDSL
fun DataSourceRefreshSchedule.dailySchedule(setup: DataSourceRefreshDailySchedule.() -> Unit) {
	dailySchedule = DataSourceRefreshDailySchedule().apply(setup)
}

@GoogleDSL
fun DataSourceRefreshSchedule.monthlySchedule(setup: DataSourceRefreshMonthlySchedule.() -> Unit) {
	monthlySchedule = DataSourceRefreshMonthlySchedule().apply(setup)
}

@GoogleDSL
fun DataSourceRefreshSchedule.nextRun(setup: Interval.() -> Unit) {
	nextRun = Interval().apply(setup)
}

@GoogleDSL
fun DataSourceRefreshSchedule.weeklySchedule(setup: DataSourceRefreshWeeklySchedule.() -> Unit) {
	weeklySchedule = DataSourceRefreshWeeklySchedule().apply(setup)
}

@GoogleDSL
fun DataSourceRefreshWeeklySchedule.startTime(setup: TimeOfDay.() -> Unit) {
	startTime = TimeOfDay().apply(setup)
}

interface DataSourceSheetDimensionRangeColumnReferencesBuilder {

	@GoogleDSL
	fun dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit)
	val all: List<DataSourceColumnReference>
}

@GoogleDSL
fun DataSourceSheetDimensionRange.columnReferences(setup: DataSourceSheetDimensionRangeColumnReferencesBuilder.() -> Unit) {
	val builder = object : DataSourceSheetDimensionRangeColumnReferencesBuilder {
		override val all = mutableListOf<DataSourceColumnReference>()

		@GoogleDSL
		override inline fun dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
			all.add(DataSourceColumnReference().apply(setup))
		}
	}

	this.columnReferences = builder.apply(setup).all
}

interface DataSourceSheetPropertiesColumnsBuilder {

	@GoogleDSL
	fun dataSourceColumn(setup: DataSourceColumn.() -> Unit)
	val all: List<DataSourceColumn>
}

@GoogleDSL
fun DataSourceSheetProperties.columns(setup: DataSourceSheetPropertiesColumnsBuilder.() -> Unit) {
	val builder = object : DataSourceSheetPropertiesColumnsBuilder {
		override val all = mutableListOf<DataSourceColumn>()

		@GoogleDSL
		override inline fun dataSourceColumn(setup: DataSourceColumn.() -> Unit) {
			all.add(DataSourceColumn().apply(setup))
		}
	}

	this.columns = builder.apply(setup).all
}

@GoogleDSL
fun DataSourceSheetProperties.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

@GoogleDSL
fun DataSourceSpec.bigQuery(setup: BigQueryDataSourceSpec.() -> Unit) {
	bigQuery = BigQueryDataSourceSpec().apply(setup)
}

@GoogleDSL
fun DataSourceSpec.looker(setup: LookerDataSourceSpec.() -> Unit) {
	looker = LookerDataSourceSpec().apply(setup)
}

interface DataSourceSpecParametersBuilder {

	@GoogleDSL
	fun dataSourceParameter(setup: DataSourceParameter.() -> Unit)
	val all: List<DataSourceParameter>
}

@GoogleDSL
fun DataSourceSpec.parameters(setup: DataSourceSpecParametersBuilder.() -> Unit) {
	val builder = object : DataSourceSpecParametersBuilder {
		override val all = mutableListOf<DataSourceParameter>()

		@GoogleDSL
		override inline fun dataSourceParameter(setup: DataSourceParameter.() -> Unit) {
			all.add(DataSourceParameter().apply(setup))
		}
	}

	this.parameters = builder.apply(setup).all
}

interface DataSourceTableColumnsBuilder {

	@GoogleDSL
	fun dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit)
	val all: List<DataSourceColumnReference>
}

@GoogleDSL
fun DataSourceTable.columns(setup: DataSourceTableColumnsBuilder.() -> Unit) {
	val builder = object : DataSourceTableColumnsBuilder {
		override val all = mutableListOf<DataSourceColumnReference>()

		@GoogleDSL
		override inline fun dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
			all.add(DataSourceColumnReference().apply(setup))
		}
	}

	this.columns = builder.apply(setup).all
}

@GoogleDSL
fun DataSourceTable.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

interface DataSourceTableFilterSpecsBuilder {

	@GoogleDSL
	fun filterSpec(setup: FilterSpec.() -> Unit)
	val all: List<FilterSpec>
}

@GoogleDSL
fun DataSourceTable.filterSpecs(setup: DataSourceTableFilterSpecsBuilder.() -> Unit) {
	val builder = object : DataSourceTableFilterSpecsBuilder {
		override val all = mutableListOf<FilterSpec>()

		@GoogleDSL
		override inline fun filterSpec(setup: FilterSpec.() -> Unit) {
			all.add(FilterSpec().apply(setup))
		}
	}

	this.filterSpecs = builder.apply(setup).all
}

interface DataSourceTableSortSpecsBuilder {

	@GoogleDSL
	fun sortSpec(setup: SortSpec.() -> Unit)
	val all: List<SortSpec>
}

@GoogleDSL
fun DataSourceTable.sortSpecs(setup: DataSourceTableSortSpecsBuilder.() -> Unit) {
	val builder = object : DataSourceTableSortSpecsBuilder {
		override val all = mutableListOf<SortSpec>()

		@GoogleDSL
		override inline fun sortSpec(setup: SortSpec.() -> Unit) {
			all.add(SortSpec().apply(setup))
		}
	}

	this.sortSpecs = builder.apply(setup).all
}

@GoogleDSL
fun DataValidationRule.condition(setup: BooleanCondition.() -> Unit) {
	condition = BooleanCondition().apply(setup)
}

@GoogleDSL
fun DeleteConditionalFormatRuleResponse.rule(setup: ConditionalFormatRule.() -> Unit) {
	rule = ConditionalFormatRule().apply(setup)
}

@GoogleDSL
fun DeleteDeveloperMetadataRequest.dataFilter(setup: DataFilter.() -> Unit) {
	dataFilter = DataFilter().apply(setup)
}

interface DeleteDeveloperMetadataResponseDeletedDeveloperMetadataBuilder {

	@GoogleDSL
	fun developerMetadata(setup: DeveloperMetadata.() -> Unit)
	val all: List<DeveloperMetadata>
}

@GoogleDSL
fun DeleteDeveloperMetadataResponse.deletedDeveloperMetadata(setup: DeleteDeveloperMetadataResponseDeletedDeveloperMetadataBuilder.() -> Unit) {
	val builder = object : DeleteDeveloperMetadataResponseDeletedDeveloperMetadataBuilder {
		override val all = mutableListOf<DeveloperMetadata>()

		@GoogleDSL
		override inline fun developerMetadata(setup: DeveloperMetadata.() -> Unit) {
			all.add(DeveloperMetadata().apply(setup))
		}
	}

	this.deletedDeveloperMetadata = builder.apply(setup).all
}

@GoogleDSL
fun DeleteDimensionGroupRequest.range(setup: DimensionRange.() -> Unit) {
	range = DimensionRange().apply(setup)
}

interface DeleteDimensionGroupResponseDimensionGroupsBuilder {

	@GoogleDSL
	fun dimensionGroup(setup: DimensionGroup.() -> Unit)
	val all: List<DimensionGroup>
}

@GoogleDSL
fun DeleteDimensionGroupResponse.dimensionGroups(setup: DeleteDimensionGroupResponseDimensionGroupsBuilder.() -> Unit) {
	val builder = object : DeleteDimensionGroupResponseDimensionGroupsBuilder {
		override val all = mutableListOf<DimensionGroup>()

		@GoogleDSL
		override inline fun dimensionGroup(setup: DimensionGroup.() -> Unit) {
			all.add(DimensionGroup().apply(setup))
		}
	}

	this.dimensionGroups = builder.apply(setup).all
}

@GoogleDSL
fun DeleteDimensionRequest.range(setup: DimensionRange.() -> Unit) {
	range = DimensionRange().apply(setup)
}

interface DeleteDuplicatesRequestComparisonColumnsBuilder {

	@GoogleDSL
	fun dimensionRange(setup: DimensionRange.() -> Unit)
	val all: List<DimensionRange>
}

@GoogleDSL
fun DeleteDuplicatesRequest.comparisonColumns(setup: DeleteDuplicatesRequestComparisonColumnsBuilder.() -> Unit) {
	val builder = object : DeleteDuplicatesRequestComparisonColumnsBuilder {
		override val all = mutableListOf<DimensionRange>()

		@GoogleDSL
		override inline fun dimensionRange(setup: DimensionRange.() -> Unit) {
			all.add(DimensionRange().apply(setup))
		}
	}

	this.comparisonColumns = builder.apply(setup).all
}

@GoogleDSL
fun DeleteDuplicatesRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun DeleteRangeRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun DeveloperMetadata.location(setup: DeveloperMetadataLocation.() -> Unit) {
	location = DeveloperMetadataLocation().apply(setup)
}

@GoogleDSL
fun DeveloperMetadataLocation.dimensionRange(setup: DimensionRange.() -> Unit) {
	dimensionRange = DimensionRange().apply(setup)
}

@GoogleDSL
fun DeveloperMetadataLookup.metadataLocation(setup: DeveloperMetadataLocation.() -> Unit) {
	metadataLocation = DeveloperMetadataLocation().apply(setup)
}

@GoogleDSL
fun DimensionGroup.range(setup: DimensionRange.() -> Unit) {
	range = DimensionRange().apply(setup)
}

@GoogleDSL
fun DimensionProperties.dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
	dataSourceColumnReference = DataSourceColumnReference().apply(setup)
}

interface DimensionPropertiesDeveloperMetadataBuilder {

	@GoogleDSL
	fun developerMetadata(setup: DeveloperMetadata.() -> Unit)
	val all: List<DeveloperMetadata>
}

@GoogleDSL
fun DimensionProperties.developerMetadata(setup: DimensionPropertiesDeveloperMetadataBuilder.() -> Unit) {
	val builder = object : DimensionPropertiesDeveloperMetadataBuilder {
		override val all = mutableListOf<DeveloperMetadata>()

		@GoogleDSL
		override inline fun developerMetadata(setup: DeveloperMetadata.() -> Unit) {
			all.add(DeveloperMetadata().apply(setup))
		}
	}

	this.developerMetadata = builder.apply(setup).all
}

@GoogleDSL
fun DuplicateFilterViewResponse.filter(setup: FilterView.() -> Unit) {
	filter = FilterView().apply(setup)
}

@GoogleDSL
fun DuplicateSheetResponse.properties(setup: SheetProperties.() -> Unit) {
	properties = SheetProperties().apply(setup)
}

@GoogleDSL
fun EmbeddedChart.border(setup: EmbeddedObjectBorder.() -> Unit) {
	border = EmbeddedObjectBorder().apply(setup)
}

@GoogleDSL
fun EmbeddedChart.position(setup: EmbeddedObjectPosition.() -> Unit) {
	position = EmbeddedObjectPosition().apply(setup)
}

@GoogleDSL
fun EmbeddedChart.spec(setup: ChartSpec.() -> Unit) {
	spec = ChartSpec().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectBorder.color(setup: Color.() -> Unit) {
	color = Color().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectBorder.colorStyle(setup: ColorStyle.() -> Unit) {
	colorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun EmbeddedObjectPosition.overlayPosition(setup: OverlayPosition.() -> Unit) {
	overlayPosition = OverlayPosition().apply(setup)
}

@GoogleDSL
fun ExtendedValue.errorValue(setup: ErrorValue.() -> Unit) {
	errorValue = ErrorValue().apply(setup)
}

@GoogleDSL
fun FilterCriteria.condition(setup: BooleanCondition.() -> Unit) {
	condition = BooleanCondition().apply(setup)
}

@GoogleDSL
fun FilterCriteria.visibleBackgroundColor(setup: Color.() -> Unit) {
	visibleBackgroundColor = Color().apply(setup)
}

@GoogleDSL
fun FilterCriteria.visibleBackgroundColorStyle(setup: ColorStyle.() -> Unit) {
	visibleBackgroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun FilterCriteria.visibleForegroundColor(setup: Color.() -> Unit) {
	visibleForegroundColor = Color().apply(setup)
}

@GoogleDSL
fun FilterCriteria.visibleForegroundColorStyle(setup: ColorStyle.() -> Unit) {
	visibleForegroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun FilterSpec.dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
	dataSourceColumnReference = DataSourceColumnReference().apply(setup)
}

@GoogleDSL
fun FilterSpec.filterCriteria(setup: FilterCriteria.() -> Unit) {
	filterCriteria = FilterCriteria().apply(setup)
}

@GoogleDSL
class FilterViewCriteriaBuilder {

	val all = mutableMapOf<String, FilterCriteria>()
	infix fun String.to(that: FilterCriteria) = all.put(this, that)
}

@GoogleDSL
fun FilterView.criteria(setup: FilterViewCriteriaBuilder.() -> Unit) {
	criteria = FilterViewCriteriaBuilder().apply(setup).all
}

interface FilterViewFilterSpecsBuilder {

	@GoogleDSL
	fun filterSpec(setup: FilterSpec.() -> Unit)
	val all: List<FilterSpec>
}

@GoogleDSL
fun FilterView.filterSpecs(setup: FilterViewFilterSpecsBuilder.() -> Unit) {
	val builder = object : FilterViewFilterSpecsBuilder {
		override val all = mutableListOf<FilterSpec>()

		@GoogleDSL
		override inline fun filterSpec(setup: FilterSpec.() -> Unit) {
			all.add(FilterSpec().apply(setup))
		}
	}

	this.filterSpecs = builder.apply(setup).all
}

@GoogleDSL
fun FilterView.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

interface FilterViewSortSpecsBuilder {

	@GoogleDSL
	fun sortSpec(setup: SortSpec.() -> Unit)
	val all: List<SortSpec>
}

@GoogleDSL
fun FilterView.sortSpecs(setup: FilterViewSortSpecsBuilder.() -> Unit) {
	val builder = object : FilterViewSortSpecsBuilder {
		override val all = mutableListOf<SortSpec>()

		@GoogleDSL
		override inline fun sortSpec(setup: SortSpec.() -> Unit) {
			all.add(SortSpec().apply(setup))
		}
	}

	this.sortSpecs = builder.apply(setup).all
}

@GoogleDSL
fun FindReplaceRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

interface GetSpreadsheetByDataFilterRequestDataFiltersBuilder {

	@GoogleDSL
	fun dataFilter(setup: DataFilter.() -> Unit)
	val all: List<DataFilter>
}

@GoogleDSL
fun GetSpreadsheetByDataFilterRequest.dataFilters(setup: GetSpreadsheetByDataFilterRequestDataFiltersBuilder.() -> Unit) {
	val builder = object : GetSpreadsheetByDataFilterRequestDataFiltersBuilder {
		override val all = mutableListOf<DataFilter>()

		@GoogleDSL
		override inline fun dataFilter(setup: DataFilter.() -> Unit) {
			all.add(DataFilter().apply(setup))
		}
	}

	this.dataFilters = builder.apply(setup).all
}

@GoogleDSL
fun GradientRule.maxpoint(setup: InterpolationPoint.() -> Unit) {
	maxpoint = InterpolationPoint().apply(setup)
}

@GoogleDSL
fun GradientRule.midpoint(setup: InterpolationPoint.() -> Unit) {
	midpoint = InterpolationPoint().apply(setup)
}

@GoogleDSL
fun GradientRule.minpoint(setup: InterpolationPoint.() -> Unit) {
	minpoint = InterpolationPoint().apply(setup)
}

interface GridDataColumnMetadataBuilder {

	@GoogleDSL
	fun dimensionProperties(setup: DimensionProperties.() -> Unit)
	val all: List<DimensionProperties>
}

@GoogleDSL
fun GridData.columnMetadata(setup: GridDataColumnMetadataBuilder.() -> Unit) {
	val builder = object : GridDataColumnMetadataBuilder {
		override val all = mutableListOf<DimensionProperties>()

		@GoogleDSL
		override inline fun dimensionProperties(setup: DimensionProperties.() -> Unit) {
			all.add(DimensionProperties().apply(setup))
		}
	}

	this.columnMetadata = builder.apply(setup).all
}

interface GridDataRowDataBuilder {

	@GoogleDSL
	fun rowData(setup: RowData.() -> Unit)
	val all: List<RowData>
}

@GoogleDSL
fun GridData.rowData(setup: GridDataRowDataBuilder.() -> Unit) {
	val builder = object : GridDataRowDataBuilder {
		override val all = mutableListOf<RowData>()

		@GoogleDSL
		override inline fun rowData(setup: RowData.() -> Unit) {
			all.add(RowData().apply(setup))
		}
	}

	this.rowData = builder.apply(setup).all
}

interface GridDataRowMetadataBuilder {

	@GoogleDSL
	fun dimensionProperties(setup: DimensionProperties.() -> Unit)
	val all: List<DimensionProperties>
}

@GoogleDSL
fun GridData.rowMetadata(setup: GridDataRowMetadataBuilder.() -> Unit) {
	val builder = object : GridDataRowMetadataBuilder {
		override val all = mutableListOf<DimensionProperties>()

		@GoogleDSL
		override inline fun dimensionProperties(setup: DimensionProperties.() -> Unit) {
			all.add(DimensionProperties().apply(setup))
		}
	}

	this.rowMetadata = builder.apply(setup).all
}

interface HistogramChartSpecSeriesBuilder {

	@GoogleDSL
	fun histogramSeries(setup: HistogramSeries.() -> Unit)
	val all: List<HistogramSeries>
}

@GoogleDSL
fun HistogramChartSpec.series(setup: HistogramChartSpecSeriesBuilder.() -> Unit) {
	val builder = object : HistogramChartSpecSeriesBuilder {
		override val all = mutableListOf<HistogramSeries>()

		@GoogleDSL
		override inline fun histogramSeries(setup: HistogramSeries.() -> Unit) {
			all.add(HistogramSeries().apply(setup))
		}
	}

	this.series = builder.apply(setup).all
}

@GoogleDSL
fun HistogramSeries.barColor(setup: Color.() -> Unit) {
	barColor = Color().apply(setup)
}

@GoogleDSL
fun HistogramSeries.barColorStyle(setup: ColorStyle.() -> Unit) {
	barColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun HistogramSeries.data(setup: ChartData.() -> Unit) {
	data = ChartData().apply(setup)
}

@GoogleDSL
fun InsertDimensionRequest.range(setup: DimensionRange.() -> Unit) {
	range = DimensionRange().apply(setup)
}

@GoogleDSL
fun InsertRangeRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun InterpolationPoint.color(setup: Color.() -> Unit) {
	color = Color().apply(setup)
}

@GoogleDSL
fun InterpolationPoint.colorStyle(setup: ColorStyle.() -> Unit) {
	colorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun KeyValueFormat.position(setup: TextPosition.() -> Unit) {
	position = TextPosition().apply(setup)
}

@GoogleDSL
fun KeyValueFormat.textFormat(setup: TextFormat.() -> Unit) {
	textFormat = TextFormat().apply(setup)
}

interface ManualRuleGroupsBuilder {

	@GoogleDSL
	fun manualRuleGroup(setup: ManualRuleGroup.() -> Unit)
	val all: List<ManualRuleGroup>
}

@GoogleDSL
fun ManualRule.groups(setup: ManualRuleGroupsBuilder.() -> Unit) {
	val builder = object : ManualRuleGroupsBuilder {
		override val all = mutableListOf<ManualRuleGroup>()

		@GoogleDSL
		override inline fun manualRuleGroup(setup: ManualRuleGroup.() -> Unit) {
			all.add(ManualRuleGroup().apply(setup))
		}
	}

	this.groups = builder.apply(setup).all
}

@GoogleDSL
fun ManualRuleGroup.groupName(setup: ExtendedValue.() -> Unit) {
	groupName = ExtendedValue().apply(setup)
}

interface ManualRuleGroupItemsBuilder {

	@GoogleDSL
	fun extendedValue(setup: ExtendedValue.() -> Unit)
	val all: List<ExtendedValue>
}

@GoogleDSL
fun ManualRuleGroup.items(setup: ManualRuleGroupItemsBuilder.() -> Unit) {
	val builder = object : ManualRuleGroupItemsBuilder {
		override val all = mutableListOf<ExtendedValue>()

		@GoogleDSL
		override inline fun extendedValue(setup: ExtendedValue.() -> Unit) {
			all.add(ExtendedValue().apply(setup))
		}
	}

	this.items = builder.apply(setup).all
}

interface MatchedDeveloperMetadataDataFiltersBuilder {

	@GoogleDSL
	fun dataFilter(setup: DataFilter.() -> Unit)
	val all: List<DataFilter>
}

@GoogleDSL
fun MatchedDeveloperMetadata.dataFilters(setup: MatchedDeveloperMetadataDataFiltersBuilder.() -> Unit) {
	val builder = object : MatchedDeveloperMetadataDataFiltersBuilder {
		override val all = mutableListOf<DataFilter>()

		@GoogleDSL
		override inline fun dataFilter(setup: DataFilter.() -> Unit) {
			all.add(DataFilter().apply(setup))
		}
	}

	this.dataFilters = builder.apply(setup).all
}

@GoogleDSL
fun MatchedDeveloperMetadata.developerMetadata(setup: DeveloperMetadata.() -> Unit) {
	developerMetadata = DeveloperMetadata().apply(setup)
}

interface MatchedValueRangeDataFiltersBuilder {

	@GoogleDSL
	fun dataFilter(setup: DataFilter.() -> Unit)
	val all: List<DataFilter>
}

@GoogleDSL
fun MatchedValueRange.dataFilters(setup: MatchedValueRangeDataFiltersBuilder.() -> Unit) {
	val builder = object : MatchedValueRangeDataFiltersBuilder {
		override val all = mutableListOf<DataFilter>()

		@GoogleDSL
		override inline fun dataFilter(setup: DataFilter.() -> Unit) {
			all.add(DataFilter().apply(setup))
		}
	}

	this.dataFilters = builder.apply(setup).all
}

@GoogleDSL
fun MatchedValueRange.valueRange(setup: ValueRange.() -> Unit) {
	valueRange = ValueRange().apply(setup)
}

@GoogleDSL
fun MergeCellsRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun MoveDimensionRequest.source(setup: DimensionRange.() -> Unit) {
	source = DimensionRange().apply(setup)
}

@GoogleDSL
fun NamedRange.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun OrgChartSpec.labels(setup: ChartData.() -> Unit) {
	labels = ChartData().apply(setup)
}

@GoogleDSL
fun OrgChartSpec.nodeColor(setup: Color.() -> Unit) {
	nodeColor = Color().apply(setup)
}

@GoogleDSL
fun OrgChartSpec.nodeColorStyle(setup: ColorStyle.() -> Unit) {
	nodeColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun OrgChartSpec.parentLabels(setup: ChartData.() -> Unit) {
	parentLabels = ChartData().apply(setup)
}

@GoogleDSL
fun OrgChartSpec.selectedNodeColor(setup: Color.() -> Unit) {
	selectedNodeColor = Color().apply(setup)
}

@GoogleDSL
fun OrgChartSpec.selectedNodeColorStyle(setup: ColorStyle.() -> Unit) {
	selectedNodeColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun OrgChartSpec.tooltips(setup: ChartData.() -> Unit) {
	tooltips = ChartData().apply(setup)
}

@GoogleDSL
fun OverlayPosition.anchorCell(setup: GridCoordinate.() -> Unit) {
	anchorCell = GridCoordinate().apply(setup)
}

@GoogleDSL
fun PasteDataRequest.coordinate(setup: GridCoordinate.() -> Unit) {
	coordinate = GridCoordinate().apply(setup)
}

@GoogleDSL
fun PieChartSpec.domain(setup: ChartData.() -> Unit) {
	domain = ChartData().apply(setup)
}

@GoogleDSL
fun PieChartSpec.series(setup: ChartData.() -> Unit) {
	series = ChartData().apply(setup)
}

@GoogleDSL
fun PivotFilterCriteria.condition(setup: BooleanCondition.() -> Unit) {
	condition = BooleanCondition().apply(setup)
}

@GoogleDSL
fun PivotFilterSpec.dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
	dataSourceColumnReference = DataSourceColumnReference().apply(setup)
}

@GoogleDSL
fun PivotFilterSpec.filterCriteria(setup: PivotFilterCriteria.() -> Unit) {
	filterCriteria = PivotFilterCriteria().apply(setup)
}

@GoogleDSL
fun PivotGroup.dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
	dataSourceColumnReference = DataSourceColumnReference().apply(setup)
}

@GoogleDSL
fun PivotGroup.groupLimit(setup: PivotGroupLimit.() -> Unit) {
	groupLimit = PivotGroupLimit().apply(setup)
}

@GoogleDSL
fun PivotGroup.groupRule(setup: PivotGroupRule.() -> Unit) {
	groupRule = PivotGroupRule().apply(setup)
}

@GoogleDSL
fun PivotGroup.valueBucket(setup: PivotGroupSortValueBucket.() -> Unit) {
	valueBucket = PivotGroupSortValueBucket().apply(setup)
}

interface PivotGroupValueMetadataBuilder {

	@GoogleDSL
	fun pivotGroupValueMetadata(setup: PivotGroupValueMetadata.() -> Unit)
	val all: List<PivotGroupValueMetadata>
}

@GoogleDSL
fun PivotGroup.valueMetadata(setup: PivotGroupValueMetadataBuilder.() -> Unit) {
	val builder = object : PivotGroupValueMetadataBuilder {
		override val all = mutableListOf<PivotGroupValueMetadata>()

		@GoogleDSL
		override inline fun pivotGroupValueMetadata(setup: PivotGroupValueMetadata.() -> Unit) {
			all.add(PivotGroupValueMetadata().apply(setup))
		}
	}

	this.valueMetadata = builder.apply(setup).all
}

@GoogleDSL
fun PivotGroupRule.dateTimeRule(setup: DateTimeRule.() -> Unit) {
	dateTimeRule = DateTimeRule().apply(setup)
}

@GoogleDSL
fun PivotGroupRule.histogramRule(setup: HistogramRule.() -> Unit) {
	histogramRule = HistogramRule().apply(setup)
}

@GoogleDSL
fun PivotGroupRule.manualRule(setup: ManualRule.() -> Unit) {
	manualRule = ManualRule().apply(setup)
}

interface PivotGroupSortValueBucketBucketsBuilder {

	@GoogleDSL
	fun extendedValue(setup: ExtendedValue.() -> Unit)
	val all: List<ExtendedValue>
}

@GoogleDSL
fun PivotGroupSortValueBucket.buckets(setup: PivotGroupSortValueBucketBucketsBuilder.() -> Unit) {
	val builder = object : PivotGroupSortValueBucketBucketsBuilder {
		override val all = mutableListOf<ExtendedValue>()

		@GoogleDSL
		override inline fun extendedValue(setup: ExtendedValue.() -> Unit) {
			all.add(ExtendedValue().apply(setup))
		}
	}

	this.buckets = builder.apply(setup).all
}

@GoogleDSL
fun PivotGroupValueMetadata.value(setup: ExtendedValue.() -> Unit) {
	value = ExtendedValue().apply(setup)
}

interface PivotTableColumnsBuilder {

	@GoogleDSL
	fun pivotGroup(setup: PivotGroup.() -> Unit)
	val all: List<PivotGroup>
}

@GoogleDSL
fun PivotTable.columns(setup: PivotTableColumnsBuilder.() -> Unit) {
	val builder = object : PivotTableColumnsBuilder {
		override val all = mutableListOf<PivotGroup>()

		@GoogleDSL
		override inline fun pivotGroup(setup: PivotGroup.() -> Unit) {
			all.add(PivotGroup().apply(setup))
		}
	}

	this.columns = builder.apply(setup).all
}

@GoogleDSL
class PivotTableCriteriaBuilder {

	val all = mutableMapOf<String, PivotFilterCriteria>()
	infix fun String.to(that: PivotFilterCriteria) = all.put(this, that)
}

@GoogleDSL
fun PivotTable.criteria(setup: PivotTableCriteriaBuilder.() -> Unit) {
	criteria = PivotTableCriteriaBuilder().apply(setup).all
}

@GoogleDSL
fun PivotTable.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

interface PivotTableFilterSpecsBuilder {

	@GoogleDSL
	fun pivotFilterSpec(setup: PivotFilterSpec.() -> Unit)
	val all: List<PivotFilterSpec>
}

@GoogleDSL
fun PivotTable.filterSpecs(setup: PivotTableFilterSpecsBuilder.() -> Unit) {
	val builder = object : PivotTableFilterSpecsBuilder {
		override val all = mutableListOf<PivotFilterSpec>()

		@GoogleDSL
		override inline fun pivotFilterSpec(setup: PivotFilterSpec.() -> Unit) {
			all.add(PivotFilterSpec().apply(setup))
		}
	}

	this.filterSpecs = builder.apply(setup).all
}

interface PivotTableRowsBuilder {

	@GoogleDSL
	fun pivotGroup(setup: PivotGroup.() -> Unit)
	val all: List<PivotGroup>
}

@GoogleDSL
fun PivotTable.rows(setup: PivotTableRowsBuilder.() -> Unit) {
	val builder = object : PivotTableRowsBuilder {
		override val all = mutableListOf<PivotGroup>()

		@GoogleDSL
		override inline fun pivotGroup(setup: PivotGroup.() -> Unit) {
			all.add(PivotGroup().apply(setup))
		}
	}

	this.rows = builder.apply(setup).all
}

@GoogleDSL
fun PivotTable.source(setup: GridRange.() -> Unit) {
	source = GridRange().apply(setup)
}

interface PivotTableValuesBuilder {

	@GoogleDSL
	fun pivotValue(setup: PivotValue.() -> Unit)
	val all: List<PivotValue>
}

@GoogleDSL
fun PivotTable.values(setup: PivotTableValuesBuilder.() -> Unit) {
	val builder = object : PivotTableValuesBuilder {
		override val all = mutableListOf<PivotValue>()

		@GoogleDSL
		override inline fun pivotValue(setup: PivotValue.() -> Unit) {
			all.add(PivotValue().apply(setup))
		}
	}

	this.setValues(builder.apply(setup).all)
}

@GoogleDSL
fun PivotValue.dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
	dataSourceColumnReference = DataSourceColumnReference().apply(setup)
}

@GoogleDSL
fun ProtectedRange.editors(setup: Editors.() -> Unit) {
	editors = Editors().apply(setup)
}

@GoogleDSL
fun ProtectedRange.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

interface ProtectedRangeUnprotectedRangesBuilder {

	@GoogleDSL
	fun gridRange(setup: GridRange.() -> Unit)
	val all: List<GridRange>
}

@GoogleDSL
fun ProtectedRange.unprotectedRanges(setup: ProtectedRangeUnprotectedRangesBuilder.() -> Unit) {
	val builder = object : ProtectedRangeUnprotectedRangesBuilder {
		override val all = mutableListOf<GridRange>()

		@GoogleDSL
		override inline fun gridRange(setup: GridRange.() -> Unit) {
			all.add(GridRange().apply(setup))
		}
	}

	this.unprotectedRanges = builder.apply(setup).all
}

@GoogleDSL
fun RandomizeRangeRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun RefreshDataSourceObjectExecutionStatus.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

@GoogleDSL
fun RefreshDataSourceObjectExecutionStatus.reference(setup: DataSourceObjectReference.() -> Unit) {
	reference = DataSourceObjectReference().apply(setup)
}

@GoogleDSL
fun RefreshDataSourceRequest.references(setup: DataSourceObjectReferences.() -> Unit) {
	references = DataSourceObjectReferences().apply(setup)
}

interface RefreshDataSourceResponseStatusesBuilder {

	@GoogleDSL
	fun refreshDataSourceObjectExecutionStatus(setup: RefreshDataSourceObjectExecutionStatus.() -> Unit)
	val all: List<RefreshDataSourceObjectExecutionStatus>
}

@GoogleDSL
fun RefreshDataSourceResponse.statuses(setup: RefreshDataSourceResponseStatusesBuilder.() -> Unit) {
	val builder = object : RefreshDataSourceResponseStatusesBuilder {
		override val all = mutableListOf<RefreshDataSourceObjectExecutionStatus>()

		@GoogleDSL
		override inline fun refreshDataSourceObjectExecutionStatus(setup: RefreshDataSourceObjectExecutionStatus.() -> Unit) {
			all.add(RefreshDataSourceObjectExecutionStatus().apply(setup))
		}
	}

	this.statuses = builder.apply(setup).all
}

@GoogleDSL
fun RepeatCellRequest.cell(setup: CellData.() -> Unit) {
	cell = CellData().apply(setup)
}

@GoogleDSL
fun RepeatCellRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun Request.addBanding(setup: AddBandingRequest.() -> Unit) {
	addBanding = AddBandingRequest().apply(setup)
}

@GoogleDSL
fun Request.addChart(setup: AddChartRequest.() -> Unit) {
	addChart = AddChartRequest().apply(setup)
}

@GoogleDSL
fun Request.addConditionalFormatRule(setup: AddConditionalFormatRuleRequest.() -> Unit) {
	addConditionalFormatRule = AddConditionalFormatRuleRequest().apply(setup)
}

@GoogleDSL
fun Request.addDataSource(setup: AddDataSourceRequest.() -> Unit) {
	addDataSource = AddDataSourceRequest().apply(setup)
}

@GoogleDSL
fun Request.addDimensionGroup(setup: AddDimensionGroupRequest.() -> Unit) {
	addDimensionGroup = AddDimensionGroupRequest().apply(setup)
}

@GoogleDSL
fun Request.addFilterView(setup: AddFilterViewRequest.() -> Unit) {
	addFilterView = AddFilterViewRequest().apply(setup)
}

@GoogleDSL
fun Request.addNamedRange(setup: AddNamedRangeRequest.() -> Unit) {
	addNamedRange = AddNamedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.addProtectedRange(setup: AddProtectedRangeRequest.() -> Unit) {
	addProtectedRange = AddProtectedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.addSheet(setup: AddSheetRequest.() -> Unit) {
	addSheet = AddSheetRequest().apply(setup)
}

@GoogleDSL
fun Request.addSlicer(setup: AddSlicerRequest.() -> Unit) {
	addSlicer = AddSlicerRequest().apply(setup)
}

@GoogleDSL
fun Request.appendCells(setup: AppendCellsRequest.() -> Unit) {
	appendCells = AppendCellsRequest().apply(setup)
}

@GoogleDSL
fun Request.appendDimension(setup: AppendDimensionRequest.() -> Unit) {
	appendDimension = AppendDimensionRequest().apply(setup)
}

@GoogleDSL
fun Request.autoFill(setup: AutoFillRequest.() -> Unit) {
	autoFill = AutoFillRequest().apply(setup)
}

@GoogleDSL
fun Request.autoResizeDimensions(setup: AutoResizeDimensionsRequest.() -> Unit) {
	autoResizeDimensions = AutoResizeDimensionsRequest().apply(setup)
}

@GoogleDSL
fun Request.cancelDataSourceRefresh(setup: CancelDataSourceRefreshRequest.() -> Unit) {
	cancelDataSourceRefresh = CancelDataSourceRefreshRequest().apply(setup)
}

@GoogleDSL
fun Request.clearBasicFilter(setup: ClearBasicFilterRequest.() -> Unit) {
	clearBasicFilter = ClearBasicFilterRequest().apply(setup)
}

@GoogleDSL
fun Request.copyPaste(setup: CopyPasteRequest.() -> Unit) {
	copyPaste = CopyPasteRequest().apply(setup)
}

@GoogleDSL
fun Request.createDeveloperMetadata(setup: CreateDeveloperMetadataRequest.() -> Unit) {
	createDeveloperMetadata = CreateDeveloperMetadataRequest().apply(setup)
}

@GoogleDSL
fun Request.cutPaste(setup: CutPasteRequest.() -> Unit) {
	cutPaste = CutPasteRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteBanding(setup: DeleteBandingRequest.() -> Unit) {
	deleteBanding = DeleteBandingRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteConditionalFormatRule(setup: DeleteConditionalFormatRuleRequest.() -> Unit) {
	deleteConditionalFormatRule = DeleteConditionalFormatRuleRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteDataSource(setup: DeleteDataSourceRequest.() -> Unit) {
	deleteDataSource = DeleteDataSourceRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteDeveloperMetadata(setup: DeleteDeveloperMetadataRequest.() -> Unit) {
	deleteDeveloperMetadata = DeleteDeveloperMetadataRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteDimension(setup: DeleteDimensionRequest.() -> Unit) {
	deleteDimension = DeleteDimensionRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteDimensionGroup(setup: DeleteDimensionGroupRequest.() -> Unit) {
	deleteDimensionGroup = DeleteDimensionGroupRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteDuplicates(setup: DeleteDuplicatesRequest.() -> Unit) {
	deleteDuplicates = DeleteDuplicatesRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteEmbeddedObject(setup: DeleteEmbeddedObjectRequest.() -> Unit) {
	deleteEmbeddedObject = DeleteEmbeddedObjectRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteFilterView(setup: DeleteFilterViewRequest.() -> Unit) {
	deleteFilterView = DeleteFilterViewRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteNamedRange(setup: DeleteNamedRangeRequest.() -> Unit) {
	deleteNamedRange = DeleteNamedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteProtectedRange(setup: DeleteProtectedRangeRequest.() -> Unit) {
	deleteProtectedRange = DeleteProtectedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteRange(setup: DeleteRangeRequest.() -> Unit) {
	deleteRange = DeleteRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.deleteSheet(setup: DeleteSheetRequest.() -> Unit) {
	deleteSheet = DeleteSheetRequest().apply(setup)
}

@GoogleDSL
fun Request.duplicateFilterView(setup: DuplicateFilterViewRequest.() -> Unit) {
	duplicateFilterView = DuplicateFilterViewRequest().apply(setup)
}

@GoogleDSL
fun Request.duplicateSheet(setup: DuplicateSheetRequest.() -> Unit) {
	duplicateSheet = DuplicateSheetRequest().apply(setup)
}

@GoogleDSL
fun Request.findReplace(setup: FindReplaceRequest.() -> Unit) {
	findReplace = FindReplaceRequest().apply(setup)
}

@GoogleDSL
fun Request.insertDimension(setup: InsertDimensionRequest.() -> Unit) {
	insertDimension = InsertDimensionRequest().apply(setup)
}

@GoogleDSL
fun Request.insertRange(setup: InsertRangeRequest.() -> Unit) {
	insertRange = InsertRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.mergeCells(setup: MergeCellsRequest.() -> Unit) {
	mergeCells = MergeCellsRequest().apply(setup)
}

@GoogleDSL
fun Request.moveDimension(setup: MoveDimensionRequest.() -> Unit) {
	moveDimension = MoveDimensionRequest().apply(setup)
}

@GoogleDSL
fun Request.pasteData(setup: PasteDataRequest.() -> Unit) {
	pasteData = PasteDataRequest().apply(setup)
}

@GoogleDSL
fun Request.randomizeRange(setup: RandomizeRangeRequest.() -> Unit) {
	randomizeRange = RandomizeRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.refreshDataSource(setup: RefreshDataSourceRequest.() -> Unit) {
	refreshDataSource = RefreshDataSourceRequest().apply(setup)
}

@GoogleDSL
fun Request.repeatCell(setup: RepeatCellRequest.() -> Unit) {
	repeatCell = RepeatCellRequest().apply(setup)
}

@GoogleDSL
fun Request.setBasicFilter(setup: SetBasicFilterRequest.() -> Unit) {
	setBasicFilter = SetBasicFilterRequest().apply(setup)
}

@GoogleDSL
fun Request.setDataValidation(setup: SetDataValidationRequest.() -> Unit) {
	setDataValidation = SetDataValidationRequest().apply(setup)
}

@GoogleDSL
fun Request.sortRange(setup: SortRangeRequest.() -> Unit) {
	sortRange = SortRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.textToColumns(setup: TextToColumnsRequest.() -> Unit) {
	textToColumns = TextToColumnsRequest().apply(setup)
}

@GoogleDSL
fun Request.trimWhitespace(setup: TrimWhitespaceRequest.() -> Unit) {
	trimWhitespace = TrimWhitespaceRequest().apply(setup)
}

@GoogleDSL
fun Request.unmergeCells(setup: UnmergeCellsRequest.() -> Unit) {
	unmergeCells = UnmergeCellsRequest().apply(setup)
}

@GoogleDSL
fun Request.updateBanding(setup: UpdateBandingRequest.() -> Unit) {
	updateBanding = UpdateBandingRequest().apply(setup)
}

@GoogleDSL
fun Request.updateBorders(setup: UpdateBordersRequest.() -> Unit) {
	updateBorders = UpdateBordersRequest().apply(setup)
}

@GoogleDSL
fun Request.updateCells(setup: UpdateCellsRequest.() -> Unit) {
	updateCells = UpdateCellsRequest().apply(setup)
}

@GoogleDSL
fun Request.updateChartSpec(setup: UpdateChartSpecRequest.() -> Unit) {
	updateChartSpec = UpdateChartSpecRequest().apply(setup)
}

@GoogleDSL
fun Request.updateConditionalFormatRule(setup: UpdateConditionalFormatRuleRequest.() -> Unit) {
	updateConditionalFormatRule = UpdateConditionalFormatRuleRequest().apply(setup)
}

@GoogleDSL
fun Request.updateDataSource(setup: UpdateDataSourceRequest.() -> Unit) {
	updateDataSource = UpdateDataSourceRequest().apply(setup)
}

@GoogleDSL
fun Request.updateDeveloperMetadata(setup: UpdateDeveloperMetadataRequest.() -> Unit) {
	updateDeveloperMetadata = UpdateDeveloperMetadataRequest().apply(setup)
}

@GoogleDSL
fun Request.updateDimensionGroup(setup: UpdateDimensionGroupRequest.() -> Unit) {
	updateDimensionGroup = UpdateDimensionGroupRequest().apply(setup)
}

@GoogleDSL
fun Request.updateDimensionProperties(setup: UpdateDimensionPropertiesRequest.() -> Unit) {
	updateDimensionProperties = UpdateDimensionPropertiesRequest().apply(setup)
}

@GoogleDSL
fun Request.updateEmbeddedObjectBorder(setup: UpdateEmbeddedObjectBorderRequest.() -> Unit) {
	updateEmbeddedObjectBorder = UpdateEmbeddedObjectBorderRequest().apply(setup)
}

@GoogleDSL
fun Request.updateEmbeddedObjectPosition(setup: UpdateEmbeddedObjectPositionRequest.() -> Unit) {
	updateEmbeddedObjectPosition = UpdateEmbeddedObjectPositionRequest().apply(setup)
}

@GoogleDSL
fun Request.updateFilterView(setup: UpdateFilterViewRequest.() -> Unit) {
	updateFilterView = UpdateFilterViewRequest().apply(setup)
}

@GoogleDSL
fun Request.updateNamedRange(setup: UpdateNamedRangeRequest.() -> Unit) {
	updateNamedRange = UpdateNamedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.updateProtectedRange(setup: UpdateProtectedRangeRequest.() -> Unit) {
	updateProtectedRange = UpdateProtectedRangeRequest().apply(setup)
}

@GoogleDSL
fun Request.updateSheetProperties(setup: UpdateSheetPropertiesRequest.() -> Unit) {
	updateSheetProperties = UpdateSheetPropertiesRequest().apply(setup)
}

@GoogleDSL
fun Request.updateSlicerSpec(setup: UpdateSlicerSpecRequest.() -> Unit) {
	updateSlicerSpec = UpdateSlicerSpecRequest().apply(setup)
}

@GoogleDSL
fun Request.updateSpreadsheetProperties(setup: UpdateSpreadsheetPropertiesRequest.() -> Unit) {
	updateSpreadsheetProperties = UpdateSpreadsheetPropertiesRequest().apply(setup)
}

@GoogleDSL
fun Response.addBanding(setup: AddBandingResponse.() -> Unit) {
	addBanding = AddBandingResponse().apply(setup)
}

@GoogleDSL
fun Response.addChart(setup: AddChartResponse.() -> Unit) {
	addChart = AddChartResponse().apply(setup)
}

@GoogleDSL
fun Response.addDataSource(setup: AddDataSourceResponse.() -> Unit) {
	addDataSource = AddDataSourceResponse().apply(setup)
}

@GoogleDSL
fun Response.addDimensionGroup(setup: AddDimensionGroupResponse.() -> Unit) {
	addDimensionGroup = AddDimensionGroupResponse().apply(setup)
}

@GoogleDSL
fun Response.addFilterView(setup: AddFilterViewResponse.() -> Unit) {
	addFilterView = AddFilterViewResponse().apply(setup)
}

@GoogleDSL
fun Response.addNamedRange(setup: AddNamedRangeResponse.() -> Unit) {
	addNamedRange = AddNamedRangeResponse().apply(setup)
}

@GoogleDSL
fun Response.addProtectedRange(setup: AddProtectedRangeResponse.() -> Unit) {
	addProtectedRange = AddProtectedRangeResponse().apply(setup)
}

@GoogleDSL
fun Response.addSheet(setup: AddSheetResponse.() -> Unit) {
	addSheet = AddSheetResponse().apply(setup)
}

@GoogleDSL
fun Response.addSlicer(setup: AddSlicerResponse.() -> Unit) {
	addSlicer = AddSlicerResponse().apply(setup)
}

@GoogleDSL
fun Response.cancelDataSourceRefresh(setup: CancelDataSourceRefreshResponse.() -> Unit) {
	cancelDataSourceRefresh = CancelDataSourceRefreshResponse().apply(setup)
}

@GoogleDSL
fun Response.createDeveloperMetadata(setup: CreateDeveloperMetadataResponse.() -> Unit) {
	createDeveloperMetadata = CreateDeveloperMetadataResponse().apply(setup)
}

@GoogleDSL
fun Response.deleteConditionalFormatRule(setup: DeleteConditionalFormatRuleResponse.() -> Unit) {
	deleteConditionalFormatRule = DeleteConditionalFormatRuleResponse().apply(setup)
}

@GoogleDSL
fun Response.deleteDeveloperMetadata(setup: DeleteDeveloperMetadataResponse.() -> Unit) {
	deleteDeveloperMetadata = DeleteDeveloperMetadataResponse().apply(setup)
}

@GoogleDSL
fun Response.deleteDimensionGroup(setup: DeleteDimensionGroupResponse.() -> Unit) {
	deleteDimensionGroup = DeleteDimensionGroupResponse().apply(setup)
}

@GoogleDSL
fun Response.deleteDuplicates(setup: DeleteDuplicatesResponse.() -> Unit) {
	deleteDuplicates = DeleteDuplicatesResponse().apply(setup)
}

@GoogleDSL
fun Response.duplicateFilterView(setup: DuplicateFilterViewResponse.() -> Unit) {
	duplicateFilterView = DuplicateFilterViewResponse().apply(setup)
}

@GoogleDSL
fun Response.duplicateSheet(setup: DuplicateSheetResponse.() -> Unit) {
	duplicateSheet = DuplicateSheetResponse().apply(setup)
}

@GoogleDSL
fun Response.findReplace(setup: FindReplaceResponse.() -> Unit) {
	findReplace = FindReplaceResponse().apply(setup)
}

@GoogleDSL
fun Response.refreshDataSource(setup: RefreshDataSourceResponse.() -> Unit) {
	refreshDataSource = RefreshDataSourceResponse().apply(setup)
}

@GoogleDSL
fun Response.trimWhitespace(setup: TrimWhitespaceResponse.() -> Unit) {
	trimWhitespace = TrimWhitespaceResponse().apply(setup)
}

@GoogleDSL
fun Response.updateConditionalFormatRule(setup: UpdateConditionalFormatRuleResponse.() -> Unit) {
	updateConditionalFormatRule = UpdateConditionalFormatRuleResponse().apply(setup)
}

@GoogleDSL
fun Response.updateDataSource(setup: UpdateDataSourceResponse.() -> Unit) {
	updateDataSource = UpdateDataSourceResponse().apply(setup)
}

@GoogleDSL
fun Response.updateDeveloperMetadata(setup: UpdateDeveloperMetadataResponse.() -> Unit) {
	updateDeveloperMetadata = UpdateDeveloperMetadataResponse().apply(setup)
}

@GoogleDSL
fun Response.updateEmbeddedObjectPosition(setup: UpdateEmbeddedObjectPositionResponse.() -> Unit) {
	updateEmbeddedObjectPosition = UpdateEmbeddedObjectPositionResponse().apply(setup)
}

interface RowDataValuesBuilder {

	@GoogleDSL
	fun cellData(setup: CellData.() -> Unit)
	val all: List<CellData>
}

@GoogleDSL
fun RowData.values(setup: RowDataValuesBuilder.() -> Unit) {
	val builder = object : RowDataValuesBuilder {
		override val all = mutableListOf<CellData>()

		@GoogleDSL
		override inline fun cellData(setup: CellData.() -> Unit) {
			all.add(CellData().apply(setup))
		}
	}

	this.setValues(builder.apply(setup).all)
}

@GoogleDSL
fun ScorecardChartSpec.baselineValueData(setup: ChartData.() -> Unit) {
	baselineValueData = ChartData().apply(setup)
}

@GoogleDSL
fun ScorecardChartSpec.baselineValueFormat(setup: BaselineValueFormat.() -> Unit) {
	baselineValueFormat = BaselineValueFormat().apply(setup)
}

@GoogleDSL
fun ScorecardChartSpec.customFormatOptions(setup: ChartCustomNumberFormatOptions.() -> Unit) {
	customFormatOptions = ChartCustomNumberFormatOptions().apply(setup)
}

@GoogleDSL
fun ScorecardChartSpec.keyValueData(setup: ChartData.() -> Unit) {
	keyValueData = ChartData().apply(setup)
}

@GoogleDSL
fun ScorecardChartSpec.keyValueFormat(setup: KeyValueFormat.() -> Unit) {
	keyValueFormat = KeyValueFormat().apply(setup)
}

interface SearchDeveloperMetadataRequestDataFiltersBuilder {

	@GoogleDSL
	fun dataFilter(setup: DataFilter.() -> Unit)
	val all: List<DataFilter>
}

@GoogleDSL
fun SearchDeveloperMetadataRequest.dataFilters(setup: SearchDeveloperMetadataRequestDataFiltersBuilder.() -> Unit) {
	val builder = object : SearchDeveloperMetadataRequestDataFiltersBuilder {
		override val all = mutableListOf<DataFilter>()

		@GoogleDSL
		override inline fun dataFilter(setup: DataFilter.() -> Unit) {
			all.add(DataFilter().apply(setup))
		}
	}

	this.dataFilters = builder.apply(setup).all
}

interface SearchDeveloperMetadataResponseMatchedDeveloperMetadataBuilder {

	@GoogleDSL
	fun matchedDeveloperMetadata(setup: MatchedDeveloperMetadata.() -> Unit)
	val all: List<MatchedDeveloperMetadata>
}

@GoogleDSL
fun SearchDeveloperMetadataResponse.matchedDeveloperMetadata(setup: SearchDeveloperMetadataResponseMatchedDeveloperMetadataBuilder.() -> Unit) {
	val builder = object : SearchDeveloperMetadataResponseMatchedDeveloperMetadataBuilder {
		override val all = mutableListOf<MatchedDeveloperMetadata>()

		@GoogleDSL
		override inline fun matchedDeveloperMetadata(setup: MatchedDeveloperMetadata.() -> Unit) {
			all.add(MatchedDeveloperMetadata().apply(setup))
		}
	}

	this.matchedDeveloperMetadata = builder.apply(setup).all
}

@GoogleDSL
fun SetBasicFilterRequest.filter(setup: BasicFilter.() -> Unit) {
	filter = BasicFilter().apply(setup)
}

@GoogleDSL
fun SetDataValidationRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun SetDataValidationRequest.rule(setup: DataValidationRule.() -> Unit) {
	rule = DataValidationRule().apply(setup)
}

interface SheetBandedRangesBuilder {

	@GoogleDSL
	fun bandedRange(setup: BandedRange.() -> Unit)
	val all: List<BandedRange>
}

@GoogleDSL
fun Sheet.bandedRanges(setup: SheetBandedRangesBuilder.() -> Unit) {
	val builder = object : SheetBandedRangesBuilder {
		override val all = mutableListOf<BandedRange>()

		@GoogleDSL
		override inline fun bandedRange(setup: BandedRange.() -> Unit) {
			all.add(BandedRange().apply(setup))
		}
	}

	this.bandedRanges = builder.apply(setup).all
}

@GoogleDSL
fun Sheet.basicFilter(setup: BasicFilter.() -> Unit) {
	basicFilter = BasicFilter().apply(setup)
}

interface SheetChartsBuilder {

	@GoogleDSL
	fun embeddedChart(setup: EmbeddedChart.() -> Unit)
	val all: List<EmbeddedChart>
}

@GoogleDSL
fun Sheet.charts(setup: SheetChartsBuilder.() -> Unit) {
	val builder = object : SheetChartsBuilder {
		override val all = mutableListOf<EmbeddedChart>()

		@GoogleDSL
		override inline fun embeddedChart(setup: EmbeddedChart.() -> Unit) {
			all.add(EmbeddedChart().apply(setup))
		}
	}

	this.charts = builder.apply(setup).all
}

interface SheetColumnGroupsBuilder {

	@GoogleDSL
	fun dimensionGroup(setup: DimensionGroup.() -> Unit)
	val all: List<DimensionGroup>
}

@GoogleDSL
fun Sheet.columnGroups(setup: SheetColumnGroupsBuilder.() -> Unit) {
	val builder = object : SheetColumnGroupsBuilder {
		override val all = mutableListOf<DimensionGroup>()

		@GoogleDSL
		override inline fun dimensionGroup(setup: DimensionGroup.() -> Unit) {
			all.add(DimensionGroup().apply(setup))
		}
	}

	this.columnGroups = builder.apply(setup).all
}

interface SheetConditionalFormatsBuilder {

	@GoogleDSL
	fun conditionalFormatRule(setup: ConditionalFormatRule.() -> Unit)
	val all: List<ConditionalFormatRule>
}

@GoogleDSL
fun Sheet.conditionalFormats(setup: SheetConditionalFormatsBuilder.() -> Unit) {
	val builder = object : SheetConditionalFormatsBuilder {
		override val all = mutableListOf<ConditionalFormatRule>()

		@GoogleDSL
		override inline fun conditionalFormatRule(setup: ConditionalFormatRule.() -> Unit) {
			all.add(ConditionalFormatRule().apply(setup))
		}
	}

	this.conditionalFormats = builder.apply(setup).all
}

interface SheetDataBuilder {

	@GoogleDSL
	fun gridData(setup: GridData.() -> Unit)
	val all: List<GridData>
}

@GoogleDSL
fun Sheet.data(setup: SheetDataBuilder.() -> Unit) {
	val builder = object : SheetDataBuilder {
		override val all = mutableListOf<GridData>()

		@GoogleDSL
		override inline fun gridData(setup: GridData.() -> Unit) {
			all.add(GridData().apply(setup))
		}
	}

	this.data = builder.apply(setup).all
}

interface SheetDeveloperMetadataBuilder {

	@GoogleDSL
	fun developerMetadata(setup: DeveloperMetadata.() -> Unit)
	val all: List<DeveloperMetadata>
}

@GoogleDSL
fun Sheet.developerMetadata(setup: SheetDeveloperMetadataBuilder.() -> Unit) {
	val builder = object : SheetDeveloperMetadataBuilder {
		override val all = mutableListOf<DeveloperMetadata>()

		@GoogleDSL
		override inline fun developerMetadata(setup: DeveloperMetadata.() -> Unit) {
			all.add(DeveloperMetadata().apply(setup))
		}
	}

	this.developerMetadata = builder.apply(setup).all
}

interface SheetFilterViewsBuilder {

	@GoogleDSL
	fun filterView(setup: FilterView.() -> Unit)
	val all: List<FilterView>
}

@GoogleDSL
fun Sheet.filterViews(setup: SheetFilterViewsBuilder.() -> Unit) {
	val builder = object : SheetFilterViewsBuilder {
		override val all = mutableListOf<FilterView>()

		@GoogleDSL
		override inline fun filterView(setup: FilterView.() -> Unit) {
			all.add(FilterView().apply(setup))
		}
	}

	this.filterViews = builder.apply(setup).all
}

interface SheetMergesBuilder {

	@GoogleDSL
	fun gridRange(setup: GridRange.() -> Unit)
	val all: List<GridRange>
}

@GoogleDSL
fun Sheet.merges(setup: SheetMergesBuilder.() -> Unit) {
	val builder = object : SheetMergesBuilder {
		override val all = mutableListOf<GridRange>()

		@GoogleDSL
		override inline fun gridRange(setup: GridRange.() -> Unit) {
			all.add(GridRange().apply(setup))
		}
	}

	this.merges = builder.apply(setup).all
}

@GoogleDSL
fun Sheet.properties(setup: SheetProperties.() -> Unit) {
	properties = SheetProperties().apply(setup)
}

interface SheetProtectedRangesBuilder {

	@GoogleDSL
	fun protectedRange(setup: ProtectedRange.() -> Unit)
	val all: List<ProtectedRange>
}

@GoogleDSL
fun Sheet.protectedRanges(setup: SheetProtectedRangesBuilder.() -> Unit) {
	val builder = object : SheetProtectedRangesBuilder {
		override val all = mutableListOf<ProtectedRange>()

		@GoogleDSL
		override inline fun protectedRange(setup: ProtectedRange.() -> Unit) {
			all.add(ProtectedRange().apply(setup))
		}
	}

	this.protectedRanges = builder.apply(setup).all
}

interface SheetRowGroupsBuilder {

	@GoogleDSL
	fun dimensionGroup(setup: DimensionGroup.() -> Unit)
	val all: List<DimensionGroup>
}

@GoogleDSL
fun Sheet.rowGroups(setup: SheetRowGroupsBuilder.() -> Unit) {
	val builder = object : SheetRowGroupsBuilder {
		override val all = mutableListOf<DimensionGroup>()

		@GoogleDSL
		override inline fun dimensionGroup(setup: DimensionGroup.() -> Unit) {
			all.add(DimensionGroup().apply(setup))
		}
	}

	this.rowGroups = builder.apply(setup).all
}

interface SheetSlicersBuilder {

	@GoogleDSL
	fun slicer(setup: Slicer.() -> Unit)
	val all: List<Slicer>
}

@GoogleDSL
fun Sheet.slicers(setup: SheetSlicersBuilder.() -> Unit) {
	val builder = object : SheetSlicersBuilder {
		override val all = mutableListOf<Slicer>()

		@GoogleDSL
		override inline fun slicer(setup: Slicer.() -> Unit) {
			all.add(Slicer().apply(setup))
		}
	}

	this.slicers = builder.apply(setup).all
}

@GoogleDSL
fun SheetProperties.dataSourceSheetProperties(setup: DataSourceSheetProperties.() -> Unit) {
	dataSourceSheetProperties = DataSourceSheetProperties().apply(setup)
}

@GoogleDSL
fun SheetProperties.gridProperties(setup: GridProperties.() -> Unit) {
	gridProperties = GridProperties().apply(setup)
}

@GoogleDSL
fun SheetProperties.tabColor(setup: Color.() -> Unit) {
	tabColor = Color().apply(setup)
}

@GoogleDSL
fun SheetProperties.tabColorStyle(setup: ColorStyle.() -> Unit) {
	tabColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun Slicer.position(setup: EmbeddedObjectPosition.() -> Unit) {
	position = EmbeddedObjectPosition().apply(setup)
}

@GoogleDSL
fun Slicer.spec(setup: SlicerSpec.() -> Unit) {
	spec = SlicerSpec().apply(setup)
}

@GoogleDSL
fun SlicerSpec.backgroundColor(setup: Color.() -> Unit) {
	backgroundColor = Color().apply(setup)
}

@GoogleDSL
fun SlicerSpec.backgroundColorStyle(setup: ColorStyle.() -> Unit) {
	backgroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun SlicerSpec.dataRange(setup: GridRange.() -> Unit) {
	dataRange = GridRange().apply(setup)
}

@GoogleDSL
fun SlicerSpec.filterCriteria(setup: FilterCriteria.() -> Unit) {
	filterCriteria = FilterCriteria().apply(setup)
}

@GoogleDSL
fun SlicerSpec.textFormat(setup: TextFormat.() -> Unit) {
	textFormat = TextFormat().apply(setup)
}

@GoogleDSL
fun SortRangeRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

interface SortRangeRequestSortSpecsBuilder {

	@GoogleDSL
	fun sortSpec(setup: SortSpec.() -> Unit)
	val all: List<SortSpec>
}

@GoogleDSL
fun SortRangeRequest.sortSpecs(setup: SortRangeRequestSortSpecsBuilder.() -> Unit) {
	val builder = object : SortRangeRequestSortSpecsBuilder {
		override val all = mutableListOf<SortSpec>()

		@GoogleDSL
		override inline fun sortSpec(setup: SortSpec.() -> Unit) {
			all.add(SortSpec().apply(setup))
		}
	}

	this.sortSpecs = builder.apply(setup).all
}

@GoogleDSL
fun SortSpec.backgroundColor(setup: Color.() -> Unit) {
	backgroundColor = Color().apply(setup)
}

@GoogleDSL
fun SortSpec.backgroundColorStyle(setup: ColorStyle.() -> Unit) {
	backgroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun SortSpec.dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) {
	dataSourceColumnReference = DataSourceColumnReference().apply(setup)
}

@GoogleDSL
fun SortSpec.foregroundColor(setup: Color.() -> Unit) {
	foregroundColor = Color().apply(setup)
}

@GoogleDSL
fun SortSpec.foregroundColorStyle(setup: ColorStyle.() -> Unit) {
	foregroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun SourceAndDestination.source(setup: GridRange.() -> Unit) {
	source = GridRange().apply(setup)
}

interface SpreadsheetDataSourceSchedulesBuilder {

	@GoogleDSL
	fun dataSourceRefreshSchedule(setup: DataSourceRefreshSchedule.() -> Unit)
	val all: List<DataSourceRefreshSchedule>
}

@GoogleDSL
fun Spreadsheet.dataSourceSchedules(setup: SpreadsheetDataSourceSchedulesBuilder.() -> Unit) {
	val builder = object : SpreadsheetDataSourceSchedulesBuilder {
		override val all = mutableListOf<DataSourceRefreshSchedule>()

		@GoogleDSL
		override inline fun dataSourceRefreshSchedule(setup: DataSourceRefreshSchedule.() -> Unit) {
			all.add(DataSourceRefreshSchedule().apply(setup))
		}
	}

	this.dataSourceSchedules = builder.apply(setup).all
}

interface SpreadsheetDataSourcesBuilder {

	@GoogleDSL
	fun dataSource(setup: DataSource.() -> Unit)
	val all: List<DataSource>
}

@GoogleDSL
fun Spreadsheet.dataSources(setup: SpreadsheetDataSourcesBuilder.() -> Unit) {
	val builder = object : SpreadsheetDataSourcesBuilder {
		override val all = mutableListOf<DataSource>()

		@GoogleDSL
		override inline fun dataSource(setup: DataSource.() -> Unit) {
			all.add(DataSource().apply(setup))
		}
	}

	this.dataSources = builder.apply(setup).all
}

interface SpreadsheetDeveloperMetadataBuilder {

	@GoogleDSL
	fun developerMetadata(setup: DeveloperMetadata.() -> Unit)
	val all: List<DeveloperMetadata>
}

@GoogleDSL
fun Spreadsheet.developerMetadata(setup: SpreadsheetDeveloperMetadataBuilder.() -> Unit) {
	val builder = object : SpreadsheetDeveloperMetadataBuilder {
		override val all = mutableListOf<DeveloperMetadata>()

		@GoogleDSL
		override inline fun developerMetadata(setup: DeveloperMetadata.() -> Unit) {
			all.add(DeveloperMetadata().apply(setup))
		}
	}

	this.developerMetadata = builder.apply(setup).all
}

interface SpreadsheetNamedRangesBuilder {

	@GoogleDSL
	fun namedRange(setup: NamedRange.() -> Unit)
	val all: List<NamedRange>
}

@GoogleDSL
fun Spreadsheet.namedRanges(setup: SpreadsheetNamedRangesBuilder.() -> Unit) {
	val builder = object : SpreadsheetNamedRangesBuilder {
		override val all = mutableListOf<NamedRange>()

		@GoogleDSL
		override inline fun namedRange(setup: NamedRange.() -> Unit) {
			all.add(NamedRange().apply(setup))
		}
	}

	this.namedRanges = builder.apply(setup).all
}

@GoogleDSL
fun Spreadsheet.properties(setup: SpreadsheetProperties.() -> Unit) {
	properties = SpreadsheetProperties().apply(setup)
}

interface SpreadsheetSheetsBuilder {

	@GoogleDSL
	fun sheet(setup: Sheet.() -> Unit)
	val all: List<Sheet>
}

@GoogleDSL
fun Spreadsheet.sheets(setup: SpreadsheetSheetsBuilder.() -> Unit) {
	val builder = object : SpreadsheetSheetsBuilder {
		override val all = mutableListOf<Sheet>()

		@GoogleDSL
		override inline fun sheet(setup: Sheet.() -> Unit) {
			all.add(Sheet().apply(setup))
		}
	}

	this.sheets = builder.apply(setup).all
}

@GoogleDSL
fun SpreadsheetProperties.defaultFormat(setup: CellFormat.() -> Unit) {
	defaultFormat = CellFormat().apply(setup)
}

@GoogleDSL
fun SpreadsheetProperties.iterativeCalculationSettings(setup: IterativeCalculationSettings.() -> Unit) {
	iterativeCalculationSettings = IterativeCalculationSettings().apply(setup)
}

@GoogleDSL
fun SpreadsheetProperties.spreadsheetTheme(setup: SpreadsheetTheme.() -> Unit) {
	spreadsheetTheme = SpreadsheetTheme().apply(setup)
}

interface SpreadsheetThemeThemeColorsBuilder {

	@GoogleDSL
	fun themeColorPair(setup: ThemeColorPair.() -> Unit)
	val all: List<ThemeColorPair>
}

@GoogleDSL
fun SpreadsheetTheme.themeColors(setup: SpreadsheetThemeThemeColorsBuilder.() -> Unit) {
	val builder = object : SpreadsheetThemeThemeColorsBuilder {
		override val all = mutableListOf<ThemeColorPair>()

		@GoogleDSL
		override inline fun themeColorPair(setup: ThemeColorPair.() -> Unit) {
			all.add(ThemeColorPair().apply(setup))
		}
	}

	this.themeColors = builder.apply(setup).all
}

@GoogleDSL
fun TextFormat.foregroundColor(setup: Color.() -> Unit) {
	foregroundColor = Color().apply(setup)
}

@GoogleDSL
fun TextFormat.foregroundColorStyle(setup: ColorStyle.() -> Unit) {
	foregroundColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun TextFormat.link(setup: Link.() -> Unit) {
	link = Link().apply(setup)
}

@GoogleDSL
fun TextFormatRun.format(setup: TextFormat.() -> Unit) {
	format = TextFormat().apply(setup)
}

@GoogleDSL
fun TextToColumnsRequest.source(setup: GridRange.() -> Unit) {
	source = GridRange().apply(setup)
}

@GoogleDSL
fun ThemeColorPair.color(setup: ColorStyle.() -> Unit) {
	color = ColorStyle().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.maxValueColor(setup: Color.() -> Unit) {
	maxValueColor = Color().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.maxValueColorStyle(setup: ColorStyle.() -> Unit) {
	maxValueColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.midValueColor(setup: Color.() -> Unit) {
	midValueColor = Color().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.midValueColorStyle(setup: ColorStyle.() -> Unit) {
	midValueColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.minValueColor(setup: Color.() -> Unit) {
	minValueColor = Color().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.minValueColorStyle(setup: ColorStyle.() -> Unit) {
	minValueColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.noDataColor(setup: Color.() -> Unit) {
	noDataColor = Color().apply(setup)
}

@GoogleDSL
fun TreemapChartColorScale.noDataColorStyle(setup: ColorStyle.() -> Unit) {
	noDataColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.colorData(setup: ChartData.() -> Unit) {
	colorData = ChartData().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.colorScale(setup: TreemapChartColorScale.() -> Unit) {
	colorScale = TreemapChartColorScale().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.headerColor(setup: Color.() -> Unit) {
	headerColor = Color().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.headerColorStyle(setup: ColorStyle.() -> Unit) {
	headerColorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.labels(setup: ChartData.() -> Unit) {
	labels = ChartData().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.parentLabels(setup: ChartData.() -> Unit) {
	parentLabels = ChartData().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.sizeData(setup: ChartData.() -> Unit) {
	sizeData = ChartData().apply(setup)
}

@GoogleDSL
fun TreemapChartSpec.textFormat(setup: TextFormat.() -> Unit) {
	textFormat = TextFormat().apply(setup)
}

@GoogleDSL
fun TrimWhitespaceRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun UnmergeCellsRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun UpdateBandingRequest.bandedRange(setup: BandedRange.() -> Unit) {
	bandedRange = BandedRange().apply(setup)
}

@GoogleDSL
fun UpdateBordersRequest.bottom(setup: Border.() -> Unit) {
	bottom = Border().apply(setup)
}

@GoogleDSL
fun UpdateBordersRequest.innerHorizontal(setup: Border.() -> Unit) {
	innerHorizontal = Border().apply(setup)
}

@GoogleDSL
fun UpdateBordersRequest.innerVertical(setup: Border.() -> Unit) {
	innerVertical = Border().apply(setup)
}

@GoogleDSL
fun UpdateBordersRequest.left(setup: Border.() -> Unit) {
	left = Border().apply(setup)
}

@GoogleDSL
fun UpdateBordersRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

@GoogleDSL
fun UpdateBordersRequest.right(setup: Border.() -> Unit) {
	right = Border().apply(setup)
}

@GoogleDSL
fun UpdateBordersRequest.top(setup: Border.() -> Unit) {
	top = Border().apply(setup)
}

@GoogleDSL
fun UpdateCellsRequest.range(setup: GridRange.() -> Unit) {
	range = GridRange().apply(setup)
}

interface UpdateCellsRequestRowsBuilder {

	@GoogleDSL
	fun rowData(setup: RowData.() -> Unit)
	val all: List<RowData>
}

@GoogleDSL
fun UpdateCellsRequest.rows(setup: UpdateCellsRequestRowsBuilder.() -> Unit) {
	val builder = object : UpdateCellsRequestRowsBuilder {
		override val all = mutableListOf<RowData>()

		@GoogleDSL
		override inline fun rowData(setup: RowData.() -> Unit) {
			all.add(RowData().apply(setup))
		}
	}

	this.rows = builder.apply(setup).all
}

@GoogleDSL
fun UpdateCellsRequest.start(setup: GridCoordinate.() -> Unit) {
	start = GridCoordinate().apply(setup)
}

@GoogleDSL
fun UpdateChartSpecRequest.spec(setup: ChartSpec.() -> Unit) {
	spec = ChartSpec().apply(setup)
}

@GoogleDSL
fun UpdateConditionalFormatRuleRequest.rule(setup: ConditionalFormatRule.() -> Unit) {
	rule = ConditionalFormatRule().apply(setup)
}

@GoogleDSL
fun UpdateConditionalFormatRuleResponse.newRule(setup: ConditionalFormatRule.() -> Unit) {
	newRule = ConditionalFormatRule().apply(setup)
}

@GoogleDSL
fun UpdateConditionalFormatRuleResponse.oldRule(setup: ConditionalFormatRule.() -> Unit) {
	oldRule = ConditionalFormatRule().apply(setup)
}

@GoogleDSL
fun UpdateDataSourceRequest.dataSource(setup: DataSource.() -> Unit) {
	dataSource = DataSource().apply(setup)
}

@GoogleDSL
fun UpdateDataSourceResponse.dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) {
	dataExecutionStatus = DataExecutionStatus().apply(setup)
}

@GoogleDSL
fun UpdateDataSourceResponse.dataSource(setup: DataSource.() -> Unit) {
	dataSource = DataSource().apply(setup)
}

interface UpdateDeveloperMetadataRequestDataFiltersBuilder {

	@GoogleDSL
	fun dataFilter(setup: DataFilter.() -> Unit)
	val all: List<DataFilter>
}

@GoogleDSL
fun UpdateDeveloperMetadataRequest.dataFilters(setup: UpdateDeveloperMetadataRequestDataFiltersBuilder.() -> Unit) {
	val builder = object : UpdateDeveloperMetadataRequestDataFiltersBuilder {
		override val all = mutableListOf<DataFilter>()

		@GoogleDSL
		override inline fun dataFilter(setup: DataFilter.() -> Unit) {
			all.add(DataFilter().apply(setup))
		}
	}

	this.dataFilters = builder.apply(setup).all
}

@GoogleDSL
fun UpdateDeveloperMetadataRequest.developerMetadata(setup: DeveloperMetadata.() -> Unit) {
	developerMetadata = DeveloperMetadata().apply(setup)
}

interface UpdateDeveloperMetadataResponseDeveloperMetadataBuilder {

	@GoogleDSL
	fun developerMetadata(setup: DeveloperMetadata.() -> Unit)
	val all: List<DeveloperMetadata>
}

@GoogleDSL
fun UpdateDeveloperMetadataResponse.developerMetadata(setup: UpdateDeveloperMetadataResponseDeveloperMetadataBuilder.() -> Unit) {
	val builder = object : UpdateDeveloperMetadataResponseDeveloperMetadataBuilder {
		override val all = mutableListOf<DeveloperMetadata>()

		@GoogleDSL
		override inline fun developerMetadata(setup: DeveloperMetadata.() -> Unit) {
			all.add(DeveloperMetadata().apply(setup))
		}
	}

	this.developerMetadata = builder.apply(setup).all
}

@GoogleDSL
fun UpdateDimensionGroupRequest.dimensionGroup(setup: DimensionGroup.() -> Unit) {
	dimensionGroup = DimensionGroup().apply(setup)
}

@GoogleDSL
fun UpdateDimensionPropertiesRequest.dataSourceSheetRange(setup: DataSourceSheetDimensionRange.() -> Unit) {
	dataSourceSheetRange = DataSourceSheetDimensionRange().apply(setup)
}

@GoogleDSL
fun UpdateDimensionPropertiesRequest.properties(setup: DimensionProperties.() -> Unit) {
	properties = DimensionProperties().apply(setup)
}

@GoogleDSL
fun UpdateDimensionPropertiesRequest.range(setup: DimensionRange.() -> Unit) {
	range = DimensionRange().apply(setup)
}

@GoogleDSL
fun UpdateEmbeddedObjectBorderRequest.border(setup: EmbeddedObjectBorder.() -> Unit) {
	border = EmbeddedObjectBorder().apply(setup)
}

@GoogleDSL
fun UpdateEmbeddedObjectPositionRequest.newPosition(setup: EmbeddedObjectPosition.() -> Unit) {
	newPosition = EmbeddedObjectPosition().apply(setup)
}

@GoogleDSL
fun UpdateEmbeddedObjectPositionResponse.position(setup: EmbeddedObjectPosition.() -> Unit) {
	position = EmbeddedObjectPosition().apply(setup)
}

@GoogleDSL
fun UpdateFilterViewRequest.filter(setup: FilterView.() -> Unit) {
	filter = FilterView().apply(setup)
}

@GoogleDSL
fun UpdateNamedRangeRequest.namedRange(setup: NamedRange.() -> Unit) {
	namedRange = NamedRange().apply(setup)
}

@GoogleDSL
fun UpdateProtectedRangeRequest.protectedRange(setup: ProtectedRange.() -> Unit) {
	protectedRange = ProtectedRange().apply(setup)
}

@GoogleDSL
fun UpdateSheetPropertiesRequest.properties(setup: SheetProperties.() -> Unit) {
	properties = SheetProperties().apply(setup)
}

@GoogleDSL
fun UpdateSlicerSpecRequest.spec(setup: SlicerSpec.() -> Unit) {
	spec = SlicerSpec().apply(setup)
}

@GoogleDSL
fun UpdateSpreadsheetPropertiesRequest.properties(setup: SpreadsheetProperties.() -> Unit) {
	properties = SpreadsheetProperties().apply(setup)
}

@GoogleDSL
fun UpdateValuesByDataFilterResponse.dataFilter(setup: DataFilter.() -> Unit) {
	dataFilter = DataFilter().apply(setup)
}

@GoogleDSL
fun UpdateValuesByDataFilterResponse.updatedData(setup: ValueRange.() -> Unit) {
	updatedData = ValueRange().apply(setup)
}

@GoogleDSL
fun UpdateValuesResponse.updatedData(setup: ValueRange.() -> Unit) {
	updatedData = ValueRange().apply(setup)
}

@GoogleDSL
fun WaterfallChartColumnStyle.color(setup: Color.() -> Unit) {
	color = Color().apply(setup)
}

@GoogleDSL
fun WaterfallChartColumnStyle.colorStyle(setup: ColorStyle.() -> Unit) {
	colorStyle = ColorStyle().apply(setup)
}

@GoogleDSL
fun WaterfallChartDomain.data(setup: ChartData.() -> Unit) {
	data = ChartData().apply(setup)
}

interface WaterfallChartSeriesCustomSubtotalsBuilder {

	@GoogleDSL
	fun waterfallChartCustomSubtotal(setup: WaterfallChartCustomSubtotal.() -> Unit)
	val all: List<WaterfallChartCustomSubtotal>
}

@GoogleDSL
fun WaterfallChartSeries.customSubtotals(setup: WaterfallChartSeriesCustomSubtotalsBuilder.() -> Unit) {
	val builder = object : WaterfallChartSeriesCustomSubtotalsBuilder {
		override val all = mutableListOf<WaterfallChartCustomSubtotal>()

		@GoogleDSL
		override inline fun waterfallChartCustomSubtotal(setup: WaterfallChartCustomSubtotal.() -> Unit) {
			all.add(WaterfallChartCustomSubtotal().apply(setup))
		}
	}

	this.customSubtotals = builder.apply(setup).all
}

@GoogleDSL
fun WaterfallChartSeries.data(setup: ChartData.() -> Unit) {
	data = ChartData().apply(setup)
}

@GoogleDSL
fun WaterfallChartSeries.dataLabel(setup: DataLabel.() -> Unit) {
	dataLabel = DataLabel().apply(setup)
}

@GoogleDSL
fun WaterfallChartSeries.negativeColumnsStyle(setup: WaterfallChartColumnStyle.() -> Unit) {
	negativeColumnsStyle = WaterfallChartColumnStyle().apply(setup)
}

@GoogleDSL
fun WaterfallChartSeries.positiveColumnsStyle(setup: WaterfallChartColumnStyle.() -> Unit) {
	positiveColumnsStyle = WaterfallChartColumnStyle().apply(setup)
}

@GoogleDSL
fun WaterfallChartSeries.subtotalColumnsStyle(setup: WaterfallChartColumnStyle.() -> Unit) {
	subtotalColumnsStyle = WaterfallChartColumnStyle().apply(setup)
}

@GoogleDSL
fun WaterfallChartSpec.connectorLineStyle(setup: LineStyle.() -> Unit) {
	connectorLineStyle = LineStyle().apply(setup)
}

@GoogleDSL
fun WaterfallChartSpec.domain(setup: WaterfallChartDomain.() -> Unit) {
	domain = WaterfallChartDomain().apply(setup)
}

interface WaterfallChartSpecSeriesBuilder {

	@GoogleDSL
	fun waterfallChartSeries(setup: WaterfallChartSeries.() -> Unit)
	val all: List<WaterfallChartSeries>
}

@GoogleDSL
fun WaterfallChartSpec.series(setup: WaterfallChartSpecSeriesBuilder.() -> Unit) {
	val builder = object : WaterfallChartSpecSeriesBuilder {
		override val all = mutableListOf<WaterfallChartSeries>()

		@GoogleDSL
		override inline fun waterfallChartSeries(setup: WaterfallChartSeries.() -> Unit) {
			all.add(WaterfallChartSeries().apply(setup))
		}
	}

	this.series = builder.apply(setup).all
}

@GoogleDSL
fun WaterfallChartSpec.totalDataLabel(setup: DataLabel.() -> Unit) {
	totalDataLabel = DataLabel().apply(setup)
}

