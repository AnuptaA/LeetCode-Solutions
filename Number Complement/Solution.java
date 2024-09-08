class Solution {
    public int findComplement(int num) {
        int res = 0, bit = 1;
        while (num != 0) {
            res = num % 2 == 0 ? res + 1 * bit: res;
            num /= 2;
            bit *= 2;
        }
        return res;
    }
}