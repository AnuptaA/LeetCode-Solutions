class Solution {
    private boolean isAnagram(int[] sf, int[] pf) {
        for (int i = 0; i < sf.length; i++) {
            if (sf[i] != pf[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;
        int[] sf = new int[26], pf = new int[26];
        for (int i = 0; i < p.length(); i++) pf[p.charAt(i) % 26]++;
        for (int i = 0; i < p.length() - 1; i++) sf[s.charAt(i) % 26]++;
        for (int i = p.length() - 1; i < s.length(); i++) {
            sf[s.charAt(i) % 26]++;
            if (isAnagram(sf, pf)) res.add(i - p.length() + 1);
            sf[s.charAt(i - p.length() + 1) % 26]--;
        }
        return res;
    }
}