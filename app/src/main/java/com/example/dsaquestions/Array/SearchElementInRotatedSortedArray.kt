package com.example.dsaquestions.Array

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (nums[mid] == target) {
            return mid
        }

        // Determine which part of the array is sorted
        if (nums[left] <= nums[mid]) {
            // Left part is sorted
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        } else {
            // Right part is sorted
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
    }

    // Element not found
    return -1
}

fun main() {
    val nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
    val target = 0
    val result = search(nums, target)

    if (result != -1) {
        println("Element found at index: $result")
    } else {
        println("Element not found")
    }
}
