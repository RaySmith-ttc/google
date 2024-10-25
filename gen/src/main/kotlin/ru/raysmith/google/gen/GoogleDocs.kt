package ru.raysmith.google.gen

import com.google.api.services.docs.v1.Docs
import ru.raysmith.google.gen.codegen.generateBuilders
import ru.raysmith.google.gen.codegen.generateDSL
import ru.raysmith.google.gen.codegen.generateFields
import ru.raysmith.google.gen.codegen.generateServices

fun main() {
    generateBuilders(
        service = Docs::class,
        buildersFile = "src/main/kotlin/ru/raysmith/google/docs/utils/Constructors.kt",
        destPackage = "ru.raysmith.google.docs.utils"
    )
    generateFields(
        service = Docs::class,
        path = "src/main/kotlin/ru/raysmith/google/docs/utils/fields",
        destPackage = "ru.raysmith.google.docs.utils.fields"
    )
    generateServices(
        service = Docs::class,
        path = "src/main/kotlin/ru/raysmith/google/docs/service",
        destPackage = "ru.raysmith.google.docs.service"
    )
    generateDSL(Docs::class, "src/main/kotlin/ru/raysmith/google/docs/dsl", "ru.raysmith.google.docs.dsl")
}