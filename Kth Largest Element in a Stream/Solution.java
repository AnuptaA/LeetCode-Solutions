class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for (int n : nums) pq.add(n);
    }

    // 2 4 5 8
    // 2 3 4 5 8

    public int add(int val) {
        int remove;
        pq.add(val);
        while (pq.size() > k) remove = pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */