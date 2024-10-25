package ru.raysmith.google.sheets.utils

import com.google.api.services.sheets.v4.model.ValueRange
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.time.Duration

private val defaultLocalDateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
private val defaultLocalTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

@JvmInline
value class Value(val value: Any) {
    val asString get() = value as String
    val asInt get() = asString.toInt()
    val asLong get() = asString.toLong()
    val asDouble get() = asString.toDouble()
    val asCurrency get() = asString
    val asScientific get() = asDouble
    val asPercent get() = asString.dropLast(1).toDouble()
    val asBigDecimal get() = BigDecimal(asString)

    val asLocalDate get() = asLocalDate(defaultLocalDateFormatter)
    fun asLocalDate(formatter: DateTimeFormatter) = LocalDate.parse(asString, formatter)

    val asLocalTime get() = asLocalTime(defaultLocalTimeFormatter)
    fun asLocalTime(formatter: DateTimeFormatter) = LocalTime.parse(asString, formatter)

    val asDuration: Duration
        get() {
            val paths = asString.split(":")
            val hoursPart = paths.getOrNull(0)?.toDoubleOrNull() ?: 0.0
            val minutesPart = paths.getOrNull(1)?.toDoubleOrNull() ?: 0.0
            val secondsPart = paths.getOrNull(2)?.toDoubleOrNull() ?: 0.0

            val totalSeconds = hoursPart * 3600 + minutesPart * 60 + secondsPart

            var remainingSeconds = totalSeconds

            val days = (remainingSeconds / (24 * 3600)).toInt()
            remainingSeconds %= (24 * 3600)

            val hours = (remainingSeconds / 3600).toInt()
            remainingSeconds %= 3600

            val minutes = (remainingSeconds / 60).toInt()
            remainingSeconds %= 60

            val seconds = remainingSeconds

            val durationString = buildString {
                append("P")
                if (days > 0) append("${days}D")
                if (hours > 0 || minutes > 0 || seconds > 0) {
                    append("T")
                    if (hours > 0) append("${hours}H")
                    if (minutes > 0) append("${minutes}M")
                    if (seconds > 0) {
                        append("${seconds}S")
                    }
                }
            }.ifEmpty { "PT0S" }

            return Duration.parse(durationString)
        }

    val asMultiselect: List<String> get() {
        val result = mutableListOf<String>()
        val sb = StringBuilder()
        var insideQuotes = false

        for (char in asString) {
            when (char) {
                '"' -> {
                    insideQuotes = !insideQuotes
                }
                ',' -> {
                    if (insideQuotes) {
                        sb.append(char)
                    } else {
                        result.add(sb.toString().trim())
                        sb.clear()
                    }
                }
                else -> {
                    sb.append(char)
                }
            }
        }
        result.add(sb.toString().trim())
        return result
    }

    override fun toString(): String {
        return value as String
    }
}

fun ValueRange.getValues() = getValues().map { it.map { v -> Value(v) } }