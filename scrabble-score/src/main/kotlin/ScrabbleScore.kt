object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
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
        for (c in word.toUpperCase()) {
            ans += scoreLetter(c)
        }
        return ans
    }
}
