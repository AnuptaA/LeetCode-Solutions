class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : stones) pq.add(n);
        while (!pq.isEmpty()) {
            if (pq.size() == 1) return pq.poll();
            int y = pq.poll();
            int x = pq.poll();
            if (x != y) pq.add(y - x);
        }
        return 0;
    }
}