class Solution {
    public List<List<Integer>> generate(int numRows) {
        int j = 1;
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> prevList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int k = 0; k < j; k++) {
                if (k == 0 || k == j - 1) list.add(1);
                else list.add(prevList.get(k - 1) + prevList.get(k));
            }
            prevList = list;
            output.add(list);
            j++;
        }
        return output;
    }
}