package com.example.dsaquestions.patterns.twopointer

/**
 * Two Sum II - Input Array Is Sorted
 *
 * Given a 1-indexed integer array `numbers` sorted in non-decreasing order
 * and an integer `target`, find two numbers whose sum equals `target`.
 *
 * Return their 1-based indices as an IntArray [index1, index2], where:
 * - 1 <= index1 < index2 <= numbers.size
 * - The same element cannot be used twice.
 * - Exactly one solution exists.
 * - The solution must use O(1) extra space.
 *
 * Example 1:
 * Input: numbers = [2, 7, 11, 15], target = 9
 * Output: [1, 2]
 *
 * Example 2:
 * Input: numbers = [2, 3, 4], target = 6
 * Output: [1, 3]
 *
 * Example 3:
 * Input: numbers = [-1, 0], target = -1
 * Output: [1, 2]
 *
 * Constraints:
 * - 2 <= numbers.size <= 30,000
 * - -1000 <= numbers[i] <= 1000
 * - numbers is sorted in non-decreasing order.
 * - -1000 <= target <= 1000
 * - Exactly one solution exists.
 *
 * Follow-up:
 * Can you solve this in O(n) time and O(1) extra space?
 *
 * Hint:
 * Since the array is sorted, consider using two pointers:
 * one starting from the beginning and one from the end.
 */
fun main() {
    val numbers = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = twoSum(numbers, target)

    println(result.joinToString(", "))
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var i = 0
    var j = numbers.size - 1

    while (i < j) {
        val sum = numbers[i] + numbers[j]

        if (sum == target) {
            return intArrayOf(i, j)
        } else if (sum > target) {
            j--
        } else {
            i++
        }
    }

    return intArrayOf()
}