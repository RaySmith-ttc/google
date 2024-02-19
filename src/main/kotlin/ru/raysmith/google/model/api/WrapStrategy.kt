package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CellFormat

/** How to wrap text in a cell. */
enum class WrapStrategy {
    /** The default value, do not use. */
    WRAP_STRATEGY_UNSPECIFIED,

    /**
     * Lines that are longer than the cell width will be written in the next cell over, so long as that cell is empty.
     * If the next cell over is non-empty, this behaves the same as CLIP . The text will never wrap to the next line
     * unless the user manually inserts a new line. Example:
     *
     * ```
     * | First sentence. |
     * | Manual newline that is very long. <- Text continues into next cell
     * | Next newline.   |
     * ```
     * */
    OVERFLOW_CELL,

    /**
     * This wrap strategy represents the old Google Sheets wrap strategy where words that are longer than a line are
     * clipped rather than broken. This strategy is not supported on all platforms and is being phased out. Example:
     *
     * ```
     * | Cell has a |
     * | loooooooooo| <- Word is clipped.
     * | word.      |
     * ```
     * */
    LEGACY_WRAP,

    /**
     * Lines that are longer than the cell width will be clipped. The text will never wrap to the next
     * line unless the user manually inserts a new line. Example:
     *
     * ```
     * | First sentence. |
     * | Manual newline t| <- Text is clipped
     * | Next newline.   |
     * ```
     * */
    CLIP,

    /**
     * Words that are longer than a line are wrapped at the character level rather than clipped. Example:
     *
     * ```
     * | Cell has a |
     * | loooooooooo| <- Word is broken.
     * | ong word.  |
     * ```
     * */
    WRAP
}

fun CellFormat.setWrapStrategy(wrapStrategy: WrapStrategy) {
    setWrapStrategy(wrapStrategy.name)
}

var CellFormat.wrapStrategyE: WrapStrategy?
    get() = this.wrapStrategy?.let { WrapStrategy.valueOf(it) }
    set(value) {
        this.wrapStrategy = value?.name
    }