package com.example.dsaquestions.Array

import kotlin.math.max
import kotlin.math.min


fun maxProfit(prices: IntArray): Int {
    // Write your code here.
    var maxProfit = 0
    var mini = prices[0]//buy price
    for (i in 1 until prices.size) {
        val curProfit = prices[i] - mini//selling price- buy pricing
        maxProfit = max(maxProfit.toDouble(), curProfit.toDouble()).toInt()
        mini = min(mini.toDouble(), prices[i].toDouble()).toInt()

    }
    return maxProfit
}
fun main() {
    val prices1 = intArrayOf(7, 1, 5, 3, 6, 4)


    println(maxProfit(prices1)) // Output: 5

}