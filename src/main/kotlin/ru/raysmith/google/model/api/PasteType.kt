package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CopyPasteRequest
import com.google.api.services.sheets.v4.model.CutPasteRequest
import com.google.api.services.sheets.v4.model.PasteDataRequest

/** What kind of data should be pasted. */
enum class PasteType {

    /** Paste values, formulas, formats, and merges. */
    PASTE_NORMAL,

    /** Paste the values ONLY without formats, formulas, or merges. */
    PASTE_VALUES,

    /** Paste the format and data validation only. */
    PASTE_FORMAT,

    /** Like PASTE_NORMAL but without borders. */
    PASTE_NO_BORDERS,

    /** Paste the formulas only. */
    PASTE_FORMULA,

    /** Paste the data validation only. */
    PASTE_DATA_VALIDATION,

    /** Paste the conditional formatting rules only. */
    PASTE_CONDITIONAL_FORMATTING,
}

/** What kind of data to paste. All the source data will be cut, regardless of what is pasted. */
fun CutPasteRequest.setPasteType(pasteType: PasteType) = setPasteType(pasteType.name)

/** What kind of data to paste. All the source data will be cut, regardless of what is pasted. */
var CutPasteRequest.pasteTypeE: PasteType?
    get() = pasteType?.let { PasteType.valueOf(it) }
    set(value) { pasteType = value?.name }



/** What kind of data to paste. */
fun CopyPasteRequest.setPasteType(pasteType: PasteType) = setPasteType(pasteType.name)

/** What kind of data to paste. */
var CopyPasteRequest.pasteTypeE: PasteType?
    get() = pasteType?.let { PasteType.valueOf(it) }
    set(value) { pasteType = value?.name }



/** How the data should be pasted. */
fun PasteDataRequest.setType(type: PasteType) = setType(type.name)

/** How the data should be pasted. */
var PasteDataRequest.typeE: PasteType?
    get() = type?.let { PasteType.valueOf(it) }
    set(value) { type = value?.name }
