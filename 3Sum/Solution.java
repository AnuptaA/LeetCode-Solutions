class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        while (i < nums.length) {
            int target = -nums[i], j = i + 1, other;
            while (j < nums.length) {
                other = target - nums[j];
                int lo = j + 1, hi = nums.length - 1, mid = (lo + hi) / 2;
                while (lo <= hi) {
                    if (nums[mid] == other) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[mid]);
                        res.add(list);
                        break;
                    }
                    else if (nums[mid] < other) lo = mid + 1;
                    else hi = mid - 1;
                    mid = (lo + hi) / 2;
                }
                j++;
                while (j < nums.length && nums[j] == nums[j - 1]) j++;
            }
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) i++;
        }
        return res;
    }
}