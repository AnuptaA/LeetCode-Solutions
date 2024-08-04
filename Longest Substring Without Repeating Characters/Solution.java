class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, start = -1;
        int[] charIndices = new int[128];
        Arrays.fill(charIndices, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndices[c] >= start) start = charIndices[c] + 1;
            charIndices[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}