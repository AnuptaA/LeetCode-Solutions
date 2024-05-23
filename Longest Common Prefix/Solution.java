public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs.length == 0) return sb.toString();
        if (strs.length == 1) return strs[0];

        char common;
        for (int i = 0; i < strs[0].length(); i++) {
            common = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || common != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(common);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // inputs
        String[] strs = {"flower","flow","flight"};

        // instatiate and solve
        Solution solution = new Solution();
        String output = solution.longestCommonPrefix(strs);

        // print output
        System.out.printf("The longest common prefix is " + output + ".\n");
    }
}