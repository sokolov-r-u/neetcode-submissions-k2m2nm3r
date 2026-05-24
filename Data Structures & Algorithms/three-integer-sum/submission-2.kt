class Solution {
//two pointers
fun threeSum(nums: IntArray): List<List<Int>> {
    if (nums.size < 3) return emptyList()
    val result = mutableListOf<List<Int>>()
    val sortedNums = nums.sorted()
    for (i in sortedNums.indices) {
        if (i > 0 && sortedNums[i - 1] == sortedNums[i]) {
            continue
        }
        var leftP = i + 1
        var rightP = sortedNums.size - 1
        while (leftP < rightP) {
            if (leftP - 1 > i && sortedNums[leftP - 1] == sortedNums[leftP]) {
                leftP++
                continue
            }
            if (rightP + 1 < sortedNums.size && sortedNums[rightP + 1] == sortedNums[rightP]) {
                rightP--
                continue
            }

            val sum = sortedNums[i] + sortedNums[leftP] + sortedNums[rightP]
            if (sum == 0) {
                result.add(listOf(sortedNums[i], sortedNums[leftP], sortedNums[rightP]))
                leftP++
                continue
            }
            if (sum < 0) {
                leftP++
                continue
            }
            rightP--
        }
    }
    return result
}
}
