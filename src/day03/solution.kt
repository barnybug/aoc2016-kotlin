package day03

class Solution : utils.Solution() {
    private fun parsed() = inputLines().map {
        it.trim().split("""\s+""".toRegex()).map { it.toInt() }
    }

    private fun validFilter(l: List<List<Int>>) = l.filter { (a, b, c) ->
        a + b > c && a + c > b && b + c > a
    }

    override fun answer1() = validFilter(parsed()).count().toString()

    override fun answer2(): Any {
        val lines = parsed()
        val l = (0 until lines.size step 3).flatMap { i ->
            listOf(
                listOf(lines[i][0], lines[i+1][0], lines[i+2][0]),
                listOf(lines[i][1], lines[i+1][1], lines[i+2][1]),
                listOf(lines[i][2], lines[i+1][2], lines[i+2][2])
            )
        }
        return validFilter(l).count()
    }
}

fun main(args: Array<String>) {
    Solution().run()
}

