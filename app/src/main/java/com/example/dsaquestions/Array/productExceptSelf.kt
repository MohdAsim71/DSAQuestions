package com.example.dsaquestions.Array


fun productExceptSelf(nums: IntArray): IntArray {
    val left = IntArray(nums.size)
    val right = IntArray(nums.size)

    left[0] = 1
    for (i in 1 until nums.size) {
        left[i] = left[i - 1] * nums[i - 1]
    }

    right[nums.size - 1] = 1
    for (i in nums.size - 2 downTo 0) {
        right[i] = right[i + 1] * nums[i + 1]
    }

    val ans = IntArray(nums.size)
    for (i in nums.indices) {
        ans[i] = left[i] * right[i]
    }

    return ans
}


fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val result = productExceptSelf(nums)
    println(result.joinToString(", "))  // Output: 24, 12, 8, 6
}