package aoc2016

import org.junit.Assert
import org.junit.Test

class Day05Test {
    @Test
    fun `part 1 examples`() {
        Assert.assertEquals("18f47a30", Day05("abc").answer1())
    }

    @Test
    fun `part 1`() {
        Assert.assertEquals("2414bc77", Day05("wtnhxymk").answer1())
    }

    @Test
    fun `part 2`() {
        Assert.assertEquals("437e60fc", Day05("wtnhxymk").answer2())
    }
}