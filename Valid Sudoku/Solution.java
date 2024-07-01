class Solution {
    private boolean isValidSubBox(char[][] board, int x, int y, int sub) {
        int[] arr = new int[board.length];
        for (int i = x; i < x + sub; i++) {
            for (int j = y; j < y + sub; j++) {
                if (board[i][j] == '.') continue;
                else if (arr[Character.getNumericValue(board[i][j]) - 1]++ == 1) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int sub = n / 3;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;
                if (arr[Character.getNumericValue(board[i][j]) - 1]++ == 1) return false;
            }
            arr = new int[n];
        }
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j][i] == '.') continue;
                if (arr[Character.getNumericValue(board[j][i]) - 1]++ == 1) return false;
            }
            arr = new int[n];
        }
        for (int i = 0; i < n; i += 3) {
            for (int j = 0; j < n; j += 3) {
                if (!isValidSubBox(board, i, j, sub)) return false;
            }
        }
        return true;
    }
}