import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> tracker = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') tracker.push(c);
            else {
                if (tracker.empty()) return false;
                char other = tracker.pop();
                if (c == ')' && other != '(') return false;
                else if (c == ']' && other != '[') return false;
                else if (c == '}' && other != '{') return false;
            }
            i++;
        }
        return tracker.empty();
    }
    public static void main(String[] args){
        // inputs
        String s = "()[]{}";

        // instantiate and solve
        Solution solution = new Solution();
        boolean result = solution.isValid(s);

        // print output
        System.out.printf("Is the string valid: %b.\n", result);
    }
}