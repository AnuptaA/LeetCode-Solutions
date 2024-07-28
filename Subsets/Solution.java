class Solution {
    private void subsetHelper(List<List<Integer>> ps, List<Integer> s, int start, int[] arr) {
        ps.add(new ArrayList<>(s));
        for (int i = start; i < arr.length; i++) {
            s.add(arr[i]);
            subsetHelper(ps, s, i + 1, arr);
            s.remove(s.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        subsetHelper(powerSet, new ArrayList<>(), 0, nums);
        return powerSet;
    }
}