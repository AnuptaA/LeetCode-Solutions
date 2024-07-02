class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int lo = i;
            int hi = numbers.length - 1;
            int mid = (hi + lo) / 2;
            int rem = target - numbers[i];
            while (lo <= hi) {
                if (i == mid) lo = mid + 1;
                else if (numbers[mid] == rem) {
                    int[] output = {i + 1, mid + 1};
                    return output;
                }
                else if (numbers[mid] < rem) lo = mid + 1;
                else hi = mid - 1;
                mid = (hi + lo) / 2;
            }
        }
        int[] output = {-1, -1};
        return output;
    }
}