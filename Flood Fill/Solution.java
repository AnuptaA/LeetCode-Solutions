class Solution {
    private void dfs(int[][] grid, int x, int y, int prev, int color) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) return;
        if (grid[x][y] != prev || grid[x][y] == color) return;
        grid[x][y] = color;
        dfs(grid, x + 1, y, prev, color);
        dfs(grid, x - 1, y, prev, color);
        dfs(grid, x, y + 1, prev, color);
        dfs(grid, x, y - 1, prev, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
}