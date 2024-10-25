package ru.raysmith.google.gen.codegen

data class BuilderData(
    val originalInterfaceName: String,
    val renamedVariantInterfaceName: String,
    val link: String,
    val interfaceFunName: String,
    val typeName: String
)

fun List<BuilderData>.containsSame(other: BuilderData): Boolean {
    return containsTwoOrMore {
        it.link == other.link && it.typeName == other.typeName && it.originalInterfaceName == other.originalInterfaceName && it.interfaceFunName == other.interfaceFunName
    }
}