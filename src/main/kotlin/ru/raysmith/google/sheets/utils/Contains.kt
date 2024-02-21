package ru.raysmith.google.sheets.utils

class ContainsModeData private constructor(val mode: ContainsMode, private var _ignoreCase: Boolean = true) {
    companion object {
        val FULL = ContainsModeData(ContainsMode.FULL)
        val PATH = ContainsModeData(ContainsMode.PATH)
        val START_WITH = ContainsModeData(ContainsMode.START_WITH)
        val END_WITH = ContainsModeData(ContainsMode.END_WITH)
        val MATCH = ContainsModeData(ContainsMode.MATCH)
    }

    val ignoreCase get() = _ignoreCase
    fun setIgnoreCase(value: Boolean) {
        _ignoreCase = value
    }

    fun <T> findIn(data: List<T>, value: Any) = data.find {
        when(mode) {
            ContainsMode.FULL -> if (it is String && value is String) it.equals(value, ignoreCase = _ignoreCase) else it == value
            ContainsMode.PATH -> it is String && value is String && it.contains(value, ignoreCase = _ignoreCase)
            ContainsMode.START_WITH -> it is String && value is String && it.startsWith(value, ignoreCase = _ignoreCase)
            ContainsMode.END_WITH -> it is String && value is String && it.endsWith(value, ignoreCase = _ignoreCase)
            ContainsMode.MATCH -> it is String && value is String && it.matches(value.toRegex())
        }
    }
}

enum class ContainsMode {
    FULL, PATH, START_WITH, END_WITH, MATCH
}

// ---------------------------------------------------------------------------------------------------------------------

fun List<List<Any>>.contains(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL) =
    findRow(value, containsModeData) != null

fun List<List<Any>>.findRow(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL) = find { row ->
    row.any {
        it.equals(value, containsModeData)
    }
}

fun List<Any>.columnIndex(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL) = indexOfFirst {
    it.equals(value, containsModeData)
}

private fun Any.equals(other: Any, containsModeData: ContainsModeData) =  when(containsModeData.mode) {
    ContainsMode.FULL -> this == other
    ContainsMode.PATH -> this is String && other is String && contains(other, ignoreCase = containsModeData.ignoreCase)
    ContainsMode.START_WITH -> this is String && other is String && startsWith(other, ignoreCase = containsModeData.ignoreCase)
    ContainsMode.END_WITH -> this is String && other is String && endsWith(other, ignoreCase = containsModeData.ignoreCase)
    ContainsMode.MATCH -> this is String && other is String && matches(other.toRegex())
}