package aoc2016

class Day03(private val input: String) {
    private fun parsed() = input.split("\n").map {
        it.trim().split("""\s+""".toRegex()).map { it.toInt() }
    }

    private fun validFilter(l: List<List<Int>>) = l.filter { (a, b, c) ->
        a + b > c && a + c > b && b + c > a
    }

    fun answer1() = validFilter(parsed()).count()

    fun answer2(): Int {
        val lines = parsed()
        val l = lines.chunked(3).flatMap { (a, b, c) ->
            listOf(
                listOf(a[0], b[0], c[0]),
                listOf(a[1], b[1], c[1]),
                listOf(a[2], b[2], c[2])
            )
        }
        return validFilter(l).count()
    }
}
