class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int length = s.length();
        if (length == 0) return result;

        int i = 0;
        boolean isPositive = true;
        Stack<Integer> stack = new Stack<>();
        char c = s.charAt(i);

        while (c == ' ') {
            i++;
            if (i == length) return result;
            c = s.charAt(i);
        }

        if (c == '-') {
            isPositive = false;
            i++;
            if (i == length) return result;
            c = s.charAt(i);
        }
        else if (c == '+') {
            i++;
            if (i == length) return result;
            c = s.charAt(i);
        }
        else if (!Character.isDigit(c)) return result;
        else if (c == '0') {
            while (c == '0') {
                i++;
                if (i == length) return result;
                c = s.charAt(i);
            }
        }

        while (Character.isDigit(c)) {
            stack.push(Character.getNumericValue(c));
            i++;
            if (i == length) break;
            c = s.charAt(i);
        }

        int digits = 0;
        long total = 0;
        long base = 1;
        boolean exceedsLong = false;

        while (!stack.empty()) {
            digits++;
            total += (long) stack.pop() * base;
            if (total > (long) Integer.MAX_VALUE || digits > 64) {
                exceedsLong = true;
                break;
            }
            base *= (long) 10;
        }

        if (exceedsLong) {
            if (!isPositive) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }

        if (!isPositive) total *= -1;

        if (total <= (long) Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        else if (total >= (long) Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }
        else result = (int) total;

        return result;
    }
}