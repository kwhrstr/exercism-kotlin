object Raindrops {
    fun convert(n: Int): String {
        val conv = { i:Int -> when (i) {
            3 -> "Pling"
            5 -> "Plang"
            7 -> "Plong"
            else -> "" }
        }
        val song = sequenceOf(3, 5, 7)
            .filter { n % it == 0 }
            .fold(""){acc, i -> acc + conv(i) }
        return song.ifEmpty {
            n.toString()
        }
    }
}
