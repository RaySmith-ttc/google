package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.OrgChartSpec

/** The size of the org chart nodes. */
enum class OrgChartNodeSize {

    /** Default value, do not use. */
    ORG_CHART_LABEL_SIZE_UNSPECIFIED,

    /** The small org chart node size. */
    SMALL,

    /** The medium org chart node size. */
    MEDIUM,

    /** The large org chart node size. */
    LARGE,

}

/** The size of the org chart nodes. */
fun OrgChartSpec.setNodeSize(nodeSize: OrgChartNodeSize) = setNodeSize(nodeSize.name)

/** The size of the org chart nodes. */
var OrgChartSpec.nodeSizeE: OrgChartNodeSize?
    get() = nodeSize?.let { OrgChartNodeSize.valueOf(it) }
    set(value) { nodeSize = value?.name }