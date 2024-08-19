class Solution {
    public int balancedStringSplit(String s) {
        int ctr = 0, win = 0;
        for (int i = 0; i < s.length(); i++) {
            win = s.charAt(i) == 'L' ? win + 1 : win - 1;
            if (win == 0) ctr++;
        }
        return ctr;
    }
}