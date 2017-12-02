package aoc2016

import org.junit.Assert
import org.junit.Test

internal class Day06Test {
    private val testinput = "eedadn\ndrvtee\neandsr\nraavrd\natevrs\ntsrnev\nsdttsa\nrasrtv\nnssdts\nntnada\nsvetve\ntesnvt\nvntsnd\nvrdear\ndvrsen\nenarar"

    @Test
    fun `part 1 examples`() {
        Assert.assertEquals("easter", Day06(testinput).answer1())
    }

    @Test
    fun `part 1`() {
        Assert.assertEquals("qtbjqiuq", Day06(Inputs.readText(6)).answer1())
    }

    @Test
    fun `part 2 examples`() {
        Assert.assertEquals("advent", Day06(testinput).answer2())
    }

    @Test
    fun `part 2`() {
        Assert.assertEquals("akothqli", Day06(Inputs.readText(6)).answer2())
    }
}