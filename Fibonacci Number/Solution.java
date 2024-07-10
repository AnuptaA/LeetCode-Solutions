class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 1; i < memo.length; i++) {
            if (i == 1) memo[i] = 1;
            else memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}