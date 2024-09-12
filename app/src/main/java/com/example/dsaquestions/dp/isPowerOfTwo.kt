package com.example.dsaquestions.dp

fun isPowerOfTwo(n: Int): Boolean {
    // Check if n is greater than 0 and has only one bit set
    return n > 0 && (n and (n - 1)) == 0
}

fun main() {
    val number = 16
    if (isPowerOfTwo(number)) {
        println("$number is a power of 2.")
    } else {
        println("$number is not a power of 2.")
    }
}
