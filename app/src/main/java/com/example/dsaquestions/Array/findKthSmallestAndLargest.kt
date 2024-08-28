package com.example.dsaquestions.Array

import java.util.PriorityQueue


internal object Solution {
    fun kth_Largest_MaxHeap(arr: IntArray, k: Int) {
        val pq = PriorityQueue { a: Int, b: Int -> b - a }

        val n = arr.size

        for (i in arr.indices) {
            pq.add(arr[i])
        }

        var f = k - 1

        while (f > 0) {
            pq.remove()
            f--
        }

        println("Kth Largest element " + pq.peek())
    }

    fun kth_Smallest_MinHeap(arr: IntArray, k: Int) {
        val pq = PriorityQueue<Int>()
        val n = arr.size

        for (i in 0 until n) {
            pq.add(arr[i])
        }

        var f = k - 1

        while (f > 0) {
            pq.remove()
            f--
        }

        println("Kth Smallest element " + pq.peek())
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 6, 4, 5, 3)

        kth_Largest_MaxHeap(arr, 3)
        kth_Smallest_MinHeap(arr, 3)
    }
}