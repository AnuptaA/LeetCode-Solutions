class Solution {
    private List<List<Integer>> ps;
    private int target;
    private void backtrack(List<Integer> s, int[] nums, int start, int prev) {
        if (prev == target) ps.add(new ArrayList<>(s));
        else if (prev > target) return;
        int sum = prev, i = start;
        while (i < nums.length) {
            if (sum + nums[i] <= target) {
                sum += nums[i];
                s.add(nums[i]);
                backtrack(s, nums, i + 1, sum);
                sum -= nums[i];
                s.remove(s.size() - 1);
            }
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) i++;
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ps = new ArrayList<>();
        this.target = target;
        Arrays.sort(candidates);
        backtrack(new ArrayList<>(), candidates, 0, 0);
        return ps;
    }
}