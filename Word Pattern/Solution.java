class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        Map<Character, String> mp = new HashMap<>();
        if (words.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!mp.containsKey(c)) {
                if (mp.containsValue(words[i])) return false;
                mp.put(c, words[i]);
            }
            else if (!mp.get(c).equals(words[i])) return false;
        }
        return true;
    }
}