class Solution {
    private List<List<Integer>> ps;
    private int target;
    private void backtrack(int[] nums, int start, List<Integer> s, int prev) {
        if (prev == target) ps.add(new ArrayList<>(s));
        int sum = prev, i = start;
        while (i < nums.length) {
            int val = nums[i];
            while (sum < target) {
                sum += val;
                s.add(val);
                backtrack(nums, i + 1, s, sum);
            }
            while (sum != prev) {
                sum -= val;
                s.remove(s.size() - 1);
            }
            i++;
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ps = new ArrayList<>();
        this.target = target;
        backtrack(candidates, 0, new ArrayList<>(), 0);
        return ps;
    }
}