class Solution {
    public int singleNumber(int[] nums) {
        int[] bit_freq = new int[32];
        for (int n : nums) {
            int i = 0;
            while (n != 0) {
                bit_freq[i++] += n % 2;
                n = n >>> 1;
            }
        }
        int single = 0;
        int pow = 1;
        for (int i = 0; i < bit_freq.length; i++) {
            if (bit_freq[i] % 3 == 1) single += pow;
            pow *= 2;
        }
        return single;
    }
}