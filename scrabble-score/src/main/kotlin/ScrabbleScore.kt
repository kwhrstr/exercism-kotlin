object ScrabbleScore {
    /*
    * go の場合は引数はruneを使うこと
    * runeが何者かは調べてね
    * 簡単にいうと2バイト文字に対しても文字単位で切り分けされたもの
    * 2バイト文字はどんなものかというと日本語とか全角文字列のこと
    * "aあiいu"を切り分けると[あ, a, い, u]
    * だが適当にやると変な切り方になるがruneでやると
    * 切り分けがうまくいく
    * 昔の言語とかではここら辺が面倒だから日本語を嫌ったりする人もいる
    * */
    fun scoreLetter(c: Char): Int {
        /*
         * 文字列が含まれているかのチェック
         * go string contains runeとかで検索してね
         * */
        if ("AEIOULNRST".contains(c)){
            return 1
        }
        if ("DG".contains(c)) {
            return 2
        }
        if ("BCMP".contains(c)) {
            return 3
        }
        if ("FHVWY".contains(c)) {
            return 4
        }
        if ("K".contains(c)) {
            return 5
        }
        if ("JX".contains(c)) {
            return 8
        }
        if ("QZ".contains(c)) {
            return 10
        }
        return 9
    }

    fun scoreWord(word: String): Int {
        var ans = 0
        /*
        * loop処理
        * go for loop stringとかで調べてね
        * 文字列をloopならmaze-goでも使ってるから参考にしてね
        * */
        for (c in word) {
            /*
            * 文字列を大文字に変換している
            * これはgo string toUpperとかで調べてね
            * */
            ans += scoreLetter(c.toUpperCase())
        }
        return ans
    }
}
