package day01

import utils.Pos
import kotlin.coroutines.experimental.buildSequence

class Solution : utils.Solution() {
    private fun walk() = buildSequence {
        var current = Pos(0, 0)
        var dir = Pos.D
        inputText().split(", ").forEach { s ->
            val n = s.substring(1).toInt()
            dir = if (s[0] == 'R') dir.clockwise else dir.anticlockwise
            for (i in 1..n) {
                current += dir
                yield(current)
            }
        }
    }

    override fun answer1() =
        walk().last().size

    override fun answer2(): String {
        var s = HashSet<Pos>()
        for (pos in walk()) {
            if (s.contains(pos)) {
                return pos.size.toString()
            }
            s.add(pos)
        }
        return ""
    }
}

fun main(args: Array<String>) {
    Solution().run()
}
