import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int otherVal;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            otherVal = target - nums[i];
            if (indexMap.containsKey(otherVal)) {
                firstIndex = i;
                secondIndex = indexMap.get(otherVal);
                break;
            }
            else indexMap.put(nums[i], i);
        }
        int[] output = {firstIndex, secondIndex};
        return output;
    }
    public static void main(String[] args) {
        // inputs
        int[] nums = {2,7,11,15};
        int target = 9;

        // instantiate and solve
        Solution solution = new Solution();
        int[] output = solution.twoSum(nums, target);

        // print output
        for (int i = 0; i < output.length; i++) {
            System.out.printf("Index %d: %d\n", i, output[0]);
        }
    }
}