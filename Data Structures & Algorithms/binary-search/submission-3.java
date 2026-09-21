class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length);
    }

    public int binarySearch(int[] nums, int target, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return -1;
        }
        int middle = startIdx + (endIdx - startIdx) / 2;

        if (target < nums[middle]) {
            return binarySearch(nums, target, startIdx, middle);
        }
        if (target > nums[middle]) {
            return binarySearch(nums, target, middle + 1, endIdx);
        }
        return middle;
    }
}
