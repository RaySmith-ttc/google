package ru.raysmith.google.test.sheets

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class UtilsTests {

    @Test
    fun getGoogleSheetColumnsRange() {
        ru.raysmith.google.sheets.utils.getGoogleSheetColumnsRange("A", "A") shouldBe 0..1
        ru.raysmith.google.sheets.utils.getGoogleSheetColumnsRange("B", "C") shouldBe 1..3
    }
}