package ru.raysmith.google.sheets.utils

import com.google.api.services.sheets.v4.model.*
import ru.raysmith.google.sheets.service.GoogleSheetsService.Companion.Config.defaultCellFormat

fun cell(format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit) = CellData().apply {
    userEnteredFormat = format.clone()
    setup()
}

fun cellFormat(parent: CellFormat = defaultCellFormat, setup: CellFormat.() -> Unit): CellFormat {
    return parent.clone().apply(setup)
}

@GoogleDSL
fun RowData.cell(cell: CellData?) {
    if (cell != null) {
        setValues((getValues() ?: mutableListOf()).apply { add(cell) })
    } else emptyCell { }
}

@GoogleDSL
fun RowData.cell(value: String?, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(cell {
    userEnteredValue = ExtendedValue().setStringValue(value)
    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

@GoogleDSL
fun RowData.cell(value: Double?, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(cell {
    userEnteredValue = ExtendedValue().setNumberValue(value)
    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

@GoogleDSL
fun RowData.cell(value: Boolean?, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(cell {
    userEnteredValue = ExtendedValue().setBoolValue(value)
    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

@GoogleDSL
fun RowData.cell(value: ErrorValue?, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(cell {
    userEnteredValue = ExtendedValue().setErrorValue(value)
    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

private val nullString: String? = null
@GoogleDSL
fun RowData.emptyCell(format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) =
    cell(nullString, format, setup)

@GoogleDSL
fun RowData.linkCell(
    text: String? = null, link: String? = null, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}
) = cell(cell {
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

@GoogleDSL
fun RowData.imageCell(
    url: String, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}
) = cell(cell {
    extendedValue {
        formulaValue = image(url)
    }
    userEnteredFormat(format.clone()) {
        setTextFormat(format.textFormat ?: TextFormat())
    }
    setup()
})

@GoogleDSL
fun CellData.extendedValue(setup: ExtendedValue.() -> Unit) {
    userEnteredValue = ExtendedValue().apply(setup)
}

@GoogleDSL
fun CellData.userEnteredFormat(parent: CellFormat? = null, setup: CellFormat.() -> Unit) {
    userEnteredFormat = (parent ?: CellFormat()).apply(setup)
}

// ---------------------------------------------------------------------------------------------------------------------

fun hyperlink(link: String, text: String) = "=HYPERLINK(\"$link\";\"$text\")"
fun image(url: String) = "=IMAGE(\"$url\")"