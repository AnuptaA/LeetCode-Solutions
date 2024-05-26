class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int num = x;
        boolean exceedsRange = false;
        int excess = Integer.MAX_VALUE / 10;

        if (x < 0) num *= -1;

        int prevNum;
        while (num != 0) {
            prevNum = reversed;
            if (prevNum + (num / 10) / 10 > excess) return 0; 
            reversed = reversed * 10 + num % 10;
            if (prevNum > reversed) return 0;
            num /= 10;
        }

        if (x < 0) reversed *= -1;
        return reversed;
    }
}