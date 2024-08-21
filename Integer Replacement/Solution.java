class Solution {
    private Map<Integer, Integer> mp;
    private int re(int n) {
        if (mp.containsKey(n)) return mp.get(n);
        int min;
        if (n % 2 == 0) min = re(n / 2);
        else min = n == Integer.MAX_VALUE ? re(n / 2) : Math.min(re(n - 1), re(n + 1));
        mp.put(n, ++min);
        return min;
    }
    public int integerReplacement(int n) {
        mp = new HashMap<>();
        mp.put(1, 0);
        return re(n);
    }
}