class Solution {
fun isPalindrome(s: String): Boolean {
    val normalized = s.filter { it.isLetterOrDigit() }
        .lowercase()
    val length = normalized.length
    if (length == 0) return true
    for (i in 0..length / 2) {
        if (normalized[i] != normalized[length - 1 - i]) {
            return false
        }
    }
    return true
}
}
