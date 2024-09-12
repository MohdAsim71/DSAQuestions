package com.example.dsaquestions.Array
import java.util.*

class MergeIntervals {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {

        if (intervals.size <= 1)
            return intervals

        // Sort by ascending starting point
        intervals.sortWith(Comparator { a, b -> a[0].compareTo(b[0]) })

        val result: MutableList<IntArray> = ArrayList()

        var newInterval = intervals[0]
        result.add(newInterval)

        for (interval in intervals) {
            if (interval[0] <= newInterval[1]) {
                // Overlapping intervals,
                // update the end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1])
            } else {
                // Disjoint intervals,
                // add the new interval to the list
                newInterval = interval
                result.add(newInterval)
            }
        }

        return result.toTypedArray()
    }

}

fun main() {
    val mergeIntervals = MergeIntervals()
    val intervals = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18)
    )

    val merged = mergeIntervals.merge(intervals)
    println("Merged Intervals:")
    for (interval in merged) {
        println("[${interval[0]}, ${interval[1]}]")
    }
}




