package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.DataLabel

/** The type of a data label. */
enum class DataLabelType {

    /** The data label type is not specified and will be interpreted depending on the context of the data label within the chart. */
    DATA_LABEL_TYPE_UNSPECIFIED,

    /** The data label is not displayed. */
    NONE,

    /** The data label is displayed using values from the series data. */
    DATA,

    /** The data label is displayed using values from a custom data source indicated by customLabelData. */
    CUSTOM,

}

/** The type of the data label. */
fun DataLabel.setChartType(type: DataLabelType) = setType(type.name)

/** The type of the data label. */
var DataLabel.typeE: DataLabelType?
    get() = type?.let { DataLabelType.valueOf(it) }
    set(value) { type = value?.name }