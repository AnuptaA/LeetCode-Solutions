class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> tracker = new HashMap<>();
        int maxLength = 0;
        char c;
        int currLength = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (!tracker.containsKey(c)) {
                currLength++;
                tracker.put(c, i);
            }
            else {
                int prevIndex = tracker.get(c);
                currLength = i - prevIndex;
                tracker = new HashMap<>();
                for (int j = prevIndex + 1; j < i + 1; j++) {
                    tracker.put(s.charAt(j), j);
                }
            }
            if (currLength > maxLength) maxLength = currLength;
        }
        return maxLength;
    }
}