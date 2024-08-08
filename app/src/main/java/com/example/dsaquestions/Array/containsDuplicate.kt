package com.example.dsaquestions.Array


fun containsDuplicate(nums: IntArray): Boolean {
    val seen = HashSet<Int>()

    for (num in nums) {
        if (!seen.add(num)) {
            // If add returns false, it means the element is already in the set
            return true
        }
    }

    return false
}

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 1)
    val nums2 = intArrayOf(1, 2, 3, 4)
    val nums3 = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)

    println(containsDuplicate(nums1)) // Output: true
    println(containsDuplicate(nums2)) // Output: false
    println(containsDuplicate(nums3)) // Output: true
}
