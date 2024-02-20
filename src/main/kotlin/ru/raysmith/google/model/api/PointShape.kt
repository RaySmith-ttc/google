package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.PointStyle

/** The shape of a point. */
enum class PointShape {

    /** Default value. */
    POINT_SHAPE_UNSPECIFIED,

    /** A circle shape. */
    CIRCLE,

    /** A diamond shape. */
    DIAMOND,

    /** A hexagon shape. */
    HEXAGON,

    /** A pentagon shape. */
    PENTAGON,

    /** A square shape. */
    SQUARE,

    /** A star shape. */
    STAR,

    /** A triangle shape. */
    TRIANGLE,

    /** An x-mark shape. */
    X_MARK,

}

/** The type of the data label. */
fun PointStyle.setShape(shape: PointShape) = setShape(shape.name)

/** The type of the data label. */
var PointStyle.shapeE: PointShape?
    get() = shape?.let { PointShape.valueOf(it) }
    set(value) { shape = value?.name }