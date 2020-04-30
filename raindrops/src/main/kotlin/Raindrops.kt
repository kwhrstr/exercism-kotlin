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

        /*
        * 3, 5, 7で割り切れない場合をif文で書くなら
        * if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {}
        * と演算子&&を使う
        * ただしこの問題でこうかくのはあまり適切ではない
        * nが11で割り切れる場合は "Pleng"を足すようにと言われたとき
        * if (n % 11 != 0){}
        * と
        * if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0　&& n % 11 != 0) {}
        * を追加しないといけなくなるこのif文も複雑度が増していく
        * 対して
        * if(ans == "")はansの初期値を""と定義していて,ansの値が何も変更なかった
        * ことを意味する => 今回はif文が全て素通りされたことを意味する => 3, 5, 7割り切れないことを
        * 意味することになる
        * この場合
        * nが11で割り切れる場合は "Pleng"を足すようにと言われたときの条件を追加するとしても
        * if (n % 11 != 0){}だけ追加するだけで良い
        */
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