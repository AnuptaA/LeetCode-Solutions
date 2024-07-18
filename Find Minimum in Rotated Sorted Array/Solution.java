class Solution {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1, mid = (lo + hi) / 2;
        int min = Integer.MAX_VALUE;
        while (lo <= hi) {
            if (nums[mid] < min) min = nums[mid];
            if (nums[hi] < nums[lo]) {
                if (nums[mid] < nums[hi]) hi = mid - 1;
                else lo = mid + 1;
            }
            else hi = mid - 1;
            mid = (lo + hi) / 2;
        }
        return min;
    }
}