package ru.raysmith.google.gen.sheets

import com.google.api.services.sheets.v4.Sheets
import ru.raysmith.google.gen.codegen.generateBuilders
import ru.raysmith.google.gen.codegen.generateDSL
import ru.raysmith.google.gen.codegen.generateFields
import ru.raysmith.google.gen.codegen.generateServices

fun main() {
    generateBuilders(
        service = Sheets::class,
        buildersFile = "src/main/kotlin/ru/raysmith/google/sheets/utils/Constructors.kt",
        destPackage = "ru.raysmith.google.sheets.utils"
    )
    generateFields(
        service = Sheets::class,
        path = "src/main/kotlin/ru/raysmith/google/sheets/utils/fields",
        destPackage = "ru.raysmith.google.sheets.utils.fields"
    )
    generateServices(
        service = Sheets::class,
        path = "src/main/kotlin/ru/raysmith/google/sheets/service",
        destPackage = "ru.raysmith.google.sheets.service"
    )
    generateDSL(
        service = Sheets::class,
        path = "src/main/kotlin/ru/raysmith/google/sheets/dsl",
        destPackage = "ru.raysmith.google.sheets.dsl"
    )
}