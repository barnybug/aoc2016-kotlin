package aoc2016

import org.junit.Assert
import org.junit.Test

internal class Day22Test {
    @Test
    fun `part 1 examples`() {
        Assert.assertEquals(0, Day22("").answer1())
    }

    @Test
    fun `part 1`() {
        Assert.assertEquals(0, Day22(Inputs.readText(22)).answer1())
    }

    @Test
    fun `part 2 examples`() {
        Assert.assertEquals(0, Day22("").answer2())
    }

    @Test
    fun `part 2`() {
        Assert.assertEquals(0, Day22(Inputs.readText(22)).answer2())
    }
}