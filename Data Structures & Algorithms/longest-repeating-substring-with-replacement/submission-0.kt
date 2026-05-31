class Solution {
fun characterReplacement(s: String, k: Int): Int {
    var maxLength = 0
    val count = IntArray(26)
    var maxFreq = 0
    var left = 0
    for (right in s.indices) {
        val windowLength = right - left + 1
        count[s[right] - 'A']++
        maxFreq = maxOf(maxFreq, count[s[right] - 'A'])
        if (maxFreq + k >= windowLength){
            maxLength = maxOf(maxLength, windowLength)
        } else {
            count[s[left] - 'A']--
            left++
        }
    }
    return maxLength
}
}
