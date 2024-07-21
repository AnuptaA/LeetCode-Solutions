class Solution {
    private boolean isFinished(int[] arr, int k, int h) {
        int totalTime = 0;
        for (int i = 0; i < arr.length; i++) {
            totalTime += Math.ceil((double) arr[i] / k);
            if (totalTime > h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo = 1, hi = piles[piles.length - 1], k = (lo + hi) / 2;
        while (lo < hi) {
            if (isFinished(piles, k, h)) hi = k;
            else lo = k + 1;
            k = (lo + hi) / 2;
        }
        return k;
    }
}