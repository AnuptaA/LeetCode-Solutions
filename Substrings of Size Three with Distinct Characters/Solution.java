class Solution {
    public int countGoodSubstrings(String s) {
        int ctr = 0, n = s.length();
        if (n < 3) return 0;
        char a = s.charAt(0), b = s.charAt(1), c = s.charAt(2);
        for (int i = 2; i < n; i++) {
            if (i != 2) {
                a = b;
                b = c;
                c = s.charAt(i);
            }
            if (a != b && b != c && a != c) ctr++;
        }
        return ctr;
    }
}