class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int lo = 0, hi = matrix[0].length - 1, mid = (lo + hi) / 2;
            while (lo <= hi) {
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] > target) hi = mid - 1;
                else lo = mid + 1;
                mid = (lo + hi) / 2;
            }
        }
        return false;
    }
}