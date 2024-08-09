class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ctr = 0, currSum = 0, sum = threshold * k;
        for (int i = 0; i < k; i++) currSum += arr[i];
        if (currSum >= sum) ctr++;
        for (int i = k; i < arr.length; i++) {
            currSum += arr[i] - arr[i - k];
            if (currSum >= sum) ctr++;
        }
        return ctr;
    }
}