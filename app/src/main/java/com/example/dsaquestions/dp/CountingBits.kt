package com.example.dsaquestions.dp


//class CountingBits {
//    fun countBits(n: Int): IntArray {
//        val result = IntArray(n + 1)
//        for (i in 1..n) {
//            result[i] = result[i shr 1] + (i and 1)
//        }
//        return result
//    }
//}
//
//fun main() {
//    val countingBits = CountingBits()
//    val n = 5  // Example input
//    val result = countingBits.countBits(n)
//    println("Number of 1 bits from 0 to $n: ${result.joinToString(", ")}")
//}


class CountingBits {
    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)
        for (i in 1..n) {
            result[i] = result[i / 2] + (i % 2)
            //i / 2 is the integer division of i by 2.
            //Dividing i by 2 (or right-shifting i by 1) effectively removes the least significant bit.
            //If i is even, the least significant bit is 0.
            //If i is odd, the least significant bit is 1.
        }
        return result
    }
}

fun main() {
    val countingBits = CountingBits()
    val n = 5  // Example input
    val result = countingBits.countBits(n)
    println("Number of 1 bits from 0 to $n: ${result.joinToString(", ")}")

}
