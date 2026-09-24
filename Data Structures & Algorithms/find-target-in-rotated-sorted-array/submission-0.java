class Solution {
    public int search(int[] nums, int target) {
        int start = findStart(nums);   
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            int realIdx = (start + m) % nums.length; 
            if (nums[realIdx] == target) {
        return realIdx;
            } else if (nums[realIdx] > target) {
                r = m;
            } else {
                l = m + 1;
            }
        }     
        return -1;
    }

    private int findStart(int[] nums) {
        int l = 0;
        int r = nums.length;
        if (nums[l] <= nums[r - 1]) {
            return l;
        }
        while (l < r) {
        int m = l + (r - l) / 2;
            if (nums[0] <= nums[m]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
