class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Solution without explicitly sorting
        int i = 1;
        int remove;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) pq.add(n);
        while (i != k) {
            i++;
            remove = pq.poll();
        }
        return pq.poll();
    }
}