class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean listFound = list.contains(s);
            boolean setFound = set.contains(s);
            if (!setFound) {
                if (!listFound) list.add(s);
                else {
                    list.remove(s);
                    set.add(s);
                }
            }
            else continue;
        }
        if (k - 1 >= list.size()) return "";
        return list.get(k - 1);
    }
}