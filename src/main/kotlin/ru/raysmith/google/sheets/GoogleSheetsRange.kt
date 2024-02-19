package ru.raysmith.google.sheets

class GoogleSheetsRange {

    private var sheet: String? = null
    private var leftTopCornerCell: String? = null
    private var rightBottomCornerCell: String? = null

    fun setSheet(title: String) = this.apply {
        sheet = title
    }

    fun setRange(leftTopCornerCell: String, rightBottomCornerCell: String) = this.apply {
        this.leftTopCornerCell = leftTopCornerCell
        this.rightBottomCornerCell = rightBottomCornerCell
    }

    fun setColumn(column: String, startFromRow: Int? = null, endWithRow: Int? = null) = this.apply {
        leftTopCornerCell = if (startFromRow != null) "$column$startFromRow" else column
        rightBottomCornerCell = if (endWithRow != null) "$column$endWithRow" else column
    }

    fun setRows(firstRow: Int, lastRow: Int = firstRow) = this.apply {
        leftTopCornerCell = firstRow.toString()
        rightBottomCornerCell = lastRow.toString()
    }

    override fun toString() = buildString {
        if (sheet != null) {
            append("'").append(sheet).append("'")
        }

        if (leftTopCornerCell != null && rightBottomCornerCell != null) {
            if (sheet != null) append("!")

            append(leftTopCornerCell).append(":").append(rightBottomCornerCell)
        }
    }
}