package aoc2016

import org.junit.Test
import org.junit.Assert.assertEquals

class Day02Test {
    @Test
    fun `part 1 examples`() {
        assertEquals("1985", Day02("ULL\nRRDDD\nLURDL\nUUUUD").answer1())
    }

    @Test
    fun `part 1`() {
        assertEquals("56855", Day02(Inputs.readText(2)).answer1())
    }

    @Test
    fun `part 2 examples`() {
        assertEquals("5DB3", Day02("ULL\nRRDDD\nLURDL\nUUUUD").answer2())
    }

    @Test
    fun `part 2`() {
        assertEquals("B3C27", Day02(Inputs.readText(2)).answer2())
    }
}