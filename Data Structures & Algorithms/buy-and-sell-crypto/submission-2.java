class Solution {
    public int maxProfit(int[] prices) {
        int[] min = new int[prices.length];
        min[0] = prices[0];
        if(min.length > 1)
        {
            min[1] = prices[0];
        }
        for(int i = 2; i < prices.length; i++)
        {
            min[i] = Math.min(prices[i-1] , min[i-1]);
        }

        int profit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            profit = Math.max(profit , prices[i] - min[i]);
        }
        return profit;
    }
}
