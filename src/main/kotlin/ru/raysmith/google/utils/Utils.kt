package ru.raysmith.google.utils

private val snakeCaseRegex = Regex("_([a-z])")
internal fun <E : Enum<E>> E.snakeCased() = snakeCaseRegex.replace(name.lowercase()) {
    it.groupValues[1].uppercase()
}