package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.BaselineValueFormat

/** The comparison type of key value with baseline value. */
enum class ComparisonType {

    /** Default value, do not use. */
    COMPARISON_TYPE_UNDEFINED,

    /** Use absolute difference between key and baseline value. */
    ABSOLUTE_DIFFERENCE,

    /** Use percentage difference between key and baseline value. */
    PERCENTAGE_DIFFERENCE,

}

/** The comparison type of key value with baseline value. */
fun BaselineValueFormat.setComparisonType(comparisonType: ComparisonType) = setComparisonType(comparisonType.name)

/** The comparison type of key value with baseline value. */
var BaselineValueFormat.comparisonTypeE: ComparisonType?
    get() = comparisonType?.let { ComparisonType.valueOf(it) }
    set(value) { comparisonType = value?.name }