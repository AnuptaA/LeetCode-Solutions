class Solution {
    private int n;
    private List<String> combos;
    private String digits;
    private void backtrack(String[] letters, String prev, int start) {
        if (prev.length() == n) {
            combos.add(new String(prev));
            return;
        }
        for (int i = start; i < digits.length(); i++) {
            String button = letters[digits.charAt(i) - '0' - 2];
            for (int j = 0; j < button.length(); j++) {
                backtrack(letters, prev + button.charAt(j), i + 1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        n = digits.length();
        combos = new ArrayList<>();
        this.digits = digits;
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (n != 0) backtrack(letters, "", 0);
        return combos;
    }
}