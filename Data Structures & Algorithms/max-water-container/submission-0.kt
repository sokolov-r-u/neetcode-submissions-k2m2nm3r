class Solution {
//brute force
fun maxArea(heights: IntArray): Int {
    var maxV = 0
    for (i in heights.indices) {
        for (j in i + 1 until heights.size) {
            val height = minOf(heights[i], heights[j])
            maxV = maxOf(maxV,  height * (j - i))
        }
    }
    return maxV
}
}
