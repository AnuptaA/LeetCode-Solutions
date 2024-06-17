class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int n = str.length();
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            while (!Character.isAlphabetic(l) && !Character.isDigit(l)) {
                left++;
                if (left >= n) break;
                l = str.charAt(left);
            }
            while (!Character.isAlphabetic(r) && !Character.isDigit(r)) {
                right--;
                if (right < 0) break;
                r = str.charAt(right);
            }
            if (right < 0 || left >= n) break;
            if (l - r != 0) return false;
            left++;
            right--;
        }
        return true;
    }
}