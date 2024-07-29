class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0, hi = arr.length - 1, mid = (lo + hi) / 2;
        while (lo <= hi) {
            if (mid == 0 || arr[mid] < arr[mid + 1]) lo = mid + 1;
            else if (mid == arr.length - 1 || arr[mid] < arr[mid - 1]) hi = mid - 1;
            else break;
            mid = (lo + hi) / 2;
        }
        return mid;
    }
}