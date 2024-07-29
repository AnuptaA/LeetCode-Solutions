class Solution {
    private int findLast(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, mid = (lo + hi) / 2;
        while (lo < hi) {
            if (nums[mid] == target) lo = mid;
            else if (nums[mid] > target) hi = mid - 1;
            else lo = mid + 1;
            mid = lo + (hi - lo + 1) / 2;
        }
        if (mid >= nums.length || mid < 0 || nums[mid] != target) return -1;
        return mid;
    }
    private int findFirst(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, mid = (lo + hi) / 2;
        while (lo < hi) {
            if (nums[mid] == target) hi = mid;
            else if (nums[mid] > target) hi = mid - 1;
            else lo = mid + 1;
            mid = lo + (hi - lo) / 2;
        }
        if (mid >= nums.length || mid < 0 || nums[mid] != target) return -1;
        return mid;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstIdx = findFirst(nums, target);
        int lastIdx = findLast(nums, target);
        int[] out = {firstIdx, lastIdx};
        return out;
    }
}