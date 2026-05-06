class Solution {
fun productExceptSelf(nums: IntArray): IntArray {
    val output = IntArray(nums.size) { 1 }

    var prefixSum = 1
    var suffixSum = 1
    for (idx in 1..<nums.size) {
        prefixSum *= nums[idx - 1]
        output[idx] = output[idx] * prefixSum

        suffixSum *= nums[nums.size - idx]
        val suffixIdx =  nums.size - idx - 1
        output[suffixIdx] = output[suffixIdx] * suffixSum
    }
    return output
}
}
