class Solution {
    private void backtrack(int[] nums, int start, List<List<Integer>> ps, List<Integer> s) {
        ps.add(new ArrayList<>(s));
        int i = start;
        while (i != nums.length) {
            s.add(nums[i]);
            backtrack(nums, i + 1, ps, s);
            s.remove(s.size() - 1);
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) i++;
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ps = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, ps, new ArrayList<>());
        return ps;
    }
}