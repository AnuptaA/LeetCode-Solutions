class Solution {
    public void rotate(int[][] matrix) {
        int temp, hi, lo;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            lo = 0;
            hi = matrix.length - 1;
            while (lo < hi) {
                temp = matrix[i][lo];
                matrix[i][lo] = matrix[i][hi];
                matrix[i][hi] = temp;
                lo++;
                hi--;
            }
        }
    }
}