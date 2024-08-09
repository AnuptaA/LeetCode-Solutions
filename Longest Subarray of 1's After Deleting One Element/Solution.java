class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, max = 0, nonZero = 0;
        int prevLength = 0, currLength = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                currLength = 0;
                while (i < nums.length && nums[i] == 1) {
                    currLength++;
                    i++;
                }
                if (currLength == nums.length) max = Math.max(max, currLength - 1);
                else max = Math.max(max, currLength + prevLength);
                prevLength = currLength;
            }
            else {
                if (nonZero != 0) nonZero++;
                else {
                    nonZero = 0;
                    prevLength = 0;
                }
            }
            i++;
        }
        return max;
    }
}