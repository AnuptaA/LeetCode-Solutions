class Solution {
    public int maxProfit(int[] prices) {
        int currProfit = 0;
        int prevPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - prevPrice > currProfit) currProfit = prices[i] - prevPrice;
            if (prices[i] < prevPrice) prevPrice = prices[i];
        }
        return currProfit;
    }
}