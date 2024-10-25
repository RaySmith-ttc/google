package ru.raysmith.google.sheets.utils

import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.model.SheetData
import ru.raysmith.google.model.api.ValueInputOption
import ru.raysmith.google.sheets.dsl.appendCells
import ru.raysmith.google.sheets.dsl.requests
import ru.raysmith.google.sheets.service.GoogleSheetsService
import ru.raysmith.google.sheets.service.GoogleSpreadsheetsService

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
    spreadsheetId, batchUpdateSpreadsheetRequest {
        requests {
            request {
                appendCells {
                    this.fields = "*"
                    this.rows = rows
                    this.sheetId = sheetId
                }
            }
        }
    }
)

fun Spreadsheet.refreshed(service: GoogleSpreadsheetsService) = service.get(spreadsheetId)

val Sheet.sheetId get() = properties.sheetId

fun CellFormat.merge(other: CellFormat, deep: Boolean): CellFormat = if (deep) this % other else this / other

infix operator fun CellFormat.div(other: CellFormat) = cellFormat {
    backgroundColor = other.backgroundColor ?: this@div.backgroundColor
    backgroundColorStyle = other.backgroundColorStyle ?: this@div.backgroundColorStyle
    borders = other.borders ?: this@div.borders
    horizontalAlignment = other.horizontalAlignment ?: this@div.horizontalAlignment
    hyperlinkDisplayType = other.hyperlinkDisplayType ?: this@div.hyperlinkDisplayType
    numberFormat = other.numberFormat ?: this@div.numberFormat
    padding = other.padding ?: this@div.padding
    textDirection = other.textDirection ?: this@div.textDirection
    textFormat = other.textFormat ?: this@div.textFormat
    textRotation = other.textRotation ?: this@div.textRotation
    verticalAlignment = other.verticalAlignment ?: this@div.verticalAlignment
    wrapStrategy = other.wrapStrategy ?: this@div.wrapStrategy
}

infix operator fun CellFormat.rem(other: CellFormat) = cellFormat {
    fun <T> select(selector: CellFormat.() -> T?): T? {
        val o = other.selector()
        val t = this@rem.selector()
        return when {
            t == null -> o
            o == null -> t
            else -> o
        }
    }

    backgroundColor = select { backgroundColor }
    backgroundColorStyle = colorStyle {
        rgbColor = select { backgroundColorStyle.rgbColor }
        themeColor = select { backgroundColorStyle.themeColor }
    }
    borders = borders {
        top = select { borders.top }
        bottom = select { borders.bottom }
        left = select { borders.left }
        right = select { borders.right }
    }
    horizontalAlignment = select { horizontalAlignment }
    hyperlinkDisplayType = select { hyperlinkDisplayType }
    numberFormat = numberFormat {
        type = select { numberFormat.type }
        pattern = select { numberFormat.pattern }
    }
    padding = padding {
        top = select { padding.top }
        bottom = select { padding.bottom }
        left = select { padding.left }
        right = select { padding.right }
    }
    textDirection = select { textDirection }
    textFormat = textFormat {
        bold = select { textFormat.bold }
        fontFamily = select { textFormat.fontFamily }
        fontSize = select { textFormat.fontSize }
        foregroundColor = select { textFormat.foregroundColor }
        foregroundColorStyle = colorStyle {
            rgbColor = select { textFormat.foregroundColorStyle.rgbColor }
            themeColor = select { textFormat.foregroundColorStyle.themeColor }
        }
        italic = select { textFormat.italic }
        link = select { textFormat.link }
        strikethrough = select { textFormat.strikethrough }
        underline = select { textFormat.underline }
    }
    textRotation = textRotation {
        angle = select { textRotation.angle }
        vertical = select { textRotation.vertical }
    }
    verticalAlignment = select { verticalAlignment }
    wrapStrategy = select { wrapStrategy }
}

/**
 * Returns index of column.
 *
 * Examples:
 * ```
 * getGoogleSheetColumnIndex("A") // returns 0
 * getGoogleSheetColumnIndex("B") // returns 1
 * getGoogleSheetColumnIndex("AA") // returns 26
 * ```
 * */
fun getGoogleSheetColumnIndex(s: String): Int {
    var index = 0
    for (ch in s) {
        index = index * 26 + (ch.code and 31)
    }
    return index - 1
}

/**
 * Returns index range of columns inclusive [column1] and exclusive [column2].
 *
 * Examples:
 * ```
 * getGoogleSheetColumnIndex("A", "A") // returns 0..1
 * getGoogleSheetColumnIndex("B", "C") // returns 1..3
 * ```
 * */
fun getGoogleSheetColumnsRange(column1: String, column2: String): IntRange {
    return getGoogleSheetColumnIndex(column1)..(getGoogleSheetColumnIndex(column2) + 1)
}