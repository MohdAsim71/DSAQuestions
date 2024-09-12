package com.example.dsaquestions.dp

fun minBitFlips(start: Int, goal: Int): Int {
    // XOR the start and goal to find differing bits
    val xorResult = start xor goal

    // Count the number of 1s in the binary representation of xorResult
    return xorResult.countOneBits()
}

fun main() {
    val start = 10
    val goal = 7
    println("Minimum bit flips to convert $start to $goal: ${minBitFlips(start, goal)}")
}
