package mjs

fun uniqueIds(words: Set<String>): Set<Char> {

    fun findUnique(word: String, otherWords: Set<String>): Char {

        word.forEachIndexed { idx, ch ->
            if (otherWords.none { other -> other.length > idx && other[idx] == ch }) {
                return ch
            }
        }
        return '.'
    }

    return words.map { word -> findUnique(word, words - word) }.toSet()
}
