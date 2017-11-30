package day1

import java.io.File
import kotlin.coroutines.experimental.buildSequence

fun walk(text: String) = buildSequence {
    var x = 0
    var y = 0
    var dx = 0
    var dy = 1
    text.split(", ").forEach { s ->
        val n = s.substring(1).toInt()
        when(s[0]) {
            'R' -> dx = dy.also { dy = -dx }
            'L' -> dx = -dy.also { dy = dx }
        }
        for (i in 1..n) {
            y += dy
            x += dx
            yield(Pair(x, y))
        }
    }
}

fun main(args: Array<String>) {
    val text = File("src/day1/input.txt").readText()
    val (x, y) = walk(text).last()
    println("Answer 1: ${Math.abs(x)+Math.abs(y)}")

    var s = HashSet<Pair<Int,Int>>()
    for (pos in walk(text)) {
        if (s.contains(pos)) {
            println("Answer 2: ${Math.abs(pos.first)+Math.abs(pos.second)}")
            break
        }
        s.add(pos)
    }
}