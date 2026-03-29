package com.aqa.interview.calculator

import java.nio.file.Files
import kotlin.io.path.absolutePathString
import kotlin.io.path.writeText
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
        assertEquals("6", calculator.evaluate("2 + 4"))
    }

    @Test
    fun `addition of two integers 3`() {
        val file = Files.createTempFile("test", "test")
        file.writeText("nothing interesting here")
        val abspath = file.absolutePathString()
        println("##aqa[artifact name='report.txt' path='$abspath']")
    }
}
