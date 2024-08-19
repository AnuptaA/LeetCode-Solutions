class Solution {
    private boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
               c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) stack.push(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) sb.append(stack.pop());
            else sb.append(c);
        }
        return sb.toString();
    }
}