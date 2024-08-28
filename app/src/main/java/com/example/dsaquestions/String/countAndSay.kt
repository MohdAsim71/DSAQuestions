package com.example.dsaquestions.String

fun countAndSay(n: Int): String {
    if (n == 1) return "1"

    var result = "1"
    for (i in 2..n) {
        result = getNextTerm(result)
    }
    return result
}

private fun getNextTerm(term: String): String {
    val sb = StringBuilder()
    var count = 1
    for (i in 1 until term.length) {
        if (term[i] == term[i - 1]) {
            count++
        } else {
            sb.append(count).append(term[i - 1])
            count = 1
        }
    }
    // Append the last group
    sb.append(count).append(term[term.length - 1])
    return sb.toString()
}

// Example usage
fun main() {
    val n = 5
    println("The $n-th term in the Count and Say sequence is: ${countAndSay(n)}")
}
