class Solution {
//brute force
fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    nums.sort()
    var result = 1
    var currentMax = 1
    for (idx in 1..<nums.size) {
        if (nums[idx] == nums[idx - 1]) {
            continue
        } else if (nums[idx] == nums[idx - 1] + 1) {
            currentMax++
        } else { // sequence was broken
            result = maxOf(result, currentMax)
            currentMax = 1
        }
    }
    return maxOf(result, currentMax)
}
}
