package ru.raysmith.google.model

import com.google.api.services.sheets.v4.model.RowData

data class SheetData(val rows: MutableList<RowData> = mutableListOf())