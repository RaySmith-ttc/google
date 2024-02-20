package ru.raysmith.google.model.api

import com.google.api.services.sheets.v4.model.CopyPasteRequest

/** How a paste operation should be performed. */
enum class PasteOrientation {

    /** Paste normally. */
    NORMAL,

    /** Paste transposed, where all rows become columns and vice versa. */
    TRANSPOSE,

}

/** How that data should be oriented when pasting. */
fun CopyPasteRequest.setPasteOrientation(pasteOrientation: PasteOrientation) = setPasteOrientation(pasteOrientation.name)

/** How that data should be oriented when pasting. */
var CopyPasteRequest.pasteOrientationE: PasteOrientation?
    get() = pasteOrientation?.let { PasteOrientation.valueOf(it) }
    set(value) { pasteOrientation = value?.name }