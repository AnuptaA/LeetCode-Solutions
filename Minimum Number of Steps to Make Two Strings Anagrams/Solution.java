class Solution {
    public int minSteps(String s, String t) {
        int[] sf = new int[26], tf = new int[26];
        int ctr = 0;
        for (int i = 0; i < s.length(); i++) sf[s.charAt(i) % 26]++;
        for (int i = 0; i < t.length(); i++) tf[t.charAt(i) % 26]++;
        for (int i = 0; i < sf.length; i++) ctr += Math.abs(sf[i] - tf[i]);
        return ctr;
    }
}