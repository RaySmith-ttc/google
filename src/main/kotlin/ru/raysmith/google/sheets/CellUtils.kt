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
        setTextFormat(TextFormat())
    }
    setup()
})

fun RowData.emptyCell(format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell(null, format, setup)

fun RowData.linkCell(text: String? = null, link: String? = null, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell {
    if (link != null) {
        extendedValue {
            formulaValue = hyperlink(link, text ?: link)
        }
    } else {
        userEnteredValue = ExtendedValue().setStringValue("")
    }

    userEnteredFormat(format.clone()) {
        setTextFormat(TextFormat())
    }
    setup()
}

//fun RowData.boldCell(text: String? = null, horizontalAlignment: HorizontalAlign = HorizontalAlign.LEFT, format: CellFormat.() -> Unit = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell {
//    userEnteredValue = ExtendedValue().setStringValue(this@boldCell)
//    userEnteredFormat = CellFormat().setTextFormat(TextFormat().setBold(true)).apply {
//        this.horizontalAlignment = horizontalAlignment.name
//        wrapStrategy = WrapStrategy.WRAP.name
//    }
//}
//
//fun String.boldCell(horizontalAlignment: HorizontalAlign = HorizontalAlign.LEFT) = CellData().apply {
//    userEnteredValue = ExtendedValue().setStringValue(this@boldCell)
//    userEnteredFormat = CellFormat().setTextFormat(TextFormat().setBold(true)).apply {
//        this.horizontalAlignment = horizontalAlignment.name
//        wrapStrategy = WrapStrategy.WRAP.name
//    }
//}
//
//
//fun String?.textCell(horizontalAlignment: HorizontalAlign = HorizontalAlign.LEFT, wrapStrategy: WrapStrategy = WrapStrategy.WRAP) = CellData().apply {
//    userEnteredValue = ExtendedValue().setStringValue(this@textCell ?: "")
//    userEnteredFormat = CellFormat().setTextFormat(TextFormat()).apply {
//        this.horizontalAlignment = horizontalAlignment.name
//        this.wrapStrategy = wrapStrategy.name
//    }
//}

fun RowData.photoCell(url: String, format: CellFormat = defaultCellFormat, setup: CellData.() -> Unit = {}) = cell {
    extendedValue {
        formulaValue = "=IMAGE(\"$url\")"
    }
    userEnteredFormat(format.clone()) {
        setTextFormat(TextFormat())
    }
    setup()
}


// -------------------------------------------------- Builders ---------------------------------------------------------

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

// ---------------------------------------------------------------------------------------------------------------------

fun appendCellsRequest(setup: AppendCellsRequest.() -> Unit) = AppendCellsRequest().apply(setup)