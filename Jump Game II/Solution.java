class Solution {
    public int jump(int[] nums) {
        int[] memo = new int [nums.length];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[memo.length - 1] = 0;
        for (int i = memo.length - 1; i >= 0; i--) {
            if (i == memo.length - 1) continue;
            int j = Math.min(nums[i], nums.length - i - 1);
            int min = Integer.MAX_VALUE;
            while (j != 0) {
                if (nums[i + j] != Integer.MAX_VALUE) {
                    if (memo[i + j] < min) min = memo[i + j];
                }
                j--;
            }
            memo[i] = min == Integer.MAX_VALUE ? Integer.MAX_VALUE : min + 1;
        }
        return memo[0];
    }
}