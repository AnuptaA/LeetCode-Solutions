class Solution {
    private int[] distTo;
    private int[][] edgeTo;
    private void bfs(int v, int w) {
        if (distTo[w] < distTo[v] + 1) return;
        Queue<Integer> q = new LinkedList<>();
        q.add(w);
        distTo[w] = distTo[v] + 1;
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < distTo.length; i++) {
                if (edgeTo[x][i] == 1 && distTo[i] > distTo[x] + 1) {
                    q.add(i);
                    distTo[i] = distTo[x] + 1;
                }
            }
        }
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        distTo = new int[n];
        edgeTo = new int[n][n];
        int[] res = new int[queries.length];
        Arrays.fill(distTo, Integer.MAX_VALUE);
        distTo[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            edgeTo[i][i + 1] = 1;
            distTo[i + 1] = i + 1;
        }
        for (int i = 0; i < queries.length; i++) {
            int v = queries[i][0];
            int w = queries[i][1];
            edgeTo[v][w] = 1;
            bfs(v, w);
            res[i] = distTo[n - 1];
        }
        return res;
    }
}