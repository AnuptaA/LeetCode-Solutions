class Solution {
    private List<List<Integer>> ps;
    private void backtrack(List<Integer> s, int start, int n, int k) {
        if (k == 0) {
            ps.add(new ArrayList<>(s));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            s.add(i);
            backtrack(s, i + 1, n, k - 1);
            s.remove(s.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ps = new ArrayList<>();
        backtrack(new ArrayList<>(), 1, n, k);
        return ps;
    }
}