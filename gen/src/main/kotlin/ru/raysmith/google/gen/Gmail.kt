package ru.raysmith.google.gen

import com.google.api.services.gmail.Gmail
import ru.raysmith.google.gen.codegen.generateBuilders
import ru.raysmith.google.gen.codegen.generateDSL
import ru.raysmith.google.gen.codegen.generateFields
import ru.raysmith.google.gen.codegen.generateServices

fun main() {
    generateBuilders(
        service = Gmail::class,
        buildersFile = "src/main/kotlin/ru/raysmith/google/gmail/utils/Constructors.kt",
        destPackage = "ru.raysmith.google.gmail.utils"
    )
    generateFields(
        service = Gmail::class,
        path = "src/main/kotlin/ru/raysmith/google/gmail/utils/fields",
        destPackage = "ru.raysmith.google.gmail.utils.fields"
    )
    generateServices(
        service = Gmail::class,
        path = "src/main/kotlin/ru/raysmith/google/gmail/service",
        destPackage = "ru.raysmith.google.gmail.service"
    )
    generateDSL(
        service = Gmail::class,
        path = "src/main/kotlin/ru/raysmith/google/gmail/dsl",
        destPackage = "ru.raysmith.google.gmail.dsl"
    )
}