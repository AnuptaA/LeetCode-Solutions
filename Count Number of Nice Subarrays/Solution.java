class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int result = 0, numSub = 0, numOdd = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) numOdd++;
            if (numOdd == k) {
                numSub = 0;
                while (numOdd == k) {
                    if (nums[j++] % 2 != 0) numOdd--;
                    numSub++;
                }
            }
            result += numSub;
        }
        return result;
    }
}