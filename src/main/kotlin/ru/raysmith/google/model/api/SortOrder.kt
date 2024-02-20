package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.PivotGroup
import com.google.api.services.sheets.v4.model.SortSpec

/** A sort order. */
enum class SortOrder {

    /** Default value, do not use this. */
    SORT_ORDER_UNSPECIFIED,

    /** Sort ascending. */
    ASCENDING,

    /** Sort descending. */
    DESCENDING
}

/** The order data should be sorted. */
fun SortSpec.setSortOrder(sortOrder: SortOrder) = setSortOrder(sortOrder.name)

/** The order data should be sorted. */
var SortSpec.sortOrderE: SortOrder?
    get() = sortOrder?.let { SortOrder.valueOf(it) }
    set(value) { sortOrder = value?.name }

/** The order the values in this group should be sorted. */
fun PivotGroup.setSortOrder(sortOrder: SortOrder) = setSortOrder(sortOrder.name)

/** The order the values in this group should be sorted. */
var PivotGroup.sortOrderE: SortOrder?
    get() = sortOrder?.let { SortOrder.valueOf(it) }
    set(value) { sortOrder = value?.name }