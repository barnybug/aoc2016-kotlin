package aoc2016

import org.junit.Test
import org.junit.Assert.assertEquals

class Day01Test {
    @Test
    fun `part 1 examples`() {
        assertEquals(5, Day01("R2, L3").answer1())
        assertEquals(2, Day01("R2, R2, R2").answer1())
        assertEquals(12, Day01("R5, L5, R5, R3").answer1())
    }

    @Test
    fun `part 1`() {
        assertEquals(279, Day01(Inputs.readText(1)).answer1())
    }

    @Test
    fun `part 2 examples`() {
        assertEquals(4, Day01("R8, R4, R4, R8").answer2())
    }

    @Test
    fun `part 2`() {
        assertEquals(163, Day01(Inputs.readText(1)).answer2())
    }
}