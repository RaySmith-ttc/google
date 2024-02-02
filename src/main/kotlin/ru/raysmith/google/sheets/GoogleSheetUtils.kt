package ru.raysmith.google.sheets

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.model.SheetData
import ru.raysmith.google.model.api.ValueInputOption
import ru.raysmith.google.sheets.service.GoogleSheetsService

fun Spreadsheet.sheets(setup: SheetsBuilder.() -> Unit) {
    val builder = object : SheetsBuilder {
        private val all = mutableListOf<Sheet>()
        override fun getAll(): List<Sheet> = all
        override fun sheet(setup: Sheet.() -> Unit) {
            all.add(Sheet().apply(setup))
        }
    }
    
    this.sheets = builder.apply(setup).getAll()
}

fun Spreadsheet.getRangeFromSheetId(sheetId: Int): String {
    return sheets.find { it.properties.sheetId == sheetId }?.properties?.title
        ?: error("Sheet with id $sheetId not found in spreadsheet $spreadsheetId")
}

fun Sheet.properties(setup: SheetProperties.() -> Unit) {
    this.properties = SheetProperties().apply(setup)
}

fun table(setup: SheetData.() -> Unit): List<RowData> {
    return SheetData().apply(setup).rows
}

fun SheetData.row(row: RowData) {
    rows.add(row)
}
fun SheetData.row(setup: RowData.() -> Unit) {
    rows.add(RowData().apply(setup))
}
fun row(setup: RowData.() -> Unit): RowData {
    return RowData().apply(setup)
}

fun RowData.cells(vararg cells: CellData?) {
    val fixed = cells.toList().toMutableList()
    fixed.forEachIndexed { index, data ->
        if (data == null) {
            fixed[index] = CellData()
        }
    }
    
    setValues(fixed)
}

fun Sheets.Spreadsheets.Values.Update.setValueInputOption(option: ValueInputOption) = apply {
    valueInputOption = option.name
}

fun Sheets.Spreadsheets.Values.Append.setValueInputOption(option: ValueInputOption) = apply {
    valueInputOption = option.name
}

fun Spreadsheet.append(rows: List<RowData>, sheet: Sheet, service: GoogleSheetsService) = append(rows, sheet.properties.sheetId, service)
fun Spreadsheet.append(rows: List<RowData>, sheetId: Int, service: GoogleSheetsService) = service.requests(
    spreadsheetId, Request().setAppendCells(
        AppendCellsRequest()
            .setFields("*")
            .setRows(rows)
            .setSheetId(sheetId)
    )
)

fun Spreadsheet.refreshed(service: GoogleSheetsService) = service.SpreadSheets.get(spreadsheetId)