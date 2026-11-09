class Solution {
    public int maxArea(int[] heights) {
        if (heights.length < 2) {
            throw new IllegalArgumentException();
        }
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;
        while(l < r) {
            int min = Math.min(heights[l], heights[r]);
            maxArea = Math.max(maxArea, min * (r - l));
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
