class Solution {
    public int numberOfSubstrings(String s) {
        int res = 0, ctr = 0, j = 0, n = s.length();
        int[] freq = new int[3];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            freq[c % 3]++;
            while (freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1) {
                res += (n - i);
                freq[s.charAt(j++) % 3]--;
            }
        }
        return res;
    }
}