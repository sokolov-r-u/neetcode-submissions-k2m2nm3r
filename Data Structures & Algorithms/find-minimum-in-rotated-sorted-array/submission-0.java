class Solution {
    public int findMin(int[] nums) {
        if (nums.length < 1) return -1;
        if (nums.length == 1) return nums[0];
        Integer result = searchSplit(nums, 0, nums.length - 1);
        return Math.min(nums[0], result);
    }

    private int searchSplit(int[] nums, int start, int end) {
        if (start == end - 1) {
            return Math.min(nums[0], nums[end]);
        }
        int mid = (end + start) /  2;
        int result;        
  
        if (nums[0] > nums[mid]) {
            result = searchSplit(nums, start, mid);
        } else {
            result = searchSplit(nums, mid, end);
        }
        return result;
    }
}

