package com.example.dsaquestions.Array

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numToIndex = mutableMapOf<Int, Int>()

    for ((index, num) in nums.withIndex()) {
        val complement = target - num
        if (numToIndex.containsKey(complement)) {
            return intArrayOf(numToIndex[complement]!!, index)
        }
        numToIndex[num] = index
    }

    throw IllegalArgumentException("No two sum solution")
}

fun main() {
    val nums1 = intArrayOf(2, 7, 11, 15)
    val target1 = 9

    println(twoSum(nums1, target1).joinToString(", ")) // Output: 0, 1

}
