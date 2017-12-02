package aoc2016

data class PosRange(override val start: Pos, override val endInclusive: Pos): ClosedRange<Pos>, Iterable<Pos> {
    override fun iterator(): Iterator<Pos> =
        (start.y..endInclusive.y).map { y ->
            (start.x..endInclusive.x).map { x -> Pos(x, y) }
        }.flatten().iterator()
}

data class Pos(val x: Int, val y: Int): Comparable<Pos> {
    override fun compareTo(other: Pos) =
        if (this == other) 0
        else if (x > other.x || x == other.x && y > other.y) 1
        else -1

    operator fun plus(a: Pos) = Pos(x + a.x, y + a.y)

    operator fun minus(a: Pos) = Pos(x - a.x, y - a.y)

    operator fun times(n: Int) = Pos(x*n, y*n)

    operator fun rangeTo(a: Pos) = PosRange(this, a-Pos(1, 1))

    val size: Int
        get() = Math.abs(x) + Math.abs(y)

    val clockwise get() = Pos(y, -x)
    val anticlockwise get() = Pos(-y, x)

    companion object {
        val U = Pos(0, -1)
        val D = Pos(0, 1)
        val L = Pos(-1, 0)
        val R = Pos(1, 0)
    }
}