package aoc2016

import org.junit.Assert
import org.junit.Test

class Day04Test {
    @Test
    fun `part 1 examples`() {
        Assert.assertEquals(123, Day04("aaaa-bbb-z-y-x-123[abxyz]").answer1())
        Assert.assertEquals(987, Day04("a-b-c-d-e-f-g-h-987[abcde]").answer1())
        Assert.assertEquals(404, Day04("not-a-real-room-404[oarel]").answer1())
        Assert.assertEquals(0, Day04("totally-real-room-200[decoy]").answer1())
    }

    @Test
    fun `part 1`() {
        Assert.assertEquals(185371, Day04(Inputs.readText(4)).answer1())
    }

    @Test
    fun `part 2`() {
        Assert.assertEquals(984, Day04(Inputs.readText(4)).answer2())
    }
}