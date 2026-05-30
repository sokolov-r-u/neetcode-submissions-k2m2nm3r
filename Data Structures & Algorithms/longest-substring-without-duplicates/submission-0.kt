class Solution {
    // sliding window
fun lengthOfLongestSubstring(s: String): Int {
    var maxLength = 0
    var leftP = 0
    var rightP = 0
    val freq = IntArray(128)
    while (leftP < s.length) {
        if (rightP == s.length || freq[s[rightP].code] > 0) {
            freq[s[leftP].code]--
            leftP++
            continue
        }
        freq[s[rightP].code]++
        rightP++
        maxLength = maxOf(maxLength, rightP - leftP)
    }
    return maxLength
}
}
