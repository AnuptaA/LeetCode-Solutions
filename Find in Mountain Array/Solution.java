/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    // define 0 as normal, 1 as reverse
    private int findFirstIdx(int target, MountainArray arr, int low, int high, int dir) {
        int lo = low, hi = high, mid = (lo + hi) / 2, val;
        if (dir == 0) {
            while (lo < hi) {
                val = arr.get(mid);
                if (val == target) hi = mid;
                else if (val > target) hi = mid - 1;
                else lo = mid + 1;
                mid = lo + (hi - lo) / 2;
            }
        }
        else {
            while (lo < hi) {
                val = arr.get(mid);
                if (val == target) hi = mid;
                else if (val > target) lo = mid + 1;
                else hi = mid - 1;
                mid = lo + (hi - lo) / 2;
            }
        }
        if (mid < low || mid > high || arr.get(mid) != target) return -1;
        return mid;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length(), val, peakIdx = -1, leftIdx;
        int lo = 0, hi = n - 1, mid = (lo + hi) / 2;
        while (lo <= hi) {
            val = mountainArr.get(mid);
            if (mid == 0 || val < mountainArr.get(mid + 1)) lo = mid + 1;
            else if (mid == n - 1 || val < mountainArr.get(mid - 1)) hi = mid - 1;
            else {
                peakIdx = mid;
                break;
            } 
            mid = (lo + hi) / 2;
        }
        leftIdx = findFirstIdx(target, mountainArr, 0, peakIdx, 0);
        if (leftIdx != -1) return leftIdx;
        return findFirstIdx(target, mountainArr, peakIdx + 1, n - 1, 1);
    }
}