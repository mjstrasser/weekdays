package mjs

fun uniqueIds(words: Set<String>): Set<Char>? {
    if (words.isEmpty()) return null

    fun findUnique(word: String, otherWords: Set<String>): Char? {
        word.forEachIndexed { idx, ch ->
            if (otherWords.none { other -> other.length > idx && other[idx] == ch }) return ch
        }
        return null
    }

    return with(words.mapNotNull { word -> findUnique(word, words - word) }) {
        if (size == words.size) toSet() else null
    }
}
