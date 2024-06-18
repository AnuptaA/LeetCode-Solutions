class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = (hi + lo) / 2;
        while (lo <= hi) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
            mid = (hi + lo) / 2;
        }
        return -1;
    }
}