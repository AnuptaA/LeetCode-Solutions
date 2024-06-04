class Solution {
    public String reversePrefix(String word, char ch) {
        int left = 0;
        int right = 0;
        StringBuilder sb = new StringBuilder();

        while (right < word.length()) {
            if (word.charAt(right) == ch) break;
            right++;
        }

        if (right != word.length()) {
            left = right;
            right++;
            while (left >= 0) {
                sb.append(word.charAt(left));
                left--;
            }
            while (right != word.length()) {
                sb.append(word.charAt(right));
                right++;
            }
            return sb.toString();
        }
        return word;

    }
}