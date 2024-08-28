package com.example.dsaquestions.Array2d


class SearchA2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rowIdx = searchPotentialRow(matrix, target)
        if (rowIdx != -1) return binarySearchOverRow(rowIdx, matrix, target)
        return false
    }

    private fun searchPotentialRow(matrix: Array<IntArray>, target: Int): Int {
        var low = 0
        var high = matrix.size - 1
        val idx = matrix[0].size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2

            if (matrix[mid][0] <= target && target <= matrix[mid][idx]) {
                return mid
            } else if (matrix[mid][0] < target) low = mid + 1
            else if (matrix[mid][0] > target) high = mid - 1
        }
        return -1
    }

    private fun binarySearchOverRow(rowIdx: Int, matrix: Array<IntArray>, target: Int): Boolean {
        var low = 0
        var high = matrix[rowIdx].size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2

            if (matrix[rowIdx][mid] == target) {
                return true
            } else if (matrix[rowIdx][mid] > target) high = mid - 1
            else low = mid + 1
        }
        return false
    }
}

// Example usage
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 3, 5, 7),
        intArrayOf(10, 11, 16, 20),
        intArrayOf(23, 30, 34, 60)
    )
    val target = 3

    val result = SearchA2DMatrix().searchMatrix(matrix, target)
    println("Target $target found in matrix: $result")
}

