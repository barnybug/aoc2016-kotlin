package aoc2016

import java.io.File

object Inputs {
    fun readText(day: Int) =
            File(javaClass.classLoader.getResource("day${"%02d".format(day)}.txt").toURI())
                    .readText()
}