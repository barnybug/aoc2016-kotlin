package aoc2016

import kotlin.coroutines.experimental.buildSequence

class Day01(private val input: String) {
    private fun walk() = buildSequence {
        var current = Pos(0, 0)
        var dir = Pos.D
        input.split(", ").forEach { s ->
            val n = s.substring(1).toInt()
            dir = if (s[0] == 'R') dir.clockwise else dir.anticlockwise
            for (i in 1..n) {
                current += dir
                yield(current)
            }
        }
    }

    fun answer1() =
        walk().last().size

    fun answer2(): Int {
        val s = HashSet<Pos>()
        for (pos in walk()) {
            if (s.contains(pos)) {
                return pos.size
            }
            s.add(pos)
        }
        return 0
    }
}
