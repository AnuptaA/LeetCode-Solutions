class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> tmp = new HashMap<>(), amp = new HashMap<>();
        for (int n : target) tmp.put(n, tmp.getOrDefault(n, 0) + 1);
        for (int n : arr) {
            amp.put(n, amp.getOrDefault(n, 0) + 1);
            if (!tmp.containsKey(n)) return false;
        }
        for (int n : amp.keySet()) {
            if (tmp.get(n) != amp.get(n)) return false;
        }
        return true;
    }
}