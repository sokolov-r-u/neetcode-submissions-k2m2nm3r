class Solution {
fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var result = 1
    var currentMax: Int
    val set = nums.toSet()

    for (num in set) {
        if (num - 1 in set) {
            continue
        }
        currentMax = 1
        var valueToSearch = num + 1
        while (valueToSearch in set) {
            valueToSearch++
            currentMax++
        }
        result = maxOf(result, currentMax)
    }
    return result
}
}
