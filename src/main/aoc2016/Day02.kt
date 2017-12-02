package aoc2016

class Day02(private val input: String) {
    private fun walk(board: List<String>): String {
        val moves = mapOf('L' to Pos.L, 'R' to Pos.R, 'U' to Pos.U, 'D' to Pos.D)
        val range = Pos(0,0)..Pos(board[0].length, board.size)
        val bs = range.associate { p -> p to board[p.y][p.x] }.filterValues { it != ' ' }
        var pos = bs.filterValues { it == '5' }.keys.first()
        val codes = input.split("\n").map { line ->
            pos = line.fold(pos) { pos, ch ->
                println(ch)
                val n = pos + moves[ch]!!
                if (bs.contains(n)) n else pos
            }
            bs[pos]
        }
        return codes.joinToString("")
    }

    fun answer1() = walk(listOf("123", "456", "789"))
    fun answer2() = walk(listOf("  1  ", " 234 ", "56789", " ABC ", "  D  "))
}
