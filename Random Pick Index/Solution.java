class Solution {
    private Map<Integer, List<Integer>> mp = new HashMap<>();
    public Solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list;
            if (mp.containsKey(nums[i])) list = mp.get(nums[i]);
            else list = new ArrayList<>();
            list.add(i);
            mp.put(nums[i], list);
        }
    }
    
    public int pick(int target) {
        List<Integer> list = mp.get(target);
        Random rn = new Random();
        return list.get(rn.nextInt(list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */