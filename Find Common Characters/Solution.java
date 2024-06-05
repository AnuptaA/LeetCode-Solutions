class Solution {
    public List<String> commonChars(String[] words) {
        int len = 52;
        int[][] tracker = new int[words.length][len];
        Map<Integer, Character> indexTracker = new HashMap<>();
        List<String> output = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = words[i].charAt(j) % len;
                indexTracker.put(index, words[i].charAt(j));
                tracker[i][index]++;
            }
        }

        for (int j = 0; j < tracker[0].length; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < tracker.length; i++) {
                if (tracker[i][j] < min) min = tracker[i][j];
            }
            if (min != 0 && min != Integer.MAX_VALUE) {
                String c = indexTracker.get(j) + "";
                while (min != 0) {
                    output.add(c);
                    min--;
                }
            }
        }
        return output;
    }
}