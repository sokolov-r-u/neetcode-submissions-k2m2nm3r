class Solution {
//two pointers
fun maxArea(heights: IntArray): Int {
    var maxV = 0
    var leftP = 0
    var rightP = heights.size - 1
    while (leftP < rightP) {
        val leftHeight = heights[leftP]
        val rightHeight = heights[rightP]
        val height = minOf(leftHeight, rightHeight)
        maxV = maxOf(maxV, height * (rightP - leftP))
        if (leftHeight < rightHeight) {
            leftP++
        } else {
            rightP--
        }
    }
    return maxV
}
}
