class Solution {
    public int[] sortedSquares(int[] nums) {
        int min = Integer.MAX_VALUE, minIdx = -1;
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min && nums[i] >= 0) {
                min = nums[i];
                minIdx = i;
            }
        }
        if (minIdx == -1) {
            for (int i = 0; i < nums.length; i++) out[nums.length - 1 - i] = nums[i] * nums[i];
            return out;
        }
        int i = 0, l = minIdx - 1, r = minIdx;
        while (l >= 0 && r < nums.length) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                out[i++] = nums[r] * nums[r];
                r++;
            }
            else {
                out[i++] = nums[l] * nums[l];
                l--;
            }
        }
        while (l >= 0) {
            out[i++] = nums[l] * nums[l];
            l--;
        }
        while (r < nums.length) {
            out[i++] = nums[r] * nums[r];
            r++;
        }
        return out;

    }
}