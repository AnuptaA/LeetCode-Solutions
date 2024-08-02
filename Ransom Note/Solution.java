class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = 26;
        int[] magFreq = new int[n], ranFreq = new int[n];
        for (int i = 0; i < magazine.length(); i++) magFreq[magazine.charAt(i) % n]++;
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (++ranFreq[c % n] > magFreq[c % n]) return false;
        }
        return true;
    }
}