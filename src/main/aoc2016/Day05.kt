package aoc2016

import java.security.MessageDigest

class Day05(private val input: String) {
    private val md5 = MessageDigest.getInstance("MD5")

    fun answer1() = (0..Int.MAX_VALUE).asSequence().mapNotNull { i ->
        val h = md5.digest("$input$i".toByteArray())
        if (h[0] == 0.toByte() && h[1] == 0.toByte() && (h[2].toInt() and 0xf0) == 0)
            Integer.toHexString(h[2].toInt())
        else
            null
    }.take(8).joinToString("")

    fun answer2() = (0..Int.MAX_VALUE).asSequence().mapNotNull { i ->
        val h = md5.digest("$input$i".toByteArray())
        if (h[0] == 0.toByte() && h[1] == 0.toByte() && h[2] >= 0 && h[2] < 8)
            h[2].toInt() to Integer.toHexString(h[3].toInt() shr 4 and 0xf)
        else
            null
    }.distinctBy { it.first }.take(8).sortedBy { it.first }.map { it.second }.joinToString("")

}
