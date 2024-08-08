class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, max = 0, nonZero = 0, ctr = 0;
        int prevLength = 0, currLength = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                currLength = 0;
                while (i < nums.length && nums[i] == 1) {
                    currLength++;
                    i++;
                    ctr++;
                }
                if (prevLength == 0) {
                    if (ctr == nums.length) max = Math.max(max, currLength - 1);
                    else max = Math.max(max, currLength);
                }
                else max = Math.max(currLength + prevLength, max);
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