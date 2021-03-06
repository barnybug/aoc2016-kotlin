package aoc2016

import org.junit.Assert
import org.junit.Test

internal class Day20Test {
    @Test
    fun `part 1 examples`() {
        Assert.assertEquals(0, Day20("").answer1())
    }

    @Test
    fun `part 1`() {
        Assert.assertEquals(0, Day20(Inputs.readText(20)).answer1())
    }

    @Test
    fun `part 2 examples`() {
        Assert.assertEquals(0, Day20("").answer2())
    }

    @Test
    fun `part 2`() {
        Assert.assertEquals(0, Day20(Inputs.readText(20)).answer2())
    }
}