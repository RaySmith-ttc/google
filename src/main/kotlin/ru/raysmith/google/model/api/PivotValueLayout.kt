package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.PivotTable

/** The layout of pivot values. */
enum class PivotValueLayout {

    /** Values are laid out horizontally (as columns). */
    HORIZONTAL,

    /** Values are laid out vertically (as rows). */
    VERTICAL,

}

/** Whether values should be listed horizontally (as columns) or vertically (as rows). */
fun PivotTable.setValueLayout(valueLayout: PivotValueLayout) = setValueLayout(valueLayout.name)

/** Whether values should be listed horizontally (as columns) or vertically (as rows). */
var PivotTable.valueLayoutE: PivotValueLayout?
    get() = valueLayout?.let { PivotValueLayout.valueOf(it) }
    set(value) { valueLayout = value?.name }