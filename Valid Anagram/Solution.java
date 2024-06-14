class Solution {
    public boolean isAnagram(String s, String t) {
        int n = 30;
        int[] freq_s = new int[n];
        int[] freq_t = new int[n];
        for (int i = 0; i < s.length(); i++) freq_s[s.charAt(i) % n]++;
        for (int i = 0; i < t.length(); i++) freq_t[t.charAt(i) % n]++;
        for (int i = 0; i < n; i++) {
            if (freq_s[i] != freq_t[i]) return false;
        }
        return true;
    }
}