class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += (double) nums[i];
        max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += (double) (nums[i] - nums[i - k]);
            if (sum > max) max = sum;
        }
        return max / k;
    }
}