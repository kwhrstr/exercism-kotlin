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
        if (ans == ""){
            /* Int -> Stringへ変換
            * プログラミング言語は数値123
            * と文字列"123"で別物
            * golangではやり方が違うので調べること
            * 検索例: go int string
            */
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