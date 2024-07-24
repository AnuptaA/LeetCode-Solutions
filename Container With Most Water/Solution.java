class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, currArea;
        int max = Integer.MIN_VALUE;
        while (l < r) {
            currArea = (r - l) * Math.min(height[l], height[r]);
            if (currArea > max) max = currArea;
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }
}