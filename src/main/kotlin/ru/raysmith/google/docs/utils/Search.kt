package ru.raysmith.google.docs.utils

import com.google.api.services.docs.v1.model.*
import java.io.IOException

@Throws(IOException::class)
fun Document.findParagraph(text: Regex, condition: (ParagraphElement) -> Boolean = { true }): ParagraphElement? {
    body.content.forEach { element ->
        element.paragraph?.let { paragraph ->
            val res = paragraph.findParagraph(text, condition)
            if (res != null) {
                return res
            }
        }
        element.table?.let { table ->
            val res = table.findParagraph(text, condition)
            if (res != null) {
                return res
            }
        }
    }

    return null
}

fun Paragraph.findParagraph(text: Regex, condition: (ParagraphElement) -> Boolean = { true }): ParagraphElement? {
    elements.forEach { element ->
        val textRun: TextRun? = element.textRun
        if (textRun != null && textRun.content.matches(text) && condition(element)) {
            return element
        }
    }

    return null
}

fun Table.findParagraph(text: Regex, condition: (ParagraphElement) -> Boolean = { true }): ParagraphElement? {
    tableRows.forEach { row ->
        row.tableCells.forEach { cell ->
            cell.content.forEach { cellElement ->
                val res = cellElement.paragraph?.findParagraph(text, condition)
                if (res != null) {
                    return res
                }
            }
        }
    }

    return null
}