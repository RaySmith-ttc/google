package ru.raysmith.google.sheets

import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.sheets.service.GoogleSheetsService.Companion.Config.defaultCellFormat

fun cell(format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit) = CellData().apply {
    userEnteredFormat = format.clone()
    setup()
}

fun RowData.cell(cell: CellData?) {
    if (cell != null) {
        setValues((getValues() ?: mutableListOf()).apply { add(cell) })
    } else emptyCell { }
}

fun RowData.cell(text: String?, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(cell {
    userEnteredValue = ExtendedValue().setStringValue(text ?: "")
    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

fun RowData.emptyCell(format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(null, format, setup)

fun RowData.linkCell(text: String? = null, link: String? = null, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(cell {
    if (link != null) {
        extendedValue {
            formulaValue = hyperlink(link, text ?: link)
        }
    } else {
        userEnteredValue = ExtendedValue().setStringValue("")
    }

    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

fun RowData.photoCell(url: String, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(cell {
    extendedValue {
        formulaValue = "=IMAGE(\"$url\")"
    }
    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

// -------------------------------------------------- DSL---------------------------------------------------------------

fun CellData.extendedValue(setup: ExtendedValue.() -> Unit) {
    userEnteredValue = ExtendedValue().apply(setup)
}

fun CellData.userEnteredFormat(parent: CellFormat? = null, setup: CellFormat.() -> Unit) {
    userEnteredFormat = (parent ?: CellFormat()).apply(setup)
}

fun cellFormat(parent: CellFormat = defaultCellFormat, setup: CellFormat.() -> Unit): CellFormat {
    return parent.clone().apply(setup)
}

// ---------------------------------------------------------------------------------------------------------------------

fun hyperlink(link: String, text: String) = "=HYPERLINK(\"$link\";\"$text\")"