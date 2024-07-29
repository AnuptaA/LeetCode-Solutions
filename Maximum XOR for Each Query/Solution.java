class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor = 0, max = (int) Math.pow(2, maximumBit) - 1;
        int[] answer = new int[nums.length];
        for (int n : nums) xor ^= n;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[nums.length - i - 1] = max ^ xor;
            xor ^= nums[i];
        }
        return answer;
    }
}