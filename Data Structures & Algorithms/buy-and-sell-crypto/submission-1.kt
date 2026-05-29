class Solution {
    // dynamic programming
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = prices[0]

        for (i in prices.indices) {
            minPrice = minOf(minPrice, prices[i])
            maxProfit = maxOf(maxProfit, prices[i] - minPrice)

        }
        return maxProfit
    }
}
