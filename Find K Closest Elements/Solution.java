class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, smallest = Math.abs(arr[l] - x), ctr = 0;
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - x) < smallest) {
                smallest = Math.abs(arr[i] - x);
                l = i;
            }
            if (smallest == 0) break;
        }
        int r = l + 1;
        while (ctr < k) {
            if (l >= 0 && r < arr.length) {
                if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) out.add(0, arr[l--]);
                else out.add(Math.max(0, out.size()), arr[r++]);
            }
            else {
                if (r >= arr.length) out.add(0, arr[l--]);
                else out.add(Math.max(0, out.size()), arr[r++]);
            }
            ctr++;
        }
        return out;
    }
}