class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> tracker = new HashMap<>();
        List<List<String>> output = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            List<String> list;
            if (!tracker.containsKey(sorted)) list = new ArrayList<>();
            else list = tracker.get(sorted);
            list.add(strs[i]);
            tracker.put(sorted, list);
        }
        for (String key : tracker.keySet()) output.add(tracker.get(key));
        return output;
    }
}