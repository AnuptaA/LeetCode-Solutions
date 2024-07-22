class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length + 1];
        for (int i = 0; i < memo.length; i++) {
            if (i == 0 || i == 1) memo[i] = cost[i];
            else if (i == cost.length) memo[i] = (int) Math.min(memo[i - 1], memo[i - 2]);
            else memo[i] = cost[i] + (int) Math.min(memo[i - 1], memo[i - 2]);
        }
        return memo[memo.length - 1];
    }
}