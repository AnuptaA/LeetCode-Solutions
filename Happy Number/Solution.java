class Solution {
    private int sumSqDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();
        while (n != 1) {
            if (st.contains(n)) return false;
            st.add(n);
            n = sumSqDigits(n);
        }
        return true;
    }
}