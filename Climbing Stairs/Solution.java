class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;

        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3; i < memo.length; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[memo.length - 1];
    }
}