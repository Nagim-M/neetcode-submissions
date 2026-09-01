class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - minBuy;
            if (profit > maxProfit) maxProfit = profit;
            if (prices[i] < minBuy) minBuy = prices[i];
        }

        return maxProfit;
    }
}
