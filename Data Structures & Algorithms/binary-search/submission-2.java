class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length);
    }

    public int binarySearch(int[] nums, int target, int low, int high) {
        int middle = low + (high - low) / 2;
       if (low >= high || middle < 0 || middle >= nums.length) {
        return -1;
       }
        if (nums[middle] == target) {
        return middle;
        }
       if (nums[middle] > target) {
        return binarySearch(nums, target, low, middle);
       }
       if (nums[middle] < target) {
        return binarySearch(nums, target, middle + 1, high);
       }
       return -1;
    }
}
