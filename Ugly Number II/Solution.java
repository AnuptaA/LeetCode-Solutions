class Solution {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] memo = new int[n];
        memo[a] = 1;
        for (int i = 1; i < n; i++) {
            memo[i] = Math.min(Math.min(memo[a] * 2, memo[b] * 3), memo[c] * 5);
            if (memo[i] == 2 * memo[a]) a++;
            if (memo[i] == 3 * memo[b]) b++;
            if (memo[i] == 5 * memo[c]) c++;
        }
        return memo[n - 1];
    }
}