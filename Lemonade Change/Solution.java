class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] cash = new int[2];
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) cash[0]++;
            else if (bills[i] == 10) {
                cash[1]++;
                if (cash[0] == 0) return false;
                cash[0]--;
            }
            else {
                if (cash[1] > 0 && cash[0] > 0) {
                    cash[1]--;
                    cash[0]--;
                }
                else if (cash[0] > 2) cash[0] -= 3;
                else return false;
            }
        }
        return true;
    }
}