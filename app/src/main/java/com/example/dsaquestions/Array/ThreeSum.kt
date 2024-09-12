package com.example.dsaquestions.Array

fun findTriplets(arr: IntArray, target: Int) {
    val n = arr.size
    arr.sort()  // Step 1: Sort the array

    for (i in 0 until n - 2) {
        var left = i + 1
        var right = n - 1

        while (left < right) {
            val currentSum = arr[i] + arr[left] + arr[right]

            when {
                currentSum == target -> {
                    println("Triplet found: ${arr[i]}, ${arr[left]}, ${arr[right]}")
                    return
                }
                currentSum < target -> left++  // Move left pointer to increase sum
                else -> right--  // Move right pointer to decrease sum
            }
        }
    }

    println("No triplet found")
}

fun main() {
    val arr = intArrayOf(12, 3, 6, 9, 15)
    val target = 24
    findTriplets(arr, target)
}
