class Solution {

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false
    val closingParenthesis = mapOf('{' to '}', '(' to ')', '[' to ']')
    val stack = ArrayDeque<Char>()
    for (char in s) {
        if (stack.isNotEmpty() && stack.last() == char) {
            stack.removeLast()
            continue
        }
        if (char !in closingParenthesis) {
            return false
        }
        stack.addLast(closingParenthesis[char]!!)
    }
    return stack.isEmpty()
}
}
