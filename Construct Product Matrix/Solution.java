class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int prod = 1, mod = 12345, n = grid.length, m = grid[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = prod;
                prod = (prod % mod) * (grid[i][j] % mod) % mod;
            }
        }
        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                res[i][j] = (res[i][j] % mod) * (prod % mod) % mod;
                prod = (prod % mod) * (grid[i][j] % mod);
            }
        }
        return res;
    }
}