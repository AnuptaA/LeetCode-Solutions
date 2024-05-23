public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return (x == reversed);
    }
    public static void main(String[] args) {
        // inputs
        int input = 121;

        // instantiate and solve
        Solution solution = new Solution();
        boolean output = solution.isPalindrome(input);

        // print output
        if (output) System.out.printf("The number is a palindrome\n");
        else System.out.printf("The number is not a palindrome\n");
    }
}