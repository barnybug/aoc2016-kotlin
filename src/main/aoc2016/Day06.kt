package aoc2016

class Day06(private val input: String) {
    private val lines = input.split("\n")
    private val length = lines[0].length

    fun answer1() = (0 until length).map { i ->
        lines.map { line -> line[i] }
                .groupBy { it }
                .map { it.key to it.value.size }
                .sortedByDescending { it.second }
                .first().first
    }.joinToString("")

    fun answer2() =(0 until length).map { i ->
        lines.map { line -> line[i] }
                .groupBy { it }
                .map { it.key to it.value.size }
                .sortedBy { it.second }
                .first().first
    }.joinToString("")
}