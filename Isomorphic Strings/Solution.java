class Solution {
    public boolean isIsomorphic(String s, String t) {
        char a, b;
        Map<Character, Character> smp = new HashMap<>(), tmp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            b = t.charAt(i);
            if (smp.containsKey(a) && smp.get(a) != b) return false;
            else if (tmp.containsKey(b) && tmp.get(b) != a) return false;
            else {
                smp.put(a, b);
                tmp.put(b, a);
            }
        }
        return true;
    }
}