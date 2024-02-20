package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.ColorStyle
import com.google.api.services.sheets.v4.model.SpreadsheetProperties
import com.google.api.services.sheets.v4.model.SpreadsheetTheme
import com.google.api.services.sheets.v4.model.ThemeColorPair

/**
 * Theme color types.
 *
 * [SpreadsheetProperties] contain a [SpreadsheetTheme] that defines a mapping of these theme color types to concrete colors.
 * */
enum class ThemeColorType {

    /** Unspecified theme color */
    THEME_COLOR_TYPE_UNSPECIFIED,

    /** Represents the primary text color */
    TEXT,

    /** Represents the primary background color */
    BACKGROUND,

    /** Represents the first accent color */
    ACCENT1,

    /** Represents the second accent color */
    ACCENT2,

    /** Represents the third accent color */
    ACCENT3,

    /** Represents the fourth accent color */
    ACCENT4,

    /** Represents the fifth accent color */
    ACCENT5,

    /** Represents the sixth accent color */
    ACCENT6,

    /** Represents the color to use for hyperlinks */
    LINK,
}

/** The type of the spreadsheet theme color. */
fun ThemeColorPair.setColorType(colorType: ThemeColorType) = setColorType(colorType.name)

/** The type of the spreadsheet theme color. */
var ThemeColorPair.colorTypeE: ThemeColorType?
    get() = colorType?.let { ThemeColorType.valueOf(it) }
    set(value) { colorType = value?.name }



/** Theme color. */
fun ColorStyle.setThemeColor(themeColor: ThemeColorType) = setThemeColor(themeColor.name)

/** Theme color. */
var ColorStyle.themeColorE: ThemeColorType?
    get() = themeColor?.let { ThemeColorType.valueOf(it) }
    set(value) { themeColor = value?.name }