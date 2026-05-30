class Solution {
    // sliding window (optimized)
fun lengthOfLongestSubstring(s: String): Int {
    val lastIndex = IntArray(128) { -1 }
    var maxLength = 0
    var left = 0
    for (right in s.indices) {
        if (lastIndex[s[right].code] != -1) {
            left = maxOf(lastIndex[s[right].code] + 1, left)
        }
        lastIndex[s[right].code] = right
        maxLength = maxOf(maxLength, right - left + 1)
    }
    return maxLength
}
}
