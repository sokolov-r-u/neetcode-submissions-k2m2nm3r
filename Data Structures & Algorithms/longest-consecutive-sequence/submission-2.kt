class Solution {
// map realization
fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var result = 1
    val map = hashMapOf<Int, Int>()

    for (num in nums) {
        if (num in map) continue

        val left = map[num - 1] ?: 0
        val right = map[num + 1] ?: 0
        val length = left + right + 1
        map[num] = length
        map[num - left] = length
        map[num + right] = length
        result = maxOf(result, length)
    }
    return result
}
}
