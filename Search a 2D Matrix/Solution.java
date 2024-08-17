class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0, hi = m * n - 1, mid = (lo + hi) / 2;
        while (lo <= hi) {
            int val = matrix[mid / n][mid % n];
            if (val == target) return true;
            else if (val > target) hi = mid - 1;
            else lo = mid + 1;
            mid = (lo + hi) / 2;
        }
        return false;
    }
}