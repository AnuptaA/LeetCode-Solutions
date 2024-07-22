class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> mp = new HashMap<>();
        for (int i = 0; i < names.length; i++) mp.put(heights[i], names[i]);
        Arrays.sort(heights);
        for (int i = 0; i < names.length; i++) names[i] = mp.get(heights[names.length - i - 1]);
        return names;
    }
}