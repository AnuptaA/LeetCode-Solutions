class Solution {
    List<List<Integer>> ps;
    private void backtrack(int start, List<Integer> list, int k, int n, int sum, int[] nums) {
        if (list.size() > k) return;
        if (list.size() == k && sum == n) {
            ps.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            sum += nums[i];
            list.add(nums[i]);
            backtrack(i + 1, list, k, n, sum, nums);
            sum -= nums[i];
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ps = new ArrayList<>();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        backtrack(0, new ArrayList<>(), k, n, 0, nums);
        return ps;
    }
}