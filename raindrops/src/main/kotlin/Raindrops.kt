object Raindrops {

    fun convert(n: Int): String {
        var ans = ""
        if (n % 3 == 0) {
            ans += "Pling"
        }
        if (n % 5 == 0) {
            ans += "Plang"
        }
        if (n % 7 == 0) {
            ans += "Plong"
        }
        if (ans.isEmpty()){
            ans = n.toString()
        }
        return ans
    }
}



//Another solution
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
    return if (song.isEmpty()){
        n.toString()
    } else {
        song
    }
}