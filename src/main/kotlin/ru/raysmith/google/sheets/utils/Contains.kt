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

fun List<List<Value>>.contains(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL, onRaw: (Value) -> Any? = { it }) =
    findRow(value, containsModeData, onRaw) != null

fun List<List<Value>>.findRow(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL, onRaw: (Value) -> Any? = { it }) = find { row ->
    row.any {
        it.equals(value, containsModeData, onRaw)
    }
}

fun List<List<Value>>.rowIndex(value: Any, columnIndex: Int? = null, containsModeData: ContainsModeData = ContainsModeData.FULL, onRaw: (Value) -> Any? = { it }) = indexOfFirst {
    if (columnIndex != null) {
        if (it.lastIndex < columnIndex) {
            return@indexOfFirst false
        }

        it[columnIndex].equals(value, containsModeData, onRaw)
    } else {
        it.any { it.equals(value, containsModeData, onRaw) }
    }
}

fun List<Value>.columnIndex(value: Any, containsModeData: ContainsModeData = ContainsModeData.FULL, onRaw: (Value) -> Any? = { it }) = indexOfFirst {
    it.equals(value, containsModeData, onRaw)
}

private fun Value.equals(other: Any, containsModeData: ContainsModeData, onRaw: (Value) -> Any? = { it }) = when(containsModeData.mode) {
    ContainsMode.FULL -> onRaw(this) == other
    ContainsMode.PATH -> {
        val value = onRaw(this)
        value is String && other is String && value.contains(other, ignoreCase = containsModeData.ignoreCase)
    }
    ContainsMode.START_WITH -> {
        val value = onRaw(this)
        value is String && other is String && value.startsWith(other, ignoreCase = containsModeData.ignoreCase)
    }
    ContainsMode.END_WITH -> {
        val value = onRaw(this)
        value is String && other is String && value.endsWith(other, ignoreCase = containsModeData.ignoreCase)
    }
    ContainsMode.MATCH -> {
        val value = onRaw(this)
        value is String && other is String && value.matches(other.toRegex())
    }
}