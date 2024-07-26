class Solution {
    private void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    private void merge(int[] arr, int[] l, int[] r) {
        int i = 0, left = 0, right = 0;
        while (left < l.length && right < r.length) {
            if (l[left] > r[right]) arr[i++] = r[right++];
            else arr[i++] = l[left++];
        }
        while (left < l.length) arr[i++] = l[left++];
        while (right < r.length) arr[i++] = r[right++];
    }
    private void mergeSort(int[] arr) {
        if (arr.length <= 7) {
            insertionSort(arr);
            return;
        }

        int mid = arr.length / 2;
        int[] l = new int[mid];
        int[] r = new int[arr.length - mid];

        for (int i = 0; i < l.length; i++) l[i] = arr[i];
        for (int i = 0; i < r.length; i++) r[i] = arr[l.length + i];

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
}