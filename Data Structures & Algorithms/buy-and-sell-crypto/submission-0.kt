class Solution {
    // two pointers
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var leftP = 0
        var rightP = 1
        while (rightP < prices.size) {
            maxProfit = maxOf(maxProfit, prices[rightP] - prices[leftP])
            if (prices[rightP] < prices[leftP]) {
                leftP = rightP
            }
                rightP++
        }
        return maxProfit
    }
}
