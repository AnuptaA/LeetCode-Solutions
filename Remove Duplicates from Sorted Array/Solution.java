public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int uPtr = 0;
        int aPtr = 1;
        while (aPtr < nums.length) {
            if (nums[uPtr] != nums[aPtr]) nums[++uPtr] = nums[aPtr++];
            else aPtr++;
        }
        return ++uPtr;
    }
    public static void main(String[] args) {
        // inputs
        int[] nums = {1, 1, 2};

        // instantiate and solve
        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);

        // print output
        System.out.printf("Number of unique elements is %d.\n", result);
    }
}