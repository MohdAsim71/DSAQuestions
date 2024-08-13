package com.example.dsaquestions.String

fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val anagramsMap = mutableMapOf<String, MutableList<String>>()

    for (word in strs) {
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (anagramsMap.containsKey(sortedWord)) {
            anagramsMap[sortedWord]?.add(word)
        } else {
            val newList = mutableListOf(word)
            anagramsMap[sortedWord] = newList
        }
    }

    return anagramsMap.values.toList()
}

fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val groupedAnagrams = groupAnagrams(strs)

    println("Grouped anagrams: $groupedAnagrams")
}
