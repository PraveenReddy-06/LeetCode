class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = -prices[0];
        int sel1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            buy1 = Math.max(buy1, -price);
            sel1 = Math.max(sel1, buy1 + price);
            buy2 = Math.max(buy2, sel1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }

        return sell2;        
    }
}