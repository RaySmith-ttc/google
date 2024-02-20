package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.ChartAxisViewWindowOptions

/** The view window's mode. It defines how to treat the min and max of the view window. */
enum class ViewWindowMode {

    /** The default view window mode used in the Sheets editor for this chart type. In most cases, if set, the default mode is equivalent to PRETTY. */
    DEFAULT_VIEW_WINDOW_MODE,

    /** Do not use. Represents that the currently set mode is not supported by the API. */
    VIEW_WINDOW_MODE_UNSUPPORTED,

    /** Follows the min and max exactly if specified. If a value is unspecified, it will fall back to the PRETTY value. */
    EXPLICIT,

    /** Chooses a min and max that make the chart look good. Both min and max are ignored in this mode. */
    PRETTY,

}

/** The view window's mode. */
fun ChartAxisViewWindowOptions.setViewWindowMode(viewWindowMode: ViewWindowMode) =
    setViewWindowMode(viewWindowMode.name)

/** The view window's mode. */
var ChartAxisViewWindowOptions.viewWindowModeE: ViewWindowMode?
    get() = viewWindowMode?.let { ViewWindowMode.valueOf(it) }
    set(value) { viewWindowMode = value?.name }