package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.MergeCellsRequest

/** The type of merge to create. */
enum class MergeType {

    /** Create a single merge from the range */
    MERGE_ALL,

    /** Create a merge for each column in the range */
    MERGE_COLUMNS,

    /** Create a merge for each row in the range */
    MERGE_ROWS,

}

/** How the cells should be merged. */
fun MergeCellsRequest.setMergeType(mergeType: MergeType) = setMergeType(mergeType.name)

/** How the cells should be merged. */
var MergeCellsRequest.mergeTypeE: MergeType?
    get() = mergeType?.let { MergeType.valueOf(it) }
    set(value) { mergeType = value?.name }