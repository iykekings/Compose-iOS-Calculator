package dev.ikeze.calculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun evaluate_works() {
        assertEquals(evaluate("2+2"), "4")
        assertEquals(evaluate("2+2–1"), "3")
        assertEquals(evaluate("2×4÷2–1"), "3")
        assertEquals(evaluate("4%2×5"), "0")
        assertEquals(evaluate("78–5"), "73")
    }
}