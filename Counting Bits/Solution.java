class Solution {
    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        for (int i = 1; i < out.length; i++) {
            if (i % 2 == 0) out[i] = out[i / 2];
            else out[i] = out[i / 2] + 1;
        }
        return out;
    }
}