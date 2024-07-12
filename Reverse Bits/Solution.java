public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int x = 0, i = 0;
        while (i++ != 32) {
            x = (x << 1) + n % 2;
            n = n >>> 1;
        }
        return x;
    }
}