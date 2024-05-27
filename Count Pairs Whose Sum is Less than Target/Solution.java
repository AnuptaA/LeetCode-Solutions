class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int numPairs = 0;
        for (int i = 0; i < nums.size(); i++) {
            int curr = nums.get(i);
            for (int j = i + 1; j < nums.size(); j++) {
                if (curr + nums.get(j) < target) numPairs++;
            }
        }
        return numPairs;
    }
}