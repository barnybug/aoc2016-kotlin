package day02

import utils.Pos

class Solution : utils.Solution() {
    private fun walk(board: List<String>): String {
        val moves = mapOf('L' to Pos.L, 'R' to Pos.R, 'U' to Pos.U, 'D' to Pos.D)
        val range = Pos(0,0)..Pos(board[0].length, board.size)
        val bs = range.associate { p -> p to board[p.y][p.x] }.filterValues { it != ' ' }
        val initial = bs.filterValues { it == '5' }.keys.first()
        val codes = inputLines().map { line ->
            val end = line.fold(initial) { pos, ch ->
                val n = pos + moves[ch]!!
                if (bs.contains(n)) n else pos
            }
            bs[end]
        }
        return codes.joinToString("")
    }

    override fun answer1() = walk(listOf("123", "456", "789"))
    override fun answer2() = walk(listOf("  1  ", " 234 ", "56789", " ABC ", "  D  "))
}

fun main(args: Array<String>) {
    Solution().run()
}

