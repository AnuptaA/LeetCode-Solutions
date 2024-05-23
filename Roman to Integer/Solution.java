import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> numerals = new HashMap<>();

        boolean indicaterI = false;
        boolean indicaterX = false;
        boolean indicaterC = false;

        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result += numerals.get(c);
            
            if (indicaterI && (c == 'V' || c == 'X')) result -= 2;
            else if (indicaterX && (c == 'L' || c == 'C')) result -= 20;
            else if (indicaterC && (c == 'D' || c == 'M')) result -= 200;

            if (c == 'I') {
                indicaterI = true;
                indicaterX = false;
                indicaterC = false;
            }
            else if (c == 'X') {
                indicaterI = false;
                indicaterX = true;
                indicaterC = false;
            }
            else if (c == 'C') {
                indicaterI = false;
                indicaterX = false;
                indicaterC = true;
            }
            else {
                indicaterI = false;
                indicaterX = false;
                indicaterC = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // inputs
        String s = "MCMXCIV";

        // instatiate and solve
        Solution solution = new Solution();
        int output = solution.romanToInt(s);

        // print output
        System.out.printf("The integer value is %d.\n", output);
    }
}