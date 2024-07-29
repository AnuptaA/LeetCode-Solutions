class Solution {
    public int myAtoi(String s) {
        long result = 0;
        int i = 0, n = s.length(), sign = 1;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < n && s.charAt(i) == '+') i++;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (sign * result < (long) Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if (sign * result > (long) Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return sign * (int) result;
    }
}