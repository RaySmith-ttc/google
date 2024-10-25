package ru.raysmith.google.gen

import com.google.api.services.drive.Drive
import ru.raysmith.google.gen.codegen.generateBuilders
import ru.raysmith.google.gen.codegen.generateDSL
import ru.raysmith.google.gen.codegen.generateFields
import ru.raysmith.google.gen.codegen.generateServices

fun main() {
    generateBuilders(
        service = Drive::class,
        buildersFile = "src/main/kotlin/ru/raysmith/google/drive/utils/Constructors.kt",
        destPackage = "ru.raysmith.google.drive.utils"
    )
    generateFields(
        service = Drive::class,
        path = "src/main/kotlin/ru/raysmith/google/drive/utils/fields",
        destPackage = "ru.raysmith.google.drive.utils.fields"
    )
    generateServices(
        service = Drive::class,
        path = "src/main/kotlin/ru/raysmith/google/drive/service",
        destPackage = "ru.raysmith.google.drive.service"
    )
    generateDSL(
        service = Drive::class,
        path = "src/main/kotlin/ru/raysmith/google/drive/dsl",
        destPackage = "ru.raysmith.google.drive.dsl"
    )
}




