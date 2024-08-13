package com.example.dsaquestions.String

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    return s.toCharArray().sorted() == t.toCharArray().sorted()
}

fun main() {
    val s = "anagram"
    val t = "nagaram"

    if (isAnagram(s, t)) {
        println("The strings are anagrams.")
    } else {
        println("The strings are not anagrams.")
    }
}
