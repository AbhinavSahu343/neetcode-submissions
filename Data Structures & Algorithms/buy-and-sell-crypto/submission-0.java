class Solution {
    public int maxProfit(int[] prices) {
        int cur = 0;
        int r = prices.length - 1;
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++)
        {
            for(int j = i + 1; j < prices.length; j++)
            {
                profit = Math.max(profit , prices[j] - prices[i]);
            }

        }
        return profit;
    }
}
