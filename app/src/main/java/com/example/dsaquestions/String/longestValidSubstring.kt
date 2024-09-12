package com.example.dsaquestions.String

fun longestValidSubstring(word: String, forbidden: List<String>): Int {
    val forbiddenSet = forbidden.toSet()  // Convert forbidden list to a set for quick lookup
    var maxLength = 0
    var start = 0  // Start of the sliding window

    // Iterate over each end of the sliding window
    for (end in word.indices) {
        // Check substrings ending at 'end' and starting from 'start' within the last 10 characters
        for (i in start..end) {
            val substring = word.substring(i, end + 1)
            if (substring in forbiddenSet) {
                // If a forbidden substring is found, move the start to exclude the forbidden part
                start = i + 1
                break  // No need to check further substrings in this window
            }
        }
        // Calculate the current valid substring length
        maxLength = maxOf(maxLength, end - start + 1)
    }

    return maxLength

}

fun main() {
    val word = "abcdabc"
    val forbidden = listOf("abc", "bcd")
    println("Length of the longest valid substring: ${longestValidSubstring(word, forbidden)}")
}
