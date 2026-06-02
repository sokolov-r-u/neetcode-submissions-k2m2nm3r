class Solution {
fun minWindow(s: String, t: String): String {
    var result = ""
    var left = 0
    val count = IntArray(128)
    for (i in t.indices) {
        count[t[i].code]--
    }

    for (right in s.indices) {
        count[s[right].code]++
        var containsAll = true
        for (i in t.indices) {
            if (count[t[i].code] < 0) containsAll = false
        }
        if (containsAll) {
            while (count[s[left].code] > 0) {
                count[s[left].code]--
                left++
            }
            if (result.isEmpty() || result.length > right - left + 1) {
                result = s.substring(left, right + 1)
            }
        }
    }
    return result
}
}
