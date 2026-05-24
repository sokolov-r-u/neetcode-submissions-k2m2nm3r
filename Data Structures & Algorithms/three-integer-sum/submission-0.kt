class Solution {
//brute force
fun threeSum(nums: IntArray): List<List<Int>> {
    if (nums.size < 3) return emptyList()
    val result: MutableMap<String, List<Int>> = mutableMapOf()
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            for (k in j + 1 until nums.size) {
                if ((nums[i] + nums[j] + nums[k]) == 0) {
                    val sortedList = listOf(nums[i], nums[j], nums[k]).sorted()
                    result[sortedList.toString()] = sortedList
                }
            }
        }
    }
    return result.values.toList()
}
}
