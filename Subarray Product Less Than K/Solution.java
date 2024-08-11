class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int j = 0, ctr = 0, prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            if (prod < k) ctr += i - j + 1;
            else {
                while (j < nums.length && prod >= k) {
                    if (prod <= 1) {
                        prod = 1;
                        break;
                    }
                    else prod /= nums[j++];
                }
                if (prod < k) ctr += i - j + 1;
            }
        }
        return ctr;
    }
}