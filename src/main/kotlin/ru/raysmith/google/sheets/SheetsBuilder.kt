package ru.raysmith.google.sheets

import com.google.api.services.sheets.v4.model.Sheet

interface SheetsBuilder {
    fun sheet(setup: Sheet.() -> Unit)
    fun getAll(): List<Sheet>
}