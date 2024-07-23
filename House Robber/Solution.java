class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] memo = new int[nums.length + 1];
        for (int i = 0; i < memo.length; i++) {
            if (i == 0 || i == 1) memo[i] = nums[i];
            else if (i == nums.length) memo[i] = Math.max(memo[i - 1], memo[i - 2]);
            else if (i == 2) memo[i] = nums[i] + memo[0];
            else memo[i] = nums[i] + (int) Math.max(memo[i - 2], memo[i - 3]);
        }
        return memo[memo.length - 1];
    }
}