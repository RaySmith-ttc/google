package ru.raysmith.google.sheets

import com.google.api.services.sheets.v4.model.CellFormat
import ru.raysmith.google.model.api.HorizontalAlign
import ru.raysmith.google.model.api.WrapStrategy
import ru.raysmith.google.model.api.horizontalAlignmentE
import ru.raysmith.google.model.api.wrapStrategyE

val leftAlignmentTextCellFormat: CellFormat = cellFormat {
    textFormat = textFormat {  }
    horizontalAlignmentE = HorizontalAlign.LEFT
    wrapStrategyE = WrapStrategy.WRAP
}