package aoc2016

import org.junit.Assert
import org.junit.Test

class Day03Test {
    @Test
    fun `part 1 examples`() {
        Assert.assertEquals(0, Day03("5 10 25").answer1())
    }

    @Test
    fun `part 1`() {
        Assert.assertEquals(1032, Day03(Inputs.readText(3)).answer1())
    }

    @Test
    fun `part 2`() {
        Assert.assertEquals(1838, Day03(Inputs.readText(3)).answer2())
    }
}