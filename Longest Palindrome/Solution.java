class Solution {
    public int longestPalindrome(String s) {
        int output = 0;
        if (s.length() == 0) return output;

        int alphLen = 100;
        boolean oddFound = false;
        int[] letters = new int[alphLen];

        for (int i = 0; i < s.length(); i++) letters[s.charAt(i) % alphLen]++;
        for (int i = 0; i < alphLen; i++) {
            while (letters[i] >= 2) {
                output += 2;
                letters[i] -= 2;
            }
            if (!oddFound && (letters[i] == 1)) {
                output++;
                oddFound = true;
            }
        }
        return output;
    }
}