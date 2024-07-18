class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, mid = (lo + hi) / 2;
        while (lo <= hi) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target && nums[lo] > target) {
                if (nums[mid] < nums[lo]) hi = mid - 1;
                else lo = mid + 1;
            }
            else if (nums[mid] < target && nums[hi] < target) {
                if (nums[mid] > nums[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
            else if (nums[mid] > target) hi = mid - 1;
            else lo = mid + 1; 
            mid = (lo + hi) / 2;
        }
        return -1;
    }
}