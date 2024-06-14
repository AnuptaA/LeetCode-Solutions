class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        Map<Integer, Integer> tracker = new HashMap<>();
        List<Integer>[] idx_freq = new List[nums.length + 1];

        for (int i = 0; i < idx_freq.length; i++) idx_freq[i] = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!tracker.containsKey(nums[i])) tracker.put(nums[i], 1);
            else tracker.put(nums[i], tracker.get(nums[i]) + 1);
        }

        for (int key : tracker.keySet()) idx_freq[tracker.get(key)].add(key);

        int left = 0;
        int right = idx_freq.length - 1;
        while (left != k) {
            List<Integer> list = idx_freq[right];
            if (list.size() != 0) {
                int j = 0;
                while (j != list.size()) {
                    output[left] = list.get(j);
                    j++;
                    left++;
                }
            }
            right--;
        }
        return output;
    }
}