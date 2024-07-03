class Solution {
    public int hammingWeight(int n) {
        int ctr = 0;
        while (n != 0) {
            ctr += n % 2;
            n /= 2;
        }
        return ctr;
    }
}