package ru.raysmith.google.sheets

import com.google.api.services.sheets.v4.model.*

fun request(setup: Request.() -> Unit) = Request().apply(setup)
fun addSheetRequest(setup: AddSheetRequest.() -> Unit) = AddSheetRequest().apply(setup)
fun sheetProperties(setup: SheetProperties.() -> Unit) = SheetProperties().apply(setup)
fun batchUpdateSpreadsheetRequest(setup: BatchUpdateSpreadsheetRequest.() -> Unit) = BatchUpdateSpreadsheetRequest().apply(setup)
fun BatchUpdateSpreadsheetRequest.request(setup: Request.() -> Unit) {
    setRequests(requests.apply { add(ru.raysmith.google.sheets.request { setup() }) })
}
fun updateCellsRequest(setup: UpdateCellsRequest.() -> Unit) = UpdateCellsRequest().apply(setup)
fun gridCoordinate(setup: GridCoordinate.() -> Unit) = GridCoordinate().apply(setup)
fun getSpreadsheetByDataFilterRequest(setup: GetSpreadsheetByDataFilterRequest.() -> Unit) = GetSpreadsheetByDataFilterRequest().apply(setup)
fun dataFilter(setup: DataFilter.() -> Unit) = DataFilter().apply(setup)
fun developerMetadataLookup(setup: DeveloperMetadataLookup.() -> Unit) = DeveloperMetadataLookup().apply(setup)
fun dimensionRange(setup: DimensionRange.() -> Unit) = DimensionRange().apply(setup)
fun spreadsheet(setup: Spreadsheet.() -> Unit) = Spreadsheet().apply(setup)
fun developerMetadata(setup: DeveloperMetadata.() -> Unit) = DeveloperMetadata().apply(setup)
fun developerMetadataLocation(setup: DeveloperMetadataLocation.() -> Unit) = DeveloperMetadataLocation().apply(setup)
fun namedRange(setup: NamedRange.() -> Unit) = NamedRange().apply(setup)
fun gridRange(setup: GridRange.() -> Unit) = GridRange().apply(setup)
fun spreadsheetProperties(setup: SpreadsheetProperties.() -> Unit) = SpreadsheetProperties().apply(setup)
fun iterativeCalculationSettings(setup: IterativeCalculationSettings.() -> Unit) = IterativeCalculationSettings().apply(setup)
fun cellFormat(setup: CellFormat.() -> Unit) = CellFormat().apply(setup)
fun color(setup: Color.() -> Unit) = Color().apply(setup)
fun colorStyle(setup: ColorStyle.() -> Unit) = ColorStyle().apply(setup)
fun borders(setup: Borders.() -> Unit) = Borders().apply(setup)
fun border(setup: Border.() -> Unit) = Border().apply(setup)
fun numberFormat(setup: NumberFormat.() -> Unit) = NumberFormat().apply(setup)
fun padding(setup: Padding.() -> Unit) = Padding().apply(setup)
fun textFormat(setup: TextFormat.() -> Unit) = TextFormat().apply(setup)
fun link(setup: Link.() -> Unit) = Link().apply(setup)
fun textRotation(setup: TextRotation.() -> Unit) = TextRotation().apply(setup)
fun sheet(setup: Sheet.() -> Unit) = Sheet().apply(setup)
fun dataSource(setup: DataSource.() -> Unit) = DataSource().apply(setup)
fun dataSourceSpec(setup: DataSourceSpec.() -> Unit) = DataSourceSpec().apply(setup)
fun dataSourceParameter(setup: DataSourceParameter.() -> Unit) = DataSourceParameter().apply(setup)
fun bigQueryDataSourceSpec(setup: BigQueryDataSourceSpec.() -> Unit) = BigQueryDataSourceSpec().apply(setup)
fun bigQueryQuerySpec(setup: BigQueryQuerySpec.() -> Unit) = BigQueryQuerySpec().apply(setup)
fun bigQueryTableSpec(setup: BigQueryTableSpec.() -> Unit) = BigQueryTableSpec().apply(setup)
fun dataSourceColumn(setup: DataSourceColumn.() -> Unit) = DataSourceColumn().apply(setup)
fun dataSourceColumnReference(setup: DataSourceColumnReference.() -> Unit) = DataSourceColumnReference().apply(setup)
fun dataSourceRefreshSchedule(setup: DataSourceRefreshSchedule.() -> Unit) = DataSourceRefreshSchedule().apply(setup)
fun interval(setup: Interval.() -> Unit) = Interval().apply(setup)
fun dataSourceRefreshWeeklySchedule(setup: DataSourceRefreshWeeklySchedule.() -> Unit) = DataSourceRefreshWeeklySchedule().apply(setup)
fun dataSourceRefreshMonthlySchedule(setup: DataSourceRefreshMonthlySchedule.() -> Unit) = DataSourceRefreshMonthlySchedule().apply(setup)
fun dataSourceRefreshDailySchedule(setup: DataSourceRefreshDailySchedule.() -> Unit) = DataSourceRefreshDailySchedule().apply(setup)
fun timeOfDay(setup: TimeOfDay.() -> Unit) = TimeOfDay().apply(setup)
fun valueRange(setup: ValueRange.() -> Unit) = ValueRange().apply(setup)
fun clearValuesRequest(setup: ClearValuesRequest.() -> Unit) = ClearValuesRequest().apply(setup)
fun batchUpdateValuesRequest(setup: BatchUpdateValuesRequest.() -> Unit) = BatchUpdateValuesRequest().apply(setup)
fun batchUpdateValuesByDataFilterRequest(setup: BatchUpdateValuesByDataFilterRequest.() -> Unit) = BatchUpdateValuesByDataFilterRequest().apply(setup)
fun batchClearValuesRequest(setup: BatchClearValuesRequest.() -> Unit) = BatchClearValuesRequest().apply(setup)
fun batchClearValuesByDataFilterRequest(setup: BatchClearValuesByDataFilterRequest.() -> Unit) = BatchClearValuesByDataFilterRequest().apply(setup)
fun batchGetValuesByDataFilterRequest(setup: BatchGetValuesByDataFilterRequest.() -> Unit) = BatchGetValuesByDataFilterRequest().apply(setup)