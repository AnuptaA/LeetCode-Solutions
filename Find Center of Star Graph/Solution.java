class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            if (!map.containsKey(from)) map.put(from, 1);
            else return from;
            if (!map.containsKey(to)) map.put(to, 1);
            else return to;
        }
        return -1;
    }
}