class Solution {
    private boolean[] safe;
    private boolean[] seen;
    private void dfs(int[][] grid, int x) {
        if (x < 0 || x >= grid.length) return;
        if (seen[x]) return;

        seen[x] = true;
        safe[x] = false;

        boolean connectedSafe = true;
        for (int i = 0; i < grid[x].length; i++) {
            dfs(grid, grid[x][i]);
            connectedSafe &= safe[grid[x][i]];
        }

        safe[x] = connectedSafe;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> output = new ArrayList<>();
        safe = new boolean[graph.length];
        seen = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) dfs(graph, i);
        for (int i = 0; i < safe.length; i++) {
            if (safe[i]) output.add(i);
        }
        return output;
    }
}