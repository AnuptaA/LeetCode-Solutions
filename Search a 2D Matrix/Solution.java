class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLo = 0;
        int rowHi = matrix.length - 1;
        int rowMid = (rowLo + rowHi) / 2;

        int colLo = 0;
        int colHi = matrix[0].length - 1;
        int colMid = (colLo + colHi) / 2;

        while (rowLo <= rowHi) {
            if (matrix[rowMid][colLo] <= target && target <= matrix[rowMid][colHi]) {
                while (colLo <= colHi) {
                    if (matrix[rowMid][colMid] == target) return true;
                    else if (matrix[rowMid][colMid] < target) colLo = colMid + 1;
                    else colHi = colMid - 1;
                    colMid = (colLo + colHi) / 2;
                }
                return false;
            }
            else if (matrix[rowMid][colHi] < target) rowLo = rowMid + 1;
            else rowHi = rowMid - 1;
            rowMid = (rowLo + rowHi) / 2;
        }
        return false;
    }
}