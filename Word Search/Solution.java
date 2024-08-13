class Solution {
    private boolean exists;
    private String target;
    private void backtrack(char[][] grid, int x, int y, String s, HashSet<Integer> set) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) return;
        if (s.length() > target.length() || exists) return;
        int coord = x * grid[0].length + y;
        if (set.contains(coord)) return;

        set.add(coord);
        String t = s + grid[x][y];

        if (target.charAt(t.length() - 1) == grid[x][y]) {
            if (t.length() == target.length()) {
                exists = true;
                return;
            }
        }
        else {
            set.remove(coord);
            return;
        }

        backtrack(grid, x + 1, y, t, set);
        backtrack(grid, x - 1, y, t, set);
        backtrack(grid, x, y + 1, t, set);
        backtrack(grid, x, y - 1, t, set);

        set.remove(coord);
    }
    public boolean exist(char[][] board, String word) {
        target = word;
        exists = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    HashSet<Integer> set = new HashSet<>();
                    backtrack(board, i, j, new String(), set);
                }
                if (exists) return true;
            }
        }
        return false;
    }
}