class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >= target) {
                if (i - j + 1 < min) min = i - j + 1;
                while (sum - nums[j] >= target) {
                    sum -= nums[j++];
                    if (i - j + 1 < min) min = i - j + 1;
                }
            }
        }
        min = min == Integer.MAX_VALUE ? 0 : min;
        return min;
    }
}