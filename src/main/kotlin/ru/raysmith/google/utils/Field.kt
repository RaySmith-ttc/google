package ru.raysmith.google.utils

interface Field {
    fun getValue(): String
}

abstract class FieldsList<F : Field>(value: String) : Field {
    private var _value: String = value

    internal fun setValue(newValue: String) {
        _value = newValue
    }

    override fun getValue() = _value

    override fun toString(): String = getValue()

    companion object {
        fun <F : Field> of(value: String): FieldsList<F> = object : FieldsList<F>(value) { }
    }
}

internal fun <F : Field> fieldsList(value: String) = object : FieldsList<F>(value) {}

operator fun <T : Field, OT : Field> FieldsList<T>.plus(other: FieldsList<OT>): FieldsList<T> = apply {
    setValue( "${this@plus.getValue()},${other.getValue()}")
}