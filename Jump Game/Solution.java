class Solution {
    public boolean canJump(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) nums[i] = -1;
            else {
                while (nums[i] > 0) {
                    if (i + nums[i] >= nums.length - 1 || nums[i + nums[i]] == -1) {
                        nums[i] = -1;
                        break;
                    }
                    nums[i]--;
                }
            }
        }
        return nums[0] == -1;
    }
}