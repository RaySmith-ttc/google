@file:Suppress("unused")

package ru.raysmith.google.sheets.utils

import com.google.api.services.sheets.v4.model.*
fun addBandingRequest(setup: AddBandingRequest.() -> Unit) = AddBandingRequest().apply(setup)
fun addBandingResponse(setup: AddBandingResponse.() -> Unit) = AddBandingResponse().apply(setup)
fun addChartRequest(setup: AddChartRequest.() -> Unit) = AddChartRequest().apply(setup)
fun addChartResponse(setup: AddChartResponse.() -> Unit) = AddChartResponse().apply(setup)
fun addConditionalFormatRuleRequest(setup: AddConditionalFormatRuleRequest.() -> Unit) = AddConditionalFormatRuleRequest().apply(setup)
fun addDataSourceRequest(setup: AddDataSourceRequest.() -> Unit) = AddDataSourceRequest().apply(setup)
fun addDataSourceResponse(setup: AddDataSourceResponse.() -> Unit) = AddDataSourceResponse().apply(setup)
fun addDimensionGroupRequest(setup: AddDimensionGroupRequest.() -> Unit) = AddDimensionGroupRequest().apply(setup)
fun addDimensionGroupResponse(setup: AddDimensionGroupResponse.() -> Unit) = AddDimensionGroupResponse().apply(setup)
fun addFilterViewRequest(setup: AddFilterViewRequest.() -> Unit) = AddFilterViewRequest().apply(setup)
fun addFilterViewResponse(setup: AddFilterViewResponse.() -> Unit) = AddFilterViewResponse().apply(setup)
fun addNamedRangeRequest(setup: AddNamedRangeRequest.() -> Unit) = AddNamedRangeRequest().apply(setup)
fun addNamedRangeResponse(setup: AddNamedRangeResponse.() -> Unit) = AddNamedRangeResponse().apply(setup)
fun addProtectedRangeRequest(setup: AddProtectedRangeRequest.() -> Unit) = AddProtectedRangeRequest().apply(setup)
fun addProtectedRangeResponse(setup: AddProtectedRangeResponse.() -> Unit) = AddProtectedRangeResponse().apply(setup)
fun addSheetRequest(setup: AddSheetRequest.() -> Unit) = AddSheetRequest().apply(setup)
fun addSheetResponse(setup: AddSheetResponse.() -> Unit) = AddSheetResponse().apply(setup)
fun addSlicerRequest(setup: AddSlicerRequest.() -> Unit) = AddSlicerRequest().apply(setup)
fun addSlicerResponse(setup: AddSlicerResponse.() -> Unit) = AddSlicerResponse().apply(setup)
fun appendCellsRequest(setup: AppendCellsRequest.() -> Unit) = AppendCellsRequest().apply(setup)
fun appendDimensionRequest(setup: AppendDimensionRequest.() -> Unit) = AppendDimensionRequest().apply(setup)
fun appendValuesResponse(setup: AppendValuesResponse.() -> Unit) = AppendValuesResponse().apply(setup)
fun autoFillRequest(setup: AutoFillRequest.() -> Unit) = AutoFillRequest().apply(setup)
fun autoResizeDimensionsRequest(setup: AutoResizeDimensionsRequest.() -> Unit) = AutoResizeDimensionsRequest().apply(setup)
fun bandedRange(setup: BandedRange.() -> Unit) = BandedRange().apply(setup)
fun bandingProperties(setup: BandingProperties.() -> Unit) = BandingProperties().apply(setup)
fun baselineValueFormat(setup: BaselineValueFormat.() -> Unit) = BaselineValueFormat().apply(setup)
fun basicChartAxis(setup: BasicChartAxis.() -> Unit) = BasicChartAxis().apply(setup)
fun basicChartDomain(setup: BasicChartDomain.() -> Unit) = BasicChartDomain().apply(setup)
fun basicChartSeries(setup: BasicChartSeries.() -> Unit) = BasicChartSeries().apply(setup)
fun basicChartSpec(setup: BasicChartSpec.() -> Unit) = BasicChartSpec().apply(setup)
fun basicFilter(setup: BasicFilter.() -> Unit) = BasicFilter().apply(setup)
fun basicSeriesDataPointStyleOverride(setup: BasicSeriesDataPointStyleOverride.() -> Unit) = BasicSeriesDataPointStyleOverride().apply(setup)
fun batchClearValuesByDataFilterRequest(setup: BatchClearValuesByDataFilterRequest.() -> Unit) = BatchClearValuesByDataFilterRequest().apply(setup)
fun batchClearValuesByDataFilterResponse(setup: BatchClearValuesByDataFilterResponse.() -> Unit) = BatchClearValuesByDataFilterResponse().apply(setup)
fun batchClearValuesRequest(setup: BatchClearValuesRequest.() -> Unit) = BatchClearValuesRequest().apply(setup)
fun batchClearValuesResponse(setup: BatchClearValuesResponse.() -> Unit) = BatchClearValuesResponse().apply(setup)
fun batchGetValuesByDataFilterRequest(setup: BatchGetValuesByDataFilterRequest.() -> Unit) = BatchGetValuesByDataFilterRequest().apply(setup)
fun batchGetValuesByDataFilterResponse(setup: BatchGetValuesByDataFilterResponse.() -> Unit) = BatchGetValuesByDataFilterResponse().apply(setup)
fun batchGetValuesResponse(setup: BatchGetValuesResponse.() -> Unit) = BatchGetValuesResponse().apply(setup)
fun batchUpdateSpreadsheetRequest(setup: BatchUpdateSpreadsheetRequest.() -> Unit) = BatchUpdateSpreadsheetRequest().apply(setup)
fun batchUpdateSpreadsheetResponse(setup: BatchUpdateSpreadsheetResponse.() -> Unit) = BatchUpdateSpreadsheetResponse().apply(setup)
fun batchUpdateValuesByDataFilterRequest(setup: BatchUpdateValuesByDataFilterRequest.() -> Unit) = BatchUpdateValuesByDataFilterRequest().apply(setup)
fun batchUpdateValuesByDataFilterResponse(setup: BatchUpdateValuesByDataFilterResponse.() -> Unit) = BatchUpdateValuesByDataFilterResponse().apply(setup)
fun batchUpdateValuesRequest(setup: BatchUpdateValuesRequest.() -> Unit) = BatchUpdateValuesRequest().apply(setup)
fun batchUpdateValuesResponse(setup: BatchUpdateValuesResponse.() -> Unit) = BatchUpdateValuesResponse().apply(setup)
fun bigQueryDataSourceSpec(setup: BigQueryDataSourceSpec.() -> Unit) = BigQueryDataSourceSpec().apply(setup)
fun bigQueryQuerySpec(setup: BigQueryQuerySpec.() -> Unit) = BigQueryQuerySpec().apply(setup)
fun bigQueryTableSpec(setup: BigQueryTableSpec.() -> Unit) = BigQueryTableSpec().apply(setup)
fun booleanCondition(setup: BooleanCondition.() -> Unit) = BooleanCondition().apply(setup)
fun booleanRule(setup: BooleanRule.() -> Unit) = BooleanRule().apply(setup)
fun border(setup: Border.() -> Unit) = Border().apply(setup)
fun borders(setup: Borders.() -> Unit) = Borders().apply(setup)
fun bubbleChartSpec(setup: BubbleChartSpec.() -> Unit) = BubbleChartSpec().apply(setup)
fun cancelDataSourceRefreshRequest(setup: CancelDataSourceRefreshRequest.() -> Unit) = CancelDataSourceRefreshRequest().apply(setup)
fun cancelDataSourceRefreshResponse(setup: CancelDataSourceRefreshResponse.() -> Unit) = CancelDataSourceRefreshResponse().apply(setup)
fun cancelDataSourceRefreshStatus(setup: CancelDataSourceRefreshStatus.() -> Unit) = CancelDataSourceRefreshStatus().apply(setup)
fun candlestickChartSpec(setup: CandlestickChartSpec.() -> Unit) = CandlestickChartSpec().apply(setup)
fun candlestickData(setup: CandlestickData.() -> Unit) = CandlestickData().apply(setup)
fun candlestickDomain(setup: CandlestickDomain.() -> Unit) = CandlestickDomain().apply(setup)
fun candlestickSeries(setup: CandlestickSeries.() -> Unit) = CandlestickSeries().apply(setup)
fun cellData(setup: CellData.() -> Unit) = CellData().apply(setup)
fun cellFormat(setup: CellFormat.() -> Unit) = CellFormat().apply(setup)
fun chartAxisViewWindowOptions(setup: ChartAxisViewWindowOptions.() -> Unit) = ChartAxisViewWindowOptions().apply(setup)
fun chartCustomNumberFormatOptions(setup: ChartCustomNumberFormatOptions.() -> Unit) = ChartCustomNumberFormatOptions().apply(setup)
fun chartData(setup: ChartData.() -> Unit) = ChartData().apply(setup)
fun chartDateTimeRule(setup: ChartDateTimeRule.() -> Unit) = ChartDateTimeRule().apply(setup)
fun chartGroupRule(setup: ChartGroupRule.() -> Unit) = ChartGroupRule().apply(setup)
fun chartHistogramRule(setup: ChartHistogramRule.() -> Unit) = ChartHistogramRule().apply(setup)
fun chartSourceRange(setup: ChartSourceRange.() -> Unit) = ChartSourceRange().apply(setup)
fun chartSpec(setup: ChartSpec.() -> Unit) = ChartSpec().apply(setup)
fun clearBasicFilterRequest(setup: ClearBasicFilterRequest.() -> Unit) = ClearBasicFilterRequest().apply(setup)
fun clearValuesRequest(setup: ClearValuesRequest.() -> Unit) = ClearValuesRequest().apply(setup)
fun clearValuesResponse(setup: ClearValuesResponse.() -> Unit) = ClearValuesResponse().apply(setup)
fun color(setup: Color.() -> Unit) = Color().apply(setup)
fun colorStyle(setup: ColorStyle.() -> Unit) = ColorStyle().apply(setup)
fun conditionValue(setup: ConditionValue.() -> Unit) = ConditionValue().apply(setup)
fun conditionalFormatRule(setup: ConditionalFormatRule.() -> Unit) = ConditionalFormatRule().apply(setup)
fun copyPasteRequest(setup: CopyPasteRequest.() -> Unit) = CopyPasteRequest().apply(setup)
fun copySheetToAnotherSpreadsheetRequest(setup: CopySheetToAnotherSpreadsheetRequest.() -> Unit) = CopySheetToAnotherSpreadsheetRequest().apply(setup)
fun createDeveloperMetadataRequest(setup: CreateDeveloperMetadataRequest.() -> Unit) = CreateDeveloperMetadataRequest().apply(setup)
fun createDeveloperMetadataResponse(setup: CreateDeveloperMetadataResponse.() -> Unit) = CreateDeveloperMetadataResponse().apply(setup)
fun cutPasteRequest(setup: CutPasteRequest.() -> Unit) = CutPasteRequest().apply(setup)
fun dataExecutionStatus(setup: DataExecutionStatus.() -> Unit) = DataExecutionStatus().apply(setup)
fun dataFilter(setup: DataFilter.() -> Unit) = DataFilter().apply(setup)
fun dataFilterValueRange(setup: DataFilterValueRange.() -> Unit) = DataFilterValueRange().apply(setup)
fun dataLabel(setup: DataLabel.() -> Unit) = DataLabel().apply(setup)
fun dataSource(setup: DataSource.() -> Unit) = DataSource().apply(setup)
fun dataSourceChartProperties(setup: DataSourceChartProperties.() -> Unit) = DataSourceChartProperties().apply(setup)
fun dataSourceColumn(setup: DataSourceColumn.() -> Unit) = DataSourceColumn().apply(setup)
fun dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) = DataSourceColumnReference().apply(setup)
fun dataSourceFormula(setup: DataSourceFormula.() -> Unit) = DataSourceFormula().apply(setup)
fun dataSourceObjectReference(setup: DataSourceObjectReference.() -> Unit) = DataSourceObjectReference().apply(setup)
fun dataSourceObjectReferences(setup: DataSourceObjectReferences.() -> Unit) = DataSourceObjectReferences().apply(setup)
fun dataSourceParameter(setup: DataSourceParameter.() -> Unit) = DataSourceParameter().apply(setup)
fun dataSourceRefreshDailySchedule(setup: DataSourceRefreshDailySchedule.() -> Unit) = DataSourceRefreshDailySchedule().apply(setup)
fun dataSourceRefreshMonthlySchedule(setup: DataSourceRefreshMonthlySchedule.() -> Unit) = DataSourceRefreshMonthlySchedule().apply(setup)
fun dataSourceRefreshSchedule(setup: DataSourceRefreshSchedule.() -> Unit) = DataSourceRefreshSchedule().apply(setup)
fun dataSourceRefreshWeeklySchedule(setup: DataSourceRefreshWeeklySchedule.() -> Unit) = DataSourceRefreshWeeklySchedule().apply(setup)
fun dataSourceSheetDimensionRange(setup: DataSourceSheetDimensionRange.() -> Unit) = DataSourceSheetDimensionRange().apply(setup)
fun dataSourceSheetProperties(setup: DataSourceSheetProperties.() -> Unit) = DataSourceSheetProperties().apply(setup)
fun dataSourceSpec(setup: DataSourceSpec.() -> Unit) = DataSourceSpec().apply(setup)
fun dataSourceTable(setup: DataSourceTable.() -> Unit) = DataSourceTable().apply(setup)
fun dataValidationRule(setup: DataValidationRule.() -> Unit) = DataValidationRule().apply(setup)
fun dateTimeRule(setup: DateTimeRule.() -> Unit) = DateTimeRule().apply(setup)
fun deleteBandingRequest(setup: DeleteBandingRequest.() -> Unit) = DeleteBandingRequest().apply(setup)
fun deleteConditionalFormatRuleRequest(setup: DeleteConditionalFormatRuleRequest.() -> Unit) = DeleteConditionalFormatRuleRequest().apply(setup)
fun deleteConditionalFormatRuleResponse(setup: DeleteConditionalFormatRuleResponse.() -> Unit) = DeleteConditionalFormatRuleResponse().apply(setup)
fun deleteDataSourceRequest(setup: DeleteDataSourceRequest.() -> Unit) = DeleteDataSourceRequest().apply(setup)
fun deleteDeveloperMetadataRequest(setup: DeleteDeveloperMetadataRequest.() -> Unit) = DeleteDeveloperMetadataRequest().apply(setup)
fun deleteDeveloperMetadataResponse(setup: DeleteDeveloperMetadataResponse.() -> Unit) = DeleteDeveloperMetadataResponse().apply(setup)
fun deleteDimensionGroupRequest(setup: DeleteDimensionGroupRequest.() -> Unit) = DeleteDimensionGroupRequest().apply(setup)
fun deleteDimensionGroupResponse(setup: DeleteDimensionGroupResponse.() -> Unit) = DeleteDimensionGroupResponse().apply(setup)
fun deleteDimensionRequest(setup: DeleteDimensionRequest.() -> Unit) = DeleteDimensionRequest().apply(setup)
fun deleteDuplicatesRequest(setup: DeleteDuplicatesRequest.() -> Unit) = DeleteDuplicatesRequest().apply(setup)
fun deleteDuplicatesResponse(setup: DeleteDuplicatesResponse.() -> Unit) = DeleteDuplicatesResponse().apply(setup)
fun deleteEmbeddedObjectRequest(setup: DeleteEmbeddedObjectRequest.() -> Unit) = DeleteEmbeddedObjectRequest().apply(setup)
fun deleteFilterViewRequest(setup: DeleteFilterViewRequest.() -> Unit) = DeleteFilterViewRequest().apply(setup)
fun deleteNamedRangeRequest(setup: DeleteNamedRangeRequest.() -> Unit) = DeleteNamedRangeRequest().apply(setup)
fun deleteProtectedRangeRequest(setup: DeleteProtectedRangeRequest.() -> Unit) = DeleteProtectedRangeRequest().apply(setup)
fun deleteRangeRequest(setup: DeleteRangeRequest.() -> Unit) = DeleteRangeRequest().apply(setup)
fun deleteSheetRequest(setup: DeleteSheetRequest.() -> Unit) = DeleteSheetRequest().apply(setup)
fun developerMetadata(setup: DeveloperMetadata.() -> Unit) = DeveloperMetadata().apply(setup)
fun developerMetadataLocation(setup: DeveloperMetadataLocation.() -> Unit) = DeveloperMetadataLocation().apply(setup)
fun developerMetadataLookup(setup: DeveloperMetadataLookup.() -> Unit) = DeveloperMetadataLookup().apply(setup)
fun dimensionGroup(setup: DimensionGroup.() -> Unit) = DimensionGroup().apply(setup)
fun dimensionProperties(setup: DimensionProperties.() -> Unit) = DimensionProperties().apply(setup)
fun dimensionRange(setup: DimensionRange.() -> Unit) = DimensionRange().apply(setup)
fun duplicateFilterViewRequest(setup: DuplicateFilterViewRequest.() -> Unit) = DuplicateFilterViewRequest().apply(setup)
fun duplicateFilterViewResponse(setup: DuplicateFilterViewResponse.() -> Unit) = DuplicateFilterViewResponse().apply(setup)
fun duplicateSheetRequest(setup: DuplicateSheetRequest.() -> Unit) = DuplicateSheetRequest().apply(setup)
fun duplicateSheetResponse(setup: DuplicateSheetResponse.() -> Unit) = DuplicateSheetResponse().apply(setup)
fun editors(setup: Editors.() -> Unit) = Editors().apply(setup)
fun embeddedChart(setup: EmbeddedChart.() -> Unit) = EmbeddedChart().apply(setup)
fun embeddedObjectBorder(setup: EmbeddedObjectBorder.() -> Unit) = EmbeddedObjectBorder().apply(setup)
fun embeddedObjectPosition(setup: EmbeddedObjectPosition.() -> Unit) = EmbeddedObjectPosition().apply(setup)
fun errorValue(setup: ErrorValue.() -> Unit) = ErrorValue().apply(setup)
fun extendedValue(setup: ExtendedValue.() -> Unit) = ExtendedValue().apply(setup)
fun filterCriteria(setup: FilterCriteria.() -> Unit) = FilterCriteria().apply(setup)
fun filterSpec(setup: FilterSpec.() -> Unit) = FilterSpec().apply(setup)
fun filterView(setup: FilterView.() -> Unit) = FilterView().apply(setup)
fun findReplaceRequest(setup: FindReplaceRequest.() -> Unit) = FindReplaceRequest().apply(setup)
fun findReplaceResponse(setup: FindReplaceResponse.() -> Unit) = FindReplaceResponse().apply(setup)
fun getSpreadsheetByDataFilterRequest(setup: GetSpreadsheetByDataFilterRequest.() -> Unit) = GetSpreadsheetByDataFilterRequest().apply(setup)
fun gradientRule(setup: GradientRule.() -> Unit) = GradientRule().apply(setup)
fun gridCoordinate(setup: GridCoordinate.() -> Unit) = GridCoordinate().apply(setup)
fun gridData(setup: GridData.() -> Unit) = GridData().apply(setup)
fun gridProperties(setup: GridProperties.() -> Unit) = GridProperties().apply(setup)
fun gridRange(setup: GridRange.() -> Unit) = GridRange().apply(setup)
fun histogramChartSpec(setup: HistogramChartSpec.() -> Unit) = HistogramChartSpec().apply(setup)
fun histogramRule(setup: HistogramRule.() -> Unit) = HistogramRule().apply(setup)
fun histogramSeries(setup: HistogramSeries.() -> Unit) = HistogramSeries().apply(setup)
fun insertDimensionRequest(setup: InsertDimensionRequest.() -> Unit) = InsertDimensionRequest().apply(setup)
fun insertRangeRequest(setup: InsertRangeRequest.() -> Unit) = InsertRangeRequest().apply(setup)
fun interpolationPoint(setup: InterpolationPoint.() -> Unit) = InterpolationPoint().apply(setup)
fun interval(setup: Interval.() -> Unit) = Interval().apply(setup)
fun iterativeCalculationSettings(setup: IterativeCalculationSettings.() -> Unit) = IterativeCalculationSettings().apply(setup)
fun keyValueFormat(setup: KeyValueFormat.() -> Unit) = KeyValueFormat().apply(setup)
fun lineStyle(setup: LineStyle.() -> Unit) = LineStyle().apply(setup)
fun link(setup: Link.() -> Unit) = Link().apply(setup)
fun lookerDataSourceSpec(setup: LookerDataSourceSpec.() -> Unit) = LookerDataSourceSpec().apply(setup)
fun manualRule(setup: ManualRule.() -> Unit) = ManualRule().apply(setup)
fun manualRuleGroup(setup: ManualRuleGroup.() -> Unit) = ManualRuleGroup().apply(setup)
fun matchedDeveloperMetadata(setup: MatchedDeveloperMetadata.() -> Unit) = MatchedDeveloperMetadata().apply(setup)
fun matchedValueRange(setup: MatchedValueRange.() -> Unit) = MatchedValueRange().apply(setup)
fun mergeCellsRequest(setup: MergeCellsRequest.() -> Unit) = MergeCellsRequest().apply(setup)
fun moveDimensionRequest(setup: MoveDimensionRequest.() -> Unit) = MoveDimensionRequest().apply(setup)
fun namedRange(setup: NamedRange.() -> Unit) = NamedRange().apply(setup)
fun numberFormat(setup: NumberFormat.() -> Unit) = NumberFormat().apply(setup)
fun orgChartSpec(setup: OrgChartSpec.() -> Unit) = OrgChartSpec().apply(setup)
fun overlayPosition(setup: OverlayPosition.() -> Unit) = OverlayPosition().apply(setup)
fun padding(setup: Padding.() -> Unit) = Padding().apply(setup)
fun pasteDataRequest(setup: PasteDataRequest.() -> Unit) = PasteDataRequest().apply(setup)
fun pieChartSpec(setup: PieChartSpec.() -> Unit) = PieChartSpec().apply(setup)
fun pivotFilterCriteria(setup: PivotFilterCriteria.() -> Unit) = PivotFilterCriteria().apply(setup)
fun pivotFilterSpec(setup: PivotFilterSpec.() -> Unit) = PivotFilterSpec().apply(setup)
fun pivotGroup(setup: PivotGroup.() -> Unit) = PivotGroup().apply(setup)
fun pivotGroupLimit(setup: PivotGroupLimit.() -> Unit) = PivotGroupLimit().apply(setup)
fun pivotGroupRule(setup: PivotGroupRule.() -> Unit) = PivotGroupRule().apply(setup)
fun pivotGroupSortValueBucket(setup: PivotGroupSortValueBucket.() -> Unit) = PivotGroupSortValueBucket().apply(setup)
fun pivotGroupValueMetadata(setup: PivotGroupValueMetadata.() -> Unit) = PivotGroupValueMetadata().apply(setup)
fun pivotTable(setup: PivotTable.() -> Unit) = PivotTable().apply(setup)
fun pivotValue(setup: PivotValue.() -> Unit) = PivotValue().apply(setup)
fun pointStyle(setup: PointStyle.() -> Unit) = PointStyle().apply(setup)
fun protectedRange(setup: ProtectedRange.() -> Unit) = ProtectedRange().apply(setup)
fun randomizeRangeRequest(setup: RandomizeRangeRequest.() -> Unit) = RandomizeRangeRequest().apply(setup)
fun refreshCancellationStatus(setup: RefreshCancellationStatus.() -> Unit) = RefreshCancellationStatus().apply(setup)
fun refreshDataSourceObjectExecutionStatus(setup: RefreshDataSourceObjectExecutionStatus.() -> Unit) = RefreshDataSourceObjectExecutionStatus().apply(setup)
fun refreshDataSourceRequest(setup: RefreshDataSourceRequest.() -> Unit) = RefreshDataSourceRequest().apply(setup)
fun refreshDataSourceResponse(setup: RefreshDataSourceResponse.() -> Unit) = RefreshDataSourceResponse().apply(setup)
fun repeatCellRequest(setup: RepeatCellRequest.() -> Unit) = RepeatCellRequest().apply(setup)
fun request(setup: Request.() -> Unit) = Request().apply(setup)
fun response(setup: Response.() -> Unit) = Response().apply(setup)
fun rowData(setup: RowData.() -> Unit) = RowData().apply(setup)
fun scorecardChartSpec(setup: ScorecardChartSpec.() -> Unit) = ScorecardChartSpec().apply(setup)
fun searchDeveloperMetadataRequest(setup: SearchDeveloperMetadataRequest.() -> Unit) = SearchDeveloperMetadataRequest().apply(setup)
fun searchDeveloperMetadataResponse(setup: SearchDeveloperMetadataResponse.() -> Unit) = SearchDeveloperMetadataResponse().apply(setup)
fun setBasicFilterRequest(setup: SetBasicFilterRequest.() -> Unit) = SetBasicFilterRequest().apply(setup)
fun setDataValidationRequest(setup: SetDataValidationRequest.() -> Unit) = SetDataValidationRequest().apply(setup)
fun sheet(setup: Sheet.() -> Unit) = Sheet().apply(setup)
fun sheetProperties(setup: SheetProperties.() -> Unit) = SheetProperties().apply(setup)
fun slicer(setup: Slicer.() -> Unit) = Slicer().apply(setup)
fun slicerSpec(setup: SlicerSpec.() -> Unit) = SlicerSpec().apply(setup)
fun sortRangeRequest(setup: SortRangeRequest.() -> Unit) = SortRangeRequest().apply(setup)
fun sortSpec(setup: SortSpec.() -> Unit) = SortSpec().apply(setup)
fun sourceAndDestination(setup: SourceAndDestination.() -> Unit) = SourceAndDestination().apply(setup)
fun spreadsheet(setup: Spreadsheet.() -> Unit) = Spreadsheet().apply(setup)
fun spreadsheetProperties(setup: SpreadsheetProperties.() -> Unit) = SpreadsheetProperties().apply(setup)
fun spreadsheetTheme(setup: SpreadsheetTheme.() -> Unit) = SpreadsheetTheme().apply(setup)
fun textFormat(setup: TextFormat.() -> Unit) = TextFormat().apply(setup)
fun textFormatRun(setup: TextFormatRun.() -> Unit) = TextFormatRun().apply(setup)
fun textPosition(setup: TextPosition.() -> Unit) = TextPosition().apply(setup)
fun textRotation(setup: TextRotation.() -> Unit) = TextRotation().apply(setup)
fun textToColumnsRequest(setup: TextToColumnsRequest.() -> Unit) = TextToColumnsRequest().apply(setup)
fun themeColorPair(setup: ThemeColorPair.() -> Unit) = ThemeColorPair().apply(setup)
fun timeOfDay(setup: TimeOfDay.() -> Unit) = TimeOfDay().apply(setup)
fun treemapChartColorScale(setup: TreemapChartColorScale.() -> Unit) = TreemapChartColorScale().apply(setup)
fun treemapChartSpec(setup: TreemapChartSpec.() -> Unit) = TreemapChartSpec().apply(setup)
fun trimWhitespaceRequest(setup: TrimWhitespaceRequest.() -> Unit) = TrimWhitespaceRequest().apply(setup)
fun trimWhitespaceResponse(setup: TrimWhitespaceResponse.() -> Unit) = TrimWhitespaceResponse().apply(setup)
fun unmergeCellsRequest(setup: UnmergeCellsRequest.() -> Unit) = UnmergeCellsRequest().apply(setup)
fun updateBandingRequest(setup: UpdateBandingRequest.() -> Unit) = UpdateBandingRequest().apply(setup)
fun updateBordersRequest(setup: UpdateBordersRequest.() -> Unit) = UpdateBordersRequest().apply(setup)
fun updateCellsRequest(setup: UpdateCellsRequest.() -> Unit) = UpdateCellsRequest().apply(setup)
fun updateChartSpecRequest(setup: UpdateChartSpecRequest.() -> Unit) = UpdateChartSpecRequest().apply(setup)
fun updateConditionalFormatRuleRequest(setup: UpdateConditionalFormatRuleRequest.() -> Unit) = UpdateConditionalFormatRuleRequest().apply(setup)
fun updateConditionalFormatRuleResponse(setup: UpdateConditionalFormatRuleResponse.() -> Unit) = UpdateConditionalFormatRuleResponse().apply(setup)
fun updateDataSourceRequest(setup: UpdateDataSourceRequest.() -> Unit) = UpdateDataSourceRequest().apply(setup)
fun updateDataSourceResponse(setup: UpdateDataSourceResponse.() -> Unit) = UpdateDataSourceResponse().apply(setup)
fun updateDeveloperMetadataRequest(setup: UpdateDeveloperMetadataRequest.() -> Unit) = UpdateDeveloperMetadataRequest().apply(setup)
fun updateDeveloperMetadataResponse(setup: UpdateDeveloperMetadataResponse.() -> Unit) = UpdateDeveloperMetadataResponse().apply(setup)
fun updateDimensionGroupRequest(setup: UpdateDimensionGroupRequest.() -> Unit) = UpdateDimensionGroupRequest().apply(setup)
fun updateDimensionPropertiesRequest(setup: UpdateDimensionPropertiesRequest.() -> Unit) = UpdateDimensionPropertiesRequest().apply(setup)
fun updateEmbeddedObjectBorderRequest(setup: UpdateEmbeddedObjectBorderRequest.() -> Unit) = UpdateEmbeddedObjectBorderRequest().apply(setup)
fun updateEmbeddedObjectPositionRequest(setup: UpdateEmbeddedObjectPositionRequest.() -> Unit) = UpdateEmbeddedObjectPositionRequest().apply(setup)
fun updateEmbeddedObjectPositionResponse(setup: UpdateEmbeddedObjectPositionResponse.() -> Unit) = UpdateEmbeddedObjectPositionResponse().apply(setup)
fun updateFilterViewRequest(setup: UpdateFilterViewRequest.() -> Unit) = UpdateFilterViewRequest().apply(setup)
fun updateNamedRangeRequest(setup: UpdateNamedRangeRequest.() -> Unit) = UpdateNamedRangeRequest().apply(setup)
fun updateProtectedRangeRequest(setup: UpdateProtectedRangeRequest.() -> Unit) = UpdateProtectedRangeRequest().apply(setup)
fun updateSheetPropertiesRequest(setup: UpdateSheetPropertiesRequest.() -> Unit) = UpdateSheetPropertiesRequest().apply(setup)
fun updateSlicerSpecRequest(setup: UpdateSlicerSpecRequest.() -> Unit) = UpdateSlicerSpecRequest().apply(setup)
fun updateSpreadsheetPropertiesRequest(setup: UpdateSpreadsheetPropertiesRequest.() -> Unit) = UpdateSpreadsheetPropertiesRequest().apply(setup)
fun updateValuesByDataFilterResponse(setup: UpdateValuesByDataFilterResponse.() -> Unit) = UpdateValuesByDataFilterResponse().apply(setup)
fun updateValuesResponse(setup: UpdateValuesResponse.() -> Unit) = UpdateValuesResponse().apply(setup)
fun valueRange(setup: ValueRange.() -> Unit) = ValueRange().apply(setup)
fun waterfallChartColumnStyle(setup: WaterfallChartColumnStyle.() -> Unit) = WaterfallChartColumnStyle().apply(setup)
fun waterfallChartCustomSubtotal(setup: WaterfallChartCustomSubtotal.() -> Unit) = WaterfallChartCustomSubtotal().apply(setup)
fun waterfallChartDomain(setup: WaterfallChartDomain.() -> Unit) = WaterfallChartDomain().apply(setup)
fun waterfallChartSeries(setup: WaterfallChartSeries.() -> Unit) = WaterfallChartSeries().apply(setup)
fun waterfallChartSpec(setup: WaterfallChartSpec.() -> Unit) = WaterfallChartSpec().apply(setup)