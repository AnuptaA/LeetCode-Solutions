class Solution {
    public int countNegatives(int[][] grid) {
        int counter = 0;
        int m = grid.length;            // number of rows
        int n = grid[0].length;         // number of columns

        for (int i = 0; i < m; i++) {
            int lo = 0;
            int hi = n - 1;
            int mid = (hi + lo) / 2;
            while (lo <= hi) {
                int num = grid[i][mid];
                if (num < 0) {
                    if (mid == 0 || grid[i][mid - 1] >= 0) {
                        counter += (n - mid);
                        break;
                    }
                    else hi = mid - 1;
                }
                else lo = mid + 1;
                mid = (hi + lo) / 2;
            }
        }

        return counter;
    }
}