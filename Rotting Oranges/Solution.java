class Solution {
    private int m, n;
    private void add(int x, int y, int[][] grid, int[][] ds, Queue<List<Integer>> q, int d) {
        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0 || ds[x][y] > 0) return;
        List<Integer> list = Arrays.asList(x, y);
        q.add(list);
        ds[x][y] = d + 1;
    }
    private int bfs(int[][] grid, List<Integer> coord) {
        List<Integer> list;
        Queue<List<Integer>> q = new LinkedList<>();
        int[][] dists = new int[m][n];
        add(coord.get(0), coord.get(1), grid, dists, q, 0);
        while (!q.isEmpty()) {
            list = q.poll();
            int x = list.get(0), y = list.get(1), dist;
            dist = dists[x][y];
            if (grid[x][y] == 2) return dist - 1;
            add(x + 1, y, grid, dists, q, dist);
            add(x - 1, y, grid, dists, q, dist);
            add(x, y + 1, grid, dists, q, dist);
            add(x, y - 1, grid, dists, q, dist);
        }
        return -1;
    }
    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    List<Integer> list = Arrays.asList(i, j);
                    int currDist = bfs(grid, list);
                    if (currDist == -1) return -1;
                    else if (currDist > max) max = currDist;
                }
            }
        }
        return max;
    }
}