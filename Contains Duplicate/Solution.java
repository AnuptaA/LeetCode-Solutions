class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> tracker = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!tracker.contains(nums[i])) tracker.add(nums[i]);
            else return true;
        }
        return false;
    }
}