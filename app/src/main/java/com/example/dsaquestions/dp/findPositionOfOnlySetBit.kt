package com.example.dsaquestions.dp

fun findPositionOfOnlySetBit(n: Int): Int {
    // Check if n is a power of 2
    if (n > 0 && (n and (n - 1)) == 0) {
        // Count the trailing zeros to get the position of the only set bit
        return n.countTrailingZeroBits()
    }
    return -1  // Return -1 if the number is not a power of 2
}

fun main() {
    val number = 16
    val position = findPositionOfOnlySetBit(number)
    if (position != -1) {
        println("Position of the only set bit in $number is $position.")
    } else {
        println("$number is not a power of 2.")
    }
}
