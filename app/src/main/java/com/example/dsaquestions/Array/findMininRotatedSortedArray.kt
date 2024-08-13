package com.example.dsaquestions.Array

fun findMin(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        val mid = left + (right - left) / 2

        // If the middle element is greater than the rightmost element,
        // then the minimum is in the right part of the array.
        //note:- if nums[mid]<num[right] means that right portion is sorted then discard the right portion
        // and move to the else part
        if (nums[mid] > nums[right]) {
            left = mid + 1
        }
        // Otherwise, the minimum is in the left part, including the middle element.
        else {
            right = mid
        }
    }

    // The left index will point to the smallest element
    return nums[left]
}

fun main() {
    val nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
    println("The minimum element is: ${findMin(nums)}")
}
