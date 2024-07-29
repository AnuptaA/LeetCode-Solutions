class Solution {
    private int total;
    private void backtrack(int[] arr, int start, int subXor) {
        total += subXor;
        int nextXor = subXor;
        for (int i = start; i < arr.length; i++) {
            nextXor ^= arr[i];
            backtrack(arr, i + 1, nextXor);
            nextXor ^= arr[i];
        }
    }
    public int subsetXORSum(int[] nums) {
        total = 0;
        backtrack(nums, 0, 0);
        return total;
    }
}