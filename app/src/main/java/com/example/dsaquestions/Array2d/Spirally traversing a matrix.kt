package com.example.dsaquestions.Array2d

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val result = mutableListOf<Int>()

    if (matrix.isEmpty() || matrix[0].isEmpty()) return result

    var top = 0
    var bottom = matrix.size - 1
    var left = 0
    var right = matrix[0].size - 1

    while (top <= bottom && left <= right) {
        // Traverse from left to right across the top row
        for (i in left..right) {
            result.add(matrix[top][i])
        }
        top++

        // Traverse down the right column
        for (i in top..bottom) {
            result.add(matrix[i][right])
        }
        right--

        if (top <= bottom) {
            // Traverse from right to left across the bottom row
            for (i in right downTo left) {
                result.add(matrix[bottom][i])
            }
            bottom--
        }

        if (left <= right) {
            // Traverse up the left column
            for (i in bottom downTo top) {
                result.add(matrix[i][left])
            }
            left++
        }
    }

    return result
}

// Example usage
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    val result = spiralOrder(matrix)
    println("Spiral order of the matrix: $result")
}
