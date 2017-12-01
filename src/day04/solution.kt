package day04

class Solution : utils.Solution() {
    val regex = """^(.+)-(\d+)\[(.{5})\]""".toRegex()

    override fun answer1() =
        inputLines().sumBy { line ->
            val m = regex.find(line)!!
            val (name, sector, checksum) = m.destructured
            val n = name.replace("-", "")
            val x = n.groupBy { it }
                    .map { it.key to it.value.size }
                    .sortedBy { it.first }
                    .sortedByDescending { it.second }
                    .take(5)
                    .joinToString("") { it.first.toString() }
            if (x == checksum) sector.toInt() else 0
        }

    private val alphabet = ('a'..'z').joinToString("")

    private fun decode(name: String, s: Int) = name.map {
        if (it == '-') '-' else alphabet[(it-'a'+s)%26]
    }.joinToString("")

    override fun answer2() =
        inputLines().mapNotNull { line ->
            val (name, sector, _) = regex.find(line)!!.destructured
            if (decode(name, sector.toInt()) == "northpole-object-storage")
                sector
            else
                null
        }.first()

}

fun main(args: Array<String>) {
    Solution().run()
}

