class Solution {
    public int missingNumber(int[] nums) {
        int ctr = nums.length;
        for (int i = 0; i < nums.length; i++) ctr -= (nums[i] - i);
        return ctr;
    }
}