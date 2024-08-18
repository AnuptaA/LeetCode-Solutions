class Solution {
    private Map<Integer, Boolean> mp;
    private boolean isPrime(int n) {
        if (mp.containsKey(n)) return mp.get(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                mp.put(n, false);
                return false;
            }
        }
        mp.put(n, true);
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int l = 0, r = nums.length - 1;
        mp = new HashMap<>();
        mp.put(1, false);
        while (!isPrime(nums[l])) l++;
        while (!isPrime(nums[r])) r--;
        return r - l;
    }
}