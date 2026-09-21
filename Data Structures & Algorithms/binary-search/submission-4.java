class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            int value = nums[m];
            if (target == value) {
                return m;
            }
            if (target > value) {
                l = m + 1;
            }
            if (target < value) {
                r = m;
            }
        }
        return -1;
    }
}
