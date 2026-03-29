package com.aqa.interview.calculator

import kotlin.test.Test
import kotlin.test.assertEquals

class ExpressionCalculatorTest {

    private val calculator = calculator()

    @Test
    fun `addition of two integers`() {
        assertEquals("3", calculator.evaluate("1 + 2"))
    }

    @Test
    fun `addition of two integers 2`() {
        assertEquals("6", calculator.evaluate("9999999999 + 4"))
    }
}
