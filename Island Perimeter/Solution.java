class Solution {
    private int perimeter = 0;
    private int seen[][];
    private int dfs(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) return 0;
        if (grid[x][y] == 0) return 0;
        if (seen[x][y] == 1) return 1;

        int borders = 4;
        seen[x][y] = 1;

        borders -= dfs(grid, x + 1, y); 
        borders -= dfs(grid, x - 1, y);
        borders -= dfs(grid, x, y + 1);
        borders -= dfs(grid, x, y - 1);
        
        perimeter += borders;
        return 1;
    }
    public int islandPerimeter(int[][] grid) {
        seen = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    break;
                }
            }
        }
        return perimeter;
    }
}