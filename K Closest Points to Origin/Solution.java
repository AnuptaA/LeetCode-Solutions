import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> ((b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])));
        int[][] output = new int[k][2];

        for (int[] point : points) {
            pq.add(point);
            if (pq.size() > k) pq.poll();
        }

        for (int i = 0; i < k; i++) output[i] = pq.poll();

        return output;
    }
}