class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new ArrayList<>();
        int[] out = new int[queries.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != x) continue;
            else list.add(i);
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > list.size()) out[i] = -1;
            else out[i] = list.get(queries[i] - 1);
        }
        return out;
    }
}