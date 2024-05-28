class Solution {
    public int myAtoi(String s) {
        long result = 0;
        int n = s.length();

        if (n == 0) return (int) result;

        int left = 0;
        int right = left;
        int sign = 1;

        while (right < n && s.charAt(right) == ' ') {
            left++;
            right++;
        }

        if (right < n && (s.charAt(right) == '-' || s.charAt(right) == '+')) {
            if (s.charAt(right) == '-') sign = -1;
            left++;
            right++;
        }

        while (right < n && Character.isDigit(s.charAt(right))) right++;
        while (left != right) {
            result = result * 10 + s.charAt(left) - '0';
            if (result > Integer.MAX_VALUE) {
                if (sign == -1) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            left++;
        }

        if (sign == -1) return -1 * (int) result;
        return (int) result;

    }
}