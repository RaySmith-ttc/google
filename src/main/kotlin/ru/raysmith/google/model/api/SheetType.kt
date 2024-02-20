package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.SheetProperties

/** The kind of sheet. */
enum class SheetType {

    /** Default value, do not use. */
    SHEET_TYPE_UNSPECIFIED,

    /** The sheet is a grid. */
    GRID,

    /** The sheet has no grid and instead has an object like a chart or image. */
    OBJECT,

    /** The sheet connects with an external DataSource and shows the preview of data. */
    DATA_SOURCE,

}

/** The type of sheet. Defaults to GRID. This field cannot be changed once set. */
fun SheetProperties.setSheetType(sheetType: SheetType) = setSheetType(sheetType.name)

/** The type of sheet. Defaults to GRID. This field cannot be changed once set. */
var SheetProperties.sheetTypeE: SheetType?
    get() = sheetType?.let { SheetType.valueOf(it) }
    set(value) { sheetType = value?.name }